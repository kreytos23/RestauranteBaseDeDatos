package Swing;

import Tablas.Clientes;
import Tablas.Platillos;
import Tablas.PlatillosTickets;
import Tablas.Tickets;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AgregarCarrito extends javax.swing.JPanel {

    private Clientes clienteLogueado;
    private Platillos platilloSeleccionado;
    private DecimalFormat formato;
    private int cantidad;
    private PlatillosTickets platilloAgregar;
    
    public AgregarCarrito(Platillos platilloSeleccionado, Clientes clienteSeleccionado) {
        initComponents();
        cantidad = 1;
        lblCantidad.setText(String.valueOf(cantidad));
        formato = new DecimalFormat("###,###.##");
        this.platilloSeleccionado = platilloSeleccionado;
        this.lblNombre.setText(this.platilloSeleccionado.getPla_Nombre());
        this.lblPrecio.setText("$" + formato.format(this.platilloSeleccionado.getPla_Precio()));
        this.lblInfo.setRows(10);
        this.lblInfo.setText(this.platilloSeleccionado.getPla_Descripcion());
        Image img = new ImageIcon(getClass().getResource(this.platilloSeleccionado.getPla_Imagen())).getImage();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(314, 240, Image.SCALE_SMOOTH));
        this.lblFoto.setIcon(img2);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnComprarAhora = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblInfo = new javax.swing.JTextArea();
        lblCantidad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblFoto.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(0, 0, 0));
        add(lblFoto);
        lblFoto.setBounds(340, 80, 350, 320);

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        add(btnMenos);
        btnMenos.setBounds(860, 360, 50, 32);

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        add(btnMas);
        btnMas.setBounds(1065, 360, 50, 32);

        btnComprarAhora.setText("jButton3");
        add(btnComprarAhora);
        btnComprarAhora.setBounds(1040, 440, 77, 32);

        btnAgregar.setText("jButton4");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(860, 440, 77, 32);

        lblInfo.setColumns(20);
        lblInfo.setRows(5);
        jScrollPane1.setViewportView(lblInfo);

        add(jScrollPane1);
        jScrollPane1.setBounds(780, 130, 430, 200);

        lblCantidad.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setOpaque(true);
        add(lblCantidad);
        lblCantidad.setBounds(940, 360, 100, 32);

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("jLabel3");
        lblNombre.setOpaque(true);
        add(lblNombre);
        lblNombre.setBounds(780, 50, 260, 50);

        lblPrecio.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("jLabel4");
        lblPrecio.setOpaque(true);
        add(lblPrecio);
        lblPrecio.setBounds(1060, 50, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1380, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(cantidad != 1){
            cantidad--;
            lblCantidad.setText(String.valueOf(cantidad));
        }
        
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        if(cantidad < platilloSeleccionado.getPla_Cantidad()){
            cantidad++;
            lblCantidad.setText(String.valueOf(cantidad));
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       platilloAgregar = new PlatillosTickets();
       platilloAgregar.setCantidad_platillo(cantidad);
       platilloAgregar.setPT_Platillo(platilloSeleccionado);
       MenuDeUsuario.getPlatillosEnCarrito().add(platilloAgregar);
       JOptionPane.showMessageDialog(null, "Agregado Al Carrito", "Hecho",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComprarAhora;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextArea lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}
