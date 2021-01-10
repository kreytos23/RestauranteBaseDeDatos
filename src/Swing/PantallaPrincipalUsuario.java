package Swing;

import java.sql.Date;


public class PantallaPrincipalUsuario extends javax.swing.JPanel {

 
    private Date hora;
    public PantallaPrincipalUsuario() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPlatillo1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Cliente_2.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 620);

        lblPlatillo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatillo1MouseClicked(evt);
            }
        });
        add(lblPlatillo1);
        lblPlatillo1.setBounds(260, 160, 280, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlatillo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatillo1MouseClicked
        
    }//GEN-LAST:event_lblPlatillo1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPlatillo1;
    // End of variables declaration//GEN-END:variables
}
