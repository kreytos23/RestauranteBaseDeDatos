package Swing;

import RestauranteConexion.Conexion;
import Tablas.Platillos;
import java.util.ArrayList;


public class MenuDePlatillos extends javax.swing.JPanel {

    private int indexDeMenu;
    private ArrayList<Platillos> arrayDePlatillos;

    public MenuDePlatillos() {
        initComponents();
        indexDeMenu = 0;
        arrayDePlatillos = RestauranteConexion.RestauranteService.traerPlatillosService();
        lblMenu.setText("Desayunos");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPlato = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnIzqEntradas = new javax.swing.JButton();
        btnDerEntrada = new javax.swing.JButton();
        btnDerPlatoFuerte = new javax.swing.JButton();
        btnIzqEnsalada = new javax.swing.JButton();
        btnIzqPlatoFuerte = new javax.swing.JButton();
        btnIzqPostres = new javax.swing.JButton();
        btnDerEnsalada = new javax.swing.JButton();
        btnAvanzarMenu = new javax.swing.JButton();
        btnDerPostres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menu");
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(70, 100, 170, 40);

        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(1070, 120, 150, 130);

        jLabel13.setText("jLabel3");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        add(jLabel13);
        jLabel13.setBounds(900, 120, 150, 130);

        lblPlato.setText("jLabel3");
        lblPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlato.setOpaque(true);
        add(lblPlato);
        lblPlato.setBounds(380, 120, 150, 130);

        jLabel15.setText("jLabel3");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setOpaque(true);
        add(jLabel15);
        jLabel15.setBounds(550, 120, 150, 130);

        jLabel16.setText("jLabel3");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        add(jLabel16);
        jLabel16.setBounds(900, 380, 150, 130);

        jLabel17.setText("jLabel3");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        add(jLabel17);
        jLabel17.setBounds(1070, 380, 150, 130);

        jLabel18.setText("jLabel3");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setOpaque(true);
        add(jLabel18);
        jLabel18.setBounds(380, 380, 150, 130);

        jLabel19.setText("jLabel3");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.setOpaque(true);
        add(jLabel19);
        jLabel19.setBounds(550, 380, 150, 130);

        lblMenu.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setText("Cena");
        lblMenu.setOpaque(true);
        add(lblMenu);
        lblMenu.setBounds(70, 170, 170, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(40, 260, 230, 200);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(360, 110, 360, 150);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ensalada");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(960, 60, 200, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Postres");
        jLabel7.setOpaque(true);
        add(jLabel7);
        jLabel7.setBounds(960, 320, 210, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        add(jLabel8);
        jLabel8.setBounds(880, 370, 360, 150);

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Plato Fuerte");
        jLabel9.setOpaque(true);
        add(jLabel9);
        jLabel9.setBounds(440, 60, 180, 30);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        add(jLabel10);
        jLabel10.setBounds(880, 110, 360, 150);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        add(jLabel11);
        jLabel11.setBounds(360, 370, 360, 150);

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Entradas");
        jLabel12.setOpaque(true);
        add(jLabel12);
        jLabel12.setBounds(440, 320, 190, 30);

        btnIzqEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqEntradas.setContentAreaFilled(false);
        btnIzqEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzqEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqEntradasActionPerformed(evt);
            }
        });
        add(btnIzqEntradas);
        btnIzqEntradas.setBounds(290, 420, 60, 50);

        btnDerEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerEntrada.setContentAreaFilled(false);
        btnDerEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnDerEntrada);
        btnDerEntrada.setBounds(730, 420, 60, 50);

        btnDerPlatoFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerPlatoFuerte.setContentAreaFilled(false);
        btnDerPlatoFuerte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnDerPlatoFuerte);
        btnDerPlatoFuerte.setBounds(730, 160, 60, 50);

        btnIzqEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqEnsalada.setContentAreaFilled(false);
        btnIzqEnsalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnIzqEnsalada);
        btnIzqEnsalada.setBounds(810, 160, 60, 50);

        btnIzqPlatoFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqPlatoFuerte.setContentAreaFilled(false);
        btnIzqPlatoFuerte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnIzqPlatoFuerte);
        btnIzqPlatoFuerte.setBounds(290, 160, 60, 50);

        btnIzqPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqPostres.setContentAreaFilled(false);
        btnIzqPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnIzqPostres);
        btnIzqPostres.setBounds(810, 420, 60, 50);

        btnDerEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerEnsalada.setContentAreaFilled(false);
        btnDerEnsalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnDerEnsalada);
        btnDerEnsalada.setBounds(1250, 160, 60, 50);

        btnAvanzarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_mas_grande.png"))); // NOI18N
        btnAvanzarMenu.setContentAreaFilled(false);
        btnAvanzarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvanzarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarMenuActionPerformed(evt);
            }
        });
        add(btnAvanzarMenu);
        btnAvanzarMenu.setBounds(1270, 280, 80, 70);

        btnDerPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerPostres.setContentAreaFilled(false);
        btnDerPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnDerPostres);
        btnDerPostres.setBounds(1260, 420, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1370, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzqEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzqEntradasActionPerformed

    private void btnAvanzarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarMenuActionPerformed
        
        indexDeMenu = indexDeMenu >= 2 ? 0 :  indexDeMenu + 1 ;

        switch(indexDeMenu){
            case 0:
                lblMenu.setText("Desayunos");
                break;
            case 1:
                lblMenu.setText("Comida");
                break;
            case 2:
                lblMenu.setText("Cena");
                break;
        }
    }//GEN-LAST:event_btnAvanzarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzarMenu;
    private javax.swing.JButton btnDerEnsalada;
    private javax.swing.JButton btnDerEntrada;
    private javax.swing.JButton btnDerPlatoFuerte;
    private javax.swing.JButton btnDerPostres;
    private javax.swing.JButton btnIzqEnsalada;
    private javax.swing.JButton btnIzqEntradas;
    private javax.swing.JButton btnIzqPlatoFuerte;
    private javax.swing.JButton btnIzqPostres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPlato;
    // End of variables declaration//GEN-END:variables
}
