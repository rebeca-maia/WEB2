package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Rebeca
 */
public class ProdutoDAO {
    //BD=idproduto,titulo,descricao,preco
    //Java=titulo,descricao,preco
    
    private Statement comando;
    
    private static ProdutoDAO instancia;
   
    
    public static ProdutoDAO getInstance() {
        return instancia == null ? instancia = new ProdutoDAO() : instancia;
    }
    
    public void adicionarProduto(Produto entity) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (titulo,descricao,preco) VALUES( '" + entity.getTitulo() + "','" + entity.getDescricao() + "'," + entity.getPreco() + ";";
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

    public void deletarProduto(Produto p) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String sql = "DELETE * FROM produto WHERE id = " + p.getId();
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

    public ArrayList buscarProdutoPorTitulo(String titulo) throws SQLException {
        //BD=idproduto,titulo,descricao,preco
        Connection con = null;
        ArrayList<Produto> r = new ArrayList();
        
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idproduto,titulo,descricao,preco FROM produto WHERE titulo LIKE('%" + titulo + "%');");
            while (rs.next()) {
               Produto p;
               p= map(rs);
               r.add(p);
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
        return r;
    }

    public Produto buscarProdutoPorID(int id) throws SQLException {
        //BD=idproduto,titulo,descricao,preco
        Connection con = null;
        Produto cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idproduto,titulo,descricao,preco FROM produto WHERE idproduto=" + id + " ;");
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

    private Produto map(ResultSet rs) throws SQLException {
        //BD=idproduto,titulo,descricao,preco
        Produto cl = new Produto();
        cl.setTitulo(rs.getString("titulo"));
        cl.setDescricao(rs.getString("descricao"));
        cl.setPreco(rs.getFloat("preco"));
        
        return cl;
    }

    public void atualizarProduto(Produto entity) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE produto SET titulo = '" + entity.getTitulo() + "',='" + entity.getDescricao() + "',preco=" + entity.getPreco() + " ;";
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
