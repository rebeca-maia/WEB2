package general;

import general.Configs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionBD {

    private static Connection conn;

    private ConnectionBD() throws Exception {
        try {
            Class.forName(Configs.getDbDriver());

            ConnectionBD.conn = DriverManager.getConnection(Configs.getDbUrl(), Configs.getDbUser(), Configs.getDbPass());

        } catch (ClassNotFoundException | SQLException ex) {
            throw new Exception("Erro! A conexão com o banco de dados falhou.");
        }
    }

    public static void startConn() throws Exception {
        if (ConnectionBD.conn == null) {
            new ConnectionBD();
        }
    }

    public static Connection getConn() {
        return ConnectionBD.conn;
    }

    public static void closeConn(Connection con) {
        if (con != null) {
            try {
                con.close();
                ConnectionBD.conn = null;
            } catch (SQLException ex) {
                System.err.println("Close connection error" + ex);
            }
        }
    }

    public static void closeConn(Connection con, PreparedStatement stmt) {
        if (con != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Close connection error" + ex);
            }
        }
        ConnectionBD.closeConn(con);
    }

    public static void closeConn(Connection con, PreparedStatement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Close connection error" + ex);
            }
        }
        ConnectionBD.closeConn(con, stmt);
    }
}
