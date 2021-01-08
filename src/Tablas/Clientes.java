package Tablas;

import java.sql.Date;

public class Clientes extends Persona {
    
    private int Cli_Id;
    private Date fecha;
    public Clientes(int Cli_Id,Date fecha, String Nombre, String Apellido_Paterno, String Apellido_Materno, String Email, String Password, String Colonia, String Calle, String Telefono) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Email, Password, Colonia, Calle, Telefono);
        this.Cli_Id = Cli_Id;
        this.fecha = fecha;
    }   
    
    public Clientes(){
    }

    public int getCli_Id() {
        return Cli_Id;
    }

    public void setCli_Id(int Cli_Id) {
        this.Cli_Id = Cli_Id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
            
}
