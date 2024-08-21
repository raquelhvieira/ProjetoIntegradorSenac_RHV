package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FonoDAO {

    private Conexao conexao;
    private Connection conn;

    public boolean conectar() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
        if (this.conn == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean inserirFono(String nomeFono, String crfa) throws SQLException {
        String query = "INSERT INTO fonos (nome_fono, crfa) VALUES (?, ?)";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nomeFono);
            ps.setString(2, crfa);
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public String buscarNomeFono(String fonoNome) throws SQLException {
        String nomeFono = null;
        String query = "SELECT nome_fono FROM fonos WHERE nome_fono = ?";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, fonoNome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nomeFono = rs.getString("nome_fono");
            }
        }
        return nomeFono;
    }

    public int buscarIdFono(String fonoNome) throws SQLException {
        int fonoId = -1;
        String query = "SELECT id FROM fonos WHERE nome_fono = ?";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, fonoNome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                fonoId = rs.getInt("id");
            }
        }
        return fonoId;
    }

    public void desconectar() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar: " + ex.getMessage());
        }
    }

}
