package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Endereco;

/**
 *
 * @author Rebeca
 */
public class EnderecoDAO {

    private Statement comando;
    
    private static EnderecoDAO instance;
    
    public static EnderecoDAO getInstance() {
        return instance == null ? instance = new EnderecoDAO() : instance;
    }

    public void adicionarEndereco(Endereco entity) throws SQLException {
        //rua,numero,bairro,complemento,cep,cidade,estado,pais
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (rua,numero,bairro,complemento,cep,cidade,estado,pais) VALUES( '" + entity.getRua() + "','" + entity.getNum() + "','" + entity.getBairro() + "','" + entity.getComplemento() + "','" + entity.getCep() + "','" + entity.getCidade() + "','" + entity.getEstado() + "','" + entity.getPais() + "';";
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
    
    public void atualizarEndereco(Endereco entity) throws SQLException {
        //rua,numero,bairro,complemento,cep,cidade,estado,pais
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE empresa SET rua = '" + entity.getRua() + "',numero='" + entity.getNum() + "',bairro='" + entity.getBairro() + "',complemento='" + entity.getComplemento() + "',cep='" + entity.getCep() + "',cidade='" + entity.getCidade() + "',estado='" + entity.getEstado() + "',pais='" + entity.getPais() + "';";
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
    public Endereco buscarEnderecoPorID(int id) throws SQLException {
        //idEndereco, rua, numero, bairro, complemento, cep, cidade, estado, pais

        Connection con = null;
        Endereco cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idEndereco,rua,numero,bairro,complemento,cep,cidade,estado,pais FROM endereco WHERE idEndereco=" + id + " ;");
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
    
     private Endereco gerarObjeto(ResultSet rs) throws SQLException {
        Endereco cl = new Endereco();
        cl.setRua(rs.getString("rua"));
        cl.setNum(rs.getString("num"));
        cl.setBairro(rs.getString("bairro"));
        cl.setComplemento(rs.getString("complemento"));
        cl.setCep(rs.getString("cep"));        
        cl.setCidade(rs.getString("cidade"));
        cl.setEstado(rs.getString("estado"));
        cl.setPais(rs.getString("pais"));
        return cl;
    }

    public void deleteEndereco(int id) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String sql = "DELETE * FROM endereco where id = " + id;
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

    public Statement getComando() {
        return comando;
    }
}
