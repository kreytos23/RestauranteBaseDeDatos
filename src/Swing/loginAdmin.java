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
        txtPass = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        txtCorreo.setText("Correo");
        add(txtCorreo);
        txtCorreo.setBounds(353, 143, 302, 37);

        txtPass.setText("Contraseña");
        add(txtPass);
        txtPass.setBounds(353, 250, 302, 40);

        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        add(btnAcceder);
        btnAcceder.setBounds(428, 371, 143, 50);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
