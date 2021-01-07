package RestauranteConexion;

import Tablas.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class RestauranteService {
    
    public static void agregarClienteService(){
        Clientes cliente;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre =  sc.nextLine();
        
        System.out.println("\nApellido Paterno: ");
        String apellidoP = sc.nextLine();
        
        System.out.println("\nApellido Materno: ");
        String apellidoM = sc.nextLine();
        
        System.out.println("\nEmail: ");
        String email = sc.nextLine();
        
        System.out.println("\nContraseña: ");
        String contra = sc.nextLine();
        
        System.out.println("\nColonia: ");
        String colonia = sc.nextLine();
        
        System.out.println("\ncalle:  ");
        String calle = sc.nextLine();
        
        System.out.println("\nnumero ");
        String num = sc.nextLine();
        
        cliente = new Clientes(0,nombre,apellidoP,apellidoM,email,contra,colonia,calle,num);
        
        RestauranteDAO.agregarCliente(cliente);
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
    
    public static void agregarEmpleado(Tipos tipo,Date fecha, String nombre,String apellidoP,String apellidoM, String email, String contra, String colonia, String calle, String num ){
        Empleados empleado = new Empleados(0,tipo,fecha, nombre, apellidoP, apellidoM, email, contra, colonia, calle, num);
        RestauranteDAO.agregarEmpleado(empleado);
    }

}