package Swing;

import AppPackage.AnimationClass;
import Tablas.Empleados;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuDeAdmin extends javax.swing.JPanel implements Runnable{
    int mostrandoMenu = 0;
    private AgregarEmpleado agregarEmpleado;
    private EscogerPlatillos escogerPlatillos;
    private Empleados admin;
    private PantallaPrincipalAdmin pantallaPrincipalAdmin;
    private String hora,minutos,segundos,ampm;
    private Calendar calenderio;
    private Thread h1;
    private AjustesAdmin ajustesAdmin;
    private loginAdmin loginAdmin;
    private GestionarEmpleados gestionarEmpleados;
    
 
    public MenuDeAdmin(Empleados admin) {
        initComponents();
        this.admin = admin;
        lblNombre.setText(admin.getNombre() + " " + admin.getApellido_Paterno());
        pantallaPrincipalAdmin = new PantallaPrincipalAdmin(admin);
        pantallaPrincipalAdmin.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(pantallaPrincipalAdmin);
        panelCambiar.updateUI();
        h1 = new Thread(this);
        h1.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarEmpleado = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnEsMenus = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        btnGestEmpleados = new javax.swing.JButton();
        lbHora = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEsMenu = new javax.swing.JLabel();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        lblManuel = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblGestEmpleados = new javax.swing.JLabel();
        lblAgregarEmpleado = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCambiar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/usuario.png"))); // NOI18N
        btnAgregarEmpleado.setContentAreaFilled(false);
        btnAgregarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        add(btnAgregarEmpleado);
        btnAgregarEmpleado.setBounds(-170, 300, 45, 35);

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/configuraciones.png"))); // NOI18N
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        add(btnAjustes);
        btnAjustes.setBounds(-170, 380, 45, 35);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/logout.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir);
        btnSalir.setBounds(-170, 420, 45, 35);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/menu (1).png"))); // NOI18N
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu);
        btnMenu.setBounds(10, 160, 45, 35);

        btnEsMenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/restaurante (1).png"))); // NOI18N
        btnEsMenus.setContentAreaFilled(false);
        btnEsMenus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsMenusActionPerformed(evt);
            }
        });
        add(btnEsMenus);
        btnEsMenus.setBounds(-170, 340, 45, 35);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/casa (1).png"))); // NOI18N
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(-170, 220, 45, 35);

        btnGestEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/silueta-de-multiples-usuarios (2).png"))); // NOI18N
        btnGestEmpleados.setContentAreaFilled(false);
        btnGestEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestEmpleadosActionPerformed(evt);
            }
        });
        add(btnGestEmpleados);
        btnGestEmpleados.setBounds(-170, 260, 45, 35);

        lbHora.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        lbHora.setForeground(new java.awt.Color(0, 0, 0));
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(lbHora);
        lbHora.setBounds(1130, 90, 230, 50);

        lblTitulo.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Bienvenido de Nuevo!! ");
        add(lblTitulo);
        lblTitulo.setBounds(910, 0, 470, 40);

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        add(lblNombre);
        lblNombre.setBounds(920, 40, 440, 60);

        lblEsMenu.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblEsMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblEsMenu.setText("* Escoger Menus");
        lblEsMenu.setToolTipText("");
        add(lblEsMenu);
        lblEsMenu.setBounds(-335, 350, 155, 20);

        lblMenuPrincipal.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        lblMenuPrincipal.setText("* Menu Principal");
        lblMenuPrincipal.setToolTipText("");
        add(lblMenuPrincipal);
        lblMenuPrincipal.setBounds(-335, 230, 155, 20);

        lblMenu.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setText("Menu");
        lblMenu.setToolTipText("");
        add(lblMenu);
        lblMenu.setBounds(-250, 170, 60, 20);

        lblAjustes.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblAjustes.setForeground(new java.awt.Color(0, 0, 0));
        lblAjustes.setText("* Ajustes");
        lblAjustes.setToolTipText("");
        add(lblAjustes);
        lblAjustes.setBounds(-335, 390, 155, 20);

        lblManuel.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblManuel.setForeground(new java.awt.Color(0, 0, 0));
        lblManuel.setText("\"Manuel Co\" Copyright 2021");
        lblManuel.setToolTipText("");
        add(lblManuel);
        lblManuel.setBounds(-335, 470, 180, 20);

        lblSalir.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setText("* Salir");
        lblSalir.setToolTipText("");
        add(lblSalir);
        lblSalir.setBounds(-335, 430, 155, 20);

        lblGestEmpleados.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblGestEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        lblGestEmpleados.setText("* Gestionar Empleados");
        lblGestEmpleados.setToolTipText("");
        add(lblGestEmpleados);
        lblGestEmpleados.setBounds(-335, 270, 170, 20);

        lblAgregarEmpleado.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblAgregarEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregarEmpleado.setText("* Agregar Empleado");
        lblAgregarEmpleado.setToolTipText("");
        add(lblAgregarEmpleado);
        lblAgregarEmpleado.setBounds(-335, 310, 155, 20);

        lblFondo.setBackground(new java.awt.Color(255, 128, 128));
        lblFondo.setOpaque(true);
        add(lblFondo);
        lblFondo.setBounds(-350, 150, 240, 360);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/encabezadoInicio.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 160);

        panelCambiar.setBackground(new java.awt.Color(255, 102, 0));
        panelCambiar.setLayout(null);
        add(panelCambiar);
        panelCambiar.setBounds(0, 150, 1370, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1430, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        btnMenuActionPerformed(evt);
        agregarEmpleado= new AgregarEmpleado();
        agregarEmpleado.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(agregarEmpleado);
        panelCambiar.updateUI(); 
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        AnimationClass carrito = new AnimationClass();
        AnimationClass boton = new AnimationClass();
                    
        if(mostrandoMenu == 0){
            mostrandoMenu = 1;
            carrito.jLabelXRight(-350,0,9,5, lblFondo);
            
            boton.jButtonXRight(-170,185,9,5, btnEsMenus);
            boton.jButtonXRight(-170,185,9,5, btnAjustes);
            boton.jButtonXRight(-170,185,9,5, btnAgregarEmpleado);
            boton.jButtonXRight(-170,185,9,5, btnSalir);
            boton.jButtonXRight(-170,185,9,5, btnGestEmpleados);
            boton.jButtonXRight(-170,185,9,5, btnMenuPrincipal);
            
            carrito.jLabelXRight(-335,15,9,5, lblAjustes);
            carrito.jLabelXRight(-335,15,9,5, lblAgregarEmpleado);
            carrito.jLabelXRight(-335,15,9,5, lblGestEmpleados);
            carrito.jLabelXRight(-335,15,9,5, lblSalir);
            carrito.jLabelXRight(-335,15,9,5, lblManuel);
            carrito.jLabelXRight(-335,15,9,5, lblMenuPrincipal);
            carrito.jLabelXRight(-335,15,9,5, lblEsMenu);
            
            carrito.jLabelXRight(-250,100,9,5, lblMenu);
            boton.jButtonXRight(10,180,20,5, btnMenu);
            
        }else{
            mostrandoMenu = 0;
            carrito.jLabelXLeft(0,-350,15,5, lblFondo);
            
            carrito.jLabelXLeft(15,-335,15,5, lblAjustes);
            carrito.jLabelXLeft(15,-335,15,5, lblAgregarEmpleado);
            carrito.jLabelXLeft(15,-335,15,5, lblGestEmpleados);
            carrito.jLabelXLeft(15,-335,15,5, lblSalir);
            carrito.jLabelXLeft(15,-335,15,5, lblManuel);
            carrito.jLabelXLeft(15,-335,15,5, lblEsMenu);
            carrito.jLabelXLeft(15,-335,15,5, lblMenuPrincipal);
            
            carrito.jLabelXLeft(100,-250,15,5, lblMenu);
            boton.jButtonXLeft(180,10, 15, 5, btnMenu);
            
            boton.jButtonXLeft(185, -170, 15, 5, btnEsMenus);
            boton.jButtonXLeft(185, -170, 15, 5, btnAjustes);
            boton.jButtonXLeft(185, -170, 15, 5, btnAgregarEmpleado);
            boton.jButtonXLeft(185, -170, 15, 5, btnSalir);
            boton.jButtonXLeft(185, -170, 15, 5, btnGestEmpleados);
            boton.jButtonXLeft(185, -170, 15, 5, btnMenuPrincipal);
            
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEsMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsMenusActionPerformed
        btnMenuActionPerformed(evt);
        escogerPlatillos= new EscogerPlatillos();
        escogerPlatillos.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(escogerPlatillos);
        panelCambiar.updateUI(); 
    }//GEN-LAST:event_btnEsMenusActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        btnMenuActionPerformed(evt);
        pantallaPrincipalAdmin = new PantallaPrincipalAdmin(admin);
        pantallaPrincipalAdmin.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(pantallaPrincipalAdmin);
        panelCambiar.updateUI();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        btnMenuActionPerformed(evt);
        ajustesAdmin = new AjustesAdmin(admin);
        ajustesAdmin.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(ajustesAdmin);
        panelCambiar.updateUI();

    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        btnMenuActionPerformed(evt);
        loginAdmin = new loginAdmin();
        loginAdmin.setBounds(this.getBounds());
        this.removeAll();
        this.add(loginAdmin);
        this.updateUI();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGestEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestEmpleadosActionPerformed
        btnMenuActionPerformed(evt);
        gestionarEmpleados = new GestionarEmpleados();
        gestionarEmpleados.setBounds(0,0,panelCambiar.getWidth(),panelCambiar.getHeight());
        panelCambiar.removeAll();
        panelCambiar.add(gestionarEmpleados);
        panelCambiar.updateUI();
    }//GEN-LAST:event_btnGestEmpleadosActionPerformed
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM? "AM" : "PM";

        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE)>9? "" + calendario.get(Calendar.MINUTE) : "0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while(ct == h1) {
            calcula();
            lbHora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
            if((Integer.parseInt(hora) == 12) || (Integer.parseInt(hora) < 6 )  && ampm == "PM"){
             //lbTipoComida.setText("Comida");
            }else if((Integer.parseInt(hora) >= 6) && (Integer.parseInt(hora) <= 11) && ampm == "PM" ){
             //lbTipoComida.setText("Cena");
            }else{
             //lbTipoComida.setText("Desayuno");
            }
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnEsMenus;
    private javax.swing.JButton btnGestEmpleados;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lblAgregarEmpleado;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblEsMenu;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGestEmpleados;
    private javax.swing.JLabel lblManuel;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCambiar;
    // End of variables declaration//GEN-END:variables

}
