package view;


import view.TelaInicio;
import data.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroPaciente extends javax.swing.JFrame {

    private PacienteDAO pctDAO;

    public TelaCadastroPaciente() {
        initComponents();
        pctDAO = new PacienteDAO();
        // Conectar ao banco de dados usando FonoDAO
        if (pctDAO.conectar()) {
            JOptionPane.showMessageDialog(this, "Conexão com o banco de dados estabelecida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    //método para limpar os campos
    private void limparCampos() {
        jtf_nomePct.setText("");
        jff_cpf.setText("");
        jff_dataNasc.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_logoCadPct = new javax.swing.JLabel();
        lbl_cadPaciente = new javax.swing.JLabel();
        btn_voltarCadPct = new javax.swing.JButton();
        btn_salvarPct = new javax.swing.JButton();
        lbl_nomePct = new javax.swing.JLabel();
        jtf_nomePct = new javax.swing.JTextField();
        lbl_dataNasc = new javax.swing.JLabel();
        jff_dataNasc = new javax.swing.JFormattedTextField();
        lbl_cpf = new javax.swing.JLabel();
        jff_cpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Easy Audio - Cadastro do paciente");
        setBackground(new java.awt.Color(214, 218, 219));

        jPanel1.setBackground(new java.awt.Color(214, 218, 219));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 360));

        lbl_logoCadPct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EASY AUDIO LOGO.png"))); // NOI18N

        lbl_cadPaciente.setBackground(new java.awt.Color(214, 218, 219));
        lbl_cadPaciente.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lbl_cadPaciente.setForeground(new java.awt.Color(4, 79, 87));
        lbl_cadPaciente.setText("CADASTRO DO PACIENTE");

        btn_voltarCadPct.setBackground(new java.awt.Color(214, 218, 219));
        btn_voltarCadPct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btn_voltarCadPct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarCadPctActionPerformed(evt);
            }
        });

        btn_salvarPct.setBackground(new java.awt.Color(6, 173, 153));
        btn_salvarPct.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_salvarPct.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvarPct.setText("Salvar");
        btn_salvarPct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarPctActionPerformed(evt);
            }
        });

        lbl_nomePct.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nomePct.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_nomePct.setForeground(new java.awt.Color(6, 173, 153));
        lbl_nomePct.setText("NOME:");

        jtf_nomePct.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jtf_nomePct.setForeground(new java.awt.Color(4, 79, 87));
        jtf_nomePct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomePctActionPerformed(evt);
            }
        });

        lbl_dataNasc.setBackground(new java.awt.Color(255, 255, 255));
        lbl_dataNasc.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_dataNasc.setForeground(new java.awt.Color(6, 173, 153));
        lbl_dataNasc.setText("DN:");

        jff_dataNasc.setForeground(new java.awt.Color(4, 79, 87));
        try {
            jff_dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jff_dataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jff_dataNascActionPerformed(evt);
            }
        });

        lbl_cpf.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cpf.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_cpf.setForeground(new java.awt.Color(6, 173, 153));
        lbl_cpf.setText("CPF:");

        jff_cpf.setForeground(new java.awt.Color(4, 79, 87));
        try {
            jff_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_logoCadPct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_voltarCadPct)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_cadPaciente)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salvarPct, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jff_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jff_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nomePct, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_nomePct, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_voltarCadPct)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_logoCadPct)))
                .addGap(1, 1, 1)
                .addComponent(lbl_cadPaciente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nomePct, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nomePct, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jff_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jff_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_salvarPct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarCadPctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarCadPctActionPerformed
        // TODO add your handling code here:

        TelaInicio ini = new TelaInicio();
        ini.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_voltarCadPctActionPerformed

    private void jtf_nomePctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomePctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomePctActionPerformed

    private void btn_salvarPctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarPctActionPerformed
        // Método para salvar os dados do paciente no banco de dados
        String nome = jtf_nomePct.getText();
        String cpf = jff_cpf.getText().replace(".", "").replace("-", ""); // Removendo pontuações do CPF
        String dataNascStr = jff_dataNasc.getText();

        try {
            // Convertendo a data para o formato do BD
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoBD = new SimpleDateFormat("yyyy-MM-dd");
            Date dataNasc = formatoEntrada.parse(dataNascStr);
            String dataNascFormatada = formatoBD.format(dataNasc);

            // Chama o método da classe PacienteDAO para inserir os dados na tabela paciente
            if (pctDAO.inserirPaciente(nome, cpf, dataNascFormatada)) {
                JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o paciente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar os dados do paciente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_salvarPctActionPerformed

    private void jff_dataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jff_dataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jff_dataNascActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvarPct;
    private javax.swing.JButton btn_voltarCadPct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField jff_cpf;
    private javax.swing.JFormattedTextField jff_dataNasc;
    private javax.swing.JTextField jtf_nomePct;
    private javax.swing.JLabel lbl_cadPaciente;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_dataNasc;
    private javax.swing.JLabel lbl_logoCadPct;
    private javax.swing.JLabel lbl_nomePct;
    // End of variables declaration//GEN-END:variables
}
