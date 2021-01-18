package Swing;

import AppPackage.AnimationClass;
import Tablas.Clientes;
import Tablas.Platillos;
import Tablas.PlatillosTickets;
import Tablas.Tickets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class MenuDeUsuario extends javax.swing.JPanel implements Runnable{

    private int mostrandoMenu = 0;
    private Clientes clienteLogueado;
    private String hora,minutos,segundos,ampm;
    private Calendar calenderio;
    private Thread h1;
    private PantallaPrincipalUsuario pantallaPrincipal;   
    private MenuDePlatillos menuDePlatillos;
    private AjustesUsuario ajustesUsuario;
    private static ArrayList<PlatillosTickets> platillosEnCarrito;
    private static Tickets ticketGenerado;
    private ComprarCarrito comprarCarrito;
    private HistorialTickets historialTickets;
    private loginCliente loginCliente;

   
    
    public MenuDeUsuario(Clientes cliente) {
        initComponents();
        this.clienteLogueado = cliente;
        pantallaPrincipal = new PantallaPrincipalUsuario(clienteLogueado);
        pantallaPrincipal.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(pantallaPrincipal);
        panelRemplazo.updateUI();
        lblNombre.setText(clienteLogueado.getNombre());
        h1 = new Thread(this);
        h1.start();
        String fecha[] = clienteLogueado.getFecha().toString().split("-");
        System.out.println(Integer.parseInt(fecha[1]));
        platillosEnCarrito = new ArrayList<>();
        ticketGenerado =  new Tickets();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        btnPlatillos = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        lblPlatillos = new javax.swing.JLabel();
        btnHist = new javax.swing.JButton();
        lblMenuPrincipal = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        lblManuel = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblHist = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRemplazo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/menu (1).png"))); // NOI18N
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu);
        btnMenu.setBounds(10, 160, 50, 40);

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/configuraciones.png"))); // NOI18N
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        add(btnAjustes);
        btnAjustes.setBounds(-70, 370, 50, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/logout.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir);
        btnSalir.setBounds(-70, 410, 50, 40);

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/carro.png"))); // NOI18N
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        add(btnCarrito);
        btnCarrito.setBounds(-70, 250, 50, 40);

        btnPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/recibo.png"))); // NOI18N
        btnPlatillos.setContentAreaFilled(false);
        btnPlatillos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatillosActionPerformed(evt);
            }
        });
        add(btnPlatillos);
        btnPlatillos.setBounds(-70, 290, 50, 40);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/casa (1).png"))); // NOI18N
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(-70, 210, 50, 40);

        lblPlatillos.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblPlatillos.setText("* Ver Menus");
        lblPlatillos.setToolTipText("");
        lblPlatillos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblPlatillos);
        lblPlatillos.setBounds(-190, 300, 150, 20);

        btnHist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/recibo.png"))); // NOI18N
        btnHist.setContentAreaFilled(false);
        btnHist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistActionPerformed(evt);
            }
        });
        add(btnHist);
        btnHist.setBounds(-70, 330, 50, 40);

        lblMenuPrincipal.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblMenuPrincipal.setText("* Menu Principal");
        lblMenuPrincipal.setToolTipText("");
        lblMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblMenuPrincipal);
        lblMenuPrincipal.setBounds(-190, 220, 122, 20);

        lbHora.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(lbHora);
        lbHora.setBounds(1130, 90, 230, 50);

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        add(lblNombre);
        lblNombre.setBounds(920, 40, 440, 60);

        lblMenu.setFont(new java.awt.Font("Rockwell", 3, 20)); // NOI18N
        lblMenu.setText("Menu");
        lblMenu.setToolTipText("");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblMenu);
        lblMenu.setBounds(-130, 170, 60, 20);

        lblTitulo.setFont(new java.awt.Font("Rockwell", 1, 40)); // NOI18N
        lblTitulo.setText("Bienvenido de Nuevo!! ");
        add(lblTitulo);
        lblTitulo.setBounds(910, 0, 470, 40);

        lblAjustes.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblAjustes.setText("* Ajustes");
        lblAjustes.setToolTipText("");
        lblAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblAjustes);
        lblAjustes.setBounds(-190, 380, 150, 20);

        lblManuel.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblManuel.setText("\"Manuel Co\" Copyright 2021");
        lblManuel.setToolTipText("");
        lblManuel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblManuel);
        lblManuel.setBounds(-190, 460, 180, 20);

        lblSalir.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblSalir.setText("* Salir");
        lblSalir.setToolTipText("");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblSalir);
        lblSalir.setBounds(-190, 420, 150, 20);

        lblHist.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblHist.setText("* Historial");
        lblHist.setToolTipText("");
        lblHist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblHist);
        lblHist.setBounds(-190, 340, 150, 20);

        lblCarrito.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        lblCarrito.setText("* Ver Carrito");
        lblCarrito.setToolTipText("");
        lblCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblCarrito);
        lblCarrito.setBounds(-190, 260, 150, 20);

        lblFondo.setBackground(new java.awt.Color(255, 128, 128));
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFondo.setOpaque(true);
        add(lblFondo);
        lblFondo.setBounds(-210, 150, 200, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/EncabezadoPanel.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 150);

        panelRemplazo.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout panelRemplazoLayout = new javax.swing.GroupLayout(panelRemplazo);
        panelRemplazo.setLayout(panelRemplazoLayout);
        panelRemplazoLayout.setHorizontalGroup(
            panelRemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        panelRemplazoLayout.setVerticalGroup(
            panelRemplazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        add(panelRemplazo);
        panelRemplazo.setBounds(0, 150, 1370, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(1400, 770));
        jLabel1.setMinimumSize(new java.awt.Dimension(1400, 770));
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1520, 770);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        AnimationClass carrito = new AnimationClass();
        AnimationClass boton = new AnimationClass();

                    
        if(mostrandoMenu == 0){
            boton.jButtonXRight(-70,140,15,5, btnPlatillos);
            boton.jButtonXRight(-70,140,15,5, btnAjustes);
            boton.jButtonXRight(-70,140,15,5, btnCarrito);
            boton.jButtonXRight(-70,140,15,5, btnSalir);
            boton.jButtonXRight(-70,140,15,5, btnMenuPrincipal);
            boton.jButtonXRight(-70,140,15,5, btnPlatillos);
            boton.jButtonXRight(-70,140,15,5, btnHist);
            
            carrito.jLabelXRight(-210,0,15,5, lblFondo);
            
            carrito.jLabelXRight(-190,15,15,5, lblAjustes);
            carrito.jLabelXRight(-190,15,15,5, lblCarrito);
            carrito.jLabelXRight(-190,15,15,5, lblHist);
            carrito.jLabelXRight(-190,15,15,5, lblSalir);
            carrito.jLabelXRight(-190,15,15,5, lblManuel);
            carrito.jLabelXRight(-190,15,15,5, lblMenuPrincipal);
            carrito.jLabelXRight(-190,15,15,5, lblPlatillos);
            
            carrito.jLabelXRight(-130,80,15,5, lblMenu);
            boton.jButtonXRight(10,140,20,5, btnMenu);
            mostrandoMenu = 1;
        }else{
            carrito.jLabelXLeft(0,-210,15,5, lblFondo);
            
            carrito.jLabelXLeft(15,-190,15,5, lblAjustes);
            carrito.jLabelXLeft(15,-190,15,5, lblCarrito);
            carrito.jLabelXLeft(15,-190,15,5, lblHist);
            carrito.jLabelXLeft(15,-190,15,5, lblSalir);
            carrito.jLabelXLeft(15,-190,15,5, lblManuel);
            carrito.jLabelXLeft(15,-190,15,5, lblMenuPrincipal);
            carrito.jLabelXLeft(15,-190,15,5, lblPlatillos);
            
            boton.jButtonXLeft(140, 10, 15, 5, btnMenu);
            carrito.jLabelXLeft(80,-130,15,5, lblMenu);
            
            boton.jButtonXLeft(140, -70, 15, 5, btnPlatillos);
            boton.jButtonXLeft(140, -70, 15, 5, btnAjustes);
            boton.jButtonXLeft(140, -70, 15, 5, btnCarrito);
            boton.jButtonXLeft(140, -70, 15, 5, btnSalir);
            boton.jButtonXLeft(140, -70, 15, 5, btnMenuPrincipal);
            boton.jButtonXLeft(140, -70, 15, 5, btnPlatillos);
            boton.jButtonXLeft(140, -70, 15, 5, btnHist);
            
            mostrandoMenu = 0;
        }
    }//GEN-LAST:event_btnMenuActionPerformed

  
    
    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        btnMenuActionPerformed(evt);
        pantallaPrincipal = new PantallaPrincipalUsuario(clienteLogueado);
        pantallaPrincipal.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(pantallaPrincipal);
        panelRemplazo.updateUI();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatillosActionPerformed
        btnMenuActionPerformed(evt);
        menuDePlatillos = new MenuDePlatillos();
        menuDePlatillos.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(menuDePlatillos);
        panelRemplazo.updateUI();
    }//GEN-LAST:event_btnPlatillosActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        btnMenuActionPerformed(evt);
        ajustesUsuario = new AjustesUsuario(clienteLogueado);
        ajustesUsuario.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(ajustesUsuario);
        panelRemplazo.updateUI();
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        btnMenuActionPerformed(evt);
        comprarCarrito = new ComprarCarrito(clienteLogueado);
        comprarCarrito.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(comprarCarrito);
        panelRemplazo.updateUI();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistActionPerformed
        btnMenuActionPerformed(evt);
        historialTickets = new HistorialTickets(clienteLogueado);
        historialTickets.setBounds(0,0,panelRemplazo.getWidth(),panelRemplazo.getHeight());
        panelRemplazo.removeAll();
        panelRemplazo.add(historialTickets);
        panelRemplazo.updateUI();
    }//GEN-LAST:event_btnHistActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        loginCliente = new loginCliente();
        loginCliente.setBounds(this.getBounds());
        this.removeAll();
        this.add(loginCliente);
        this.updateUI();
    }//GEN-LAST:event_btnSalirActionPerformed

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
    
     public static ArrayList<PlatillosTickets> getPlatillosEnCarrito() {
        return platillosEnCarrito;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnHist;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnPlatillos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHist;
    private javax.swing.JLabel lblManuel;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlatillos;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelRemplazo;
    // End of variables declaration//GEN-END:variables

   
}
