
package RestauranteConexion;

import Tablas.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RestauranteDAO {
    
    public static ArrayList<Empleados> mostrarEmpleadosNombre(){
        Empleados empleado;
        ArrayList<Empleados> arrayEmpleados = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.getConnection()){
            String query = "SELECT * FROM empleados_Nombre_Id";    
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                empleado = new Empleados();
                empleado.setNombre(rs.getString("Emp_Nombre"));
                empleado.setApellido_Paterno(rs.getString("Emp_Apellido_Paterno"));
                empleado.setApellido_Materno(rs.getString("Emp_Apellido_Materno"));
                arrayEmpleados.add(empleado);
            }
            return arrayEmpleados;
            
        }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo leer los mensajes");
                return arrayEmpleados;
        }
    }
    
    public static void agregarCliente(Clientes cliente){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO clientes (Cli_Nombre,Cli_Apellido_Paterno,Cli_Apellido_Materno,Cli_Email,Cli_Password,Cli_Colonia,Cli_Calle,Cli_Telefono)"
                               + " VALUES (?,?,?,?,?,?,?,?)";
                
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido_Paterno());
                ps.setString(3, cliente.getApellido_Materno());
                ps.setString(4, cliente.getEmail());
                ps.setString(5, cliente.getPassword());
                ps.setString(6, cliente.getColonia());
                ps.setString(7, cliente.getCalle());
                ps.setString(8, cliente.getTelefono());
                
                ps.executeUpdate();
                System.out.println("Cliente Agregado");    
            
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void mostrarClienteConId(int Id){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "call ObtenerClienteConId (?)";
                ps = conexion.prepareStatement(query);
                
                ps.setInt(1, Id);
                rs = ps.executeQuery();  
            
                while(rs.next()){
                    System.out.println("El cliente Con Id " + Id + " es " + rs.getString("Cli_Nombre") 
                                        + " " + rs.getString("Cli_Apellido_Paterno"));
                }
                
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void mostrarClienteConApelldidos(String ApePaterno,String ApeMaterno){
        Conexion db_connect = new Conexion();
        boolean vacio = false;
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "call ObtenerClienteConApellidos(?,?)";
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, ApePaterno);
                ps.setString(2, ApeMaterno);
                rs = ps.executeQuery();  
            
                while(rs.next()){
                    System.out.println("El cliente con Apellidos " + ApePaterno + " " + ApeMaterno + " tiene un Id " 
                            + rs.getInt("Cli_Id"));
                    vacio = true;
                }
                
                if(!vacio){
                    System.out.println("Esta vacio wue F");
                }
                
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static Clientes loginCliente(String Correo,String Pass){
        Clientes cliente = null;
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "call LoginCliente(?,?)";
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, Correo);
                ps.setString(2, Pass);
                rs = ps.executeQuery();  
            
                while(rs.next()){
                    cliente = new Clientes(rs.getInt("Cli_Id"), rs.getString("Cli_Nombre"), rs.getString("Cli_Apellido_Paterno"), 
                            rs.getString("Cli_Apellido_Materno"), rs.getString("Cli_Email"), rs.getString("Cli_Password"),
                            rs.getString("Cli_Colonia"), rs.getString("Cli_Calle"), rs.getString("Cli_Telefono"));
                }
                
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return cliente;
    }
    
    public static Empleados loginEmpleado(String Correo,String Pass){
        Empleados empleado = null;
        Tipos tipoDeEmp = null;
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "call LoginAdmin(?,?)";
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, Correo);
                ps.setString(2, Pass);
                rs = ps.executeQuery();  
            
                while(rs.next()){
                    tipoDeEmp = new Tipos(rs.getInt("Tipo_Id"), 
                                          rs.getString("Tipo_Nombre"),
                                          rs.getInt("Tipo_Sueldo"));
                    
                    empleado = new Empleados(rs.getInt("Emp_Id"),
                                             tipoDeEmp,
                                             rs.getDate("Emp_Fecha_Nacimiento"),
                                             rs.getString("Emp_Nombre"),
                                             rs.getString("Emp_Apellido_Paterno"), 
                                             rs.getString("Emp_Apellido_Materno"),
                                             rs.getString("Emp_Email"),
                                             rs.getString("Emp_Password"),
                                             rs.getString("Emp_Colonia"),
                                             rs.getString("Emp_Calle"),
                                             rs.getString("Emp_Telefono"));
                }
                
            }catch(SQLException e){
                System.out.println(e);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return empleado;
    }
    
      
    
}
