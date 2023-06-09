package view.SelectedCadastroPaciente;

import model.dao.EnderecoDAO;
import javax.swing.*;
import model.bean.Endereco;

public class InsertAddressPaciente extends javax.swing.JFrame {

    public InsertAddressPaciente() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/InsertAddressBackground.svg", 1000, 640);
        // Imagem botão de retorno
        btnReturn.setSvgImage("images/returnIcon.svg", 44, 35);
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
        btnReturn = new images.SVGImage();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        btnProximaTela = new javax.swing.JButton();
        Background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Paciente");
        setName("InsertPersonalDataFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 44, 35));

        txtRua.setBackground(new java.awt.Color(247, 247, 247));
        txtRua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRua.setText("Rua");
        txtRua.setBorder(null);
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 195, 230, 30));

        txtBairro.setBackground(new java.awt.Color(247, 247, 247));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBairro.setText("Bairro");
        txtBairro.setBorder(null);
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 240, 230, 30));

        txtCidade.setBackground(new java.awt.Color(247, 247, 247));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCidade.setText("Cidade");
        txtCidade.setBorder(null);
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 285, 230, 30));

        txtEstado.setBackground(new java.awt.Color(247, 247, 247));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEstado.setText("Estado");
        txtEstado.setBorder(null);
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 330, 230, 30));

        txtCep.setBackground(new java.awt.Color(247, 247, 247));
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCep.setText("CEP");
        txtCep.setBorder(null);
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 375, 230, 30));

        btnProximaTela.setBackground(new java.awt.Color(227, 1, 64));
        btnProximaTela.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnProximaTela.setForeground(new java.awt.Color(255, 255, 255));
        btnProximaTela.setText("Próximo");
        btnProximaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaTelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximaTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 413, 245, 38));

        Background.setText("sVGImage1");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Ação do botão voltar*/
    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        InsertAddressPaciente returnToAddress = new InsertAddressPaciente();
        returnToAddress.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnProximaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaTelaActionPerformed
        //Aula dia 13 - Apostila 13_apostila... Pag3
        //Identificando Dados Inseridos
        String rua = txtRua.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        int cep = Integer.parseInt(txtCep.getText());
        try {
            Endereco endereco = new Endereco(0,rua, bairro, cidade, estado, cep);
            EnderecoDAO enderecodao = new EnderecoDAO();
            enderecodao.createEndereco(endereco);
            System.out.println("Dados Salvos com sucesso");
        } catch (Exception e) {
            System.out.println("Não foi possivel inserir");
        }

        InsertPersonalDataPaciente clickNextPage = new InsertPersonalDataPaciente();
        clickNextPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProximaTelaActionPerformed

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
            java.util.logging.Logger.getLogger(InsertAddressPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAddressPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAddressPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAddressPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAddressPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnProximaTela;
    private images.SVGImage btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
