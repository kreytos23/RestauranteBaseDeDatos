package RestauranteConexion;

import Tablas.*;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RestauranteService {
    
    public static int agregarClienteService(String fecha, String nombre,String apellidoP,String apellidoM, String email,String Password, String colonia , String calle, String numero ){
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
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
    
    public static ArrayList<Empleados> mostrarEmpleadosService(){
        return RestauranteDAO.mostrarEmpleadosNombre();
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
        System.out.println("llega");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
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
    
    public static ArrayList<Platillos> traerPlatillosService(){
        return RestauranteDAO.traerPlatillos();
    }

    public static void actualizarPlatillosService(ArrayList<Platillos> arrayplatillos){
        RestauranteDAO.ActualizarPlatillos(arrayplatillos);
    }
    
    public static int actualizarEmpleadoService(Empleados empleado, boolean correo){
        return RestauranteDAO.actualizarEmpleado(empleado, correo);
    }
    
    public static int actualizarClienteService(Clientes cliente, boolean correo){
        return RestauranteDAO.actualizarCliente(cliente, correo);
    }
    
    public static void eliminarEmpleado(int Id){
        RestauranteDAO.eliminarEmpleado(Id);
    }
    
    public static int idTicketService(){
        return RestauranteDAO.idDeTicket();
    }
    
    public static void agregarTicketService(Tickets ticket){
        RestauranteDAO.agregarTicket(ticket);
    }
    
    public static void agregarPlatillosEnTickets(ArrayList<PlatillosTickets> arrayPlatillos){
        RestauranteDAO.agregarPlatillosTicket(arrayPlatillos);
    }
    
    public static ArrayList<Tickets> mostrarTicketsDeClientesService(int idCliente){
        return RestauranteDAO.mostrarTicketsCliente(idCliente);
    }
    
    public static ArrayList<PlatillosTickets> mostrarPlatillosDeTicketsService(int idTicket){
        return RestauranteDAO.mostrarPlatillosDeTickets(idTicket);
    }
    
    public static ArrayList<Platillos> traerPlatillosActivosService(){
        return RestauranteDAO.traerPlatillosActivos();
    }
    
    public static void eliminarTicketService(int idTicket){
        RestauranteDAO.eliminarTickets(idTicket);
    }
}