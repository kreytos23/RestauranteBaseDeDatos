package Tablas;

import java.sql.Date;


public class Empleados extends Persona{
    private int Emp_Id;
    private Tipos Emp_Tipo;
    private Date Emp_Fecha_Nacimiento;

    public Empleados(int Emp_Id, Tipos Emp_Tipo, Date Emp_Fecha_Nacimiento, String Nombre, String Apellido_Paterno, String Apellido_Materno,
                    String Email, String Password, String Colonia, String Calle, String Telefono) {
        super(Nombre, Apellido_Paterno, Apellido_Materno, Email, Password, Colonia, Calle, Telefono);
        this.Emp_Id = Emp_Id;
        this.Emp_Tipo = Emp_Tipo;
        this.Emp_Fecha_Nacimiento = Emp_Fecha_Nacimiento;
    }
    
    public Empleados(){
    }

    public int getEmp_Id() {
        return Emp_Id;
    }

    public void setEmp_Id(int Emp_Id) {
        this.Emp_Id = Emp_Id;
    }

    public Tipos getEmp_Tipo() {
        return Emp_Tipo;
    }

    public void setEmp_Tipo(Tipos Emp_Tipo) {
        this.Emp_Tipo = Emp_Tipo;
    }

    public Date getEmp_Fecha_Nacimiento() {
        return Emp_Fecha_Nacimiento;
    }

    public void setEmp_Fecha_Nacimiento(Date Emp_Fecha_Nacimiento) {
        this.Emp_Fecha_Nacimiento = Emp_Fecha_Nacimiento;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + getApellido_Paterno() + " " + getApellido_Materno();
    }
    
    
    
    
}
