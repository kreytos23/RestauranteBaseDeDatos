package Tablas;

import java.text.DecimalFormat;

public class PlatillosTickets {
    private int PT_Id;
    private Platillos PT_Platillo;
    private Tickets PT_Ticket;
    private int cantidad_platillo;

    public PlatillosTickets(int PT_Id, Platillos PT_Platillo, Tickets PT_Ticket, int cantidad_platillo) {
        this.PT_Id = PT_Id;
        this.PT_Platillo = PT_Platillo;
        this.PT_Ticket = PT_Ticket;
        this.cantidad_platillo = cantidad_platillo;
    }

    public PlatillosTickets() {
    }
    
    public int getPT_Id() {
        return PT_Id;
    }

    public void setPT_Id(int PT_Id) {
        this.PT_Id = PT_Id;
    }

    public Platillos getPT_Platillo() {
        return PT_Platillo;
    }

    public void setPT_Platillo(Platillos PT_Platillo) {
        this.PT_Platillo = PT_Platillo;
    }

    public Tickets getPT_Ticket() {
        return PT_Ticket;
    }

    public void setPT_Ticket(Tickets PT_Ticket) {
        this.PT_Ticket = PT_Ticket;
    }

    public int getCantidad_platillo() {
        return cantidad_platillo;
    }

    public void setCantidad_platillo(int cantidad_platillo) {
        this.cantidad_platillo = cantidad_platillo;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("###,###.##");
        return PT_Platillo.getPla_Nombre() + "                              " + cantidad_platillo +
                "                      $" + formato.format(PT_Platillo.getPla_Precio());
    }
}
