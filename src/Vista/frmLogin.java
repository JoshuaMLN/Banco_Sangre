/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmSistema
     */
    public frmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casilla_login = new javax.swing.JPanel();
        txt_empresa = new javax.swing.JLabel();
        txt_bienvenido = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        fld_usuario = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JLabel();
        fld_contraseña = new javax.swing.JPasswordField();
        btn_ingresar = new javax.swing.JButton();
        casilla_logo = new javax.swing.JPanel();
        txt_proyecto_part1 = new javax.swing.JLabel();
        txt_proyecto_part2 = new javax.swing.JLabel();
        ico_logo_150x150 = new javax.swing.JLabel();
        txt_sabs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SABS");
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(520, 60));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla_login.setBackground(new java.awt.Color(255, 204, 204));
        casilla_login.setPreferredSize(new java.awt.Dimension(260, 300));

        txt_empresa.setFont(new java.awt.Font("Font Awesome 5 Free Solid", 1, 14)); // NOI18N
        txt_empresa.setForeground(new java.awt.Color(243, 95, 95));
        txt_empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_empresa.setText("Blood Care Bank");

        txt_bienvenido.setBackground(new java.awt.Color(255, 255, 255));
        txt_bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txt_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_bienvenido.setText("Bienvenido");

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_usuario.setText("USUARIO");

        fld_usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fld_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_usuarioActionPerformed(evt);
            }
        });

        txt_contraseña.setText("CONTRASEÑA");

        fld_contraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fld_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_contraseñaActionPerformed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(243, 95, 95));
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout casilla_loginLayout = new javax.swing.GroupLayout(casilla_login);
        casilla_login.setLayout(casilla_loginLayout);
        casilla_loginLayout.setHorizontalGroup(
            casilla_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(casilla_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contraseña)
                    .addGroup(casilla_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(casilla_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fld_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(fld_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txt_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_usuario))))
                .addGap(50, 50, 50))
        );
        casilla_loginLayout.setVerticalGroup(
            casilla_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, casilla_loginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt_empresa)
                .addGap(10, 10, 10)
                .addComponent(txt_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txt_usuario)
                .addGap(10, 10, 10)
                .addComponent(fld_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_contraseña)
                .addGap(10, 10, 10)
                .addComponent(fld_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_ingresar)
                .addGap(40, 40, 40))
        );

        getContentPane().add(casilla_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 300));

        casilla_logo.setBackground(new java.awt.Color(243, 95, 95));
        casilla_logo.setMinimumSize(new java.awt.Dimension(260, 300));
        casilla_logo.setName(""); // NOI18N
        casilla_logo.setPreferredSize(new java.awt.Dimension(260, 300));
        casilla_logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_proyecto_part1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_proyecto_part1.setForeground(new java.awt.Color(255, 255, 255));
        txt_proyecto_part1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_proyecto_part1.setText("SISTEMA DE ADMINISTRACIÓN");
        casilla_logo.add(txt_proyecto_part1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, -1));

        txt_proyecto_part2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_proyecto_part2.setForeground(new java.awt.Color(255, 255, 255));
        txt_proyecto_part2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_proyecto_part2.setText("DEL BANCO DE SANGRE");
        casilla_logo.add(txt_proyecto_part2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, -1));

        ico_logo_150x150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SABS_Logo_150x150.png"))); // NOI18N
        casilla_logo.add(ico_logo_150x150, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 150));

        txt_sabs.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txt_sabs.setForeground(new java.awt.Color(255, 255, 255));
        txt_sabs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_sabs.setText("SABS");
        casilla_logo.add(txt_sabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, -1));

        getContentPane().add(casilla_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 260, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_contraseñaActionPerformed

    private void fld_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_usuarioActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ingresar;
    public javax.swing.JPanel casilla_login;
    public javax.swing.JPanel casilla_logo;
    public javax.swing.JPasswordField fld_contraseña;
    public javax.swing.JTextField fld_usuario;
    private javax.swing.JLabel ico_logo_150x150;
    private javax.swing.JLabel txt_bienvenido;
    private javax.swing.JLabel txt_contraseña;
    private javax.swing.JLabel txt_empresa;
    private javax.swing.JLabel txt_proyecto_part1;
    private javax.swing.JLabel txt_proyecto_part2;
    private javax.swing.JLabel txt_sabs;
    private javax.swing.JLabel txt_usuario;
    // End of variables declaration//GEN-END:variables
}
