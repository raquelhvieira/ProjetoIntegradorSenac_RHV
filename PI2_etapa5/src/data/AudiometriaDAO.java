package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AudiometriaDAO {

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

    public boolean inserirAudiometria(int pacienteId, String dataExameFormatada, int fonosId, int resultVA05OD, int resultVA1OD, int resultVA2OD, int resultVA3OD, int resultVA4OD, int resultVA6OD, int resultVA8OD, int resultVA05OE, int resultVA1OE, int resultVA2OE, int resultVA3OE, int resultVA4OE, int resultVA6OE, int resultVA8OE) throws SQLException {
        String query = "INSERT INTO audiometria (paciente_id, data_exame, fonos_id, aud_VAD_05, aud_VAD_1, aud_VAD_2, aud_VAD_3, aud_VAD_4, aud_VAD_6, aud_VAD_8, aud_VAE_05, aud_VAE_1, aud_VAE_2, aud_VAE_3, aud_VAE_4, aud_VAE_6, aud_VAE_8) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, pacienteId);
            ps.setString(2, dataExameFormatada);
            ps.setInt(3, fonosId);
            ps.setInt(4, resultVA05OD);
            ps.setInt(5, resultVA1OD);
            ps.setInt(6, resultVA2OD);
            ps.setInt(7, resultVA3OD);
            ps.setInt(8, resultVA4OD);
            ps.setInt(9, resultVA6OD);
            ps.setInt(10, resultVA8OD);
            ps.setInt(11, resultVA05OE);
            ps.setInt(12, resultVA1OE);
            ps.setInt(13, resultVA2OE);
            ps.setInt(14, resultVA3OE);
            ps.setInt(15, resultVA4OE);
            ps.setInt(16, resultVA6OE);
            ps.setInt(17, resultVA8OE);
            int rowsInserted = ps.executeUpdate();
            return rowsInserted > 0;
        }
    }

    public void desconectar() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.out.print("erro ao desconectar " + ex.getMessage());
        }
    }
}
