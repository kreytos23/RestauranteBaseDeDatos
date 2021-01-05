package Tablas;


public class Tipos {
    private int Tipo_Id;
    private String Tipo_Nombre;
    private int Tipo_Sueldo;

    public Tipos(int Tipo_Id, String Tipo_Nombre, int Tipo_Sueldo) {
        this.Tipo_Id = Tipo_Id;
        this.Tipo_Nombre = Tipo_Nombre;
        this.Tipo_Sueldo = Tipo_Sueldo;
        
    }

    
    
    public int getTipo_Id() {
        return Tipo_Id;
    }

    public void setTipo_Id(int Tipo_Id) {
        this.Tipo_Id = Tipo_Id;
    }

    public String getTipo_Nombre() {
        return Tipo_Nombre;
    }

    public void setTipo_Nombre(String Tipo_Nombre) {
        this.Tipo_Nombre = Tipo_Nombre;
    }

    public int getTipo_Sueldo() {
        return Tipo_Sueldo;
    }

    public void setTipo_Sueldo(int Tipo_Sueldo) {
        this.Tipo_Sueldo = Tipo_Sueldo;
    }
    
    
}
