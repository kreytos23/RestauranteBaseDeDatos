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
        
        if(!ticketsDeCliente.isEmpty()){
            for (Tickets tickets : ticketsDeCliente) {
            modeloTickets.addElement(tickets);
            }
            listaTickets.setModel(modeloTickets);
            listaTickets.setSelectedIndex(0);
            listaTicketsMouseClicked(null);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTickets = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPlatillos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosMenu/Borrar (1).png"))); // NOI18N
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        add(btnBorrar);
        btnBorrar.setBounds(1060, 190, 190, 90);

        listaTickets.setBackground(new java.awt.Color(255, 51, 0));
        listaTickets.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        listaTickets.setForeground(new java.awt.Color(255, 255, 255));
        listaTickets.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaTickets.setSelectionBackground(new java.awt.Color(255, 153, 153));
        listaTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTicketsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTickets);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 110, 330, 330);

        jLabel2.setFont(new java.awt.Font("Rockwell", 3, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Historial de Tickets");
        add(jLabel2);
        jLabel2.setBounds(530, 50, 240, 30);

        listaPlatillos.setBackground(new java.awt.Color(255, 51, 0));
        listaPlatillos.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        listaPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        listaPlatillos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaPlatillos.setSelectionBackground(new java.awt.Color(255, 153, 153));
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

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int index = listaTickets.getSelectedIndex();
        Tickets ticket = (Tickets) modeloTickets.getElementAt(index);
        RestauranteConexion.RestauranteService.eliminarTicketService(ticket.getTic_Id());
        modeloTickets.removeElementAt(index);
        listaTickets.setSelectedIndex(0);
        listaTicketsMouseClicked(null);
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPlatillos;
    private javax.swing.JList<String> listaTickets;
    // End of variables declaration//GEN-END:variables
}
