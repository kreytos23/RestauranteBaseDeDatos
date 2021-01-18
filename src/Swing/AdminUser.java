package Swing;

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
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonAd.png"))); // NOI18N
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonAdrojo.png"))); // NOI18N
        btnAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrandes/btnAdminG.png"))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        add(btnAdmin);
        btnAdmin.setBounds(500, 330, 460, 130);

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonCli.png"))); // NOI18N
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/BotonClirojo.png"))); // NOI18N
        btnCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrandes/btnClientegG.png"))); // NOI18N
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        add(btnCliente);
        btnCliente.setBounds(500, 480, 460, 130);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/felcahanegrita.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/flecha.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar);
        btnRegresar.setBounds(1300, 150, 60, 60);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 56)); // NOI18N
        jLabel2.setText("Inicia Sesión");
        add(jLabel2);
        jLabel2.setBounds(550, 180, 350, 56);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 147);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/Cliente.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(420, 500, 110, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/sradministracion.png"))); // NOI18N
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuRoles menuRoles = new MenuRoles();
        menuRoles.setBounds(this.getBounds());
        this.removeAll();
        this.add(menuRoles);
        this.updateUI();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
