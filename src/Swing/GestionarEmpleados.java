package Swing;

import Tablas.Empleados;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import EnumClases.TipoEmpleado;
import RestauranteConexion.RestauranteService;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class GestionarEmpleados extends javax.swing.JPanel {
    
    private ArrayList<Empleados> empleados;
    private DefaultListModel modeloEmpleados = new DefaultListModel();
    private TipoEmpleado tipoEmpleado;
    private SimpleDateFormat formato;
    private DecimalFormat formatoNumero;
    
    
    
    public GestionarEmpleados() {
        initComponents();
        formato = new SimpleDateFormat("yyyy/MM/dd");
        formatoNumero = new DecimalFormat("###,###.##");
        
        jlListaEmpleados.setModel(modeloEmpleados);
        
        for(TipoEmpleado tipo : tipoEmpleado.values()){
            cbTiposEmpleados.addItem(tipo.toString());
        }
        
        empleados = RestauranteConexion.RestauranteService.mostrarEmpleadosService();
        
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getEmp_Tipo().getTipo_Id() == 1)
            modeloEmpleados.addElement(empleados.get(i));
        }
        
        System.out.println(((Empleados)modeloEmpleados.getElementAt(0)).getEmp_Fecha_Nacimiento().toString());
        jlListaEmpleados.setSelectedIndex(0);
        lbNombre.setText(((Empleados)modeloEmpleados.getElementAt(0)).getNombre());
        lbApellidoP.setText(((Empleados)modeloEmpleados.getElementAt(0)).getApellido_Paterno());
        lbApellidoM.setText(((Empleados)modeloEmpleados.getElementAt(0)).getApellido_Materno());
        lbFechaNacimiento.setText(formato.format(((Empleados)modeloEmpleados.getElementAt(0)).getEmp_Fecha_Nacimiento()));
        lblPuesto.setText(((Empleados)modeloEmpleados.getElementAt(0)).getEmp_Tipo().getTipo_Nombre());
        lblSueldo.setText("$" + formatoNumero.format(((Empleados)modeloEmpleados.getElementAt(0)).getEmp_Tipo().getTipo_Sueldo()));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTiposEmpleados = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaEmpleados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbApellidoP = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lbApellidoM = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbFechaNacimiento = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        cbTiposEmpleados.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        cbTiposEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        cbTiposEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTiposEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTiposEmpleadosActionPerformed(evt);
            }
        });
        add(cbTiposEmpleados);
        cbTiposEmpleados.setBounds(370, 70, 190, 40);

        jlListaEmpleados.setBackground(new java.awt.Color(255, 102, 0));
        jlListaEmpleados.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jlListaEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        jlListaEmpleados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlListaEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlListaEmpleados.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jlListaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlListaEmpleados);

        add(jScrollPane1);
        jScrollPane1.setBounds(370, 130, 330, 260);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        add(jLabel2);
        jLabel2.setBounds(800, 130, 120, 22);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido Paterno:");
        add(jLabel3);
        jLabel3.setBounds(800, 170, 160, 22);

        lbApellidoP.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbApellidoP.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidoP.setText("jLabel4");
        add(lbApellidoP);
        lbApellidoP.setBounds(1010, 170, 210, 22);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/Eliminar2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar);
        btnEliminar.setBounds(1130, 220, 210, 90);

        lbApellidoM.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbApellidoM.setForeground(new java.awt.Color(0, 0, 0));
        lbApellidoM.setText("jLabel5");
        add(lbApellidoM);
        lbApellidoM.setBounds(1010, 210, 210, 22);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido Materno:");
        add(jLabel6);
        jLabel6.setBounds(800, 210, 170, 22);

        lbNombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("jLabel7");
        add(lbNombre);
        lbNombre.setBounds(1010, 130, 210, 22);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de Nacimiento:");
        add(jLabel8);
        jLabel8.setBounds(800, 250, 200, 22);

        lbFechaNacimiento.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        lbFechaNacimiento.setText("jLabel4");
        add(lbFechaNacimiento);
        lbFechaNacimiento.setBounds(1010, 250, 210, 22);

        lblSueldo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblSueldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSueldo.setText("jLabel4");
        add(lblSueldo);
        lblSueldo.setBounds(1010, 290, 210, 22);

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo:");
        add(jLabel9);
        jLabel9.setBounds(800, 330, 120, 22);

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Sueldo:");
        add(jLabel10);
        jLabel10.setBounds(800, 290, 120, 22);

        lblPuesto.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lblPuesto.setText("jLabel7");
        add(lblPuesto);
        lblPuesto.setBounds(1010, 330, 210, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -140, 1670, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void cbTiposEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTiposEmpleadosActionPerformed
        try {
            if(cbTiposEmpleados.getSelectedIndex() == 0){
                actualizarLista(1);
            }else if(cbTiposEmpleados.getSelectedIndex() == 1){
                actualizarLista(2);
            }else if(cbTiposEmpleados.getSelectedIndex() == 2){
                actualizarLista(3);
            }else if(cbTiposEmpleados.getSelectedIndex() == 3){
                actualizarLista(4);
            }else if(cbTiposEmpleados.getSelectedIndex() == 4){
                 actualizarLista(5);
            }else{
                actualizarLista(6);
            }
            } catch (Exception e) {
            }
        
    }//GEN-LAST:event_cbTiposEmpleadosActionPerformed

    private void jlListaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaEmpleadosMouseClicked
        int index = jlListaEmpleados.getSelectedIndex();
        lbNombre.setText(((Empleados)modeloEmpleados.getElementAt(index)).getNombre());
        lbApellidoP.setText(((Empleados)modeloEmpleados.getElementAt(index)).getApellido_Paterno());
        lbApellidoM.setText(((Empleados)modeloEmpleados.getElementAt(index)).getApellido_Materno());
        lbFechaNacimiento.setText(formato.format(((Empleados)modeloEmpleados.getElementAt(index)).getEmp_Fecha_Nacimiento()));
        lblPuesto.setText(((Empleados)modeloEmpleados.getElementAt(index)).getEmp_Tipo().getTipo_Nombre());
        lblSueldo.setText("$ " + formatoNumero.format(((Empleados)modeloEmpleados.getElementAt(index)).getEmp_Tipo().getTipo_Sueldo()));
    }//GEN-LAST:event_jlListaEmpleadosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar Al Empleado?","Uy Cuidado",JOptionPane.WARNING_MESSAGE);
        if(confirmacion == 0){
            int puesto = ((Empleados) modeloEmpleados.getElementAt(jlListaEmpleados.getSelectedIndex())).getEmp_Tipo().getTipo_Id();
            if(puesto != 4){
                int idEmpleado = ((Empleados) modeloEmpleados.getElementAt(jlListaEmpleados.getSelectedIndex())).getEmp_Id();
                modeloEmpleados.removeElementAt(jlListaEmpleados.getSelectedIndex());
                RestauranteService.eliminarEmpleado(idEmpleado);
            }else{
                JOptionPane.showMessageDialog(null,"No puede Eliminar un Administrador","Error",JOptionPane.WARNING_MESSAGE );
            }
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbTiposEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlListaEmpleados;
    private javax.swing.JLabel lbApellidoM;
    private javax.swing.JLabel lbApellidoP;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSueldo;
    // End of variables declaration//GEN-END:variables

    private void actualizarLista(int tipo) {
        modeloEmpleados.removeAllElements();
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getEmp_Tipo().getTipo_Id() == tipo)
            modeloEmpleados.addElement(empleados.get(i));
        }
    }
}
