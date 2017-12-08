package dao;

//import general.Configs;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import model.Address;

public class AddressDAO {

    public void insert(Address address) throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "INSERT INTO "
                + "endereco (`rua`, `numero`, `bairro`, `complemento`, `cep`, `cidade`, `estado`, `pais`) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, address.getRua());
            stmt.setString(2, address.getNumero());
            stmt.setString(3, address.getBairro());
            stmt.setString(4, address.getComplemento());
            stmt.setString(5, address.getCep());
            stmt.setString(6, address.getCidade());
            stmt.setString(7, address.getEstado());
            stmt.setString(8, address.getPais());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new Exception("Erro! A comunicação com o banco de dados falhou.");

        } finally {
            ConnectionBD.closeConn(con, stmt);
        }
    }
}
