package Tablas;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Tickets {
    private int Tic_Id;
    private double Tic_Total;
    private Date Tic_Fecha;
    private Clientes Tic_cliente;

    public Tickets(int Tic_Id, double Tic_Total, Date Tic_Fecha, Clientes Tic_cliente) {
        this.Tic_Id = Tic_Id;
        this.Tic_Total = Tic_Total;
        this.Tic_Fecha = Tic_Fecha;
        this.Tic_cliente = Tic_cliente;
    }

    public Tickets(int Tic_Id) {
        this.Tic_Id = Tic_Id;
    }

    public Tickets() {
    }
    
    public int getTic_Id() {
        return Tic_Id;
    }

    public void setTic_Id(int Tic_Id) {
        this.Tic_Id = Tic_Id;
    }

    public double getTic_Total() {
        return Tic_Total;
    }

    public void setTic_Total(double Tic_Total) {
        this.Tic_Total = Tic_Total;
    }

    public Date getTic_Fecha() {
        return Tic_Fecha;
    }

    public void setTic_Fecha(Date Tic_Fecha) {
        this.Tic_Fecha = Tic_Fecha;
    }

    public Clientes getTic_cliente() {
        return Tic_cliente;
    }

    public void setTic_cliente(Clientes Tic_cliente) {
        this.Tic_cliente = Tic_cliente;
    }
    
    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("###,###.##");
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        return "Fecha: " + form.format(Tic_Fecha) + "  Total: $" + formato.format(Tic_Total);
    }
}
