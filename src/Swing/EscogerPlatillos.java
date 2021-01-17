package Swing;

import Tablas.Platillos;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EscogerPlatillos extends javax.swing.JPanel {

    DefaultListModel listaPlatillos = new DefaultListModel();
    DefaultListModel listaPlatillosMenu = new DefaultListModel();
    
    private Platillos platillo;
    private ArrayList<Platillos> arrayPlatillos;
    
    private int platillosComidaTipoComida;
    private int platillosCenaTipoComida;
    private int platillosDesayunoTipoComida;
    
    private int platillosDesayunoTipoBebida;
    private int platillosComidaTipoBebida;
    private int platillosCenaTipoBebida;
    
    
    private int[] platillosTipoComidaDesayuno = {0,0,0,0,0};
    private int[] platillosTipoBebidaDesayuno = {0};
    
    private int[] platillosTipoComidaComida = {0,0,0,0,0,0};
    private int[] platillosTipoBebidaComida = {0};
    
    private int[] platillosTipoComidaCena = {0,0,0};
    private int[] platillosTipoBebidaCena = {0};
    
    public EscogerPlatillos() {
        initComponents();
        
        
        arrayPlatillos = RestauranteConexion.RestauranteService.traerPlatillosService();
        jlListaPlatillos.setModel(listaPlatillos);
        jlListaPlatillosMenu.setModel(listaPlatillosMenu);
        
 
        //USANDO LAS NUEVAS CATEGORIAS
        
        for(int i= 0; i< arrayPlatillos.size(); i++){
            
            if(arrayPlatillos.get(i).getPla_Estatus().equals("Activo")){
                listaPlatillosMenu.addElement(arrayPlatillos.get(i));
                if(arrayPlatillos.get(i).getPla_Menu().getMenu_Id()== 1){
                    
                    contarValoresInciales(arrayPlatillos.get(i).getPla_Categoria().getCat_Id(),platillosTipoComidaDesayuno,platillosTipoBebidaDesayuno,"Desayuno");
                    
                }else if(arrayPlatillos.get(i).getPla_Menu().getMenu_Id()==2){
                    
                        contarValoresInciales(arrayPlatillos.get(i).getPla_Categoria().getCat_Id(),platillosTipoComidaComida,platillosTipoBebidaComida,"Comida");
                }else{
                        contarValoresInciales(arrayPlatillos.get(i).getPla_Categoria().getCat_Id(),platillosTipoComidaCena,platillosTipoBebidaCena,"Cena");
                    }
            }
            else{
                
                listaPlatillos.addElement(arrayPlatillos.get(i));
            }
        }
        
        jlListaPlatillos.setSelectedIndex(0);
        lbNombrePlatillo.setText(((Platillos)listaPlatillos.getElementAt(0)).getPla_Nombre());
        lblMenu.setText(((Platillos)listaPlatillos.getElementAt(0)).getPla_Menu().getMenu_Tipo());
        lblCategoria.setText(((Platillos)listaPlatillos.getElementAt(0)).getPla_Categoria().getCat_Nombre());
        Image img = new ImageIcon(getClass().getResource(((Platillos)listaPlatillos.getElementAt(0)).getPla_Imagen())).getImage();
        ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblDescripcion.setIcon(iimg);
        lblDescripcion.setText("");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCategoria = new javax.swing.JLabel();
        lbNombrePlatillo = new javax.swing.JLabel();
        btnEliminarPlatillo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();
        btnConfirmarMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlListaPlatillosMenu = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaPlatillos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblCategoria.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblCategoria);
        lblCategoria.setBounds(720, 350, 160, 40);

        lbNombrePlatillo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbNombrePlatillo.setForeground(new java.awt.Color(0, 0, 0));
        lbNombrePlatillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombrePlatillo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbNombrePlatillo);
        lbNombrePlatillo.setBounds(510, 80, 370, 40);

        btnEliminarPlatillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton borrar.png"))); // NOI18N
        btnEliminarPlatillo.setBorderPainted(false);
        btnEliminarPlatillo.setContentAreaFilled(false);
        btnEliminarPlatillo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton borrarOsc.png"))); // NOI18N
        btnEliminarPlatillo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton borrarG.png"))); // NOI18N
        btnEliminarPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlatilloActionPerformed(evt);
            }
        });
        add(btnEliminarPlatillo);
        btnEliminarPlatillo.setBounds(590, 440, 270, 100);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton AgregarOsc.png"))); // NOI18N
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton AgregarG.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(290, 440, 270, 100);

        lblDescripcion.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("Foto");
        lblDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblDescripcion);
        lblDescripcion.setBounds(540, 130, 330, 170);

        btnConfirmarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton confirmar.png"))); // NOI18N
        btnConfirmarMenu.setBorderPainted(false);
        btnConfirmarMenu.setContentAreaFilled(false);
        btnConfirmarMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton confirmarOsc.png"))); // NOI18N
        btnConfirmarMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Boton confirmarG.png"))); // NOI18N
        btnConfirmarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarMenuActionPerformed(evt);
            }
        });
        add(btnConfirmarMenu);
        btnConfirmarMenu.setBounds(880, 440, 270, 100);

        jLabel2.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        add(jLabel2);
        jLabel2.setBounds(530, 310, 160, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Categoria");
        add(jLabel3);
        jLabel3.setBounds(720, 310, 160, 40);

        lblMenu.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblMenu);
        lblMenu.setBounds(530, 350, 160, 40);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Platillos En Menu");
        add(jLabel4);
        jLabel4.setBounds(930, 20, 340, 50);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Platillos");
        add(jLabel5);
        jLabel5.setBounds(240, 20, 150, 50);

        jScrollPane2.setBackground(new java.awt.Color(234, 107, 22));
        jScrollPane2.setOpaque(false);

        jlListaPlatillosMenu.setBackground(new java.awt.Color(234, 107, 22));
        jlListaPlatillosMenu.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jlListaPlatillosMenu.setForeground(new java.awt.Color(255, 255, 255));
        jlListaPlatillosMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaPlatillosMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlListaPlatillosMenu.setOpaque(false);
        jlListaPlatillosMenu.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jlListaPlatillosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaPlatillosMenuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlListaPlatillosMenu);

        add(jScrollPane2);
        jScrollPane2.setBounds(940, 100, 290, 270);

        jScrollPane1.setBackground(new java.awt.Color(234, 107, 22));
        jScrollPane1.setOpaque(false);

        jlListaPlatillos.setBackground(new java.awt.Color(234, 107, 22));
        jlListaPlatillos.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jlListaPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        jlListaPlatillos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaPlatillos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlListaPlatillos.setOpaque(false);
        jlListaPlatillos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jlListaPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaPlatillosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlListaPlatillos);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 100, 290, 270);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Platillos.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(900, 80, 360, 330);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Platillos.png"))); // NOI18N
        jLabel7.setText("jLabel6");
        add(jLabel7);
        jLabel7.setBounds(140, 80, 360, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -140, 1670, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int index = jlListaPlatillos.getSelectedIndex();
        boolean agregar = false;
        Platillos platilloAux = (Platillos) listaPlatillos.getElementAt(index);
        int categoria = platilloAux.getPla_Categoria().getCat_Id();
        
        if(platilloAux.getPla_Menu().getMenu_Id() == 1){
            agregar = comprarMaximoPlatillos(categoria, platillosTipoComidaDesayuno,platillosTipoBebidaDesayuno,"Desayuno");
        }
 
        if(platilloAux.getPla_Menu().getMenu_Id() == 2){
            agregar = comprarMaximoPlatillos(categoria, platillosTipoComidaComida,platillosTipoBebidaComida,"Comida");
        }
        
        if(platilloAux.getPla_Menu().getMenu_Id()== 3){
            agregar = comprarMaximoPlatillos(categoria, platillosTipoComidaCena,platillosTipoBebidaCena,"Cena");
        }
        
        if(agregar){    
            listaPlatillosMenu.addElement(platilloAux);
            listaPlatillos.removeElementAt(index);
        }  
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPlatilloActionPerformed
        int index = jlListaPlatillosMenu.getSelectedIndex();
        Platillos platilloAux = (Platillos) listaPlatillosMenu.getElementAt(index);
        int categoria = platilloAux.getPla_Categoria().getCat_Id();
        
        if(platilloAux.getPla_Menu().getMenu_Id() == 1){
            elimianrValores(categoria, platillosTipoComidaDesayuno, platillosTipoBebidaDesayuno,"Desayuno");
        }else if(platilloAux.getPla_Menu().getMenu_Id() == 2){
            elimianrValores(categoria, platillosTipoComidaComida, platillosTipoBebidaComida,"Comida");
        }else{
             elimianrValores(categoria, platillosTipoComidaCena, platillosTipoBebidaCena,"Cena");
        }
        
        listaPlatillos.addElement(platilloAux);
        listaPlatillosMenu.removeElementAt(index);
    }//GEN-LAST:event_btnEliminarPlatilloActionPerformed

    private void jlListaPlatillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaPlatillosMouseClicked
        int index = jlListaPlatillos.getSelectedIndex();
        Platillos platilloAux = (Platillos) listaPlatillos.getElementAt(index);
        lblCategoria.setText(platilloAux.getPla_Categoria().getCat_Nombre());
        lbNombrePlatillo.setText(platilloAux.getPla_Nombre());
        lblMenu.setText(platilloAux.getPla_Menu().getMenu_Tipo());
        Image img = new ImageIcon(getClass().getResource(platilloAux.getPla_Imagen())).getImage();
        ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblDescripcion.setIcon(iimg);
        lblDescripcion.setText("");
    }//GEN-LAST:event_jlListaPlatillosMouseClicked

    private void jlListaPlatillosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaPlatillosMenuMouseClicked
        int index = jlListaPlatillosMenu.getSelectedIndex();
        Platillos platilloAux = (Platillos) listaPlatillosMenu.getElementAt(index);
        lblCategoria.setText(platilloAux.getPla_Categoria().getCat_Nombre());
        lbNombrePlatillo.setText(platilloAux.getPla_Nombre());
        lblMenu.setText(platilloAux.getPla_Menu().getMenu_Tipo());
        Image img = new ImageIcon(getClass().getResource(platilloAux.getPla_Imagen())).getImage();
        ImageIcon iimg=new ImageIcon(img.getScaledInstance(150, 130, Image.SCALE_SMOOTH));
        lblDescripcion.setIcon(iimg);
        lblDescripcion.setText("");
    }//GEN-LAST:event_jlListaPlatillosMenuMouseClicked

    private void btnConfirmarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarMenuActionPerformed
        
        boolean confirmar1 = false,confirmar2 = false, confirmar3 =false;
        
        ////// DESAYUNO
        
        confirmar1 = comprobacionPlatillosFinal(platillosTipoComidaDesayuno,platillosTipoBebidaDesayuno,confirmar1,"Desayuno");
        /////// COMIDA
        
        confirmar2 = comprobacionPlatillosFinal(platillosTipoComidaComida,platillosTipoBebidaComida,confirmar2,"Comida");
        
        ////// CENA
        
        confirmar3 = comprobacionPlatillosFinal(platillosTipoComidaCena,platillosTipoBebidaCena,confirmar3,"Cena");

        if(confirmar1 == true && confirmar2 == true && confirmar3 == true){
            arrayPlatillos.clear();
            
            for(int i = 0; i< listaPlatillos.getSize() ; i++){
                Platillos platilloAux = (Platillos) listaPlatillos.getElementAt(i);
                platilloAux.setPla_Estatus("Inactivo");
                arrayPlatillos.add(platilloAux);
            }
            for(int i = 0; i< listaPlatillosMenu.getSize() ; i++){
                Platillos platilloAux = (Platillos) listaPlatillosMenu.getElementAt(i);
                platilloAux.setPla_Estatus("Activo");
                arrayPlatillos.add(platilloAux);
            }
            
            RestauranteConexion.RestauranteService.actualizarPlatillosService(arrayPlatillos);
            JOptionPane.showMessageDialog(null, "El menu se confirmo");
        }
    }//GEN-LAST:event_btnConfirmarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConfirmarMenu;
    private javax.swing.JButton btnEliminarPlatillo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlListaPlatillos;
    private javax.swing.JList<String> jlListaPlatillosMenu;
    private javax.swing.JLabel lbNombrePlatillo;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables

    private boolean comprobarComida() {
        
        if(platillosComidaTipoComida >=3 && platillosComidaTipoComida <= 5){
            return true;
        }else{
            return false;
        }
        
    }

    private void contarValoresInciales(int cat_Id ,int[]platilloComida, int[] platilloBebida,String tipo) {
        switch(cat_Id){
                        case 1:
                            platilloComida[0]++; // Para todos
                            break;
                        case 2:
                            platilloComida[1]++; // Solo esta en comida
                            break;
                        case 3:
                            if(tipo.equals("Desayuno") || tipo.equals("Cena"))
                                 platilloComida[1]++;
                            else if(tipo.equals("Comida"))
                                 platilloComida[2]++; 
                            break;
                        case 4:
                            if(tipo.equals("Desayuno"))  //Solo comida y desayuno
                                platilloComida[2]++;
                            else
                                platilloComida[3]++;
                            break;
                        case 5:
                            if(tipo.equals("Desayuno"))
                            platilloComida[3]++;            //comida y desayuno
                            else
                                platilloComida[4]++;
                            break;
                        case 6:
                            if(tipo.equals("Desayuno"))
                                platilloComida[4]++;
                            else if(tipo.equals("Comida"))
                                platilloComida[5]++;
                            else
                                platilloComida[2]++;
                            break;
                        case 7:
                            platilloBebida[0]++;
                            break;
                        case 8:
                            platilloBebida[0]++;
                            break;
                        case 9:
                            platilloBebida[0]++;
                            break;
    }
    
}

    private boolean comprarMaximoPlatillos(int categoria, int[] platilloComida, int[] platilloBebida, String tipo) {
        boolean agregar = false;
        switch(categoria){
                        case 1:
                            agregar = comprobarMaximoif(platilloComida[0], platilloComida,agregar , tipo,"platillo", 0);
                            break;
                        case 2:
                            agregar = comprobarMaximoif(platilloComida[1], platilloComida,agregar , tipo,"platillo", 1);
                            break;
                        case 3:
                            if(tipo.equals("Desayuno") || tipo.equals("Cena"))
                                agregar = comprobarMaximoif(platilloComida[1], platilloComida,agregar , tipo,"platillo", 1);
                            else if(tipo.equals("Comida"))
                                agregar = comprobarMaximoif(platilloComida[2], platilloComida,agregar , tipo,"platillo", 2);
                            break;
                        case 4:
                            if(tipo.equals("Desayuno"))
                                agregar = comprobarMaximoif(platilloComida[2], platilloComida,agregar , tipo,"platillo", 2);
                            else
                                agregar = comprobarMaximoif(platilloComida[3], platilloComida,agregar , tipo,"platillo", 3);
                            break;
                        case 5:
                            if(tipo.equals("Desayuno"))
                                agregar = comprobarMaximoif(platilloComida[3], platilloComida,agregar , tipo,"platillo", 3);
                            else
                                agregar = comprobarMaximoif(platilloComida[4], platilloComida,agregar , tipo,"platillo", 4);
                            break;
                        case 6:
                            if(tipo.equals("Desayuno"))
                                agregar = comprobarMaximoif(platilloComida[4], platilloComida,agregar , tipo,"platillo", 4);
                            else if(tipo.equals("Comida"))
                                agregar = comprobarMaximoif(platilloComida[5], platilloComida,agregar , tipo,"platillo", 5);
                            else
                                agregar = comprobarMaximoif(platilloComida[2], platilloComida,agregar , tipo,"platillo", 2);
                            break;
                        case 7:
                            agregar = comprobarMaximoif(platilloBebida[0], platilloBebida,agregar , tipo,"bebida", 0);
                            break;
                        case 8:
                            agregar = comprobarMaximoif(platilloBebida[0], platilloBebida,agregar , tipo,"bebida", 0);
                            break;
                        case 9:
                            agregar = comprobarMaximoif(platilloBebida[0], platilloBebida,agregar , tipo,"bebida", 0);
                            break;
            }
        
        return agregar;
    }

    private boolean comprobarMaximoif(int platillo , int[]platilloArreglo, boolean agregar, String tipo,String tipoComida, int i) {
        if(platillo < 5){
              platilloArreglo[i]++;
              agregar = true;
       }else{
           JOptionPane.showMessageDialog(null, "No se puede agregar mas de 5" + tipoComida + " de tipo " + tipo);
            }
    return agregar;
    }
    
    private void elimianrValores(int cat_Id ,int[]platilloComida, int[] platilloBebida,String tipo) {
        switch(cat_Id){
                        case 1:
                            platilloComida[0]--;
                            break;
                        case 2:
                            platilloComida[1]--;
                            break;
                        case 3:
                            if(tipo.equals("Desayuno") || tipo.equals("Cena"))
                                platilloComida[1]--;
                            else
                                platilloComida[2]--;
                            break;
                        case 4:
                            if(tipo.equals("Desayuno"))
                                platilloComida[2]--;
                            else
                                platilloComida[3]--;
                            break;
                        case 5:
                            if(tipo.equals("Desayuno"))
                                platilloComida[3]--;
                            else
                                platilloComida[4]--;
                            break;
                        case 6:
                            if(tipo.equals("Desayuno"))
                                platilloComida[4]--;
                            else if(tipo.equals("Comida"))
                                platilloComida[5]--;
                            else
                                platilloComida[2]--;
                            break;
                        case 7:
                            platilloBebida[0]--;
                            break;
                        case 8:
                            platilloBebida[0]--;
                            break;
                        case 9:
                            platilloBebida[0]--;
                            break;
    }
    
}

    private boolean comprobacionPlatillosFinal(int[] platilloComida, int[] platilloBebida, boolean confirmar , String tipo) {
        boolean conPlatillos = false;
        boolean conBebidad = false;
        for(int i = 0; i < platilloComida.length; i++){
            
            if(platilloComida[i] < 1){
                if(tipo.equals("Desayuno")){
                JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 en Desayuno cosas de tipo: Entradas,Plato Fuerte,Ensaladas,Complementos y Postre" );
                }else if(tipo.equals("Comida")){
                    JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 en Comida cosas de tipo: Entradas,Sopas, Plato Fuerte,Ensaladas,Complementos y Postre " );
                }
                else 
                    JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 en Cena cosas de tipo: Entradas, Plato Fuerte y Postre " );
                conPlatillos = false;
                break;
            }else{
                conPlatillos = true;
            }
        }
        if(conPlatillos){
        for(int i = 0;i< platilloBebida.length; i++){
            if(platilloBebida[i] < 1){
                if(tipo.equals("Desayuno"))
                    JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 cosas en Desayuno de tipo: Bebidas Calientes"); 
                else if(tipo.equals("Comida"))
                    JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 cosas en Comida de tipo: Bebidas Frias  ");
                else
                    JOptionPane.showMessageDialog(null,"Debe de haber al menos 2 cosas en Cena de tipo: Bebidas Alcoholicas");
                
                conBebidad = false;
                break;
            }else{
                conBebidad = true;
            }
        }
        }
        
        if(conBebidad == true && conPlatillos ==true)
            return true;
        else
            return false;
    }
}

    
