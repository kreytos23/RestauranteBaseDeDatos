package Swing;

import EnumClases.Calendario;
import RestauranteConexion.RestauranteService;
import static Swing.AgregarEmpleado.ComprobarNumeros;
import static Swing.AgregarEmpleado.ComprobarStrings;
import javax.swing.JOptionPane;


public class AgregarUsuario extends javax.swing.JPanel {

    private Calendario dias;
    public AgregarUsuario() {
        initComponents();
        LbPass1.setVisible(false);
        LbPass2.setVisible(false);
        
        for(int i = 2021 ; i>=1940 ; i--){
            jcYear.addItem(String.valueOf(i));
        }
        
        for(Calendario item : dias.values()){
            if(item.toString() != dias.FebreroBi.toString())
            jcMes.addItem(item.toString());
        }
        
        jcDia.removeAllItems();
        for(int i = 1; i<=dias.Enero.getDias();i++){
            jcDia.addItem(String.valueOf(i));
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtApellidoM = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtNoCalle = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jcDia = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jcMes = new javax.swing.JComboBox<>();
        jcYear = new javax.swing.JComboBox<>();
        txtCalleNom = new javax.swing.JTextField();
        LbPass2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LbPass1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);
        add(txtCorreo);
        txtCorreo.setBounds(30, 570, 270, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo");
        add(jLabel3);
        jLabel3.setBounds(30, 520, 160, 24);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido Paterno");
        add(jLabel4);
        jLabel4.setBounds(350, 230, 190, 20);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Nacimiento");
        add(jLabel5);
        jLabel5.setBounds(1020, 220, 280, 24);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Colonia");
        add(jLabel6);
        jLabel6.setBounds(30, 390, 100, 40);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero Telefonico");
        add(jLabel7);
        jLabel7.setBounds(980, 390, 240, 24);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("No. Exterior");
        add(jLabel10);
        jLabel10.setBounds(670, 390, 130, 24);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellido Materno");
        add(jLabel11);
        jLabel11.setBounds(670, 220, 180, 24);
        add(txtApellidoP);
        txtApellidoP.setBounds(350, 280, 270, 40);
        add(txtNombre);
        txtNombre.setBounds(30, 280, 270, 40);

        btnAgregar.setText("Aceptar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(1070, 560, 180, 60);
        add(txtApellidoM);
        txtApellidoM.setBounds(670, 280, 270, 40);
        add(txtPassword);
        txtPassword.setBounds(350, 570, 270, 40);
        add(txtNoCalle);
        txtNoCalle.setBounds(670, 440, 270, 40);
        add(txtColonia);
        txtColonia.setBounds(30, 440, 270, 40);

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Contraseña");
        add(jLabel12);
        jLabel12.setBounds(350, 520, 160, 24);
        add(txtTelefono);
        txtTelefono.setBounds(980, 440, 270, 40);

        add(jcDia);
        jcDia.setBounds(980, 280, 110, 40);

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        add(jLabel14);
        jLabel14.setBounds(30, 240, 160, 24);

        jcMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesActionPerformed(evt);
            }
        });
        add(jcMes);
        jcMes.setBounds(1105, 280, 110, 40);

        add(jcYear);
        jcYear.setBounds(1240, 280, 110, 40);
        add(txtCalleNom);
        txtCalleNom.setBounds(350, 440, 270, 40);

        LbPass2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass2.setForeground(new java.awt.Color(255, 0, 0));
        LbPass2.setText("De Al Menos 6 Caracteres");
        add(LbPass2);
        LbPass2.setBounds(390, 640, 210, 20);

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Calle");
        add(jLabel15);
        jLabel15.setBounds(350, 390, 130, 24);

        LbPass1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass1.setForeground(new java.awt.Color(255, 0, 0));
        LbPass1.setText("La Contraseña Debe Ser ");
        add(LbPass1);
        LbPass1.setBounds(390, 620, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1360, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String txtFecha;
        String calle;
        int error;
        
        boolean correcto = datosCorrectos();

        if(jcMes.getSelectedIndex()< 9){
            txtFecha = jcYear.getSelectedItem().toString() + "/0" + (jcMes.getSelectedIndex() + 1) + "/" + jcDia.getSelectedItem().toString();
        }else{
            txtFecha = jcYear.getSelectedItem().toString() + "/" + (jcMes.getSelectedIndex() + 1) + "/" + jcDia.getSelectedItem().toString();
        }

        System.out.println(txtFecha);
        calle = txtCalleNom.getText() + " #" + txtNoCalle.getText();

        if(correcto){
            error =  RestauranteService.agregarClienteService(txtFecha,
                txtNombre.getText(),
                txtApellidoP.getText(),
                txtApellidoM.getText(),
                txtCorreo.getText(),
                txtPassword.getText(),
                txtColonia.getText(),
                calle,
                txtTelefono.getText());
            
            switch(error){
                case 0:
                    loginCliente loginCliente = new loginCliente();
                    loginCliente.setBounds(this.getBounds());
                    this.removeAll();
                    this.add(loginCliente);
                    this.updateUI();
                    
                case 1:

                break;
                case 2:
                LbPass1.setVisible(true);
                LbPass2.setVisible(true);
                break;
                case 3:
                break;
                case 4:

            }
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jcMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMesActionPerformed
        int añoBisiesto = Integer.parseInt(jcYear.getSelectedItem().toString()) % 4;

        for(Calendario item : dias.values()){
            if(jcMes.getSelectedItem().toString() == item.toString()){
                jcDia.removeAllItems();
                for(int i=1; i <= item.getDias();i++){
                    jcDia.addItem(String.valueOf(i));
                    if(añoBisiesto == 0 && (jcMes.getSelectedItem().toString() == item.Febrero.toString()) && (i == item.getDias())){
                        jcDia.addItem(String.valueOf(i+1));
                    }
                }
            }
        }
    }//GEN-LAST:event_jcMesActionPerformed

    private boolean datosCorrectos(){
        boolean correcto = true;
        if(!ComprobarStrings(txtNombre.getText().trim())){
            JOptionPane.showMessageDialog(null,"El nombre no puede contener numeros o caracteres especiales");
            correcto = false;
        }
        if(!ComprobarStrings(txtApellidoP.getText().trim())){
            JOptionPane.showMessageDialog(null,"El Apellido Paterno no puede contener numeros o caracteres especiales");
            correcto = false;
        }
        if(!ComprobarStrings(txtApellidoM.getText().trim())){
            JOptionPane.showMessageDialog(null,"El Apellido Materno no puede contener numeros o caracteres especiales");
            correcto = false;
        }
        if(!ComprobarStrings(txtColonia.getText().trim())){
            JOptionPane.showMessageDialog(null,"La colonia no puede contener numeros o caracteres especiales");
            correcto = false;
        }
        if(!ComprobarNumeros(txtNoCalle.getText().trim())){
            JOptionPane.showMessageDialog(null,"El numero de la calle no puede contener letras");
            correcto = false;
        }
        if(!ComprobarNumeros(txtTelefono.getText().trim())){
            JOptionPane.showMessageDialog(null,"El telefono no puede contener letras,espacios o caracteres especiales");
            correcto = false;
        }
        
        if(txtNombre.getText().equals("")|| txtApellidoM.getText().equals("") || txtApellidoP.getText().equals("") || txtColonia.getText().equals("") || txtCalleNom.getText().equals("") || txtNoCalle.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llena todos los campos","Error",JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        
        return correcto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbPass1;
    private javax.swing.JLabel LbPass2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcDia;
    private javax.swing.JComboBox<String> jcMes;
    private javax.swing.JComboBox<String> jcYear;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalleNom;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNoCalle;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
