package Swing;

import EnumClases.Calendario;
import EnumClases.TipoEmpleado;
import RestauranteConexion.RestauranteService;
import static Swing.AgregarEmpleado.ComprobarNumeros;
import static Swing.AgregarEmpleado.ComprobarStrings;
import Tablas.Empleados;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class AjustesAdmin extends javax.swing.JPanel {

    private TipoEmpleado tipoEmpleado;
    private Empleados admin;
    
    public AjustesAdmin(Empleados admin) {
        initComponents();
        quitarLabels();
        this.admin=admin;
        txtNombre.setText(admin.getNombre());
        txtApellidoP.setText(admin.getApellido_Paterno());
        txtApellidoM.setText(admin.getApellido_Materno());
        String fecha[] = admin.getEmp_Fecha_Nacimiento().toString().split("-");
        ///////////////FECHA////////////////
        
        jcYear.addItem(fecha[0]);
        jcDia.addItem(fecha[2]);
        
        Calendario mes = null;
        System.out.println(admin.getEmp_Fecha_Nacimiento().toString());
        
        ponerMes(mes, fecha[1]);
                
        
        
        ////////OTROS DATOS//////////////
        
        txtColonia.setText(admin.getColonia());
        String calleNo[] = admin.getCalle().split("#");
        txtCalleNom.setText(calleNo[0]);
        txtNoCalle.setText(calleNo[1]);
        txtTelefono.setText(admin.getTelefono());
        txtCorreo.setText(admin.getEmail());
        txtPassword.setText(admin.getPassword());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcDia = new javax.swing.JComboBox<>();
        jcMes = new javax.swing.JComboBox<>();
        jcYear = new javax.swing.JComboBox<>();
        txtColonia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCalleNom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNoCalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LbColonia1 = new javax.swing.JLabel();
        LbColonia2 = new javax.swing.JLabel();
        LbNoCalle1 = new javax.swing.JLabel();
        LbNoCalle2 = new javax.swing.JLabel();
        LbTelefono1 = new javax.swing.JLabel();
        LbTelefono2 = new javax.swing.JLabel();
        LbTelefono3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        LbCorreo = new javax.swing.JLabel();
        LbCorreoRep = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        LbPass1 = new javax.swing.JLabel();
        LbPass2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        LbCampos = new javax.swing.JLabel();
        btnTColonia = new javax.swing.JToggleButton();
        btnTCalle = new javax.swing.JToggleButton();
        btnTNoCalle = new javax.swing.JToggleButton();
        btnTTelefono = new javax.swing.JToggleButton();
        btnTCorreo = new javax.swing.JToggleButton();
        btnTPassword = new javax.swing.JToggleButton();
        LbCalle1 = new javax.swing.JLabel();
        LbCalle2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre");
        add(jLabel14);
        jLabel14.setBounds(20, 70, 160, 24);

        txtNombre.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtNombre.setEnabled(false);
        add(txtNombre);
        txtNombre.setBounds(20, 110, 270, 40);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido Paterno");
        add(jLabel4);
        jLabel4.setBounds(340, 60, 190, 20);

        txtApellidoP.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtApellidoP.setEnabled(false);
        add(txtApellidoP);
        txtApellidoP.setBounds(340, 110, 270, 40);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellido Materno");
        add(jLabel11);
        jLabel11.setBounds(660, 50, 180, 24);

        txtApellidoM.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtApellidoM.setEnabled(false);
        add(txtApellidoM);
        txtApellidoM.setBounds(660, 110, 270, 40);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Nacimiento");
        add(jLabel5);
        jLabel5.setBounds(1010, 50, 280, 24);

        jcDia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jcDia.setEnabled(false);
        add(jcDia);
        jcDia.setBounds(990, 110, 110, 40);

        jcMes.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jcMes.setEnabled(false);
        add(jcMes);
        jcMes.setBounds(1110, 110, 110, 40);

        jcYear.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jcYear.setEnabled(false);
        add(jcYear);
        jcYear.setBounds(1230, 110, 110, 40);

        txtColonia.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtColonia.setEnabled(false);
        add(txtColonia);
        txtColonia.setBounds(20, 270, 270, 40);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Colonia");
        add(jLabel6);
        jLabel6.setBounds(20, 220, 100, 40);

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Calle");
        add(jLabel15);
        jLabel15.setBounds(340, 220, 130, 24);

        txtCalleNom.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtCalleNom.setEnabled(false);
        add(txtCalleNom);
        txtCalleNom.setBounds(340, 270, 270, 40);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("No. Exterior");
        add(jLabel10);
        jLabel10.setBounds(660, 220, 130, 24);

        txtNoCalle.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtNoCalle.setEnabled(false);
        add(txtNoCalle);
        txtNoCalle.setBounds(660, 270, 270, 40);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Numero Telefonico");
        add(jLabel7);
        jLabel7.setBounds(970, 220, 240, 24);

        txtTelefono.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtTelefono.setEnabled(false);
        add(txtTelefono);
        txtTelefono.setBounds(970, 270, 270, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo");
        add(jLabel3);
        jLabel3.setBounds(20, 350, 160, 24);

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

        txtCorreo.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtCorreo.setEnabled(false);
        add(txtCorreo);
        txtCorreo.setBounds(20, 400, 270, 40);

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

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Contraseña");
        add(jLabel12);
        jLabel12.setBounds(340, 350, 160, 24);

        txtPassword.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtPassword.setEnabled(false);
        add(txtPassword);
        txtPassword.setBounds(340, 400, 270, 40);

        LbPass1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass1.setForeground(new java.awt.Color(255, 0, 0));
        LbPass1.setText("La Contraseña Debe Ser ");
        add(LbPass1);
        LbPass1.setBounds(390, 450, 170, 20);

        LbPass2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbPass2.setForeground(new java.awt.Color(255, 0, 0));
        LbPass2.setText("De Al Menos 6 Caracteres");
        add(LbPass2);
        LbPass2.setBounds(390, 470, 210, 20);

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Puesto");
        add(jLabel13);
        jLabel13.setBounds(660, 360, 160, 24);

        txtPuesto.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        txtPuesto.setEnabled(false);
        add(txtPuesto);
        txtPuesto.setBounds(660, 400, 180, 40);

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

        LbCampos.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        LbCampos.setForeground(new java.awt.Color(255, 0, 0));
        LbCampos.setText("Llene todos los campos ");
        add(LbCampos);
        LbCampos.setBounds(1000, 490, 240, 40);

        btnTColonia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTColonia.setContentAreaFilled(false);
        btnTColonia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTColonia.setVerifyInputWhenFocusTarget(false);
        btnTColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTColoniaActionPerformed(evt);
            }
        });
        add(btnTColonia);
        btnTColonia.setBounds(230, 220, 60, 40);

        btnTCalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTCalle.setContentAreaFilled(false);
        btnTCalle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTCalle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTCalle.setVerifyInputWhenFocusTarget(false);
        btnTCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTCalleActionPerformed(evt);
            }
        });
        add(btnTCalle);
        btnTCalle.setBounds(550, 220, 60, 40);

        btnTNoCalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTNoCalle.setToolTipText("");
        btnTNoCalle.setBorderPainted(false);
        btnTNoCalle.setContentAreaFilled(false);
        btnTNoCalle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTNoCalle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTNoCalle.setVerifyInputWhenFocusTarget(false);
        btnTNoCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTNoCalleActionPerformed(evt);
            }
        });
        add(btnTNoCalle);
        btnTNoCalle.setBounds(870, 210, 60, 40);

        btnTTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTTelefono.setBorderPainted(false);
        btnTTelefono.setContentAreaFilled(false);
        btnTTelefono.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTTelefono.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTTelefono.setVerifyInputWhenFocusTarget(false);
        btnTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTelefonoActionPerformed(evt);
            }
        });
        add(btnTTelefono);
        btnTTelefono.setBounds(1180, 210, 60, 40);

        btnTCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTCorreo.setBorderPainted(false);
        btnTCorreo.setContentAreaFilled(false);
        btnTCorreo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTCorreo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTCorreo.setVerifyInputWhenFocusTarget(false);
        btnTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTCorreoActionPerformed(evt);
            }
        });
        add(btnTCorreo);
        btnTCorreo.setBounds(230, 360, 60, 40);

        btnTPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTPassword.setBorderPainted(false);
        btnTPassword.setContentAreaFilled(false);
        btnTPassword.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitado.png"))); // NOI18N
        btnTPassword.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Habilitar en verde.png"))); // NOI18N
        btnTPassword.setVerifyInputWhenFocusTarget(false);
        btnTPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPasswordActionPerformed(evt);
            }
        });
        add(btnTPassword);
        btnTPassword.setBounds(550, 360, 60, 40);

        LbCalle1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCalle1.setForeground(new java.awt.Color(255, 0, 0));
        LbCalle1.setText("La calle no puede contener caracteres");
        add(LbCalle1);
        LbCalle1.setBounds(340, 310, 264, 18);

        LbCalle2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        LbCalle2.setForeground(new java.awt.Color(255, 0, 0));
        LbCalle2.setText("especiales");
        add(LbCalle2);
        LbCalle2.setBounds(430, 330, 80, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -140, 1670, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String calle;
        int error;
        quitarLabels();
        boolean correcto = datosCorrectos();

        calle = txtCalleNom.getText() + " #" + txtNoCalle.getText();
        
        if(correcto){
            admin.setCalle(calle);
            admin.setColonia(txtColonia.getText());
            admin.setTelefono(txtTelefono.getText());
            admin.setPassword(txtPassword.getText());
            
            if(txtCorreo.getText().equals(admin.getEmail())){
                error = RestauranteService.actualizarEmpleadoService(admin, false);
            }else{
                admin.setEmail(txtCorreo.getText());
                error = RestauranteService.actualizarEmpleadoService(admin, true);
            }
            switch(error){
                case 1:
                LbCorreo.setVisible(true);
                break;
                case 2:
                LbPass1.setVisible(true);
                LbPass2.setVisible(true);
                break;
                case 3:
                LbTelefono3.setVisible(true);
                break;
                case 4:
                LbCorreoRep.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnTColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTColoniaActionPerformed
        activarTxt(txtColonia, btnTColonia);
    }//GEN-LAST:event_btnTColoniaActionPerformed

    private void btnTCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTCalleActionPerformed
        activarTxt(txtCalleNom, btnTCalle);
    }//GEN-LAST:event_btnTCalleActionPerformed

    private void btnTNoCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTNoCalleActionPerformed
        activarTxt(txtNoCalle, btnTNoCalle);
    }//GEN-LAST:event_btnTNoCalleActionPerformed

    private void btnTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTelefonoActionPerformed
        activarTxt(txtTelefono, btnTTelefono);
    }//GEN-LAST:event_btnTTelefonoActionPerformed

    private void btnTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTCorreoActionPerformed
        activarTxt(txtCorreo, btnTCorreo);
    }//GEN-LAST:event_btnTCorreoActionPerformed

    private void btnTPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTPasswordActionPerformed
        activarTxt(txtPassword, btnTPassword);
    }//GEN-LAST:event_btnTPasswordActionPerformed

    
    private boolean datosCorrectos(){
        boolean correcto = true;
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
        
        if(!ComprobarStrings(txtCalleNom.getText().trim())){
            LbCalle1.setVisible(true);
            LbCalle2.setVisible(true);
            correcto = false;
        }
        
        
        if(!ComprobarNumeros(txtTelefono.getText().trim())){
            LbTelefono1.setVisible(true);
            LbTelefono2.setVisible(true);
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
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "correo invalido");
                correcto = false;
            }
        return correcto;
    }
    
    private void activarTxt(JTextField txtField,JToggleButton boton ){
        if(boton.isSelected()){
            txtField.setEnabled(true);
        }else{
            txtField.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCalle1;
    private javax.swing.JLabel LbCalle2;
    private javax.swing.JLabel LbCampos;
    private javax.swing.JLabel LbColonia1;
    private javax.swing.JLabel LbColonia2;
    private javax.swing.JLabel LbCorreo;
    private javax.swing.JLabel LbCorreoRep;
    private javax.swing.JLabel LbNoCalle1;
    private javax.swing.JLabel LbNoCalle2;
    private javax.swing.JLabel LbPass1;
    private javax.swing.JLabel LbPass2;
    private javax.swing.JLabel LbTelefono1;
    private javax.swing.JLabel LbTelefono2;
    private javax.swing.JLabel LbTelefono3;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JToggleButton btnTCalle;
    private javax.swing.JToggleButton btnTColonia;
    private javax.swing.JToggleButton btnTCorreo;
    private javax.swing.JToggleButton btnTNoCalle;
    private javax.swing.JToggleButton btnTPassword;
    private javax.swing.JToggleButton btnTTelefono;
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

    private void ponerMes(Calendario mes, String fecha) {
        
        switch(Integer.parseInt(fecha)){
            case 1:
                jcMes.addItem(mes.Enero.toString());
                break;
            case 2:
                jcMes.addItem(mes.Febrero.toString());
                break;
            case 3:
                jcMes.addItem(mes.Marzo.toString());
                break;
            case 4:
                jcMes.addItem(mes.Abril.toString());
                break;           
            case 5:
                jcMes.addItem(mes.Mayo.toString());
                break;
            case 6:
                jcMes.addItem(mes.Junio.toString());
                break;
            case 7:
                jcMes.addItem(mes.Julio.toString());
                break;
            case 8:
                jcMes.addItem(mes.Agosto.toString());
                break;
            case 9:
                jcMes.addItem(mes.Septiembre.toString());
                break;
            case 10:
                jcMes.addItem(mes.Octubre.toString());
                break;
            case 11:
                jcMes.addItem(mes.Noviembre.toString());
                break;
            case 12:
                jcMes.addItem(mes.Diciembre.toString());
                break;
        }
    }

    private void quitarLabels() {
        LbPass1.setVisible(false);
        LbPass2.setVisible(false);
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
        LbCalle1.setVisible(false);
        LbCalle2.setVisible(false);
    }
}
