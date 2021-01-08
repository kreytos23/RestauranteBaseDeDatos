
package Swing;
/**
 * @author serpi
 */
public class MenuRoles extends javax.swing.JPanel {

    private AdminUser adminUser;
    
    public MenuRoles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(1290, 0, 77, 32);

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/iniciosesion2.JPG"))); // NOI18N
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        add(btnIniciarSesion);
        btnIniciarSesion.setBounds(1060, 60, 220, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 147);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        lbFondo.setText("    ");
        lbFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        add(lbFondo);
        lbFondo.setBounds(0, 0, 1370, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       adminUser = new AdminUser();
       adminUser.setBounds(this.getBounds());
       this.removeAll();
       this.add(adminUser);
       this.updateUI();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
