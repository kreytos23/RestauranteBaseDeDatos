package Swing;

import RestauranteConexion.RestauranteService;
import Tablas.Clientes;
import Tablas.PlatillosTickets;
import Tablas.Tickets;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class ComprarCarrito extends javax.swing.JPanel {

    private DefaultListModel modeloCarrito;
    private ArrayList<PlatillosTickets> platillosDeCarrito;
    private Tickets ticketCompra;
    private int total;
    private Clientes logueado;
    private DecimalFormat formato;
    
    
    public ComprarCarrito(Clientes logueado) {
        initComponents();
        
        modeloCarrito = new DefaultListModel();
        formato = new DecimalFormat("###,###.##");
        this.logueado = logueado;
        total = 0;
        platillosDeCarrito = MenuDeUsuario.getPlatillosEnCarrito();
        listaCarrito.setModel(modeloCarrito);
        System.out.println("Cantidad Id " + logueado.getCli_Id());
        for (PlatillosTickets plat : platillosDeCarrito) {
            modeloCarrito.addElement(plat);
            System.out.println("Cantidad Id " + plat.getPT_Platillo().getPla_Cantidad());
            plat.getPT_Platillo().setPla_Cantidad(plat.getPT_Platillo().getPla_Cantidad() - plat.getCantidad_platillo());
            total += plat.getCantidad_platillo() * plat.getPT_Platillo().getPla_Precio();
        }
        lblTotal.setText("Total:    $ " + formato.format(total));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnComprar = new javax.swing.JButton();
        lblTotal1 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCarrito = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        add(jSeparator1);
        jSeparator1.setBounds(700, 70, 10, 365);

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        add(jSeparator2);
        jSeparator2.setBounds(290, 120, 600, 10);

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        add(jSeparator3);
        jSeparator3.setBounds(550, 70, 10, 365);

        btnComprar.setBackground(new java.awt.Color(255, 51, 0));
        btnComprar.setFont(new java.awt.Font("Rockwell", 1, 21)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/cargar (1).png"))); // NOI18N
        btnComprar.setText("     Comprar");
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnComprar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnComprar.setOpaque(true);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar);
        btnComprar.setBounds(950, 170, 320, 70);

        lblTotal1.setFont(new java.awt.Font("Rockwell", 3, 25)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal1.setText(" Producto                 Cantidad            Precio");
        add(lblTotal1);
        lblTotal1.setBounds(360, 70, 660, 50);

        lblTotal2.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        lblTotal2.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal2.setText("Carrito De Compra");
        add(lblTotal2);
        lblTotal2.setBounds(580, 0, 310, 50);

        lblTotal.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total");
        add(lblTotal);
        lblTotal.setBounds(580, 440, 280, 50);

        btnEliminarProducto.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminarProducto.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagarCarrito/eliminar.png"))); // NOI18N
        btnEliminarProducto.setText("      Eliminar Producto");
        btnEliminarProducto.setContentAreaFilled(false);
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminarProducto.setOpaque(true);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        add(btnEliminarProducto);
        btnEliminarProducto.setBounds(950, 320, 320, 70);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 51));

        listaCarrito.setBackground(new java.awt.Color(255, 153, 51));
        listaCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        listaCarrito.setFont(new java.awt.Font("Rockwell", 3, 22)); // NOI18N
        listaCarrito.setForeground(new java.awt.Color(0, 0, 0));
        listaCarrito.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCarrito.setAlignmentX(1.5F);
        listaCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaCarrito.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(listaCarrito);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 128, 560, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1380, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
       java.util.Date fechaActual = new java.util.Date();
       Date fechaSQL = new Date(fechaActual.getTime());
       int idTicket = RestauranteService.idTicketService() + 1;
       
       ticketCompra = new Tickets();
       ticketCompra.setTic_Total(total);
       ticketCompra.setTic_cliente(logueado);
       ticketCompra.setTic_Fecha(fechaSQL);
       ticketCompra.setTic_Id(idTicket);
       
       for (PlatillosTickets plat : platillosDeCarrito) {
            plat.setPT_Ticket(ticketCompra);
       }
       
       RestauranteService.agregarTicketService(ticketCompra);
       RestauranteService.agregarPlatillosEnTickets(platillosDeCarrito);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int index = listaCarrito.getSelectedIndex();
        System.out.println(platillosDeCarrito.get(index));
        platillosDeCarrito.remove(index);
        modeloCarrito.removeElementAt(index);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JList<String> listaCarrito;
    // End of variables declaration//GEN-END:variables
}
