package Swing;
import RestauranteConexion.*;
import Tablas.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class loginAdmin extends javax.swing.JPanel {


    public loginAdmin() {
        initComponents();
        LBincorrecto.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        LBincorrecto = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnOlvidarPass = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(null);

        txtCorreo.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtCorreo);
        txtCorreo.setBounds(394, 285, 580, 60);

        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginAdmin/Iniciar_sesion.png"))); // NOI18N
        btnAcceder.setContentAreaFilled(false);
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrandes/btnIniciar.png"))); // NOI18N
        btnAcceder.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnOscuros/Iniciar_sesionrojo.png"))); // NOI18N
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        add(btnAcceder);
        btnAcceder.setBounds(530, 540, 340, 90);

        LBincorrecto.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        LBincorrecto.setForeground(new java.awt.Color(255, 0, 0));
        LBincorrecto.setText("Datos Incorrectos");
        LBincorrecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(LBincorrecto);
        LBincorrecto.setBounds(400, 470, 320, 24);

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

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 40)); // NOI18N
        jLabel3.setText("Inicio de sesión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel3);
        jLabel3.setBounds(565, 170, 320, 47);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1363, 146);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Contraseña");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel1);
        jLabel1.setBounds(400, 360, 210, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setText("Correo");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel5);
        jLabel5.setBounds(400, 240, 150, 30);

        txtPass.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        txtPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtPass);
        txtPass.setBounds(394, 400, 580, 60);

        btnOlvidarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginCliente/Olvidaste_la_contrasena.jpg"))); // NOI18N
        btnOlvidarPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOlvidarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidarPassActionPerformed(evt);
            }
        });
        add(btnOlvidarPass);
        btnOlvidarPass.setBounds(400, 500, 313, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        
        Empleados empleadoRegistrado = RestauranteService.loginEmpleadoService(txtCorreo.getText(), txtPass.getText());
        
        if(empleadoRegistrado == null){
            //JOptionPane.showMessageDialog(this, "Usuario No Registrado", "Error", JOptionPane.WARNING_MESSAGE);
            LBincorrecto.setVisible(true);
            txtCorreo.setText("");
            txtPass.setText("");
        }else{
            System.out.println("Bienvenido " + empleadoRegistrado.getEmp_Tipo().getTipo_Nombre() + " " + empleadoRegistrado.getNombre());
            MenuDeAdmin menuDeAdmin = new MenuDeAdmin(empleadoRegistrado);
            menuDeAdmin.setBounds(this.getBounds());
            this.removeAll();
            this.add(menuDeAdmin);
            this.updateUI();
        }
        
        
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnOlvidarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidarPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOlvidarPassActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        AdminUser adminUser = new AdminUser();
        adminUser.setBounds(this.getBounds());
        this.removeAll();
        this.add(adminUser);
        this.updateUI();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBincorrecto;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnOlvidarPass;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
