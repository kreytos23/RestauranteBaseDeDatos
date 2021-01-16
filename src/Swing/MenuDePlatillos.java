package Swing;


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
    int num;
    int  num2;
    int num3;
    int num4;
    Icon imagen;
    String ruta;
    
    public MenuDePlatillos() {
        initComponents();
        btnIzqPlatoFuerte.setEnabled(false);
        btnIzqEntradas.setEnabled(false);
        btnIzqEnsalada.setEnabled(false);
        btnIzqPostres.setEnabled(false);
        indexDeMenu = -1;
        arrayDePlatillos = RestauranteConexion.RestauranteService.traerPlatillosService();
        System.out.println("tamanio "+arrayDePlatillos.size());
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
       num=1;
       num2=1;
       num3=1;
       num4=1;
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
                    cena.add(plat);
                    break;
            }
            if(plat.getPla_Categoria().getCat_Id()==7 || plat.getPla_Categoria().getCat_Id()==8 ||plat.getPla_Categoria().getCat_Id()==9){
                bebidas.add(plat);
            }
        }
       btnAvanzarMenuActionPerformed(null);
       
    //   lblPlato.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())));
    //         lblPlato2.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())));
        if(platoFuerte.size()==0){
            lblPlato.setText("No disponible");
            lblPlato.setText("No disponible");
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
           // lblEntrada2.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())));
           // lblEntrada.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())));
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
            //lblPostre2.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(1).getPla_Imagen())));
            //lblPostre.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(0).getPla_Imagen())));
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel2.setText("Menu");
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(70, 100, 170, 40);

        lblEnsalada2.setText("jLabel3");
        lblEnsalada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEnsalada2.setOpaque(true);
        lblEnsalada2.addMouseListener(new java.awt.event.MouseAdapter() {
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrada2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrada2MouseExited(evt);
            }
        });
        add(lblEntrada2);
        lblEntrada2.setBounds(550, 380, 150, 130);

        lblMenu.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        lblMenu.setText("Cena");
        lblMenu.setOpaque(true);
        add(lblMenu);
        lblMenu.setBounds(70, 170, 170, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Platillos/desayuno.png"))); // NOI18N
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(40, 260, 230, 200);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        add(jLabel5);
        jLabel5.setBounds(360, 110, 360, 150);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel6.setText("Ensalada");
        jLabel6.setOpaque(true);
        add(jLabel6);
        jLabel6.setBounds(960, 60, 200, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel7.setText("Postres");
        jLabel7.setOpaque(true);
        add(jLabel7);
        jLabel7.setBounds(960, 320, 210, 30);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPanelPlatillos/Cuadrito_naranja.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        add(jLabel8);
        jLabel8.setBounds(880, 370, 360, 150);

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel9.setText("Plato Fuerte");
        jLabel9.setOpaque(true);
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

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel12.setText("Entradas");
        jLabel12.setOpaque(true);
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

        switch(indexDeMenu){
            case 0:
                
                lblMenu.setText("Desayunos");
                cambiarPanelDeMenu(desayuno);
                try{
                imagen=new ImageIcon(getClass().getResource("/Imagenes/Platillos/desayuno.png"));
                ruta="/Imagenes/Platillos/desayuno.png";
                jLabel4.setIcon(imagen);}
                catch(Exception e){
                  //  System.out.println("error xd");
                }
                break;
            case 1:
                lblMenu.setText("Comida");
                cambiarPanelDeMenu(comida);
                try {
                    
                imagen=new ImageIcon(getClass().getResource("/Imagenes/Platillos/comida.png"));
                ruta="/Imagenes/Platillos/comida.png";
                jLabel4.setIcon(imagen);
                } catch (Exception e) {
                }
                break;
            case 2:
                lblMenu.setText("Cena");
                cambiarPanelDeMenu(cena);
                try {
                    
                imagen=new ImageIcon(getClass().getResource("/Imagenes/Platillos/cena.png"));
                ruta="/Imagenes/Platillos/cena.png";
                jLabel4.setIcon(imagen);
                } catch (Exception e) {
                }
                break;
            case 3:
                try {
                    lblMenu.setText("Bebidas");
                  cambiarPanelDeMenu(bebidas);
                  imagen=new ImageIcon(getClass().getResource("/Imagenes/Platillos/Bebidas.png"));
                  ruta="/Imagenes/Platillos/Bebidas.png";
                  jLabel4.setIcon(imagen);
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
        // TODO add your handling code here:
        int aux = num;
         System.out.println(num);
             //activa el boton para retroceder
             btnIzqPlatoFuerte.setEnabled(true);         
          //que sea la url
             //falta cambiar por url
             Image img = new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
              lblPlato.setIcon(img2);
              img=new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())).getImage();
              img2=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
              lblPlato2.setIcon(img2);
              
              
             /*System.out.println(platoFuerte.get(aux).getPla_Imagen());
             lblPlato.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())));
             
             System.out.println(platoFuerte.get(aux).getPla_Imagen());
             lblPlato2.setIcon(new ImageIcon(getClass().getResource(platoFuerte.get(aux++).getPla_Imagen())));
           */
              if(num==platoFuerte.size()-2)
                 btnDerPlatoFuerte.setEnabled(false);
             num++;
    }//GEN-LAST:event_btnDerPlatoFuerteActionPerformed

    private void lblPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatoMouseEntered
        // TODO add your handling code here:
        int aux=num;
        
        jLabel4.setText(platoFuerte.get(aux-1).getPla_Descripcion());
        jLabel4.setIcon(null);
     
    }//GEN-LAST:event_lblPlatoMouseEntered

    private void lblPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatoMouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPlatoMouseExited

    private void lblPlato2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlato2MouseEntered
        // TODO add your handling code here:
         int aux=num;
        jLabel4.setText(platoFuerte.get(aux).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPlato2MouseEntered

    private void lblPlato2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlato2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPlato2MouseExited

    private void btnIzqEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqEnsaladaActionPerformed
        // TODO add your handling code here:
        int aux = num2;
               //System.out.println(num2);
                btnDerEnsalada.setEnabled(true);      
             //falta cambiarlo y ponerle la url
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
          //que sea la url
             //falta cambiar por url
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
        jLabel4.setText(ensalada.get(aux-1).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEnsaladaMouseEntered

    private void lblEnsaladaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsaladaMouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEnsaladaMouseExited

    private void lblEnsalada2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsalada2MouseEntered
        // TODO add your handling code here:
         int aux=num2;
        jLabel4.setText(ensalada.get(aux).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEnsalada2MouseEntered

    private void lblEnsalada2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnsalada2MouseExited
        // TODO add your handling code here:
         Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEnsalada2MouseExited

    private void btnIzqEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqEntradasActionPerformed
        // TODO add your handling code here:
          int aux = num3;
               //System.out.println(num2);
                btnDerEntrada.setEnabled(true);      
             //falta cambiarlo y ponerle la url
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
             //activa el boton para retroceder
             btnIzqEntradas.setEnabled(true);         
          //que sea la url
             //falta cambiar por url
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
        jLabel4.setText(ensalada.get(aux-1).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEntradaMouseEntered

    private void lblEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntradaMouseExited
        // TODO add your handling code here:
         Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEntradaMouseExited

    private void lblEntrada2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrada2MouseEntered
        // TODO add your handling code here:
        int aux=num3;
        jLabel4.setText(ensalada.get(aux).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblEntrada2MouseEntered

    private void lblEntrada2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrada2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblEntrada2MouseExited

    private void btnIzqPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqPostresActionPerformed
        // TODO add your handling code here:
         int aux = num4;
               //System.out.println(num2);
                btnDerPostres.setEnabled(true);      
             //falta cambiarlo y ponerle la url
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
          //que sea la url
             //falta cambiar por url
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
        jLabel4.setText(ensalada.get(aux-1).getPla_Descripcion());
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
        jLabel4.setText(ensalada.get(aux).getPla_Descripcion());
        jLabel4.setIcon(null);
    }//GEN-LAST:event_lblPostre2MouseEntered

    private void lblPostre2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostre2MouseExited
        // TODO add your handling code here:
        Image img = new ImageIcon(getClass().getResource(ruta)).getImage();
            ImageIcon img2=new ImageIcon(img.getScaledInstance(380, 120, Image.SCALE_SMOOTH));
           // labelPrueba.setIcon(img2);
           
         jLabel4.setIcon(img2);
        jLabel4.setText("");
    }//GEN-LAST:event_lblPostre2MouseExited

    private void cambiarPanelDeMenu(ArrayList<Platillos> comidas) {
        System.out.println("cambiar panel menu comidas "+ comidas.size());
        platoFuerte.clear();
        entradas.clear();
        ensalada.clear();
        postres.clear();
        
        //laacarguilarceja@gmail.com
        for(Platillos plat:comidas)  {
            int categoria = plat.getPla_Categoria().getCat_Id();
            //la categoria 9 se puede quitar?
            entradas.add(plat);
            platoFuerte.add(plat);
            ensalada.add(plat);
            postres.add(plat);
           /* if(categoria==1 || categoria==2 || categoria==5 ||categoria==9){
                entradas.add(plat);
                System.out.println("entradas");
            }
            else if(categoria==3 || categoria==7)
                platoFuerte.add(plat);
            
            else if(categoria==4 || categoria==8)
                ensalada.add(plat);
            else if(categoria==6)
                postres.add(plat);*/
           
        }
         System.out.println("Plato fuerte "+platoFuerte.size());
            System.out.println("Ensaladas "+ensalada.size());
            System.out.println("Entradas "+entradas.size());
            System.out.println("Postre "+postres.size());
            try {
            llenarPaneles(entradas, lblEntrada, lblEntrada2);
            llenarPaneles(platoFuerte, lblPlato, lblPlato2);
            llenarPaneles(ensalada, lblEnsalada, lblEnsalada2);
            llenarPaneles(postres, lblPostre, lblPostre2);

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
           System.out.println("entro al else de llenar panel");
       }
       
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
