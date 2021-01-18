package Swing;

import Tablas.Empleados;
import java.text.DecimalFormat;

public class PantallaPrincipalAdmin extends javax.swing.JPanel {
    
    private DecimalFormat formatoNumero;
    
    public PantallaPrincipalAdmin(Empleados empleado) {
        initComponents();
        formatoNumero = new DecimalFormat("###,###.##");
        lblNombre.setText(empleado.getNombre() + " " + empleado.getApellido_Paterno() + " " + empleado.getApellido_Materno());
        lblCalle.setText(empleado.getCalle());
        lblColonia.setText(empleado.getColonia());
        lblNumero.setText(empleado.getTelefono());
        lblPuesto.setText(empleado.getEmp_Tipo().getTipo_Nombre());
        lblSueldo.setText("$" + String.valueOf(formatoNumero.format(empleado.getEmp_Tipo().getTipo_Sueldo())));
        lblCorreo.setText(empleado.getEmail());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPuesto = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblNombre);
        lblNombre.setBounds(630, 90, 470, 40);

        lblCalle.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(0, 0, 0));
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCalle.setText("Calle");
        add(lblCalle);
        lblCalle.setBounds(630, 190, 300, 40);

        lblColonia.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(0, 0, 0));
        lblColonia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblColonia.setText("Colonia");
        add(lblColonia);
        lblColonia.setBounds(940, 190, 200, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdminUser/sradministracion.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(390, 190, 100, 110);

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Direccion");
        add(jLabel3);
        jLabel3.setBounds(630, 140, 200, 30);

        lblNumero.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumero.setText("Numero");
        add(lblNumero);
        lblNumero.setBounds(940, 300, 220, 40);

        lblCorreo.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreo.setText("Correo");
        add(lblCorreo);
        lblCorreo.setBounds(630, 300, 300, 40);

        jLabel6.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Puesto y Salario");
        add(jLabel6);
        jLabel6.setBounds(630, 350, 200, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Contacto");
        add(jLabel4);
        jLabel4.setBounds(630, 250, 200, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos Generales");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5);
        jLabel5.setBounds(320, 290, 230, 30);

        lblPuesto.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(0, 0, 0));
        lblPuesto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPuesto.setText("Puesto");
        add(lblPuesto);
        lblPuesto.setBounds(630, 390, 180, 40);

        lblSueldo.setFont(new java.awt.Font("Rockwell", 1, 19)); // NOI18N
        lblSueldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSueldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSueldo.setText("Salario");
        add(lblSueldo);
        lblSueldo.setBounds(940, 390, 190, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblSueldo;
    // End of variables declaration//GEN-END:variables
}
