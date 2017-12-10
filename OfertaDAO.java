package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Oferta;

/**
 *
 * @author Rebeca
 */
public class OfertaDAO {
    //BD=idoferta,fk_pedido,categoria,qtd,precoTotal
    //Java = categoria, p,precoTotal,qtd,id,or
    
     private Statement comando;
     private static OfertaDAO instance;
    
    public static OfertaDAO getInstance() {
        return instance == null ? instance = new OfertaDAO() : instance;
    }
    
    public void cadastrar(Oferta entity) throws SQLException {
        //idoferta,fk_pedido,categoria,qtd,precoTotal
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            //como inserir a foreign key de pedido? 
            String s = "INSERT INTO (fk_pedido,categoria,qtd,precoTotal) VALUES( '" + entity.getP()+ "','" + entity.getCategoria() + "'," + entity.getQtd()+ "," + entity.getPrecoTotal()+ ";";
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

    public void deletarOferta(Oferta p) throws SQLException {
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

    

    public Oferta buscarOfertaPorID(int id) throws SQLException {
        //idoferta,fk_pedido,categoria,qtd,precoTotal
        
        Connection con = null;
        Oferta cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idoferta,fk_pedido,categoria,qtd,precoTotal FROM oferta WHERE idoferta=" + id + " ;");
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

    private Oferta gerarObjeto(ResultSet rs) throws SQLException {
        //idoferta,fk_pedido,categoria,qtd,precoTotal
        //categoria, p,precoTotal,qtd,or
        Oferta cl = new Oferta();
        cl.setPrecoTotal(rs.getInt("precoTotal"));
        cl.setQtd(rs.getInt("qtd"));
        //como setar os itens do pedido?
        //como setar a foreign key para pedido?
        cl.setCategoria(rs.getString("categoria"));
        

        return cl;
    }

    public void atualizarOferta(Oferta entity) throws SQLException {
        //idoferta,fk_pedido,categoria,qtd,precoTotal
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE empresa SET fk_pedido = " + entity.getOr() + ",categoria='" + entity.getCategoria() + "',qtd=" + entity.getQtd() + ",precoTotal="+entity.getPrecoTotal()+";";
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
