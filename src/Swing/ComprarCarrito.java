package Swing;

import RestauranteConexion.RestauranteService;
import Tablas.Clientes;
import Tablas.Platillos;
import Tablas.PlatillosTickets;
import Tablas.Tickets;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class ComprarCarrito extends javax.swing.JPanel {

    private DefaultListModel modeloCarrito = new DefaultListModel();
    private ArrayList<PlatillosTickets> platillosDeCarrito;
    private Tickets ticketCompra;
    private int total;
    private Clientes logueado;
    
    public ComprarCarrito(Clientes logueado) {
        initComponents();
        this.logueado = logueado;
        total = 0;
        platillosDeCarrito = MenuDeUsuario.getPlatillosEnCarrito();
        listaCarrito.setModel(modeloCarrito);
        
        for (PlatillosTickets plat : platillosDeCarrito) {
            modeloCarrito.addElement(plat);
            total += plat.getCantidad_platillo() * plat.getPT_Platillo().getPla_Precio();
        }
        lblTotal.setText(String.valueOf(total));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCarrito = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar);
        btnComprar.setBounds(990, 130, 80, 32);

        lblTotal.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("jLabel2");
        add(lblTotal);
        lblTotal.setBounds(690, 410, 140, 30);

        jButton2.setText("jButton2");
        add(jButton2);
        jButton2.setBounds(990, 280, 77, 32);

        listaCarrito.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCarrito);

        add(jScrollPane1);
        jScrollPane1.setBounds(360, 60, 420, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1370, 790);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> listaCarrito;
    // End of variables declaration//GEN-END:variables
}
