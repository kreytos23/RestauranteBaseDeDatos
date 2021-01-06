
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

        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/iniciosesion2.JPG"))); // NOI18N
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        add(btnIniciarSesion);
        btnIniciarSesion.setBounds(1045, 70, 220, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 147);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        lbFondo.setText("    ");
        lbFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        add(lbFondo);
        lbFondo.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       adminUser = new AdminUser();
       adminUser.setBounds(this.getBounds());
       this.removeAll();
       this.add(adminUser);
       this.updateUI();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
