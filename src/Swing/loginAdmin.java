package Swing;
import RestauranteConexion.*;
import Tablas.*;
import javax.swing.ImageIcon;

public class loginAdmin extends javax.swing.JPanel {


    public loginAdmin() {
        initComponents();
     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        txtCorreo.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        add(txtCorreo);
        txtCorreo.setBounds(394, 285, 580, 60);

        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginCliente/Iniciar_sesion.jpg"))); // NOI18N
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        add(btnAcceder);
        btnAcceder.setBounds(565, 560, 260, 53);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 40)); // NOI18N
        jLabel3.setText("Inicio de sesión");
        add(jLabel3);
        jLabel3.setBounds(565, 170, 320, 47);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginAdmin/Encabezado Admin.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 1363, 146);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Contraseña");
        add(jLabel1);
        jLabel1.setBounds(400, 360, 210, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Correo");
        add(jLabel5);
        jLabel5.setBounds(400, 240, 150, 30);

        txtPass.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        add(txtPass);
        txtPass.setBounds(394, 400, 580, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginCliente/Olvidaste_la_contrasena.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(400, 480, 313, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        
        Empleados empleadoRegistrado = RestauranteService.loginEmpleadoService(txtCorreo.getText(), txtPass.getText());
        
        if(empleadoRegistrado == null){
            System.out.println("No registrado");
        }else{
            System.out.println("Bienvenido " + empleadoRegistrado.getEmp_Tipo().getTipo_Nombre() + " " + empleadoRegistrado.getNombre());
        }
        
        
    }//GEN-LAST:event_btnAccederActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
