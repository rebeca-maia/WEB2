package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pedido;

/**
 *
 * @author Rebeca
 */
public class PedidoDAO {
     private Statement comando;
     private static PedidoDAO instance;
    
    public static PedidoDAO getInstance() {
        return instance == null ? instance = new PedidoDAO() : instance;
    }

    public void adicionarPedido(Pedido entity) throws SQLException {
        //idpedido, precoTotal, data, qtdTotal
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (precoTotal, data, qtdTotal) VALUES( '" + entity.getPrecoTotal()+ "','" + entity.getD() + "','" + entity.getQtdTotal()+ "';";
            getComando().executeQuery(s);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.", e);
            }
        }
    }

    public void deletarPedido(Pedido p) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String sql = "DELETE * FROM empresa WHERE id = " + p.getId();
            comando.executeQuery(sql);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.", e);
            }
        }
    }

    

    public Pedido buscarPedidoPorID(int id) throws SQLException {
        //idpedido, precoTotal, data, qtdTotal

        Connection con = null;
        Pedido cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idpedido, precoTotal, data, qtdTotal FROM pedido WHERE idpedido=" + id + " ;");
            if (rs.next()) {
                cl = gerarObjeto(rs);
            }
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.", e);
            }
        }
        return cl;
    }

    private Pedido gerarObjeto(ResultSet rs) throws SQLException {
        //precoTotal,qtdTotal,itens,id, d
        Pedido cl = new Pedido();
        cl.setPrecoTotal(rs.getInt("precoTotal"));
        cl.setQtdTotal(rs.getInt("qtdTotal"));
        //como setar os itens do pedido?
        cl.setD(rs.getDate("d"));
        

        return cl;
    }

    public void atualizarPedido(Pedido entity) throws SQLException {
        //idpedido, precoTotal, data, qtdTotal
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE empresa SET precoTotal = " + entity.getPrecoTotal() + ",data='" + entity.getD() + "',qtdTotal=" + entity.getQtdTotal() + ";";
            getComando().executeQuery(update_sql);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.", e);
            }
        }
    }

    public Statement getComando() {
        return comando;
    }
}
