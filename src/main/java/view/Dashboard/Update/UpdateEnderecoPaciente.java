package view.Dashboard.Update;

import view.SelectedCadastroPaciente.*;
import javax.swing.*;
import model.bean.Endereco;
import model.dao.PacienteDAO;

public class UpdateEnderecoPaciente extends javax.swing.JFrame {

    public UpdateEnderecoPaciente() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/InsertAddressPacienteBackground.svg", 1000, 640);
        //FocusGained Placeholder
        txtRua.setFocusable(true);
        txtBairro.setFocusable(true);
        txtCidade.setFocusable(true);
        txtEstado.setFocusable(true);
        txtCep.setFocusable(true);
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
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        btnAtualizarEndereco = new javax.swing.JButton();
        Background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Endereço | Paciente");
        setName("InsertPersonalDataFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRua.setBackground(new java.awt.Color(247, 247, 247));
        txtRua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRua.setText("Rua");
        txtRua.setBorder(null);
        txtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRuaFocusLost(evt);
            }
        });
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 195, 230, 30));

        txtBairro.setBackground(new java.awt.Color(247, 247, 247));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBairro.setText("Bairro");
        txtBairro.setBorder(null);
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 240, 230, 30));

        txtCidade.setBackground(new java.awt.Color(247, 247, 247));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCidade.setText("Cidade");
        txtCidade.setBorder(null);
        txtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCidadeFocusLost(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 285, 230, 30));

        txtEstado.setBackground(new java.awt.Color(247, 247, 247));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEstado.setText("Estado");
        txtEstado.setBorder(null);
        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 330, 230, 30));

        txtCep.setBackground(new java.awt.Color(247, 247, 247));
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCep.setText("CEP");
        txtCep.setBorder(null);
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 375, 230, 30));

        btnAtualizarEndereco.setBackground(new java.awt.Color(227, 1, 64));
        btnAtualizarEndereco.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAtualizarEndereco.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarEndereco.setText("Próximo");
        btnAtualizarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 413, 245, 38));

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

    private void btnAtualizarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarEnderecoActionPerformed

    }//GEN-LAST:event_btnAtualizarEnderecoActionPerformed
    //FocusGained (Funciona para limpar o campo quando é selecionado)
    private void txtRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusGained
        if (txtRua.getText().equals("Rua")) {
            txtRua.setText("");
        }
    }//GEN-LAST:event_txtRuaFocusGained

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        if (txtBairro.getText().equals("Bairro")) {
            txtBairro.setText("");
        }
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusGained
        if (txtCidade.getText().equals("Cidade")) {
            txtCidade.setText("");
        }
    }//GEN-LAST:event_txtCidadeFocusGained

    private void txtEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusGained
        if (txtEstado.getText().equals("Estado")) {
            txtEstado.setText("");
        }
    }//GEN-LAST:event_txtEstadoFocusGained

    private void txtCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusGained
        if (txtCep.getText().equals("CEP")) {
            txtCep.setText("");
        }
    }//GEN-LAST:event_txtCepFocusGained
    //FocusLost (Restaura o texto padrão se o campo não for mais selecionado e não estiver preenchido)
    private void txtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusLost
        if (txtRua.getText().equals("")) {
            txtRua.setText("Rua");
        }
    }//GEN-LAST:event_txtRuaFocusLost

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        if (txtBairro.getText().equals("Bairro")) {
            txtBairro.setText("Bairro");
        }
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusLost
        if (txtCidade.getText().equals("Cidade")) {
            txtCidade.setText("Cidade");
        }
    }//GEN-LAST:event_txtCidadeFocusLost

    private void txtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusLost
        if (txtEstado.getText().equals("")) {
            txtEstado.setText("Estado");
        }
    }//GEN-LAST:event_txtEstadoFocusLost

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        if (txtCep.getText().equals("")) {
            txtCep.setText("CEP");
        }
    }//GEN-LAST:event_txtCepFocusLost

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
            java.util.logging.Logger.getLogger(UpdateEnderecoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEnderecoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEnderecoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEnderecoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new UpdateEnderecoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnAtualizarEndereco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
