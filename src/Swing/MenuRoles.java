
package Swing;

import java.io.IOException;
import java.net.URISyntaxException;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setRequestFocusEnabled(false);
        setLayout(null);

        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/Inicio sesion_1.png"))); // NOI18N
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        add(btnIniciarSesion);
        btnIniciarSesion.setBounds(1030, 40, 260, 80);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(730, 50, 50, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 147);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/Panel_2.jpg"))); // NOI18N
        lbFondo.setText("    ");
        lbFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        add(lbFondo);
        lbFondo.setBounds(0, 70, 1370, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
       adminUser = new AdminUser();
       adminUser.setBounds(this.getBounds());
       this.removeAll();
       this.add(adminUser);
       this.updateUI();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new java.net.URI("https://www.facebook.com/Restaurante-3-Panaderos-110684760689198");
                   desktop.browse(uri);
               } catch(URISyntaxException | IOException ex){
                   
               }
           }
       }
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
