package dao;
import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.SQLException;
/**
 *
 * @author Rebeca
 */
public final class ConexaoDAO {
    private static ConexaoDAO instance;
    
    public static ConexaoDAO getInstance() {
        return instance == null ? instance = new ConexaoDAO() : instance;
    }

    public static java.sql.Connection getConexaoMySQL() {
 
        Connection connection = null;          
 
    try {
 
        String driverName = "com.mysql.jdbc.Driver";                        
 
        Class.forName(driverName);
            String serverName = "localhost:3306/Web";    //caminho do servidor do BD  
            String url = "jdbc:mysql://" + serverName; 
            String username = "admin";        //nome de um usuário de seu BD 
            String password = "admin";      //sua senha de acesso 
            connection = DriverManager.getConnection(url, username, password);
            
        return connection; 
        } catch (ClassNotFoundException e) {  //Driver não encontrado 
            System.out.println("O driver expecificado nao foi encontrado."); 
            return null; 
        } catch (SQLException e) { 
            System.out.println("Nao foi possivel conectar ao Banco de Dados."); 
            return null;
         } 
    }
        public static boolean FecharConexao() { 
        try { 
            ConexaoDAO.getConexaoMySQL().close(); 
            return true; 
        } catch (SQLException e) { 
            return false;
        } 
    }
        
        public static java.sql.Connection ReiniciarConexao(){
           ConexaoDAO.FecharConexao();
           return ConexaoDAO.getConexaoMySQL();
        }

}
