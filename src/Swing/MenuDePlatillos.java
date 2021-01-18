package Swing;


import Tablas.Clientes;
import Tablas.Platillos;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class MenuDePlatillos extends javax.swing.JPanel {

    private int indexDeMenu;
    private ArrayList<Platillos> arrayDePlatillos;
    
    private ArrayList<Platillos> desayuno;
    private ArrayList<Platillos> comida;
    private ArrayList<Platillos> cena;
    private ArrayList<Platillos> bebidas;
    
    private ArrayList<Platillos> platoFuerte;
    private ArrayList<Platillos> ensalada;
    private ArrayList<Platillos> entradas;
    private ArrayList<Platillos> postres;
    private ArrayList<Platillos> bebidasCalientes;
    private ArrayList<Platillos> bebidasFrias;
    private ArrayList<Platillos> bebidasAlcoholicas;
    
    private Clientes clienteLogueado;
    private int num;
    private int num2;
    private int num3;
    private int num4;
    private Icon imagen;
    private String ruta;
    private AgregarCarrito agregarCarrito;
    
    public MenuDePlatillos(Clientes logueado) {
        initComponents();
        this.clienteLogueado = logueado;
        btnIzqPlatoFuerte.setEnabled(false);
        btnIzqEntradas.setEnabled(false);
        btnIzqEnsalada.setEnabled(false);
        btnIzqPostres.setEnabled(false);
        btnDerPlatoFuerte.setEnabled(true);
        btnDerEntrada.setEnabled(true);
        btnDerEnsalada.setEnabled(true);
        btnDerPostres.setEnabled(true);
        indexDeMenu = -1;
        arrayDePlatillos = RestauranteConexion.RestauranteService.traerPlatillosActivosService();
        
        System.out.println("***tamanio en el menu "+arrayDePlatillos.size());
        lblMenu.setText("Desayunos");
        imagen= null;
        ruta="";
        platoFuerte = new ArrayList<>();
        ensalada = new ArrayList<>();
        entradas = new ArrayList<>();
        postres = new ArrayList<>();
        desayuno = new ArrayList<>();
        comida = new ArrayList<>();
        cena  = new ArrayList<>();
        bebidas = new ArrayList<>();
        bebidasCalientes = new ArrayList<>();
        bebidasFrias = new ArrayList<>();
        bebidasAlcoholicas = new ArrayList<>();
       num=1;
       num2=1;
       num3=1;
       num4=1;
       //recorre el array de platillos
        for(Platillos plat : arrayDePlatillos){
            int a=plat.getPla_Menu().getMenu_Id();
            switch(a){
                case 1:
                    desayuno.add(plat);
                    break;
                case 2:
                    comida.add(plat);
                    break;
                case 3:
                    
                    if(!(plat.getPla_Categoria().getCat_Id()==7 || plat.getPla_Categoria().getCat_Id()==8 ||plat.getPla_Categoria().getCat_Id()==9))
                    {
                        cena.add(plat);
                    }
                    break;
            }
            if(plat.getPla_Categoria().getCat_Id()==7 || plat.getPla_Categoria().getCat_Id()==8 ||plat.getPla_Categoria().getCat_Id()==9){
                bebidas.add(plat);
              //  System.out.println(bebidas.get(bebidas.size()));
            }
        }
        System.out.println("tamanio de bebidas"+bebidas.size());
       btnAvanzarMenuActionPerformed(null);
      
        if(platoFuerte.size()==0){
            lblPlato.setText("No disponible");
            lblPlato2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblPlato2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblPlato.setIcon(img2);
        }
        if(ensalada.size()==0){
            lblEnsalada.setText("No disponible");
            lblEnsalada2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(ensalada.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblEnsalada2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(ensalada.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblEnsalada.setIcon(img2);
        }
        if(entradas.size()==0){
            lblEntrada.setText("No disponible");
            lblEntrada2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(entradas.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblEntrada2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(entradas.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblEntrada.setIcon(img2);
        }
        if(postres.size()==0){
            lblPostre.setText("No disponible");
            lblPostre2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(postres.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblPostre2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(postres.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblPostre.setIcon(img2);
        }
        /*if(bebidasCalientes.size()==0){
            lblPlato.setText("No disponible");
            lblPlato.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(bebidasCalientes.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblPlato2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(bebidasCalientes.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblPlato.setIcon(img2);
        }
        if(bebidasFrias.size()==0){
            lblEnsalada.setText("No disponible");
            lblEnsalada2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(bebidasFrias.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblEnsalada2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(bebidasFrias.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblEnsalada.setIcon(img2);
        }
        if(bebidasAlcoholicas.size()==0){
            lblEntrada.setText("No disponible");
            lblEntrada2.setText("No disponible");
        }
        else{
            Image img = new ImageIcon(getClass().getResource(bebidasAlcoholicas.get(1).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblEntrada2.setIcon(img2);
              img=new ImageIcon(getClass().getResource(bebidasAlcoholicas.get(0).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
            lblEntrada.setIcon(img2);
        }*/
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblEnsalada2 = new javax.swing.JLabel();
        lblEnsalada = new javax.swing.JLabel();
        lblPlato = new javax.swing.JLabel();
        lblPlato2 = new javax.swing.JLabel();
        lblPostre = new javax.swing.JLabel();
        lblPostre2 = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblEntrada2 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnIzqEntradas = new javax.swing.JButton();
        btnDerEntrada = new javax.swing.JButton();
        btnDerPlatoFuerte = new javax.swing.JButton();
        btnIzqEnsalada = new javax.swing.JButton();
        btnIzqPlatoFuerte = new javax.swing.JButton();
        btnIzqPostres = new javax.swing.JButton();
        btnDerEnsalada = new javax.swing.JButton();
        btnAvanzarMenu = new javax.swing.JButton();
        btnDerPostres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jSeparator2);
        jSeparator2.setBounds(980, 355, 170, 2);

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jSeparator3);
        jSeparator3.setBounds(970, 90, 170, 2);

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jSeparator4);
        jSeparator4.setBounds(452, 355, 170, 2);

        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jSeparator5);
        jSeparator5.setBounds(445, 90, 170, 2);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        add(jLabel2);
        jLabel2.setBounds(70, 100, 170, 40);

        lblEnsalada2.setText("jLabel3");
        lblEnsalada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnsalada2.setOpaque(true);
        lblEnsalada2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnsalada2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEnsalada2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEnsalada2MouseExited(evt);
            }
        });
        add(lblEnsalada2);
        lblEnsalada2.setBounds(1070, 120, 150, 130);

        lblEnsalada.setText("jLabel3");
        lblEnsalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnsalada.setOpaque(true);
        lblEnsalada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEnsaladaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEnsaladaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEnsaladaMouseExited(evt);
            }
        });
        add(lblEnsalada);
        lblEnsalada.setBounds(900, 120, 150, 130);

        lblPlato.setText("jLabel3");
        lblPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlato.setOpaque(true);
        lblPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPlatoMouseExited(evt);
            }
        });
        add(lblPlato);
        lblPlato.setBounds(380, 120, 150, 130);

        lblPlato2.setText("jLabel3");
        lblPlato2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlato2.setOpaque(true);
        lblPlato2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlato2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPlato2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPlato2MouseExited(evt);
            }
        });
        add(lblPlato2);
        lblPlato2.setBounds(550, 120, 150, 130);

        lblPostre.setText("jLabel3");
        lblPostre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPostre.setOpaque(true);
        lblPostre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPostreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPostreMouseExited(evt);
            }
        });
        add(lblPostre);
        lblPostre.setBounds(900, 380, 150, 130);

        lblPostre2.setText("jLabel3");
        lblPostre2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPostre2.setOpaque(true);
        lblPostre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostre2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPostre2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPostre2MouseExited(evt);
            }
        });
        add(lblPostre2);
        lblPostre2.setBounds(1070, 380, 150, 130);

        lblEntrada.setText("jLabel3");
        lblEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrada.setOpaque(true);
        lblEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntradaMouseExited(evt);
            }
        });
        add(lblEntrada);
        lblEntrada.setBounds(380, 380, 150, 130);

        lblEntrada2.setText("jLabel3");
        lblEntrada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrada2.setOpaque(true);
        lblEntrada2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrada2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrada2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrada2MouseExited(evt);
            }
        });
        add(lblEntrada2);
        lblEntrada2.setBounds(550, 380, 150, 130);

        lblMenu.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Cena");
        add(lblMenu);
        lblMenu.setBounds(70, 170, 170, 30);

        jLabel4.setBackground(new java.awt.Color(255, 51, 0));
        jLabel4.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Platillos/desayuno.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(40, 260, 230, 200);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(360, 110, 360, 150);

        jLabel6.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ensalada");
        add(jLabel6);
        jLabel6.setBounds(960, 60, 200, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Postres");
        add(jLabel7);
        jLabel7.setBounds(960, 320, 210, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        add(jLabel8);
        jLabel8.setBounds(880, 370, 360, 150);

        jLabel9.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Plato Fuerte");
        add(jLabel9);
        jLabel9.setBounds(440, 60, 180, 30);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        add(jLabel10);
        jLabel10.setBounds(880, 110, 360, 150);

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        add(jLabel11);
        jLabel11.setBounds(360, 370, 360, 150);

        jLabel12.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Entradas");
        add(jLabel12);
        jLabel12.setBounds(440, 320, 190, 30);

        btnIzqEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqEntradas.setContentAreaFilled(false);
        btnIzqEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzqEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqEntradasActionPerformed(evt);
            }
        });
        add(btnIzqEntradas);
        btnIzqEntradas.setBounds(290, 420, 60, 50);

        btnDerEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerEntrada.setContentAreaFilled(false);
        btnDerEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerEntradaActionPerformed(evt);
            }
        });
        add(btnDerEntrada);
        btnDerEntrada.setBounds(730, 420, 60, 50);

        btnDerPlatoFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerPlatoFuerte.setContentAreaFilled(false);
        btnDerPlatoFuerte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerPlatoFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerPlatoFuerteActionPerformed(evt);
            }
        });
        add(btnDerPlatoFuerte);
        btnDerPlatoFuerte.setBounds(730, 160, 60, 50);

        btnIzqEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqEnsalada.setContentAreaFilled(false);
        btnIzqEnsalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzqEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqEnsaladaActionPerformed(evt);
            }
        });
        add(btnIzqEnsalada);
        btnIzqEnsalada.setBounds(810, 160, 60, 50);

        btnIzqPlatoFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqPlatoFuerte.setContentAreaFilled(false);
        btnIzqPlatoFuerte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzqPlatoFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqPlatoFuerteActionPerformed(evt);
            }
        });
        add(btnIzqPlatoFuerte);
        btnIzqPlatoFuerte.setBounds(290, 160, 60, 50);

        btnIzqPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_izq.png"))); // NOI18N
        btnIzqPostres.setContentAreaFilled(false);
        btnIzqPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIzqPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqPostresActionPerformed(evt);
            }
        });
        add(btnIzqPostres);
        btnIzqPostres.setBounds(810, 420, 60, 50);

        btnDerEnsalada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerEnsalada.setContentAreaFilled(false);
        btnDerEnsalada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerEnsaladaActionPerformed(evt);
            }
        });
        add(btnDerEnsalada);
        btnDerEnsalada.setBounds(1250, 160, 60, 50);

        btnAvanzarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Flecha_mas_grande.png"))); // NOI18N
        btnAvanzarMenu.setContentAreaFilled(false);
        btnAvanzarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvanzarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarMenuActionPerformed(evt);
            }
        });
        add(btnAvanzarMenu);
        btnAvanzarMenu.setBounds(1270, 280, 80, 70);

        btnDerPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/flecha_derecha.png"))); // NOI18N
        btnDerPostres.setContentAreaFilled(false);
        btnDerPostres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDerPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerPostresActionPerformed(evt);
            }
        });
        add(btnDerPostres);
        btnDerPostres.setBounds(1260, 420, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1370, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvanzarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarMenuActionPerformed
        
        indexDeMenu = indexDeMenu >= 3 ? 0 :  indexDeMenu + 1 ;
        /*se quiere hacer que cuando se presione el boton mande el menu del siguiente*/
        
        num=1;
        num2=1;
        num3=1;
        num4=1;
        jLabel9.setText("Plato Fuerte");
        jLabel12.setText("Entradas");
        jLabel6.setText("Ensalada");
        jLabel7.setText("Postres");
        jLabel7.setVisible(true);
        lblPostre.setVisible(true);
        lblPostre.setEnabled(true);
        lblPostre2.setVisible(true);
        lblPostre2.setEnabled(true);
        btnIzqPostres.setVisible(true);
        btnDerPostres.setVisible(true);
        jLabel8.setVisible(true);
        switch(indexDeMenu){
            case 0:
                
                lblMenu.setText("Desayunos");
                cambiarPanelDeMenu(desayuno);
                try{
                    
                    Image img = new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())).getImage();
                    Image img2 = new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())).getImage();
                    Image img3 = new ImageIcon(getClass().getResource(ensalada.get(0).getPla_Imagen())).getImage();
                    Image img4 = new ImageIcon(getClass().getResource(ensalada.get(1).getPla_Imagen())).getImage();
                    Image img5 = new ImageIcon(getClass().getResource(entradas.get(0).getPla_Imagen())).getImage();
                    Image img6 = new ImageIcon(getClass().getResource(entradas.get(1).getPla_Imagen())).getImage();
                    Image img7 = new ImageIcon(getClass().getResource(postres.get(0).getPla_Imagen())).getImage();
                    Image img8 = new ImageIcon(getClass().getResource(postres.get(1).getPla_Imagen())).getImage();
                    ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg2=new ImageIcon(img2.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg3=new ImageIcon(img3.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg4=new ImageIcon(img4.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg5=new ImageIcon(img5.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg6=new ImageIcon(img6.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg7=new ImageIcon(img7.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg8=new ImageIcon(img8.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ruta="/Imagenes/Platillos/desayuno.png"; 
                    imagen=new ImageIcon(getClass().getResource(ruta));
                     
                     jLabel4.setIcon(imagen);
                     
                     lblPlato.setIcon(iimg);  
                     lblPlato2.setIcon(iimg2);
                     lblEnsalada.setIcon(iimg3);
                     lblEnsalada2.setIcon(iimg4);
                     lblEntrada.setIcon(iimg5);
                     lblEntrada2.setIcon(iimg6);
                     lblPostre.setIcon(iimg7);
                     lblPostre2.setIcon(iimg8);
                     btnIzqPlatoFuerte.setEnabled(false);
                     btnIzqEntradas.setEnabled(false);
                     btnIzqEnsalada.setEnabled(false);
                     btnIzqPostres.setEnabled(false);
                     if(num==platoFuerte.size()-1)
                        btnDerPlatoFuerte.setEnabled(false);
                     if(num2==ensalada.size()-1)
                        btnDerEnsalada.setEnabled(false);
                     if(num3==entradas.size()-1)
                        btnDerEntrada.setEnabled(false);
                     if(num4==postres.size()-1)
                        btnDerPostres.setEnabled(false);
                
                 
                }
                catch(Exception e){
                  //  System.out.println("error xd");
                }
                break;
            case 1:
                
                lblMenu.setText("Comida");
                cambiarPanelDeMenu(comida);
                try {
                    Image img = new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())).getImage();
                    Image img2 = new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())).getImage();
                    Image img3 = new ImageIcon(getClass().getResource(ensalada.get(0).getPla_Imagen())).getImage();
                    Image img4 = new ImageIcon(getClass().getResource(ensalada.get(1).getPla_Imagen())).getImage();
                    Image img5 = new ImageIcon(getClass().getResource(entradas.get(0).getPla_Imagen())).getImage();
                    Image img6 = new ImageIcon(getClass().getResource(entradas.get(1).getPla_Imagen())).getImage();
                    Image img7 = new ImageIcon(getClass().getResource(postres.get(0).getPla_Imagen())).getImage();
                    Image img8 = new ImageIcon(getClass().getResource(postres.get(1).getPla_Imagen())).getImage();
                    ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg2=new ImageIcon(img2.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg3=new ImageIcon(img3.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg4=new ImageIcon(img4.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg5=new ImageIcon(img5.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg6=new ImageIcon(img6.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg7=new ImageIcon(img7.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg8=new ImageIcon(img8.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ruta="/Imagenes/Platillos/comida.png";
                     imagen=new ImageIcon(getClass().getResource(ruta)); 
                     lblPlato.setIcon(iimg);  
                     lblPlato2.setIcon(iimg2);
                     lblEnsalada.setIcon(iimg3);
                     lblEnsalada2.setIcon(iimg4);
                     lblEntrada.setIcon(iimg5);
                     lblEntrada2.setIcon(iimg6);
                     lblPostre.setIcon(iimg7);
                     lblPostre2.setIcon(iimg8);
                     jLabel4.setIcon(imagen);
                     btnIzqPlatoFuerte.setEnabled(false);
                     btnIzqEntradas.setEnabled(false);
                     btnIzqEnsalada.setEnabled(false);
                     btnIzqPostres.setEnabled(false);
                     //si es -1?
                     if(num==platoFuerte.size()-1)
                        btnDerPlatoFuerte.setEnabled(false);
                     if(num2==ensalada.size()-1)
                        btnDerEnsalada.setEnabled(false);
                     if(num3==entradas.size()-1)
                        btnDerEntrada.setEnabled(false);
                     if(num4==postres.size()-1)
                        btnDerPostres.setEnabled(false);
                } catch (Exception e) {
                }
                break;
            case 2:
                //no muestra al inicio ni muestra bien las ensaladas
                ensalada.clear();
                lblMenu.setText("Cena");
                cambiarPanelDeMenu(cena);
                
                try {
                    
                    Image img = new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())).getImage();
                    Image img2 = new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())).getImage();
                    Image img3 = new ImageIcon(getClass().getResource(ensalada.get(0).getPla_Imagen())).getImage();
                    Image img4 = new ImageIcon(getClass().getResource(ensalada.get(1).getPla_Imagen())).getImage();
                    Image img5 = new ImageIcon(getClass().getResource(entradas.get(0).getPla_Imagen())).getImage();
                    Image img6 = new ImageIcon(getClass().getResource(entradas.get(1).getPla_Imagen())).getImage();
                    Image img7 = new ImageIcon(getClass().getResource(postres.get(0).getPla_Imagen())).getImage();
                    Image img8 = new ImageIcon(getClass().getResource(postres.get(1).getPla_Imagen())).getImage();
                    ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg2=new ImageIcon(img2.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg3=new ImageIcon(img3.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg4=new ImageIcon(img4.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg5=new ImageIcon(img5.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg6=new ImageIcon(img6.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg7=new ImageIcon(img7.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ImageIcon iimg8=new ImageIcon(img8.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                    ruta="/Imagenes/Platillos/cena.png";
                     imagen=new ImageIcon(getClass().getResource(ruta)); 
                     lblPlato.setIcon(iimg);  
                     lblPlato2.setIcon(iimg2);
                     lblEnsalada.setIcon(iimg3);
                     lblEnsalada2.setIcon(iimg4);
                     lblEntrada.setIcon(iimg5);
                     lblEntrada2.setIcon(iimg6);
                     lblPostre.setIcon(iimg7);
                     lblPostre2.setIcon(iimg8);
                     jLabel4.setIcon(imagen);
                     btnIzqPlatoFuerte.setEnabled(false);
                     btnIzqEntradas.setEnabled(false);
                     btnIzqEnsalada.setEnabled(false);
                     btnIzqPostres.setEnabled(false);
                     if(num==platoFuerte.size()-1)
                        btnDerPlatoFuerte.setEnabled(false);
                     if(num2==ensalada.size()-1)
                        btnDerEnsalada.setEnabled(false);
                     if(num3==entradas.size()-1)
                        btnDerEntrada.setEnabled(false);
                     if(num4==postres.size()-1)
                        btnDerPostres.setEnabled(false);
                } catch (Exception e) {
                }
                break;
            case 3:
                lblMenu.setText("Bebidas");
                cambiarPanelDeMenu(bebidas);
                try {
                        platoFuerte=bebidasCalientes;
                        ensalada=bebidasAlcoholicas;
                        entradas=bebidasFrias;        
                     Image img = new ImageIcon(getClass().getResource(bebidasCalientes.get(0).getPla_Imagen())).getImage();
                     Image img2 = new ImageIcon(getClass().getResource(bebidasCalientes.get(1).getPla_Imagen())).getImage();
                     Image img3 = new ImageIcon(getClass().getResource(bebidasFrias.get(0).getPla_Imagen())).getImage();
                     Image img4 = new ImageIcon(getClass().getResource(bebidasFrias.get(1).getPla_Imagen())).getImage();
                     Image img5 = new ImageIcon(getClass().getResource(bebidasAlcoholicas.get(0).getPla_Imagen())).getImage();
                     Image img6 = new ImageIcon(getClass().getResource(bebidasAlcoholicas.get(1).getPla_Imagen())).getImage();
                     //Image img7 = new ImageIcon(getClass().getResource(bebidas.get(0).getPla_Imagen())).getImage();
                     //Image img8 = new ImageIcon(getClass().getResource(bebidas.get(1).getPla_Imagen())).getImage();
                     ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ImageIcon iimg2=new ImageIcon(img2.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ImageIcon iimg3=new ImageIcon(img3.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ImageIcon iimg4=new ImageIcon(img4.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ImageIcon iimg5=new ImageIcon(img5.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ImageIcon iimg6=new ImageIcon(img6.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     //ImageIcon iimg7=new ImageIcon(img7.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     //ImageIcon iimg8=new ImageIcon(img8.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
                     ruta="/Imagenes/Platillos/Bebidas.png";                  
                     imagen=new ImageIcon(getClass().getResource(ruta));
                     jLabel9.setText("Bebidas Calientes");
                     jLabel12.setText("Bebidas Frias");
                     jLabel6.setText("Bebidas Alcoholicas");
                     jLabel7.setVisible(false);
                     lblPostre.setVisible(false);
                     lblPostre2.setVisible(false);
                     btnIzqPostres.setVisible(false);
                     btnDerPostres.setVisible(false);
                     jLabel8.setVisible(false);
                     jLabel4.setIcon(imagen);
                     lblPlato.setIcon(iimg);  
                     lblPlato2.setIcon(iimg2);
                     lblEnsalada.setIcon(iimg5);
                     lblEnsalada2.setIcon(iimg6);
                     lblEntrada.setIcon(iimg3);
                     lblEntrada2.setIcon(iimg4);
                     
                     lblPostre.setEnabled(false);
                     lblPostre2.setEnabled(false);
                     lblMenu.setText("Bebidas");
                     btnIzqPlatoFuerte.setEnabled(false);
                     btnIzqEntradas.setEnabled(false);
                     btnIzqEnsalada.setEnabled(false);
                     btnIzqPostres.setEnabled(false);
                   /*  if(num==platoFuerte.size()-2)
                        btnDerPlatoFuerte.setEnabled(false);
                     if(num2==ensalada.size()-2)
                        btnDerEnsalada.setEnabled(false);
                     if(num3==entradas.size()-2)
                        btnDerEntrada.setEnabled(false);
                     if(num4==postres.size()-2)
                        btnDerPostres.setEnabled(false);*/
                } catch (Exception e) {
                }
                
                break;
        }
    }//GEN-LAST:event_btnAvanzarMenuActionPerformed

    private void btnIzqPlatoFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqPlatoFuerteActionPerformed
        // TODO add your handling code here:
        int aux = num;
      //System.out.println(num2);
        btnDerPlatoFuerte.setEnabled(true);            
        Image img = new ImageIcon(getClass().getResource(platoFuerte.get(aux-1).getPla_Imagen())).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblPlato2.setIcon(img2);
        img=new ImageIcon(getClass().getResource(platoFuerte.get(aux-2).getPla_Imagen())).getImage();
        img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblPlato.setIcon(img2);
        if(num==2)
           btnIzqPlatoFuerte.setEnabled(false);
        num--;
    }//GEN-LAST:event_btnIzqPlatoFuerteActionPerformed

    private void btnDerPlatoFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerPlatoFuerteActionPerformed

        int aux = num;
        System.out.println(num);
        //activa el boton para retroceder
        btnIzqPlatoFuerte.setEnabled(true);         
        Image img = new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblPlato.setIcon(img2);
        img=new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())).getImage();
        img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblPlato2.setIcon(img2);
        if(num==platoFuerte.size()-2)
           btnDerPlatoFuerte.setEnabled(false);
        num++;
    }//GEN-LAST:event_btnDerPlatoFuerteActionPerformed

    private void lblPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatoMouseEntered
        // TODO add your handling code here:
        int aux=num;
        jLabel4.setText(platoFuerte.get(aux-1).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPlatoMouseEntered

    private void lblPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatoMouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPlatoMouseExited

    private void lblPlato2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlato2MouseEntered
        // TODO add your handling code here:
        int aux=num;
        jLabel4.setText(platoFuerte.get(aux).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPlato2MouseEntered

    private void lblPlato2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlato2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPlato2MouseExited

    private void btnIzqEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqEnsaladaActionPerformed
        // TODO add your handling code here:
        int aux = num2;
               //System.out.println(num2);
        btnDerEnsalada.setEnabled(true);      
        Image img = new ImageIcon(getClass().getResource(ensalada.get(aux-1).getPla_Imagen())).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblEnsalada2.setIcon(img2);
        img=new ImageIcon(getClass().getResource(ensalada.get(aux-2).getPla_Imagen())).getImage();
        img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblEnsalada.setIcon(img2);
        if(num2==2)
           btnIzqEnsalada.setEnabled(false);
        num2--;
    }//GEN-LAST:event_btnIzqEnsaladaActionPerformed

    private void btnDerEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerEnsaladaActionPerformed
        // TODO add your handling code here:
         int aux = num2;
         System.out.println(num2);
             //activa el boton para retroceder
             btnIzqEnsalada.setEnabled(true);         
             Image img = new ImageIcon(getClass().getResource(ensalada.get(aux++).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
              lblEnsalada.setIcon(img2);
              img=new ImageIcon(getClass().getResource(ensalada.get(aux++).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
              lblEnsalada2.setIcon(img2);
           
              if(num2==ensalada.size()-2)
                 btnDerEnsalada.setEnabled(false);
             num2++;
    }//GEN-LAST:event_btnDerEnsaladaActionPerformed

    private void lblEnsaladaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsaladaMouseEntered
        // TODO add your handling code here:
         int aux=num2;
        jLabel4.setText(ensalada.get(aux-1).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEnsaladaMouseEntered

    private void lblEnsaladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsaladaMouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEnsaladaMouseExited

    private void lblEnsalada2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsalada2MouseEntered
        // TODO add your handling code here:
        int aux=num2;
        jLabel4.setText(ensalada.get(aux).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEnsalada2MouseEntered

    private void lblEnsalada2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsalada2MouseExited
        // TODO add your handling code here:
         Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
         jLabel4.setIcon(img2);
         jLabel4.setText("");
    }//GEN-LAST:event_lblEnsalada2MouseExited

    private void btnIzqEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqEntradasActionPerformed
        // TODO add your handling code here:
          int aux = num3;
       //System.out.println(num2);
          btnDerEntrada.setEnabled(true);      
          Image img = new ImageIcon(getClass().getResource(entradas.get(aux-1).getPla_Imagen())).getImage();
          ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
          lblEntrada2.setIcon(img2);
          img=new ImageIcon(getClass().getResource(entradas.get(aux-2).getPla_Imagen())).getImage();
          img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
          lblEntrada.setIcon(img2);
          if(num3==2)
             btnIzqEntradas.setEnabled(false);
          num3--;
    }//GEN-LAST:event_btnIzqEntradasActionPerformed

    private void btnDerEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerEntradaActionPerformed
        // TODO add your handling code here:
        int aux = num3;
         System.out.println(num3);
         System.out.println(entradas.size());
       //activa el boton para retroceder
         btnIzqEntradas.setEnabled(true);       
         Image img = new ImageIcon(getClass().getResource(entradas.get(aux++).getPla_Imagen())).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
         lblEntrada.setIcon(img2);
         img=new ImageIcon(getClass().getResource(entradas.get(aux++).getPla_Imagen())).getImage();
         img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
         lblEntrada2.setIcon(img2);
         if(num3==entradas.size()-2)
            btnDerEntrada.setEnabled(false);
         num3++;
    }//GEN-LAST:event_btnDerEntradaActionPerformed

    private void lblEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntradaMouseEntered
        // TODO add your handling code here:
        int aux=num3;
        jLabel4.setText(entradas.get(aux-1).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEntradaMouseEntered

    private void lblEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntradaMouseExited
        // TODO add your handling code here:
         Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
         jLabel4.setIcon(img2);
         jLabel4.setText("");
    }//GEN-LAST:event_lblEntradaMouseExited

    private void lblEntrada2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrada2MouseEntered
        // TODO add your handling code here:
        int aux=num3;
        jLabel4.setText(entradas.get(aux).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEntrada2MouseEntered

    private void lblEntrada2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrada2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEntrada2MouseExited

    private void btnIzqPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqPostresActionPerformed
        // TODO add your handling code here:
         int aux = num4;
       //System.out.println(num2);
         btnDerPostres.setEnabled(true);    
         Image img = new ImageIcon(getClass().getResource(postres.get(aux-1).getPla_Imagen())).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
         lblPostre2.setIcon(img2);
         img=new ImageIcon(getClass().getResource(postres.get(aux-2).getPla_Imagen())).getImage();
         img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
         lblPostre.setIcon(img2); 
         if(num4==2)
            btnIzqPostres.setEnabled(false);
         num4--;
    }//GEN-LAST:event_btnIzqPostresActionPerformed

    private void btnDerPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerPostresActionPerformed
        // TODO add your handling code here:
         int aux = num4;
         System.out.println(num4);
             //activa el boton para retroceder
             btnIzqPostres.setEnabled(true);
             Image img = new ImageIcon(getClass().getResource(postres.get(aux++).getPla_Imagen())).getImage();
             ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblPostre.setIcon(img2);
             img=new ImageIcon(getClass().getResource(postres.get(aux++).getPla_Imagen())).getImage();
             img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
             lblPostre2.setIcon(img2);
           
             if(num4==postres.size()-2)
                btnDerPostres.setEnabled(false);
            num4++;
    }//GEN-LAST:event_btnDerPostresActionPerformed

    private void lblPostreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostreMouseEntered
        // TODO add your handling code here:
        int aux=num4;
        jLabel4.setText(postres.get(aux-1).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPostreMouseEntered

    private void lblPostreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostreMouseExited
        // TODO add your handling code here:
         Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPostreMouseExited

    private void lblPostre2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostre2MouseEntered
        // TODO add your handling code here:
        int aux=num4;
        jLabel4.setText(postres.get(aux).getPla_Nombre());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPostre2MouseEntered

    private void lblPostre2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostre2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPostre2MouseExited

    private void lblPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatoMouseClicked
        comprarPlatillo(platoFuerte, num, true);
    }//GEN-LAST:event_lblPlatoMouseClicked

    private void lblPlato2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlato2MouseClicked
       comprarPlatillo(platoFuerte, num, false);
    }//GEN-LAST:event_lblPlato2MouseClicked

    private void lblEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntradaMouseClicked
        comprarPlatillo(entradas, num3, true);
    }//GEN-LAST:event_lblEntradaMouseClicked

    private void lblEntrada2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrada2MouseClicked
        comprarPlatillo(entradas, num3, false);
    }//GEN-LAST:event_lblEntrada2MouseClicked

    private void lblEnsaladaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsaladaMouseClicked
         comprarPlatillo(ensalada, num2, true);
    }//GEN-LAST:event_lblEnsaladaMouseClicked

    private void lblEnsalada2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsalada2MouseClicked
         comprarPlatillo(ensalada, num2, false);
    }//GEN-LAST:event_lblEnsalada2MouseClicked

    private void lblPostreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostreMouseClicked
         comprarPlatillo(postres, num4, true);
    }//GEN-LAST:event_lblPostreMouseClicked

    private void lblPostre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostre2MouseClicked
         comprarPlatillo(postres, num4, false);
    }//GEN-LAST:event_lblPostre2MouseClicked

    private void cambiarPanelDeMenu(ArrayList<Platillos> comidas) {
        System.out.println("cambiar panel menu comidas "+ comidas.size());
        //aqui se reinician los array
        platoFuerte.clear();
        entradas.clear();
        ensalada.clear();
        postres.clear();
        bebidasFrias.clear();
        bebidasCalientes.clear();
        bebidasAlcoholicas.clear();
      //agregas en cada categoria a los array
        for(Platillos plat:comidas)  {
            int categoria = plat.getPla_Categoria().getCat_Id();
            
//en el primero estaba la 9,en el segundo va el 7, el tercero va 8
            if(categoria==1 || categoria==2 || categoria==5 ){
                entradas.add(plat);
            }
            else if(categoria==3 ){
                platoFuerte.add(plat);
            }
            else if(categoria==4 ){
                ensalada.add(plat);
            }
            else if(categoria==6){
                postres.add(plat);  
            }
            else if(categoria==7)
                bebidasCalientes.add(plat);
            else if(categoria==8)
                bebidasFrias.add(plat);
            else if(categoria==9)
                bebidasAlcoholicas.add(plat);
            
           
        }
         System.out.println("Plato fuerte "+platoFuerte.size());
            System.out.println("Ensaladas "+ensalada.size());
            System.out.println("Entradas "+entradas.size());
            System.out.println("Postre "+postres.size());
            System.out.println("bebidas calientes  "+bebidasCalientes.size());
            System.out.println("bebidas frias "+bebidasFrias.size());
            System.out.println("Alcohol "+bebidasAlcoholicas.size());
         //asigna un nombre a los label   
            try {
            llenarPaneles(entradas, lblEntrada, lblEntrada2);
            llenarPaneles(platoFuerte, lblPlato, lblPlato2);
            llenarPaneles(ensalada, lblEnsalada, lblEnsalada2);
            llenarPaneles(postres, lblPostre, lblPostre2);
            //esto va aqui?
           /* llenarPaneles(bebidasCalientes, lblEntrada, lblEntrada2);
            llenarPaneles(bebidasFrias, lblPlato, lblPlato2);
            llenarPaneles(bebidasAlcoholicas, lblEnsalada, lblEnsalada2);*/

        } catch (Exception e) {
                System.out.println("error llenar paneles");
        }
        
    }

    private void llenarPaneles(ArrayList<Platillos> comida,JLabel lbl1, JLabel lb2)throws Exception {
       //System.out.println("comida "+comida.size());
       if(comida.size()>0){
        lbl1.setText(comida.get(0).getPla_Nombre());
        lb2.setText(comida.get(1).getPla_Nombre());
        
       }
       else{
           lbl1.setText("No disponible");
        lb2.setText("No disponible");
        lbl1.setIcon(null);
        lb2.setIcon(null);
           System.out.println("entro al else de llenar panel");
           System.out.println("indexMenu "+indexDeMenu);
       }
     /*  if(comida==bebidasCalientes){
           platoFuerte=bebidasCalientes;
       }
       else if(comida==bebidasFrias){
           ensalada=bebidasFrias;
       }
       else if(comida==bebidasAlcoholicas){
           entradas=bebidasAlcoholicas;
       }*/
      
       
       
    }
    
    void comprarPlatillo(ArrayList<Platillos> comida,int index,boolean izq){
        int aux = index;
        if(izq){
            agregarCarrito = new AgregarCarrito(comida.get(aux - 1),clienteLogueado);
        }else{
            agregarCarrito = new AgregarCarrito(comida.get(aux),clienteLogueado);
        }
        agregarCarrito.setBounds(0,0,this.getWidth(),this.getHeight());
        this.removeAll();
        this.add(agregarCarrito);
        this.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzarMenu;
    private javax.swing.JButton btnDerEnsalada;
    private javax.swing.JButton btnDerEntrada;
    private javax.swing.JButton btnDerPlatoFuerte;
    private javax.swing.JButton btnDerPostres;
    private javax.swing.JButton btnIzqEnsalada;
    private javax.swing.JButton btnIzqEntradas;
    private javax.swing.JButton btnIzqPlatoFuerte;
    private javax.swing.JButton btnIzqPostres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblEnsalada;
    private javax.swing.JLabel lblEnsalada2;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblEntrada2;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPlato;
    private javax.swing.JLabel lblPlato2;
    private javax.swing.JLabel lblPostre;
    private javax.swing.JLabel lblPostre2;
    // End of variables declaration//GEN-END:variables

}
