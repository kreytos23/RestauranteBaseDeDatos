package Swing;
/**
 * @author serpi
 */
public class AdminUser extends javax.swing.JPanel {
    
    private loginAdmin loginAdmin;
    private loginCliente loginCliente;
    
    public AdminUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonAd.jpg"))); // NOI18N
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        add(btnAdmin);
        btnAdmin.setBounds(565, 344, 290, 66);

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonCli.jpg"))); // NOI18N
        btnCliente.setContentAreaFilled(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        add(btnCliente);
        btnCliente.setBounds(565, 525, 210, 60);

        jLabel2.setText("Ingrese como cliente o administrador");
        add(jLabel2);
        jLabel2.setBounds(259, 187, 200, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 147);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/Cliente.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(430, 515, 110, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/administracion (1).jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(430, 334, 110, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
       loginAdmin = new loginAdmin();
       loginAdmin.setBounds(this.getBounds());
       this.removeAll();
       this.add(loginAdmin);
       this.updateUI();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
       loginCliente = new loginCliente();
       loginCliente.setBounds(this.getBounds());
       this.removeAll();
       this.add(loginCliente);
       this.updateUI();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAdminMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
