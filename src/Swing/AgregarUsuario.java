package Swing;

import EnumClases.Calendario;
import RestauranteConexion.RestauranteService;
import static Swing.AgregarEmpleado.ComprobarNumeros;
import static Swing.AgregarEmpleado.ComprobarStrings;
import javax.swing.JOptionPane;


public class AgregarUsuario extends javax.swing.JPanel {

    private Calendario dias;
    private loginCliente loginCliente;
    
    public AgregarUsuario() {
        initComponents();
        ocultarLabels();
        
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
        btnRegresar = new javax.swing.JButton();
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
        LbCorreo = new javax.swing.JLabel();
        LbTelefono1 = new javax.swing.JLabel();
        LbTelefono2 = new javax.swing.JLabel();
        LbTelefono3 = new javax.swing.JLabel();
        LbNoCalle1 = new javax.swing.JLabel();
        LbNoCalle2 = new javax.swing.JLabel();
        LbColonia1 = new javax.swing.JLabel();
        LbColonia2 = new javax.swing.JLabel();
        LbApellidoM1 = new javax.swing.JLabel();
        LbApellidoM2 = new javax.swing.JLabel();
        LbApellidoP1 = new javax.swing.JLabel();
        LbApellidoP2 = new javax.swing.JLabel();
        LbNombre1 = new javax.swing.JLabel();
        LbNombre2 = new javax.swing.JLabel();
        LbRepet = new javax.swing.JLabel();
        LbError = new javax.swing.JLabel();
        LbCalle1 = new javax.swing.JLabel();
        LbCalle2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        txtCorreo.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtCorreo);
        txtCorreo.setBounds(30, 570, 270, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel3.setText("Correo");
        add(jLabel3);
        jLabel3.setBounds(30, 520, 160, 24);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel4.setText("Apellido Paterno");
        add(jLabel4);
        jLabel4.setBounds(350, 230, 190, 20);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");
        add(jLabel5);
        jLabel5.setBounds(1020, 220, 280, 24);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setText("Colonia");
        add(jLabel6);
        jLabel6.setBounds(30, 390, 100, 40);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel7.setText("Numero Telefonico");
        add(jLabel7);
        jLabel7.setBounds(980, 390, 240, 24);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel10.setText("No. Exterior");
        add(jLabel10);
        jLabel10.setBounds(670, 390, 130, 24);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel11.setText("Apellido Materno");
        add(jLabel11);
        jLabel11.setBounds(670, 220, 180, 24);

        txtApellidoP.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtApellidoP);
        txtApellidoP.setBounds(350, 280, 270, 40);

        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtNombre);
        txtNombre.setBounds(30, 280, 270, 40);

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
        btnAgregar.setBounds(900, 530, 410, 130);

        txtApellidoM.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtApellidoM);
        txtApellidoM.setBounds(670, 280, 270, 40);

        txtPassword.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(350, 570, 270, 40);

        txtNoCalle.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtNoCalle);
        txtNoCalle.setBounds(670, 440, 270, 40);

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

        txtColonia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtColonia);
        txtColonia.setBounds(30, 440, 270, 40);

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel12.setText("Contraseña");
        add(jLabel12);
        jLabel12.setBounds(350, 520, 160, 24);

        txtTelefono.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtTelefono);
        txtTelefono.setBounds(980, 440, 270, 40);

        jcDia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(jcDia);
        jcDia.setBounds(980, 280, 110, 40);

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel14.setText("Nombre");
        add(jLabel14);
        jLabel14.setBounds(30, 240, 160, 24);

        jcMes.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jcMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesActionPerformed(evt);
            }
        });
        add(jcMes);
        jcMes.setBounds(1105, 280, 110, 40);

        jcYear.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(jcYear);
        jcYear.setBounds(1230, 280, 110, 40);

        txtCalleNom.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        add(txtCalleNom);
        txtCalleNom.setBounds(350, 440, 270, 40);

        LbPass2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass2.setForeground(new java.awt.Color(255, 0, 0));
        LbPass2.setText("De Al Menos 6 Caracteres");
        add(LbPass2);
        LbPass2.setBounds(390, 640, 210, 20);

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel15.setText("Calle");
        add(jLabel15);
        jLabel15.setBounds(350, 390, 130, 24);

        LbPass1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass1.setForeground(new java.awt.Color(255, 0, 0));
        LbPass1.setText("La Contraseña Debe Ser ");
        add(LbPass1);
        LbPass1.setBounds(390, 620, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1360, 150);

        LbCorreo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCorreo.setForeground(new java.awt.Color(255, 0, 0));
        LbCorreo.setText("El Correo Esta Mal Escrito");
        LbCorreo.setToolTipText("");
        add(LbCorreo);
        LbCorreo.setBounds(60, 620, 190, 30);

        LbTelefono1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono1.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono1.setText("El telefono no puede contener letras,");
        add(LbTelefono1);
        LbTelefono1.setBounds(990, 470, 260, 30);

        LbTelefono2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono2.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono2.setText(" espacios o caracteres especiales");
        add(LbTelefono2);
        LbTelefono2.setBounds(1000, 490, 240, 20);

        LbTelefono3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbTelefono3.setForeground(new java.awt.Color(255, 0, 0));
        LbTelefono3.setText("Maximo 10 caracteres");
        add(LbTelefono3);
        LbTelefono3.setBounds(1040, 510, 160, 18);

        LbNoCalle1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNoCalle1.setForeground(new java.awt.Color(255, 0, 0));
        LbNoCalle1.setText("El numero de la calle no puede ");
        add(LbNoCalle1);
        LbNoCalle1.setBounds(690, 480, 220, 30);

        LbNoCalle2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNoCalle2.setForeground(new java.awt.Color(255, 0, 0));
        LbNoCalle2.setText("contener letras");
        add(LbNoCalle2);
        LbNoCalle2.setBounds(740, 500, 110, 20);

        LbColonia1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbColonia1.setForeground(new java.awt.Color(255, 0, 0));
        LbColonia1.setText("La colonia no puede contener numeros");
        add(LbColonia1);
        LbColonia1.setBounds(30, 480, 270, 30);

        LbColonia2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbColonia2.setForeground(new java.awt.Color(255, 0, 0));
        LbColonia2.setText(" o caracteres especiales");
        add(LbColonia2);
        LbColonia2.setBounds(70, 500, 170, 30);

        LbApellidoM1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoM1.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoM1.setText("El Apellido Materno no puede contener ");
        LbApellidoM1.setToolTipText("");
        add(LbApellidoM1);
        LbApellidoM1.setBounds(670, 310, 300, 40);

        LbApellidoM2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoM2.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoM2.setText("numeros o caracteres especiales");
        add(LbApellidoM2);
        LbApellidoM2.setBounds(690, 340, 240, 20);

        LbApellidoP1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoP1.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoP1.setText("El Apellido Paterno no puede contener ");
        LbApellidoP1.setToolTipText("");
        add(LbApellidoP1);
        LbApellidoP1.setBounds(350, 310, 300, 40);

        LbApellidoP2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbApellidoP2.setForeground(new java.awt.Color(255, 0, 0));
        LbApellidoP2.setText("numeros o caracteres especiales");
        add(LbApellidoP2);
        LbApellidoP2.setBounds(370, 340, 240, 20);

        LbNombre1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNombre1.setForeground(new java.awt.Color(255, 0, 0));
        LbNombre1.setText("El nombre no puede contener ");
        add(LbNombre1);
        LbNombre1.setBounds(60, 320, 220, 30);

        LbNombre2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbNombre2.setForeground(new java.awt.Color(255, 0, 0));
        LbNombre2.setText("numeros o caracteres especiales");
        add(LbNombre2);
        LbNombre2.setBounds(50, 340, 240, 20);

        LbRepet.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbRepet.setForeground(new java.awt.Color(255, 0, 0));
        LbRepet.setText("El correo ya esta registrado");
        add(LbRepet);
        LbRepet.setBounds(60, 640, 190, 18);

        LbError.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbError.setForeground(new java.awt.Color(255, 0, 0));
        LbError.setText("Llena todos los campos");
        add(LbError);
        LbError.setBounds(690, 590, 170, 18);

        LbCalle1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCalle1.setForeground(new java.awt.Color(255, 0, 0));
        LbCalle1.setText("La calle no puede contener caracteres");
        add(LbCalle1);
        LbCalle1.setBounds(350, 480, 270, 18);

        LbCalle2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCalle2.setForeground(new java.awt.Color(255, 0, 0));
        LbCalle2.setText("especiales");
        add(LbCalle2);
        LbCalle2.setBounds(440, 500, 80, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String txtFecha;
        String calle;
        int error;
        ocultarLabels();
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
                break;
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
                case 4: 
                    LbRepet.setVisible(true);
                                   
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        loginCliente = new loginCliente();
        loginCliente.setBounds(this.getBounds());
        this.removeAll();
        this.add(loginCliente);
        this.updateUI();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            LbCalle1.setVisible(true);
            LbCalle2.setVisible(true);
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
            LbError.setVisible(true);
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
    private javax.swing.JLabel LbCalle1;
    private javax.swing.JLabel LbCalle2;
    private javax.swing.JLabel LbColonia1;
    private javax.swing.JLabel LbColonia2;
    private javax.swing.JLabel LbCorreo;
    private javax.swing.JLabel LbError;
    private javax.swing.JLabel LbNoCalle1;
    private javax.swing.JLabel LbNoCalle2;
    private javax.swing.JLabel LbNombre1;
    private javax.swing.JLabel LbNombre2;
    private javax.swing.JLabel LbPass1;
    private javax.swing.JLabel LbPass2;
    private javax.swing.JLabel LbRepet;
    private javax.swing.JLabel LbTelefono1;
    private javax.swing.JLabel LbTelefono2;
    private javax.swing.JLabel LbTelefono3;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
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

    private void ocultarLabels() {
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
        LbTelefono1.setVisible(false);
        LbTelefono2.setVisible(false);
        LbTelefono3.setVisible(false);
        LbCorreo.setVisible(false);
        LbCalle1.setVisible(false);
        LbCalle2.setVisible(false);
        LbError.setVisible(false);
        LbRepet.setVisible(false);
        
    }
}
