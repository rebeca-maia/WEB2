package dao;

import java.sql.Connection;
import model.Cliente;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Rebeca
 */
public class ClienteDAO {
    private Statement comando;
    
    public void adicionarCliente(Cliente entity) throws SQLException{
     Connection con = null;
        try {
            con = ConexaoDAO.getConexaoMySQL();
            String s = "INSERT INTO (tipo,cnpj,razao_social,nome_fantasia) VALUES( '"+entity.getTipo()+"','"+entity.getCnpj()+"','"+entity.getRazaoSocial()+"','"+entity.getNomeFantasia()+"';";
            getComando().executeQuery(s);
            String update_sql = "UPDATE empresa SET tipo = '"+entity.getTipo()+"',cnpj='"+entity.getCnpj()+"',razao_social='"+entity.getRazaoSocial()+"',nome_fantasia='"+entity.getNomeFantasia()+"' WHERE tipo='cliente';";
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
