package Tablas;

public class Clientes extends Persona {
    
    private int Cli_Id;

    public Clientes(int Cli_Id, String Nombre, String Apellido_Paterno, String Apellido_Materno, String Email, String Password, String Colonia, String Calle, String Telefono) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Email, Password, Colonia, Calle, Telefono);
        this.Cli_Id = Cli_Id;
    }
    
    public Clientes(){
    }

    public int getCli_Id() {
        return Cli_Id;
    }

    public void setCli_Id(int Cli_Id) {
        this.Cli_Id = Cli_Id;
    }
    
    
    
            
}
