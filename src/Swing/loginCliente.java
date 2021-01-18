package Swing;
import RestauranteConexion.*;
import Tablas.*;

public class loginCliente extends javax.swing.JPanel {

 
    public loginCliente() {
        initComponents();
        LBincorrecto.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LBincorrecto = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(null);

        txtCorreo.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        add(txtCorreo);
        txtCorreo.setBounds(394, 280, 580, 60);

        txtPass.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtPass);
        txtPass.setBounds(394, 390, 580, 60);

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginAdmin/Iniciar_sesion.png"))); // NOI18N
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrandes/btnIniciar.png"))); // NOI18N
        btnIngresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnOscuros/Iniciar_sesionrojo.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnOscuros/Iniciar_sesionrojo.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar);
        btnIngresar.setBounds(520, 510, 330, 90);

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

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setText("Contraseña");
        add(jLabel6);
        jLabel6.setBounds(400, 350, 160, 29);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel7.setText("Correo");
        add(jLabel7);
        jLabel7.setBounds(400, 230, 160, 29);

        LBincorrecto.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        LBincorrecto.setForeground(new java.awt.Color(255, 0, 0));
        LBincorrecto.setText("Datos Incorrectos");
        LBincorrecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(LBincorrecto);
        LBincorrecto.setBounds(400, 460, 320, 24);

        btnCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginAdmin/Crear_cuenta.png"))); // NOI18N
        btnCrearCuenta.setContentAreaFilled(false);
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearCuenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrandes/btnCrearG.png"))); // NOI18N
        btnCrearCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnOscuros/Crear_cuentarojo.png"))); // NOI18N
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        add(btnCrearCuenta);
        btnCrearCuenta.setBounds(520, 600, 330, 90);

        jLabel4.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        jLabel4.setText("¿Eres nuevo?");
        add(jLabel4);
        jLabel4.setBounds(310, 630, 200, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1366, 147);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 40)); // NOI18N
        jLabel5.setText("Inicio de sesion");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel5);
        jLabel5.setBounds(560, 160, 300, 47);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginCliente/Olvidaste_la_contrasena.jpg"))); // NOI18N
        add(jButton2);
        jButton2.setBounds(400, 490, 313, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);

        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(180, 230, 34, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
     
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Clientes clienteRegistrado = RestauranteService.loginClienteService(txtCorreo.getText(), txtPass.getText());
        
        if(clienteRegistrado == null){
            LBincorrecto.setVisible(true);
            txtCorreo.setText("");
            txtPass.setText("");
        }else{
            MenuDeUsuario menuDeUsuario = new MenuDeUsuario(clienteRegistrado);
            menuDeUsuario.setBounds(0,0,1400,770);
            this.removeAll();
            this.add(menuDeUsuario);
            this.updateUI();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        
            AgregarUsuario agregarUsuario = new AgregarUsuario();
            agregarUsuario.setBounds(this.getBounds());
            this.removeAll();
            this.add(agregarUsuario);
            this.updateUI();
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        AdminUser adminUser = new AdminUser();
        adminUser.setBounds(this.getBounds());
        this.removeAll();
        this.add(adminUser);
        this.updateUI();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBincorrecto;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
