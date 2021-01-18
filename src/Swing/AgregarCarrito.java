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
    private MenuDePlatillos menuDePlatillos;
    
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
        btnRegresar = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnComprarAhora = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblInfo = new javax.swing.JTextArea();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblFoto.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(0, 0, 0));
        add(lblFoto);
        lblFoto.setBounds(230, 80, 350, 320);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/felcahanegrita.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesAUsar/flecha.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar);
        btnRegresar.setBounds(1290, 10, 60, 60);

        btnMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/Menos.png"))); // NOI18N
        btnMenos.setBorderPainted(false);
        btnMenos.setContentAreaFilled(false);
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        add(btnMenos);
        btnMenos.setBounds(770, 350, 60, 60);

        btnMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/Mas.png"))); // NOI18N
        btnMas.setBorderPainted(false);
        btnMas.setContentAreaFilled(false);
        btnMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        add(btnMas);
        btnMas.setBounds(930, 350, 60, 60);

        btnComprarAhora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/Comprar ahora_1.png"))); // NOI18N
        btnComprarAhora.setBorderPainted(false);
        btnComprarAhora.setContentAreaFilled(false);
        btnComprarAhora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprarAhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAhoraActionPerformed(evt);
            }
        });
        add(btnComprarAhora);
        btnComprarAhora.setBounds(920, 430, 160, 70);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/Agregar al carrito_1.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar);
        btnAgregar.setBounds(670, 430, 160, 70);

        lblInfo.setBackground(new java.awt.Color(255, 102, 51));
        lblInfo.setColumns(20);
        lblInfo.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setRows(5);
        jScrollPane1.setViewportView(lblInfo);

        add(jScrollPane1);
        jScrollPane1.setBounds(630, 130, 500, 200);

        lblNombre.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("jLabel3");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblNombre);
        lblNombre.setBounds(670, 50, 260, 50);

        lblPrecio.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("jLabel4");
        lblPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblPrecio);
        lblPrecio.setBounds(950, 50, 140, 50);

        lblCantidad.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lblCantidad);
        lblCantidad.setBounds(824, 355, 110, 50);

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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menuDePlatillos = new MenuDePlatillos(clienteLogueado);
        menuDePlatillos.setBounds(this.getBounds());
        this.removeAll();
        this.add(menuDePlatillos);
        this.updateUI();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnComprarAhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAhoraActionPerformed
        platilloAgregar = new PlatillosTickets();
        platilloAgregar.setCantidad_platillo(cantidad);
        platilloAgregar.setPT_Platillo(platilloSeleccionado);
        MenuDeUsuario.getPlatillosEnCarrito().add(platilloAgregar);
        JOptionPane.showMessageDialog(null, "Agregado Al Carrito", "Hecho",JOptionPane.INFORMATION_MESSAGE);
        ComprarCarrito comprarCarrito = new ComprarCarrito(clienteLogueado);
        comprarCarrito.setBounds(this.getBounds());
        this.removeAll();
        this.add(comprarCarrito);
        this.updateUI();
    }//GEN-LAST:event_btnComprarAhoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComprarAhora;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextArea lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}
