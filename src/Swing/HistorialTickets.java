package Swing;

import Tablas.Clientes;
import Tablas.PlatillosTickets;
import Tablas.Tickets;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class HistorialTickets extends javax.swing.JPanel {
    
    private DefaultListModel modeloTickets;
    private DefaultListModel modeloDePlatillos;
    private ArrayList<Tickets> ticketsDeCliente;
    private ArrayList<PlatillosTickets> platillosDeTicket;
    private Clientes logueado;
    
    public HistorialTickets(Clientes clienteLogueado) {
        initComponents();
        this.logueado = clienteLogueado;
        modeloTickets = new DefaultListModel();
        modeloDePlatillos = new DefaultListModel();
        System.out.println("Sirve gg " + logueado.getCli_Id());
        ticketsDeCliente = RestauranteConexion.RestauranteService.mostrarTicketsDeClientesService(logueado.getCli_Id());
        
        for (Tickets tickets : ticketsDeCliente) {
            modeloTickets.addElement(tickets);
        }
        
        listaTickets.setModel(modeloTickets);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaTickets = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPlatillos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        listaTickets.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTicketsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTickets);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 110, 330, 330);

        listaPlatillos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaPlatillos);

        add(jScrollPane2);
        jScrollPane2.setBounds(670, 110, 330, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoles/PANEL PRINCIPAL.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -150, 1380, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void listaTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTicketsMouseClicked
        modeloDePlatillos.clear();
        Tickets ticket = (Tickets) modeloTickets.getElementAt(listaTickets.getSelectedIndex());
        System.out.println("Id Ticket: " + ticket.getTic_Id());
        platillosDeTicket = RestauranteConexion.RestauranteService.mostrarPlatillosDeTicketsService(ticket.getTic_Id());
        for (PlatillosTickets platillosTickets : platillosDeTicket) {
            modeloDePlatillos.addElement(platillosTickets);
        }
        listaPlatillos.setModel(modeloDePlatillos);
    }//GEN-LAST:event_listaTicketsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPlatillos;
    private javax.swing.JList<String> listaTickets;
    // End of variables declaration//GEN-END:variables
}
