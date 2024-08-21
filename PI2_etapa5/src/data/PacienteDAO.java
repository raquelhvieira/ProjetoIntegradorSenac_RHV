package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class PacienteDAO {

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

    public boolean inserirPaciente(String nome, String cpf, String dataNasc) throws SQLException {
        String query = "INSERT INTO paciente (nome_pct, cpf_pct, dataNasc_pct) VALUES (?, ?, ?)";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, dataNasc);
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public String buscarNomePaciente(String pacienteNome) throws SQLException {
        String nomePaciente = null;
        String query = "SELECT nome_pct FROM paciente WHERE nome_pct = ?";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, pacienteNome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nomePaciente = rs.getString("nome_pct");
            }
        }
        return nomePaciente;
    }

    public int buscarIdPaciente(String pacienteNome) throws SQLException {
        int pacienteId = -1; 
        String query = "SELECT id FROM paciente WHERE nome_pct = ?";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, pacienteNome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pacienteId = rs.getInt("id");
            }
        }
        return pacienteId;
    }

    public void desconectar() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.out.print("erro ao desconectar " + ex.getMessage());
        }
    }

}
