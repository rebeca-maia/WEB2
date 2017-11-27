package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Endereco;
import model.Fornecedor;

/**
 *
 * @author Rebeca
 */
public class FornecedorDAO {
    private Statement comando;
    
    public void adicionarFornecedor(Fornecedor entity) throws SQLException{
     Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (tipo,cnpj,razao_social,nome_fantasia,login,email,senha) VALUES( '"+entity.getTipo()+"','"+entity.getCnpj()+"','"+entity.getRazaoSocial()+"','"+entity.getNomeFantasia()+"','"+entity.getLogin()+"','"+entity.getEmail()+"','"+entity.getSenha()+"';";
            getComando().executeQuery(s);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
    }
    public void deletarFornecedor(Fornecedor p) throws SQLException {
        Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String sql = "DELETE * FROM empresa WHERE id = "+p.getId();
            comando.executeQuery(sql);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
    }
    public Fornecedor buscarFornecedorPorID(int id) throws SQLException{
      
        Connection con = null;
        Fornecedor cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idEmpresa,tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE idEmpresa="+id+" ;");
            if (rs.next()) {
                cl = map(rs);
            }
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
        return cl;
    }
    
    public Fornecedor buscarFornecedorPorCNPJ(String cnpj) throws SQLException{
      
        Connection con = null;
        Fornecedor cl = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT idEmpresa,tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE cnpj='"+cnpj+"' ;");
            if (rs.next()) {
                cl = map(rs);
            }
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
        return cl;
    }
    
    public ArrayList buscarFornecedorPorNome(String nome) throws SQLException{
      
        Connection con = null;
        ArrayList<Fornecedor> f = new ArrayList();
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE nome_fantasia LIKE('%"+nome+"%');");
            if (rs.next()) {
                Fornecedor cl;
                cl = map(rs);
                f.add(cl);
            }
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
        return f;
    }
    
    public ArrayList buscarFornecedorPorRazSoc(String nome) throws SQLException{
      
        Connection con = null;
        ArrayList<Fornecedor> f = new ArrayList();
        try {
            con = ConexaoDAO.getConexaoMySQL();
            ResultSet rs = comando.executeQuery("SELECT tipo,cnpj,razao_social,nome_fantasia,login,email,senha FROM empresa WHERE razao_social LIKE('%"+nome+"%');");
            if (rs.next()) {
                Fornecedor cl;
                cl = map(rs);
                f.add(cl);
            }
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
        return f;
    }
    
    private Fornecedor map(ResultSet rs) throws SQLException {
       //tipo,cnpj,razao_social,nome_fantasia,login,email,senha
        Fornecedor cl = new Fornecedor();
        EnderecoDAO d = new EnderecoDAO();
        
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
     
    public void atualizarFornecedor(Fornecedor entity) throws SQLException{
          Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String update_sql = "UPDATE empresa SET tipo = '"+entity.getTipo()+"',cnpj='"+entity.getCnpj()+"',razao_social='"+entity.getRazaoSocial()+"',nome_fantasia='"+entity.getNomeFantasia()+"',login='"+entity.getLogin()+"',email='"+entity.getEmail()+"',senha='"+entity.getSenha()+"' WHERE tipo='cliente';";
            getComando().executeQuery(update_sql);
        } catch (SQLException e) {
            throw new SQLException("Operação não realizada com sucesso.", e);
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                throw new SQLException("Não foi possível fechar a conexão.",e);
            }
        }
     }
    public Statement getComando() {
        return comando;
    }
}
