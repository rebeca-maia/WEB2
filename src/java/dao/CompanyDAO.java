package dao;

import general.ConnectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Address;
import model.Company;

public class CompanyDAO {

    public Company selectOne(int id) throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "SELECT *"
                + "FROM empresa AS E "
                + "INNER JOIN endereco AS EN ON E.idEndereco = EN.idEndereco "
                + "WHERE idEmpresa = ? "
                + "LIMIT 1";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Company company = null;
        Address address = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) {

                company = new Company();
                address = new Address();

                company.setId(rs.getInt("IdEmpresa"));
                company.setTipo(rs.getString("tipo"));
                company.setCnpj(rs.getString("cnpj"));
                company.setRazaoSocial(rs.getString("razao_social"));
                company.setNomeFantasia(rs.getString("nome_fantasia"));
                company.setEmail(rs.getString("email"));

                address.setIdEndereco(rs.getInt("IdEndereco"));
                address.setRua(rs.getString("rua"));
                address.setNumero(rs.getString("numero"));
                address.setBairro(rs.getString("bairro"));
                address.setComplemento(rs.getString("complemento"));
                address.setCep(rs.getString("cep"));
                address.setCidade(rs.getString("cidade"));
                address.setEstado(rs.getString("estado"));
                address.setPais(rs.getString("pais"));

                company.setEndereco(address);
            }

            return company;

        } catch (SQLException ex) {
            throw new Exception("Erro! A comunicação com o banco de dados falhou.");

        } finally {
            ConnectionBD.closeConn(con, stmt, rs);
        }

    }

    public List<Company> selectAll() throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "SELECT * FROM empresa";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Company> result = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {

                Company company = new Company();

                company.setId(rs.getInt("IdEmpresa"));
                company.setTipo(rs.getString("tipo"));
                company.setCnpj(rs.getString("cnpj"));
                company.setRazaoSocial(rs.getString("razao_social"));
                company.setNomeFantasia(rs.getString("nome_fantasia"));
                company.setEmail(rs.getString("email"));

                result.add(company);
            }

            return result;

        } catch (SQLException ex) {
            throw new Exception("Erro! A comunicação com o banco de dados falhou.");

        } finally {
            ConnectionBD.closeConn(con, stmt, rs);
        }
    }

    public void insert(Address address) throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "INSERT INTO "
                + "endereco (rua, numero, bairro, complemento, cep, cidade, estado, pais) "
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

    public void update(Address address) throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "UPDATE endereco "
                + "SET rua = ?, numero = ?, bairro = ?, complemento = ?,"
                + "cep = ?, cidade = ?, estado = ?, pais = ?"
                + "WHERE idEndereco = ?";

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
            stmt.setInt(9, address.getIdEndereco());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new Exception("Erro! A comunicação com o banco de dados falhou.");

        } finally {
            ConnectionBD.closeConn(con, stmt);
        }
    }

    public void delete(int id) throws Exception {

        ConnectionBD.startConn();
        Connection con = ConnectionBD.getConn();

        String sql = "DELETE FROM endereco WHERE idEndereco = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            throw new Exception("Erro! A comunicação com o banco de dados falhou.");

        } finally {
            ConnectionBD.closeConn(con, stmt);
        }
    }
}
