/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;

public class frmSolicitudes extends javax.swing.JFrame {

    /**
     * Creates new form frmSolicitud
     */
    public frmSolicitudes() {
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

        casilla_logo = new javax.swing.JPanel();
        ico_logo_40x40 = new javax.swing.JLabel();
        txt_proyecto = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JLabel();
        casilla_modulo = new javax.swing.JPanel();
        btn_atras_ico = new javax.swing.JButton();
        btn_atras_txt = new javax.swing.JButton();
        txt_modulo = new javax.swing.JLabel();
        casilla_formulario = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        fld_nombre = new javax.swing.JTextArea();
        txt_motivo = new javax.swing.JLabel();
        fld_motivo = new javax.swing.JTextArea();
        txt_grupo_sanguineo = new javax.swing.JLabel();
        box_grupo_sanguineo = new javax.swing.JComboBox<>();
        txt_factor_rh = new javax.swing.JLabel();
        box_factor_rh = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JLabel();
        fld_cantidad = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tbl_solicitudes = new javax.swing.JTable();
        casilla_botones = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SABS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla_logo.setBackground(new java.awt.Color(243, 95, 95));

        ico_logo_40x40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SABS_Logo_50x50.png"))); // NOI18N
        ico_logo_40x40.setText("jLabel7");

        txt_proyecto.setBackground(new java.awt.Color(255, 255, 255));
        txt_proyecto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_proyecto.setForeground(new java.awt.Color(255, 255, 255));
        txt_proyecto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_proyecto.setText("SISTEMA DE ADMINISTRACIÓN DEL BANCO DE SANGRE");

        txt_empresa.setBackground(new java.awt.Color(255, 255, 255));
        txt_empresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_empresa.setForeground(new java.awt.Color(255, 204, 204));
        txt_empresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_empresa.setText("Blood Care Bank");

        javax.swing.GroupLayout casilla_logoLayout = new javax.swing.GroupLayout(casilla_logo);
        casilla_logo.setLayout(casilla_logoLayout);
        casilla_logoLayout.setHorizontalGroup(
            casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_logoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ico_logo_40x40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_proyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(417, 417, 417))
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_empresa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        casilla_logoLayout.setVerticalGroup(
            casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_logoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(casilla_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_logoLayout.createSequentialGroup()
                        .addComponent(txt_proyecto)
                        .addGap(10, 10, 10)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ico_logo_40x40))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        casilla_modulo.setBackground(new java.awt.Color(255, 255, 255));

        btn_atras_ico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_atras_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SABS_Regresar_32x32.png"))); // NOI18N
        btn_atras_ico.setBorder(null);
        btn_atras_ico.setBorderPainted(false);
        btn_atras_ico.setContentAreaFilled(false);
        btn_atras_ico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras_ico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_icoActionPerformed(evt);
            }
        });

        btn_atras_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_atras_txt.setText("  ATRAS");
        btn_atras_txt.setBorder(null);
        btn_atras_txt.setBorderPainted(false);
        btn_atras_txt.setContentAreaFilled(false);
        btn_atras_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras_txt.setFocusPainted(false);
        btn_atras_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_txtActionPerformed(evt);
            }
        });

        txt_modulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_modulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_modulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_modulo.setText("MÓDULO DE REGISTRO DE SOLICITUDES");

        javax.swing.GroupLayout casilla_moduloLayout = new javax.swing.GroupLayout(casilla_modulo);
        casilla_modulo.setLayout(casilla_moduloLayout);
        casilla_moduloLayout.setHorizontalGroup(
            casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_moduloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_atras_ico)
                .addGap(0, 0, 0)
                .addComponent(btn_atras_txt)
                .addGap(58, 58, 58)
                .addComponent(txt_modulo)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        casilla_moduloLayout.setVerticalGroup(
            casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_moduloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(casilla_moduloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_atras_ico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_modulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_atras_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_modulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, -1));

        casilla_formulario.setBackground(new java.awt.Color(255, 204, 204));

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nombre.setText("NOMBRE :");

        fld_nombre.setColumns(20);
        fld_nombre.setLineWrap(true);
        fld_nombre.setRows(5);
        fld_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Document document_nombre = fld_nombre.getDocument();

        DocumentFilter filter_nombre = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 20)
                if ((fb.getDocument().getLength() + text.length()) <= 20) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 20)
                if ((fb.getDocument().getLength() - length + text.length()) <= 20) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_nombre).setDocumentFilter(filter_nombre);
        fld_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_nombreKeyTyped(evt);
            }
        });

        txt_motivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_motivo.setText("MOTIVO  :");

        fld_motivo.setColumns(20);
        fld_motivo.setLineWrap(true);
        fld_motivo.setRows(5);
        fld_motivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Document document_motivo = fld_motivo.getDocument();

        DocumentFilter filter_motivo = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 50)
                if ((fb.getDocument().getLength() + text.length()) <= 50) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 50)
                if ((fb.getDocument().getLength() - length + text.length()) <= 50) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_motivo).setDocumentFilter(filter_motivo);

        txt_grupo_sanguineo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_grupo_sanguineo.setText("GRUPO SANGUÍNEO :");

        box_grupo_sanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "O", "AB" }));

        txt_factor_rh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_factor_rh.setText("FACTOR RH               :");

        box_factor_rh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        box_factor_rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_factor_rhActionPerformed(evt);
            }
        });

        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cantidad.setText("CANTIDAD (ml)         :");

        fld_cantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fld_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fld_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_cantidadActionPerformed(evt);
            }
        });
        fld_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fld_cantidadKeyTyped(evt);
            }
        });
        Document document_cantidad = fld_cantidad.getDocument();

        DocumentFilter filter_cantidad = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 3)
                if ((fb.getDocument().getLength() + text.length()) <= 3) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Limitar el número de caracteres permitidos (en este caso, 3)
                if ((fb.getDocument().getLength() - length + text.length()) <= 3) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        ((AbstractDocument) document_cantidad).setDocumentFilter(filter_cantidad);

        tbl_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Motivo", "Grupo Sanguíneo", "Rh", "Cantidad (L)", "Fecha"
            }
        ));
        jScrollPane.setViewportView(tbl_solicitudes);

        javax.swing.GroupLayout casilla_formularioLayout = new javax.swing.GroupLayout(casilla_formulario);
        casilla_formulario.setLayout(casilla_formularioLayout);
        casilla_formularioLayout.setHorizontalGroup(
            casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_formularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_motivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(fld_motivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addComponent(txt_grupo_sanguineo)
                        .addGap(10, 10, 10)
                        .addComponent(box_grupo_sanguineo, 0, 106, Short.MAX_VALUE))
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_factor_rh)
                            .addComponent(txt_cantidad))
                        .addGap(10, 10, 10)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_cantidad)
                            .addComponent(box_factor_rh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        casilla_formularioLayout.setVerticalGroup(
            casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(casilla_formularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(casilla_formularioLayout.createSequentialGroup()
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre))
                        .addGap(13, 13, 13)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_motivo)
                            .addComponent(fld_motivo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_grupo_sanguineo)
                            .addComponent(box_grupo_sanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_factor_rh)
                            .addComponent(box_factor_rh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(casilla_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fld_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(casilla_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 780, 220));

        casilla_botones.setBackground(new java.awt.Color(255, 255, 255));
        casilla_botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrar.setBackground(new java.awt.Color(255, 204, 204));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(243, 95, 95));
        btn_registrar.setText("REGISTRAR"); // NOI18N
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        casilla_botones.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, 40));

        btn_eliminar.setBackground(new java.awt.Color(243, 95, 95));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 204, 204));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        casilla_botones.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 110, 40));

        getContentPane().add(casilla_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 780, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atras_icoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_icoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atras_icoActionPerformed

    private void btn_atras_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atras_txtActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void fld_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_cantidadKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_fld_cantidadKeyTyped

    private void fld_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_cantidadActionPerformed

    private void fld_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fld_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_nombreKeyTyped

    private void box_factor_rhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_factor_rhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_factor_rhActionPerformed

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
            java.util.logging.Logger.getLogger(frmSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSolicitudes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> box_factor_rh;
    public javax.swing.JComboBox<String> box_grupo_sanguineo;
    public javax.swing.JButton btn_atras_ico;
    public javax.swing.JButton btn_atras_txt;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_registrar;
    private javax.swing.JPanel casilla_botones;
    private javax.swing.JPanel casilla_formulario;
    private javax.swing.JPanel casilla_logo;
    private javax.swing.JPanel casilla_modulo;
    public javax.swing.JTextField fld_cantidad;
    public javax.swing.JTextArea fld_motivo;
    public javax.swing.JTextArea fld_nombre;
    private javax.swing.JLabel ico_logo_40x40;
    public javax.swing.JScrollPane jScrollPane;
    public javax.swing.JTable tbl_solicitudes;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_empresa;
    private javax.swing.JLabel txt_factor_rh;
    private javax.swing.JLabel txt_grupo_sanguineo;
    private javax.swing.JLabel txt_modulo;
    private javax.swing.JLabel txt_motivo;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_proyecto;
    // End of variables declaration//GEN-END:variables
}