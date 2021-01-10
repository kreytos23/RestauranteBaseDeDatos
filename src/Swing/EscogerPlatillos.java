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
        
        for(int i= 0; i< arrayPlatillos.size(); i++){
            if(arrayPlatillos.get(i).getPla_Estatus().equals("Activo")){
                listaPlatillosMenu.addElement(arrayPlatillos.get(i));
            }else{
                listaPlatillos.addElement(arrayPlatillos.get(i));
            }
        }
        
        platillosComidaTipoComida = 0;
        platillosCenaTipoComida= 0;
        platillosDesayunoTipoComida = 0;
        
        platillosDesayunoTipoBebida = 0;
        platillosComidaTipoBebida = 0;
        platillosCenaTipoBebida = 0;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaPlatillos = new javax.swing.JList<>();
        lbFotoPlatillo = new javax.swing.JLabel();
        lbNombrePlatillo = new javax.swing.JLabel();
        btnEliminarPlatillo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmarMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlListaPlatillosMenu = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jlListaPlatillos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaPlatillosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlListaPlatillos);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 260, 270);
        add(lbFotoPlatillo);
        lbFotoPlatillo.setBounds(480, 80, 150, 80);
        add(lbNombrePlatillo);
        lbNombrePlatillo.setBounds(460, 160, 120, 70);

        btnEliminarPlatillo.setText("Eliminar");
        btnEliminarPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlatilloActionPerformed(evt);
            }
        });
        add(btnEliminarPlatillo);
        btnEliminarPlatillo.setBounds(660, 430, 110, 50);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(340, 430, 110, 60);

        jLabel3.setText("Categoria");
        add(jLabel3);
        jLabel3.setBounds(390, 100, 50, 30);

        btnConfirmarMenu.setText("Confirmar");
        btnConfirmarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarMenuActionPerformed(evt);
            }
        });
        add(btnConfirmarMenu);
        btnConfirmarMenu.setBounds(800, 430, 120, 60);

        jLabel2.setText("Menu");
        add(jLabel2);
        jLabel2.setBounds(390, 170, 70, 40);

        jlListaPlatillosMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaPlatillosMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaPlatillosMenuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlListaPlatillosMenu);

        add(jScrollPane2);
        jScrollPane2.setBounds(660, 80, 260, 290);

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
        lbFotoPlatillo.setText(platilloAux.getPla_Categoria().getCat_Nombre());
        lbNombrePlatillo.setText(platilloAux.getPla_Menu().getMenu_Tipo());
    }//GEN-LAST:event_jlListaPlatillosMouseClicked

    private void jlListaPlatillosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaPlatillosMenuMouseClicked
        int index = jlListaPlatillosMenu.getSelectedIndex();
        Platillos platilloAux = (Platillos) listaPlatillosMenu.getElementAt(index);
        lbFotoPlatillo.setText(platilloAux.getPla_Categoria().getCat_Nombre());
        lbNombrePlatillo.setText(platilloAux.getPla_Menu().getMenu_Tipo());
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlListaPlatillos;
    private javax.swing.JList<String> jlListaPlatillosMenu;
    private javax.swing.JLabel lbFotoPlatillo;
    private javax.swing.JLabel lbNombrePlatillo;
    // End of variables declaration//GEN-END:variables

    private boolean comprobarComida() {
        
        if(platillosComidaTipoComida >=3 && platillosComidaTipoComida <= 5){
            return true;
        }else{
            return false;
        }
        
    }
    
}
    
