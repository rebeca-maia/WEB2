package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import model.Cliente;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Rebeca
 */
public class ClienteDAO {

    private Statement comando;

    public void adicionarCliente(Cliente entity) throws SQLException {
        Connection con = null;
        //como eu seto o idEndereco?
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (tipo,cnpj,razao_social,nome_fantasia,login,email,senha,idEndereco) VALUES( '" + entity.getTipo() + "','" + entity.getCnpj() + "','" + entity.getRazaoSocial() + "','" + entity.getNomeFantasia() + "','" + entity.getLogin() + "','" + entity.getEmail() + "','" + entity.getSenha() + "';";
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

    public void deletarCliente(Cliente p) throws SQLException {
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

    public ArrayList buscarClientePorNome(String nome) throws SQLException {

        Connection con = null;
        ArrayList<Cliente> r = new ArrayList();
        
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idEmpresa,tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE nome_fantasia LIKE('%" + nome + "%');");
            while (rs.next()) {
               Cliente p;
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

    public Cliente buscarClientePorID(int id) throws SQLException {

        Connection con = null;
        Cliente cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idEmpresa,tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE idEmpresa=" + id + " ;");
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

    private Cliente map(ResultSet rs) throws SQLException {
        //tipo,cnpj,razao_social,nome_fantasia,login,email,senha
        EnderecoDAO d = new EnderecoDAO();
        Cliente cl = new Cliente();
        cl.setTipo(rs.getString("tipo"));
        cl.setCnpj(rs.getString("cnpj"));
        cl.setRazaoSocial(rs.getString("razaoSocial"));
        cl.setNomeFantasia(rs.getString("nomeFantasia"));
        cl.setLogin(rs.getString("login"));
        cl.setEnd(d.buscarEnderecoPorID(rs.getInt("end")));    
        cl.setEmail(rs.getString("email"));
        cl.setSenha(rs.getString("senha"));

        return cl;
    }

    public void atualizarCliente(Cliente entity) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE empresa SET tipo = '" + entity.getTipo() + "',cnpj='" + entity.getCnpj() + "',razao_social='" + entity.getRazaoSocial() + "',nome_fantasia='" + entity.getNomeFantasia() + "',login='" + entity.getLogin() + "',email='" + entity.getEmail() + "',senha='" + entity.getSenha() + "' WHERE tipo='cliente';";
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
