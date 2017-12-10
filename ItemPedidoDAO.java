package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ItemPedido;

/**
 *
 * @author Rebeca
 */
public class ItemPedidoDAO {
    //como representar o relacionamento de pedido com produto?
    //BD= qtdProduto,precoTotalProd,fk_produto,fk_pedido
    
    private Statement comando;
    
    private static ItemPedidoDAO instance;
    
    public static ItemPedidoDAO getInstance() {
        return instance == null ? instance = new ItemPedidoDAO() : instance;
    }

    public void adicionarItemPedido(ItemPedido entity) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (qtdProduto,precoTotalProd,fk_produto,fk_pedido) VALUES( " + entity.getQuant() + "," + entity.getPrecoTotal() + "," + entity.getProd().getId() + "," + entity.getIdPedido()+";";
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

    public void deletarItemPedido(ItemPedido p) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String sql = "DELETE * FROM produto WHERE id = " + p.getIdPedido();//modificar para as duas fk;
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

    
    public ItemPedido buscarPorID(int id1,int id2 ) throws SQLException {
     //qtdProduto,precoTotalProd,fk_produto,fk_pedido
        Connection con = null;
        ItemPedido cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT qtdProduto,precoTotalProd,fk_produto,fk_pedido FROM itenspedido WHERE idproduto=" + id1 + " AND "+id2+ ";");
            if (rs.next()) {
                cl = map(rs);
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

    private ItemPedido map(ResultSet rs) throws SQLException {
        //qtdProduto,precoTotalProd,fk_produto,fk_pedido
        //idPedido, precoTotal, quant, prod
        ProdutoDAO p = new ProdutoDAO();
        ItemPedido cl = new ItemPedido();
        cl.setPrecoTotal(rs.getFloat("precoTotalProd"));
        cl.setQuant(rs.getInt("qtdProduto"));
        cl.setProd(p.buscarProdutoPorID(rs.getInt("fk_produto")));
        
        return cl;
    }

    public void atualizarItemPedido(ItemPedido entity) throws SQLException {
        //qtdProduto,precoTotalProd,fk_produto,fk_pedido
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE itenspedido SET qtdProduto = " + entity.getQuant() + ",precoTotalProd=" + entity.getPrecoTotal()+ ",fk_produto=" + entity.getProd().getId()  + ",fk_pedido="+entity.getIdPedido()+ ";";
            getComando().executeQuery(update_sql);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null) {                    con.close();
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
