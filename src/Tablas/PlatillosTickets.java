package Tablas;


public class PlatillosTickets {
    private int PT_Id;
    private Platillos PT_Platillo;
    private Tickets PT_Ticket;
    private int cantidad_platillo;

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
    
    
}
