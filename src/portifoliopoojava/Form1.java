
package portifoliopoojava;

import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.table.DefaultTableModel;

//DateTime
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Andre Jr Mello
 * 
 */
public class Form1 extends javax.swing.JFrame {


    public Form1() {
        initComponents();
    }
    
    // variaveis
    ArrayList<String> listaDenuncias = new ArrayList<>();
    DateTimeFormatter dataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameDenuncias = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDenuncias = new javax.swing.JTable();
        jFrameCadastrar = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtDenuncia = new javax.swing.JTextField();
        btnDesconectar = new javax.swing.JButton();
        btnVerDenuncias = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        txtErro = new javax.swing.JLabel();
        txtSenhaUser = new javax.swing.JPasswordField();

        jFrameDenuncias.setPreferredSize(new java.awt.Dimension(650, 460));
        jFrameDenuncias.setSize(new java.awt.Dimension(650, 460));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("DENUNCIAS");

        tabelaDenuncias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Data", "Denuncia"
            }
        ));
        jScrollPane1.setViewportView(tabelaDenuncias);
        if (tabelaDenuncias.getColumnModel().getColumnCount() > 0) {
            tabelaDenuncias.getColumnModel().getColumn(0).setMaxWidth(80);
            tabelaDenuncias.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelaDenuncias.getColumnModel().getColumn(2).setMinWidth(300);
        }

        javax.swing.GroupLayout jFrameDenunciasLayout = new javax.swing.GroupLayout(jFrameDenuncias.getContentPane());
        jFrameDenuncias.getContentPane().setLayout(jFrameDenunciasLayout);
        jFrameDenunciasLayout.setHorizontalGroup(
            jFrameDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameDenunciasLayout.createSequentialGroup()
                .addGroup(jFrameDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameDenunciasLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel2))
                    .addGroup(jFrameDenunciasLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jFrameDenunciasLayout.setVerticalGroup(
            jFrameDenunciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameDenunciasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jFrameCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrameCadastrar.setMaximumSize(new java.awt.Dimension(820, 480));
        jFrameCadastrar.setMinimumSize(new java.awt.Dimension(820, 480));
        jFrameCadastrar.setPreferredSize(new java.awt.Dimension(820, 480));
        jFrameCadastrar.setResizable(false);
        jFrameCadastrar.setSize(new java.awt.Dimension(820, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("DENUNCIAR OCORRENCIAS");
        jLabel1.setAlignmentX(0.5F);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR DENUNCIA");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtDenuncia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDenuncia.setToolTipText("");
        txtDenuncia.setName(""); // NOI18N
        txtDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenunciaActionPerformed(evt);
            }
        });

        btnDesconectar.setText("DESCONECTAR");
        btnDesconectar.setToolTipText("");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        btnVerDenuncias.setText("VER DENUNCIAS");
        btnVerDenuncias.setToolTipText("");
        btnVerDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDenunciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameCadastrarLayout = new javax.swing.GroupLayout(jFrameCadastrar.getContentPane());
        jFrameCadastrar.getContentPane().setLayout(jFrameCadastrarLayout);
        jFrameCadastrarLayout.setHorizontalGroup(
            jFrameCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnDesconectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerDenuncias)
                .addGap(19, 19, 19))
            .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                .addGroup(jFrameCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnCadastrar))
                    .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(txtDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        jFrameCadastrarLayout.setVerticalGroup(
            jFrameCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameCadastrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(txtDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(82, 82, 82)
                .addGroup(jFrameCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesconectar)
                    .addComponent(btnVerDenuncias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("TELA DE LOGIN");

        jLabel4.setText("Usuario");

        txtLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginUserActionPerformed(evt);
            }
        });

        jLabel5.setText("Senha");

        btnLogar.setText("Fazer Login");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        txtErro.setForeground(new java.awt.Color(255, 0, 0));
        txtErro.setText("     ");
        txtErro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtErroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtSenhaUser.setMaximumSize(new java.awt.Dimension(64, 22));
        txtSenhaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLogar)
                                    .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtErro, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSenhaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogar)
                .addGap(18, 18, 18)
                .addComponent(txtErro)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenunciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenunciaActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        dispose();
        
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnVerDenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDenunciasActionPerformed
         // Bot??o ver denuncias
         jFrameDenuncias.setVisible(true);

    }//GEN-LAST:event_btnVerDenunciasActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Bot??o cadastrar den??ncia:
        String denunciaTexto = txtDenuncia.getText();
        listaDenuncias.add(denunciaTexto);
        txtDenuncia.setText("");
        Object[] dados = {txtLoginUser.getText(), dataHora.format(LocalDateTime.now()), denunciaTexto};
        DefaultTableModel tabela = (DefaultTableModel)tabelaDenuncias.getModel();
        tabela.addRow(dados);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtSenhaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUserActionPerformed

    private void txtErroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtErroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErroAncestorAdded

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed

        if(Usuarios.cadastrados.containsKey(txtLoginUser.getText()))
        //Conferindo se o usuario tem no map
        {
            if(Usuarios.cadastrados.get(txtLoginUser.getText()).equals(txtSenhaUser.getText())) {
                //Coferindo a senha
                txtErro.setForeground(new java.awt.Color(0, 155, 0));
                txtErro.setText("Conectado com sucesso!");
                //sleep pra ficar bonito
                jFrameCadastrar.setVisible(true);
                dispose();
            } else {
                txtErro.setText("A senha est?? incorreta!");
            }
        } else {
            txtErro.setText("Usu??rio n??o cadastrado!");
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginUserActionPerformed

    
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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnVerDenuncias;
    private javax.swing.JFrame jFrameCadastrar;
    private javax.swing.JFrame jFrameDenuncias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDenuncias;
    private javax.swing.JTextField txtDenuncia;
    private javax.swing.JLabel txtErro;
    private javax.swing.JTextField txtLoginUser;
    private javax.swing.JPasswordField txtSenhaUser;
    // End of variables declaration//GEN-END:variables

    private Consumer<? super String> print(ArrayList<String> listaDenuncias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
