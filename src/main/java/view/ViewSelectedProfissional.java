package view;

import javax.swing.ImageIcon;

public class ViewSelectedProfissional extends javax.swing.JFrame {

    public ViewSelectedProfissional() {
        initComponents();
        /*Icon Janela*/
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        /*Background*/
        sVGImage1.setSvgImage("images/BackgroundCadastroProfissional.svg", 1000, 640);
        sVGImage2.setSvgImage("images/returnIcon.svg", 24, 15);
        /*Permitindo a visibillidade da PlaceHolder nas Labels*/
        txtNomeProfissional.setFocusable(true);
        txtEmailProfissional.setFocusable(true);
        txtEnderecoProfissional.setFocusable(true);
        txtNumConselho.setFocusable(true);
        txtProfissionalizacao.setFocusable(true);
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
        jPasswordField1 = new javax.swing.JPasswordField();
        txtProfissionalizacao = new javax.swing.JTextField();
        txtNumConselho = new javax.swing.JTextField();
        txtEnderecoProfissional = new javax.swing.JTextField();
        txtEmailProfissional = new javax.swing.JTextField();
        txtNomeProfissional = new javax.swing.JTextField();
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

        jPasswordField1.setBackground(new java.awt.Color(247, 247, 247));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 440, 230, 30));

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

        txtEnderecoProfissional.setBackground(new java.awt.Color(247, 247, 247));
        txtEnderecoProfissional.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEnderecoProfissional.setText("Endereço");
        txtEnderecoProfissional.setBorder(null);
        txtEnderecoProfissional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnderecoProfissionalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoProfissionalFocusLost(evt);
            }
        });
        jPanel1.add(txtEnderecoProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 252, 230, 30));

        txtEmailProfissional.setBackground(new java.awt.Color(247, 247, 247));
        txtEmailProfissional.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmailProfissional.setText("E-mail");
        txtEmailProfissional.setBorder(null);
        txtEmailProfissional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailProfissionalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailProfissionalFocusLost(evt);
            }
        });
        jPanel1.add(txtEmailProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 207, 230, 30));

        txtNomeProfissional.setBackground(new java.awt.Color(247, 247, 247));
        txtNomeProfissional.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeProfissional.setText("Nome");
        txtNomeProfissional.setBorder(null);
        txtNomeProfissional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeProfissionalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeProfissionalFocusLost(evt);
            }
        });
        jPanel1.add(txtNomeProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 162, 230, 30));

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
    /*FocusGained*/
    private void txtNomeProfissionalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProfissionalFocusGained
        if (txtNomeProfissional.getText().equals("Nome")) {
            txtNomeProfissional.setText("");
        }
    }//GEN-LAST:event_txtNomeProfissionalFocusGained

    private void txtEmailProfissionalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailProfissionalFocusGained
        if (txtEmailProfissional.getText().equals("E-mail")) {
            txtEmailProfissional.setText("");
        }
    }//GEN-LAST:event_txtEmailProfissionalFocusGained

    private void txtEnderecoProfissionalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoProfissionalFocusGained
        if (txtEnderecoProfissional.getText().equals("Endereço")) {
            txtEnderecoProfissional.setText("");
        }
    }//GEN-LAST:event_txtEnderecoProfissionalFocusGained

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
    /*FocusLost*/
    private void txtNomeProfissionalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProfissionalFocusLost
        if (txtNomeProfissional.getText().equals("")) {
            txtNomeProfissional.setText("Nome");
        }
    }//GEN-LAST:event_txtNomeProfissionalFocusLost

    private void txtEmailProfissionalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailProfissionalFocusLost
        if (txtEmailProfissional.getText().equals("")) {
            txtEmailProfissional.setText("E-mail");
        }
    }//GEN-LAST:event_txtEmailProfissionalFocusLost

    private void txtEnderecoProfissionalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoProfissionalFocusLost
        if (txtEnderecoProfissional.getText().equals("")) {
            txtEnderecoProfissional.setText("Endereço");
        }
    }//GEN-LAST:event_txtEnderecoProfissionalFocusLost

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
        ViewSelectTypeCadastro returnTypeCadastro = new ViewSelectTypeCadastro();
        this.setVisible(false);
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
    private javax.swing.JPasswordField jPasswordField1;
    private view.SVGImage sVGImage1;
    private view.SVGImage sVGImage2;
    private javax.swing.JTextField txtEmailProfissional;
    private javax.swing.JTextField txtEnderecoProfissional;
    private javax.swing.JTextField txtNomeProfissional;
    private javax.swing.JTextField txtNumConselho;
    private javax.swing.JTextField txtProfissionalizacao;
    // End of variables declaration//GEN-END:variables
}
