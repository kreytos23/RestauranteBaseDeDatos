package Swing;

import javax.swing.DefaultListModel;


public class HistorialTickets extends javax.swing.JPanel {
    
    private DefaultListModel modeloTickets;
    private DefaultListModel modeloDePlatillos;
 
    public HistorialTickets() {
        initComponents();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaPlatillos;
    private javax.swing.JList<String> listaTickets;
    // End of variables declaration//GEN-END:variables
}
