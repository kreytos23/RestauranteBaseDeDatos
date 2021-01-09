package Swing;

import AppPackage.AnimationClass;
import javafx.animation.Animation;


public class MenuDeAdmin extends javax.swing.JPanel {

 
    public MenuDeAdmin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarEmpleado = new javax.swing.JButton();
        btnMenu = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAjustes = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnHist = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        lblManuel = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblHist = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnAgregarEmpleado.setText("Agregar");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        add(btnAgregarEmpleado);
        btnAgregarEmpleado.setBounds(430, 340, 180, 40);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/menu (1).png"))); // NOI18N
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu);
        btnMenu.setBounds(10, 160, 50, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agregar Empleado");
        add(jLabel3);
        jLabel3.setBounds(420, 290, 210, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-10, 0, 1360, 150);

        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnAjustes);
        btnAjustes.setBounds(-150, 300, 50, 40);

        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnCarrito);
        btnCarrito.setBounds(-150, 220, 50, 40);

        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnSalir);
        btnSalir.setBounds(-150, 340, 50, 40);

        jButton1.setText("jButton1");
        add(jButton1);
        jButton1.setBounds(-70, 160, 50, 40);

        btnHist.setContentAreaFilled(false);
        btnHist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnHist);
        btnHist.setBounds(-150, 260, 50, 40);

        lblMenu.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setText("Menu");
        lblMenu.setToolTipText("");
        add(lblMenu);
        lblMenu.setBounds(-210, 170, 60, 20);

        lblAjustes.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblAjustes.setForeground(new java.awt.Color(0, 0, 0));
        lblAjustes.setText("* Ajustes");
        lblAjustes.setToolTipText("");
        add(lblAjustes);
        lblAjustes.setBounds(-270, 310, 140, 20);

        lblManuel.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblManuel.setForeground(new java.awt.Color(0, 0, 0));
        lblManuel.setText("\"Manuel Co\" Copyright 2021");
        lblManuel.setToolTipText("");
        add(lblManuel);
        lblManuel.setBounds(-270, 410, 180, 20);

        lblSalir.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setText("* Salir");
        lblSalir.setToolTipText("");
        add(lblSalir);
        lblSalir.setBounds(-270, 350, 140, 20);

        lblHist.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblHist.setForeground(new java.awt.Color(0, 0, 0));
        lblHist.setText("* Historial");
        lblHist.setToolTipText("");
        add(lblHist);
        lblHist.setBounds(-270, 270, 140, 20);

        lblCarrito.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(0, 0, 0));
        lblCarrito.setText("* Ver Carrito");
        lblCarrito.setToolTipText("");
        add(lblCarrito);
        lblCarrito.setBounds(-270, 230, 140, 20);

        lblFondo.setBackground(new java.awt.Color(255, 128, 128));
        lblFondo.setOpaque(true);
        add(lblFondo);
        lblFondo.setBounds(-290, 160, 200, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-10, 0, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        AgregarEmpleado agregarEmpleado = new AgregarEmpleado();
        agregarEmpleado.setBounds(this.getBounds());
        this.removeAll();
        this.add(agregarEmpleado);
        this.updateUI();
        
         
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnHist;
    private javax.swing.JToggleButton btnMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHist;
    private javax.swing.JLabel lblManuel;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}
