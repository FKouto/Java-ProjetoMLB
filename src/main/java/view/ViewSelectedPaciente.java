package view;

import javax.swing.*;

/**
 *
 * @author couto
 */
public class ViewSelectedPaciente extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    public ViewSelectedPaciente() {
        initComponents();
        // Define o ícone da janela
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define o fundo da janela usando uma imagem SVG
        sVGImage1.setSvgImage("images/BackgroundCadastroPaciente.svg", 1000, 640);
        // Define uma imagem SVG para o componente sVGImage2
        sVGImage2.setSvgImage("images/returnIcon.svg", 44, 35);
        // Habilita a exibição do PlaceHolder nas Labels
        txtNomePaciente.setFocusable(true);
        txtEmail.setFocusable(true);
        txtEndereco.setFocusable(true);
        txtCelular.setFocusable(true);
        txtCpf.setFocusable(true);
        // Define a localização da janela como centralizada na tela
        this.setLocationRelativeTo(null);
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
        txtNomePaciente = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        btnCriarConta = new javax.swing.JButton();
        sVGImage2 = new view.SVGImage();
        sVGImage1 = new view.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Paciente");
        setLocation(new java.awt.Point(250, 50));
        setMinimumSize(new java.awt.Dimension(1000, 640));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomePaciente.setBackground(new java.awt.Color(247, 247, 247));
        txtNomePaciente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomePaciente.setText("Nome");
        txtNomePaciente.setToolTipText("");
        txtNomePaciente.setBorder(null);
        txtNomePaciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomePacienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomePacienteFocusLost(evt);
            }
        });
        jPanel1.add(txtNomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 172, 230, 30));

        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setText("E-mail");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 216, 230, 30));

        txtEndereco.setBackground(new java.awt.Color(247, 247, 247));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEndereco.setText("Endereço");
        txtEndereco.setBorder(null);
        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 263, 230, 30));

        txtCelular.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular.setText("Celular");
        txtCelular.setBorder(null);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 307, 230, 30));

        txtCpf.setBackground(new java.awt.Color(247, 247, 247));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpf.setText("CPF");
        txtCpf.setBorder(null);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 351, 230, 30));

        senhaPasswordField.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField.setText("jPasswordField1");
        senhaPasswordField.setBorder(null);
        jPanel1.add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 397, 230, 30));

        btnCriarConta.setBackground(new java.awt.Color(41, 151, 255));
        btnCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setText("CRIAR CONTA");
        btnCriarConta.setBorder(null);
        btnCriarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 438, 242, 35));

        sVGImage2.setText("sVGImage2");
        sVGImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sVGImage2MouseClicked(evt);
            }
        });
        jPanel1.add(sVGImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 44, 35));
        jPanel1.add(sVGImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

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
    /*FocusGained, Quando o componente é selecionado esse método é acionado.*/
    private void txtNomePacienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomePacienteFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "Nome".
        if (txtNomePaciente.getText().equals("Nome")) {
            txtNomePaciente.setText("");
        }
    }//GEN-LAST:event_txtNomePacienteFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "E-mail".
        if (txtEmail.getText().equals("E-mail")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "Endereço".
        if (txtEndereco.getText().equals("Endereço")) {
            txtEndereco.setText("");
        }
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "Celular".
        if (txtCelular.getText().equals("Celular")) {
            txtCelular.setText("");
        }
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "CPF".
        if (txtCpf.getText().equals("CPF")) {
            txtCpf.setText("");
        }
    }//GEN-LAST:event_txtCpfFocusGained
    /*FocusLost, Quando o componente perde o foco (deixa de ser selecionado).*/
    private void txtNomePacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomePacienteFocusLost
        if (txtNomePaciente.getText().equals("")) {
            txtNomePaciente.setText("Nome");
        }
    }//GEN-LAST:event_txtNomePacienteFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("E-mail");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        if (txtEndereco.getText().equals("")) {
            txtEndereco.setText("Endereço");
        }
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (txtCelular.getText().equals("")) {
            txtCelular.setText("Celular");
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if (txtCpf.getText().equals("")) {
            txtCpf.setText("CPF");
        }
    }//GEN-LAST:event_txtCpfFocusLost
    /*Click Voltar para tela selecionar tipo de Cadastro*/
    private void sVGImage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGImage2MouseClicked
        // Cria uma instância da classe ViewSelectTypeCadastro
        ViewSelectTypeCadastro returnTypeCadastro = new ViewSelectTypeCadastro();
        // Torna a janela atual invisível
        this.setVisible(false);
        // Torna a janela returnTypeCadastro visível
        returnTypeCadastro.setVisible(true);
    }//GEN-LAST:event_sVGImage2MouseClicked

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
            java.util.logging.Logger.getLogger(ViewSelectedPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSelectedPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JPanel jPanel1;
    private view.SVGImage sVGImage1;
    private view.SVGImage sVGImage2;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
