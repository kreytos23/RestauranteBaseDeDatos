package Swing;

import Tablas.Clientes;
import Tablas.Platillos;
import java.sql.Date;
import java.util.ArrayList;


public class PantallaPrincipalUsuario extends javax.swing.JPanel {

 
    private Date hora;
    private Clientes clienteLogueado;
    private AgregarCarrito agregarCarrito;
    
    public PantallaPrincipalUsuario(Clientes clientesLogueado) {
        initComponents();
        this.clienteLogueado = clientesLogueado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlatillo1 = new javax.swing.JLabel();
        lblPlatillo2 = new javax.swing.JLabel();
        lblPlatillo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblPlatillo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlatillo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatillo1MouseClicked(evt);
            }
        });
        add(lblPlatillo1);
        lblPlatillo1.setBounds(260, 160, 280, 300);

        lblPlatillo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlatillo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatillo2MouseClicked(evt);
            }
        });
        add(lblPlatillo2);
        lblPlatillo2.setBounds(620, 160, 280, 300);

        lblPlatillo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlatillo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatillo3MouseClicked(evt);
            }
        });
        add(lblPlatillo3);
        lblPlatillo3.setBounds(980, 160, 280, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Cliente_2.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPlatillo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatillo1MouseClicked
        abrirMenu(49);
    }//GEN-LAST:event_lblPlatillo1MouseClicked

    private void lblPlatillo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatillo2MouseClicked
        abrirMenu(68);
    }//GEN-LAST:event_lblPlatillo2MouseClicked

    private void lblPlatillo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatillo3MouseClicked
        abrirMenu(35);
    }//GEN-LAST:event_lblPlatillo3MouseClicked

    private void abrirMenu(int Id){
        ArrayList<Platillos> arrayDePlatillos = RestauranteConexion.RestauranteService.traerPlatillosService();
        agregarCarrito = new AgregarCarrito(arrayDePlatillos.get(Id),clienteLogueado);
        agregarCarrito.setBounds(0,0,this.getWidth(),this.getHeight());
        this.removeAll();
        this.add(agregarCarrito);
        this.updateUI();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPlatillo1;
    private javax.swing.JLabel lblPlatillo2;
    private javax.swing.JLabel lblPlatillo3;
    // End of variables declaration//GEN-END:variables
}
