package view;

import javax.swing.ImageIcon;

public class ViewSelectedProfissional extends javax.swing.JFrame {

    public ViewSelectedProfissional() {
        initComponents();
        // Define o ícone da janela
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define o fundo da janela usando uma imagem SVG
        sVGImage1.setSvgImage("images/BackgroundCadastroProfissional.svg", 1000, 640);
        // Define uma imagem SVG para o componente sVGImage2
        sVGImage2.setSvgImage("images/returnIcon.svg", 24, 15);
        // Habilita a exibição do PlaceHolder nas Labels
        txtNome.setFocusable(true);
        txtEmail.setFocusable(true);
        txtEndereco.setFocusable(true);
        txtNumConselho.setFocusable(true);
        txtProfissionalizacao.setFocusable(true);
        // Define a localização da janela como centralizada na tela
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        btnCriarConta = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        txtProfissionalizacao = new javax.swing.JTextField();
        txtNumConselho = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sVGImage2 = new view.SVGImage();
        sVGImage1 = new view.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Paciente");
        setLocation(new java.awt.Point(250, 50));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox2.setText("Psiquiatra");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 120, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox1.setText("Psicólogo");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 120, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox3.setText("On-line");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 402, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jCheckBox4.setText("Presencial");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 402, -1, -1));

        btnCriarConta.setBackground(new java.awt.Color(41, 151, 255));
        btnCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setText("CRIAR CONTA");
        btnCriarConta.setBorder(null);
        btnCriarConta.setBorderPainted(false);
        jPanel1.add(btnCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 485, 242, 35));

        senhaPasswordField.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaPasswordField.setText("jPasswordField1");
        senhaPasswordField.setBorder(null);
        jPanel1.add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 440, 230, 30));

        txtProfissionalizacao.setBackground(new java.awt.Color(247, 247, 247));
        txtProfissionalizacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtProfissionalizacao.setText("Profissionalização");
        txtProfissionalizacao.setBorder(null);
        txtProfissionalizacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProfissionalizacaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProfissionalizacaoFocusLost(evt);
            }
        });
        jPanel1.add(txtProfissionalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 342, 230, 30));

        txtNumConselho.setBackground(new java.awt.Color(247, 247, 247));
        txtNumConselho.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNumConselho.setText("Número do Conselho");
        txtNumConselho.setBorder(null);
        txtNumConselho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumConselhoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumConselhoFocusLost(evt);
            }
        });
        jPanel1.add(txtNumConselho, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 297, 230, 30));

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
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 252, 230, 30));

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
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 207, 230, 30));

        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setText("Nome");
        txtNome.setBorder(null);
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 162, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 160, 160));
        jLabel2.setText("Tipo de Consulta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 378, -1, -1));

        sVGImage2.setText("sVGImage2");
        sVGImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sVGImage2MouseClicked(evt);
            }
        });
        jPanel1.add(sVGImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 24, 15));
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
    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if (txtNome.getText().equals("Nome")) {
            txtNome.setText("");
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("E-mail")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusGained
        if (txtEndereco.getText().equals("Endereço")) {
            txtEndereco.setText("");
        }
    }//GEN-LAST:event_txtEnderecoFocusGained

    private void txtNumConselhoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumConselhoFocusGained
        if (txtNumConselho.getText().equals("Número do Conselho")) {
            txtNumConselho.setText("");
        }
    }//GEN-LAST:event_txtNumConselhoFocusGained

    private void txtProfissionalizacaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProfissionalizacaoFocusGained
        if (txtProfissionalizacao.getText().equals("Profissionalização")) {
            txtProfissionalizacao.setText("");
        }
    }//GEN-LAST:event_txtProfissionalizacaoFocusGained
    /*FocusLost, Quando o componente perde o foco (deixa de ser selecionado).*/
    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if (txtNome.getText().equals("")) {
            txtNome.setText("Nome");
        }
    }//GEN-LAST:event_txtNomeFocusLost

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

    private void txtNumConselhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumConselhoFocusLost
        if (txtNumConselho.getText().equals("")) {
            txtNumConselho.setText("Número do Conselho");
        }
    }//GEN-LAST:event_txtNumConselhoFocusLost

    private void txtProfissionalizacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProfissionalizacaoFocusLost
        if (txtProfissionalizacao.getText().equals("")) {
            txtProfissionalizacao.setText("Profissionalização");
        }
    }//GEN-LAST:event_txtProfissionalizacaoFocusLost
    /*Click Voltar para tela selecionar tipo de Cadastro*/
    private void sVGImage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGImage2MouseClicked
        // Cria uma instância da classe ViewSelectTypeCadastro
        ViewSelectTypeCadastro returnTypeCadastro = new ViewSelectTypeCadastro();
        // Torna a janela atual invisível
        this.setVisible(false);
        // Torna a janela returnTypeCadastro visível
        returnTypeCadastro.setVisible(true);
    }//GEN-LAST:event_sVGImage2MouseClicked

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
            java.util.logging.Logger.getLogger(ViewSelectedProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelectedProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSelectedProfissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private view.SVGImage sVGImage1;
    private view.SVGImage sVGImage2;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumConselho;
    private javax.swing.JTextField txtProfissionalizacao;
    // End of variables declaration//GEN-END:variables
}
