package Swing;

import Tablas.Platillos;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
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
    
    public EscogerPlatillos() {
        initComponents();
        
        arrayPlatillos = RestauranteConexion.RestauranteService.traerPlatillosService();
        jlListaPlatillos.setModel(listaPlatillos);
        jlListaPlatillosMenu.setModel(listaPlatillosMenu);
        
        
        platillosComidaTipoComida = 0;
        platillosCenaTipoComida= 0;
        platillosDesayunoTipoComida = 0;
        
        platillosDesayunoTipoBebida = 0;
        platillosComidaTipoBebida = 0;
        platillosCenaTipoBebida = 0;
        
        for(int i= 0; i< arrayPlatillos.size(); i++){
            
            if(arrayPlatillos.get(i).getPla_Estatus().equals("Activo")){
                listaPlatillosMenu.addElement(arrayPlatillos.get(i));
                if(arrayPlatillos.get(i).getPla_Menu().getMenu_Id()== 1){
                    switch(arrayPlatillos.get(i).getPla_Categoria().getCat_Id()){
                        case 2:
                        case 3:
                            platillosDesayunoTipoBebida++;
                            break;
                        default:
                            platillosDesayunoTipoComida++;
                    }}else if(arrayPlatillos.get(i).getPla_Menu().getMenu_Id()==2){
                            switch(arrayPlatillos.get(i).getPla_Categoria().getCat_Id()){
                            case 2:
                            case 3:
                                platillosComidaTipoBebida++;
                                break;
                            default:
                                platillosComidaTipoComida++;
                                }
                }else{
                        switch(arrayPlatillos.get(i).getPla_Categoria().getCat_Id()){
                            case 2:
                            case 3:
                                platillosCenaTipoBebida++;
                                break;
                            default:
                                platillosCenaTipoComida++;
                                }
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
        add(lblCategoria);
        lblCategoria.setBounds(710, 350, 160, 40);

        lbNombrePlatillo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbNombrePlatillo.setForeground(new java.awt.Color(0, 0, 0));
        lbNombrePlatillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        jLabel2.setText("Menu");
        add(jLabel2);
        jLabel2.setBounds(560, 310, 110, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria");
        add(jLabel3);
        jLabel3.setBounds(720, 310, 110, 30);

        lblMenu.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(0, 0, 0));
        add(lblMenu);
        lblMenu.setBounds(540, 350, 160, 40);

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
        
        if(platilloAux.getPla_Menu().getMenu_Id() == 1){
            /*
            if(platillosDesayunoTipoComida< 5){
                platillosDesayunoTipoComida++;
                agregar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 5 platillos de tipo Desayuno");
            }
            */
            int categoria = platilloAux.getPla_Categoria().getCat_Id();
            
            if( categoria == 2 || categoria == 3){
                if(platillosDesayunoTipoBebida <2){
                    platillosDesayunoTipoBebida++;
                    agregar = true;
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede agregar mas de 6 bebidas de tipo Desayuno");
                }
            }else{
                if(platillosDesayunoTipoComida < 2){
                    platillosDesayunoTipoComida++;
                    agregar = true;
                }
                else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 8 platillos de tipo Desayuno");
            }
        }
        }
        
        
        
        if(platilloAux.getPla_Menu().getMenu_Id() == 2){
            /*if(platillosComidaTipoComida < 5){
                platillosComidaTipoComida++;
                agregar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 5 platillos de tipo Comida");
            }*/
            
            int categoria = platilloAux.getPla_Categoria().getCat_Id();
            
            if( categoria == 2 || categoria == 3){
                if(platillosComidaTipoBebida <2){
                    platillosComidaTipoBebida++;
                    agregar = true;
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede agregar mas de 6 bebidas de tipo Comida");
                }
            }else{
                if(platillosComidaTipoComida < 2){
                    platillosComidaTipoComida++;
                    agregar = true;
                }
            else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 8 platillos de tipo Comida");
            }
        }
        }
        
        if(platilloAux.getPla_Menu().getMenu_Id()== 3){
            /*if(platillosCenaTipoComida < 5 ){
                platillosCenaTipoComida++;
                agregar = true;
            }else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 5 platillos de tipo Cena");
            }*/
            
            int categoria = platilloAux.getPla_Categoria().getCat_Id();
            
            if( categoria == 2 || categoria == 3){
                if(platillosCenaTipoBebida <2){
                    platillosCenaTipoBebida++;
                    agregar = true;
                }else{
                    JOptionPane.showMessageDialog(null, "No se puede agregar mas de 6 bebidas de tipo Cena");
                }
            }else{
                if(platillosCenaTipoComida < 2){
                    platillosCenaTipoComida++;
                    agregar = true;
                }
            else{
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 8 platillos de tipo Cena");
            }
        }
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
            if(categoria == 2 || categoria == 3){
                platillosDesayunoTipoBebida--;
            }else{
                platillosDesayunoTipoComida--;
            }
        }else if(platilloAux.getPla_Menu().getMenu_Id() == 2){
            if(categoria == 2 || categoria == 3){
                platillosComidaTipoBebida--;
            }else{
                platillosComidaTipoComida--;
            }
        }else{
            if(categoria == 2 || categoria == 3){
                platillosCenaTipoBebida--;
            }else{
                platillosCenaTipoComida--;
            }
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
    }//GEN-LAST:event_jlListaPlatillosMouseClicked

    private void jlListaPlatillosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaPlatillosMenuMouseClicked
        int index = jlListaPlatillosMenu.getSelectedIndex();
        Platillos platilloAux = (Platillos) listaPlatillosMenu.getElementAt(index);
        lblCategoria.setText(platilloAux.getPla_Categoria().getCat_Nombre());
        lbNombrePlatillo.setText(platilloAux.getPla_Nombre());
        lblMenu.setText(platilloAux.getPla_Menu().getMenu_Tipo());
    }//GEN-LAST:event_jlListaPlatillosMenuMouseClicked

    private void btnConfirmarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarMenuActionPerformed
        
        boolean confirmar = true;
        
        ////// DESAYUNO
        if(platillosDesayunoTipoBebida < 1){
            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 bebidas de tipo desayuno");
            confirmar = false;
        }
        if(platillosDesayunoTipoComida < 1){
            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 platillos de tipo desayuno");
            confirmar = false;
        }
        
        /////// COMIDA
        if(platillosComidaTipoBebida < 1){
            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 bebidas de tipo comida");
            confirmar = false;
        }
        if(platillosComidaTipoComida < 1){
            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 platillos de tipo comida");
            confirmar = false;
        }
        
        ////// CENA
        
//        if(platillosCenaTipoBebida < 1){
//            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 bebidas de tipo cena");
//            confirmar = false;
//        }
        if(platillosCenaTipoComida < 1){
            JOptionPane.showMessageDialog(null, "Debe haber al menos 3 platillos de tipo cena");
            confirmar = false;
        }
        
        
        if(confirmar){
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
    
}
    
