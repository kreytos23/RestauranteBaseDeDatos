package RestauranteConexion;

import Swing.AgregarEmpleado;
import Tablas.*;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class RestauranteService {
    
    public static int agregarClienteService(String fecha, String nombre,String apellidoP,String apellidoM, String email,String Password, String colonia , String calle, String numero ){
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
        try {
            java.util.Date fechaJ = format.parse(fecha);
 
            Date fechaSQL = new Date(fechaJ.getTime());
            Clientes cliente = new Clientes(0,fechaSQL, nombre, apellidoP, apellidoM, email, Password, colonia, calle, numero);
            System.out.println(cliente.getFecha());
            return RestauranteDAO.agregarCliente(cliente);
        }catch(ParseException ex) {
            return 0;
        }
    }
    
    public static void mostrarEmpleadosService(){
        ArrayList<Empleados> arrayEmpleados = RestauranteDAO.mostrarEmpleadosNombre();
        for(int i = 0; i < arrayEmpleados.size(); i++){
            System.out.println(arrayEmpleados.get(i).getNombre());
            System.out.println(arrayEmpleados.get(i).getApellido_Paterno());
            System.out.println(arrayEmpleados.get(i).getApellido_Materno());
        }
    }
    
    public static void mostrarClienteConIdService(int Id){
        RestauranteDAO.mostrarClienteConId(Id);
    }
    
    public static void mostarClientesConApellidos(){
        RestauranteDAO.mostrarClienteConApelldidos("Cabello", "Vargas");
    }
    
    public static Clientes loginClienteService(String correo,String pass){
        return RestauranteDAO.loginCliente(correo, pass);
    }
    
    public static Empleados loginEmpleadoService(String correo, String pass){
        return RestauranteDAO.loginEmpleado(correo, pass);
    }
    
    public static int agregarEmpleado(String tipo,String fecha, String nombre,String apellidoP,String apellidoM, String email, String contra, String colonia, String calle, String num ){
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
        try {
            java.util.Date fechaJ = format.parse(fecha);
            try{
                Tipos puesto = new Tipos(Integer.parseInt(tipo), null, 0);
                try{
                    Date fechaSQL = new Date(fechaJ.getTime());
                    Empleados empleado = new Empleados(0,puesto,fechaSQL, nombre, apellidoP, apellidoM, email, contra, colonia, calle, num);
                    return RestauranteDAO.agregarEmpleado(empleado);
                }catch(SQLException ex){
                    System.out.println(ex);
                    return 0;
                }
            }catch(NumberFormatException es){
                return 0;
            } 
        }catch(ParseException ex) {
            return 0;
        }
    }

}