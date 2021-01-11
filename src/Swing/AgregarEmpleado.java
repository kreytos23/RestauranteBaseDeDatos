package Swing;

import EnumClases.Calendario;
import EnumClases.TipoEmpleado;
import RestauranteConexion.*;
import javax.swing.JOptionPane;


public class AgregarEmpleado extends javax.swing.JPanel {

    private Calendario dias;
    private TipoEmpleado tipoEmpleado;
    
    public AgregarEmpleado() {
        initComponents();
        LbPass1.setVisible(false);
        LbPass2.setVisible(false);
        LbNombre1.setVisible(false);
        LbNombre2.setVisible(false);
        LbApellidoP1.setVisible(false);
        LbApellidoP2.setVisible(false);
        LbApellidoM1.setVisible(false);
        LbApellidoM2.setVisible(false);
        LbColonia1.setVisible(false);
        LbColonia2.setVisible(false);
        LbNoCalle1.setVisible(false);
        LbNoCalle2.setVisible(false);
        LbCorreo.setVisible(false);
        LbTelefono1.setVisible(false);
        LbTelefono2.setVisible(false);
        LbTelefono3.setVisible(false);
        LbCorreoRep.setVisible(false);
        LbCampos.setVisible(false);
        
        for(TipoEmpleado tp : tipoEmpleado.values()){
            txtPuesto.addItem(tp.toString());
        }
        
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
        btnAgregar = new javax.swing.JButton();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JComboBox<>();
        txtNoCalle = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcDia = new javax.swing.JComboBox<>();
        jcMes = new javax.swing.JComboBox<>();
        jcYear = new javax.swing.JComboBox<>();
        txtCalleNom = new javax.swing.JTextField();
        LbPass2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        LbPass1 = new javax.swing.JLabel();
        LbNombre1 = new javax.swing.JLabel();
        LbNombre2 = new javax.swing.JLabel();
        LbApellidoM1 = new javax.swing.JLabel();
        LbApellidoM2 = new javax.swing.JLabel();
        LbApellidoP1 = new javax.swing.JLabel();
        LbApellidoP2 = new javax.swing.JLabel();
        LbColonia1 = new javax.swing.JLabel();
        LbColonia2 = new javax.swing.JLabel();
        LbNoCalle1 = new javax.swing.JLabel();
        LbNoCalle2 = new javax.swing.JLabel();
        LbTelefono1 = new javax.swing.JLabel();
        LbTelefono2 = new javax.swing.JLabel();
        LbTelefono3 = new javax.swing.JLabel();
        LbCorreo = new javax.swing.JLabel();
        LbCorreoRep = new javax.swing.JLabel();
        LbCampos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1370, 620));
        setLayout(null);

        txtCorreo.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtCorreo);
        txtCorreo.setBounds(20, 400, 270, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo");
        add(jLabel3);
        jLabel3.setBounds(20, 350, 160, 24);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido Paterno");
        add(jLabel4);
        jLabel4.setBounds(340, 60, 190, 20);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Nacimiento");
        add(jLabel5);
        jLabel5.setBounds(1010, 50, 280, 24);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Colonia");
        add(jLabel6);
        jLabel6.setBounds(20, 220, 100, 40);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero Telefonico");
        add(jLabel7);
        jLabel7.setBounds(970, 220, 240, 24);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("No. Exterior");
        add(jLabel10);
        jLabel10.setBounds(660, 220, 130, 24);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellido Materno");
        add(jLabel11);
        jLabel11.setBounds(660, 50, 180, 24);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUsuario/btnAceptar.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUsuario/btnAceptarG.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUsuario/btnAceptarRojo.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(920, 380, 360, 110);

        txtApellidoP.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtApellidoP);
        txtApellidoP.setBounds(340, 110, 270, 40);

        txtApellidoM.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtApellidoM);
        txtApellidoM.setBounds(660, 110, 270, 40);

        txtTelefono.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtTelefono);
        txtTelefono.setBounds(970, 270, 270, 40);

        txtColonia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtColonia);
        txtColonia.setBounds(20, 270, 270, 40);

        txtPassword.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(340, 400, 270, 40);

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Contraseña");
        add(jLabel12);
        jLabel12.setBounds(340, 350, 160, 24);

        txtPuesto.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });
        add(txtPuesto);
        txtPuesto.setBounds(660, 400, 180, 40);

        txtNoCalle.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtNoCalle);
        txtNoCalle.setBounds(660, 270, 270, 40);

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Puesto");
        add(jLabel13);
        jLabel13.setBounds(660, 360, 160, 24);

        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtNombre);
        txtNombre.setBounds(20, 110, 270, 40);

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        add(jLabel14);
        jLabel14.setBounds(20, 70, 160, 24);

        jcDia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(jcDia);
        jcDia.setBounds(990, 110, 110, 40);

        jcMes.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jcMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesActionPerformed(evt);
            }
        });
        add(jcMes);
        jcMes.setBounds(1110, 110, 110, 40);

        jcYear.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(jcYear);
        jcYear.setBounds(1230, 110, 110, 40);

        txtCalleNom.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtCalleNom);
        txtCalleNom.setBounds(340, 270, 270, 40);

        LbPass2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass2.setForeground(new java.awt.Color(255, 0, 0));
        LbPass2.setText("De Al Menos 6 Caracteres");
        add(LbPass2);
        LbPass2.setBounds(390, 470, 210, 20);

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Calle");
        add(jLabel15);
        jLabel15.setBounds(340, 220, 130, 24);

        LbPass1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass1.setForeground(new java.awt.Color(255, 0, 0));
        LbPass1.setText("La Contraseña Debe Ser ");
        add(LbPass1);
        LbPass1.setBounds(390, 450, 170, 20);

        LbNombre1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNombre1.setForeground(new java.awt.Color(255, 0, 0));
        LbNombre1.setText("El nombre no puede contener numeros");
        add(LbNombre1);
        LbNombre1.setBounds(20, 160, 280, 18);

        LbNombre2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNombre2.setForeground(new java.awt.Color(255, 0, 0));
        LbNombre2.setText("o caracteres especiales");
        add(LbNombre2);
        LbNombre2.setBounds(70, 180, 170, 18);

        LbApellidoM1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoM1.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoM1.setText("El Apellido Paterno no puede contener");
        add(LbApellidoM1);
        LbApellidoM1.setBounds(660, 160, 270, 18);

        LbApellidoM2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoM2.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoM2.setText("numeros o caracteres especiales");
        add(LbApellidoM2);
        LbApellidoM2.setBounds(680, 180, 240, 18);

        LbApellidoP1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoP1.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoP1.setText("El Apellido Paterno no puede contener");
        add(LbApellidoP1);
        LbApellidoP1.setBounds(340, 160, 270, 18);

        LbApellidoP2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoP2.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoP2.setText("numeros o caracteres especiales");
        add(LbApellidoP2);
        LbApellidoP2.setBounds(360, 180, 240, 18);

        LbColonia1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbColonia1.setForeground(new java.awt.Color(255, 0, 0));
        LbColonia1.setText("La colonia no puede contener numeros");
        add(LbColonia1);
        LbColonia1.setBounds(20, 310, 270, 18);

        LbColonia2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbColonia2.setForeground(new java.awt.Color(255, 0, 0));
        LbColonia2.setText("o caracteres especiales");
        add(LbColonia2);
        LbColonia2.setBounds(80, 330, 170, 18);

        LbNoCalle1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNoCalle1.setForeground(new java.awt.Color(255, 0, 0));
        LbNoCalle1.setText("El numero de la calle no puede contener ");
        add(LbNoCalle1);
        LbNoCalle1.setBounds(650, 320, 290, 20);

        LbNoCalle2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNoCalle2.setForeground(new java.awt.Color(255, 0, 0));
        LbNoCalle2.setText("letras");
        add(LbNoCalle2);
        LbNoCalle2.setBounds(760, 340, 39, 18);

        LbTelefono1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono1.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono1.setText("El telefono no puede contener letras");
        add(LbTelefono1);
        LbTelefono1.setBounds(980, 310, 250, 18);

        LbTelefono2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono2.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono2.setText("espacios o caracteres especiales");
        add(LbTelefono2);
        LbTelefono2.setBounds(990, 330, 230, 16);

        LbTelefono3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono3.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono3.setText("Maximo 10 numeros");
        add(LbTelefono3);
        LbTelefono3.setBounds(1040, 350, 150, 16);

        LbCorreo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCorreo.setForeground(new java.awt.Color(255, 0, 0));
        LbCorreo.setText("El correo esta mal escrito");
        add(LbCorreo);
        LbCorreo.setBounds(20, 440, 180, 18);

        LbCorreoRep.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCorreoRep.setForeground(new java.awt.Color(255, 0, 0));
        LbCorreoRep.setText("El correo ya esta registrado");
        add(LbCorreoRep);
        LbCorreoRep.setBounds(20, 460, 200, 18);

        LbCampos.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        LbCampos.setForeground(new java.awt.Color(255, 0, 0));
        LbCampos.setText("Llene todos los campos ");
        add(LbCampos);
        LbCampos.setBounds(1000, 490, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String txtFecha;
        String calle;
        int error;
        boolean correcto = datosCorrectos();
        
        if(jcMes.getSelectedIndex()< 9){
            txtFecha = jcYear.getSelectedItem().toString() + "/0" + (jcMes.getSelectedIndex() + 1) ;
        }else{
            txtFecha = jcYear.getSelectedItem().toString() + "/" + (jcMes.getSelectedIndex() + 1) ;
        }
        
        if(jcDia.getSelectedIndex() < 9){
            txtFecha += "/0" + jcDia.getSelectedItem().toString();
        }else{
            txtFecha += "/" + jcDia.getSelectedItem().toString();
        }
        
        calle = txtCalleNom.getText() + " #" + txtNoCalle.getText();
        System.out.println(txtFecha);
        if(correcto){
            System.out.println(txtPuesto.getSelectedIndex()+ 1);
            error =  RestauranteService.agregarEmpleado(String.valueOf(txtPuesto.getSelectedIndex()+ 1),
                                           txtFecha,
                                           txtNombre.getText(),
                                           txtApellidoP.getText(),
                                           txtApellidoM.getText(),
                                           txtCorreo.getText(),
                                           txtPassword.getText(),
                                           txtColonia.getText(),
                                           calle,
                                           txtTelefono.getText());
            switch(error){
                case 1:
                    LbCorreo.setVisible(true);
                    break;
                case 2:
                    LbPass1.setVisible(true);
                    LbPass2.setVisible(true);
                    break;
                case 3:
                    LbTelefono1.setVisible(true);
                    LbTelefono2.setVisible(true);
                    break;
                case 4:
                    LbCorreoRep.setVisible(true);
                
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

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoActionPerformed

    public static boolean ComprobarStrings(String datos){

        String [] palabras = datos.split(" ");

        for (String palabra : palabras) {
            if (!palabra.matches("[a-zA-Z]*")) {
                return false;
            }
        }

        return true;
    }

    public static boolean ComprobarNumeros(String datos){
        return datos.matches("[0-9]*");
    }
    
    private boolean datosCorrectos(){
        boolean correcto = true;
        if(!ComprobarStrings(txtNombre.getText().trim())){
            LbNombre1.setVisible(true);
            LbNombre2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarStrings(txtApellidoP.getText().trim())){
            LbApellidoP1.setVisible(true);
            LbApellidoP2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarStrings(txtCalleNom.getText().trim())){
//            LbNoCalle1.setVisible(true);
//            LbNoCalle2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarStrings(txtApellidoM.getText().trim())){
            LbApellidoM1.setVisible(true);
            LbApellidoM2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarStrings(txtColonia.getText().trim())){
            LbColonia1.setVisible(true);
            LbColonia2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarNumeros(txtNoCalle.getText().trim())){
            LbNoCalle1.setVisible(true);
            LbNoCalle2.setVisible(true);
            correcto = false;
        }
        if(!ComprobarNumeros(txtTelefono.getText().trim())){
            LbTelefono3.setVisible(true);
            correcto = false;
        }
        
        if(txtNombre.getText().equals("")|| txtApellidoM.getText().equals("") || txtApellidoP.getText().equals("") || txtColonia.getText().equals("") || txtCalleNom.getText().equals("") || txtNoCalle.getText().equals("")){
            LbCampos.setVisible(true);
            correcto = false;
        }
        
        String correo = txtCorreo.getText();
        String correoPartes[] = correo.split("@");
        
            try {
                if(!correoPartes[0].trim().equals("")){
                switch(correoPartes[1]){
                    case "gmail.com":
                    case "yahoo.com.mx":
                    case "hotmail.com":
                    case "outlook.com":
                                break;
                       default:
                           JOptionPane.showMessageDialog(null, "Extension desconocida");
                           correcto = false;
                         }
            }else{
                    correcto = false;
                    JOptionPane.showMessageDialog(null, "Debe haber algo antes del @");
                }} catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "correo invalido");
                    correcto = false;
            }
        
        return correcto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbApellidoM1;
    private javax.swing.JLabel LbApellidoM2;
    private javax.swing.JLabel LbApellidoP1;
    private javax.swing.JLabel LbApellidoP2;
    private javax.swing.JLabel LbCampos;
    private javax.swing.JLabel LbColonia1;
    private javax.swing.JLabel LbColonia2;
    private javax.swing.JLabel LbCorreo;
    private javax.swing.JLabel LbCorreoRep;
    private javax.swing.JLabel LbNoCalle1;
    private javax.swing.JLabel LbNoCalle2;
    private javax.swing.JLabel LbNombre1;
    private javax.swing.JLabel LbNombre2;
    private javax.swing.JLabel LbPass1;
    private javax.swing.JLabel LbPass2;
    private javax.swing.JLabel LbTelefono1;
    private javax.swing.JLabel LbTelefono2;
    private javax.swing.JLabel LbTelefono3;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JComboBox<String> txtPuesto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
