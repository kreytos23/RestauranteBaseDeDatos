
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
        Tipos tipoDeEmp;
        ArrayList<Empleados> arrayEmpleados = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.getConnection()){
            String query = "SELECT * FROM traerEmpleados";    
            ps = conexion.prepareStatement(query);
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
                arrayEmpleados.add(empleado);
            }
            return arrayEmpleados;
            
        }catch(SQLException ex){
                System.out.println(ex);
                return arrayEmpleados;
        }
    }
    
    public static int agregarCliente(Clientes cliente){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO clientes (Cli_Nombre,Cli_Apellido_Paterno,Cli_Apellido_Materno,Cli_Email,Cli_Password,Cli_Colonia,Cli_Calle,Cli_Telefono,Cli_Fecha_Nacimiento)"
                               + " VALUES (?,?,?,?,?,?,?,?,?)";
                
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getApellido_Paterno());
                ps.setString(3, cliente.getApellido_Materno());
                ps.setString(4, cliente.getEmail());
                ps.setString(5, cliente.getPassword());
                ps.setString(6, cliente.getColonia());
                ps.setString(7, cliente.getCalle());
                ps.setString(8, cliente.getTelefono());
                ps.setDate(9, cliente.getFecha());
                
                ps.executeUpdate();
                return 0;  
            
            }catch(SQLException e){
                System.out.println(e);
                String correo = "java.sql.SQLException: Check constraint 'clientes_chk_1' is violated.";
                String pass = "java.sql.SQLException: Check constraint 'clientes_chk_2' is violated.";
                String num = "java.sql.SQLException: Check constraint 'clientes_chk_3' is violated.";
                
                if(correo.equals(e.toString())){
                    return 1;
                }else if(pass.equals(e.toString())){
                    return 2;
                }else if(num.equals(e.toString())){
                    return 3;
                }else{
                    return 4;
                }
            }
        }catch(SQLException e){
            System.out.println(e);
            return 0;
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
                    cliente = new Clientes(rs.getInt("Cli_Id"),rs.getDate("Cli_Fecha_Nacimiento"), rs.getString("Cli_Nombre"), rs.getString("Cli_Apellido_Paterno"), 
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
            System.out.println("conexion exitosa");
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
    
     public static int agregarEmpleado(Empleados empleados) throws SQLException{
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            System.out.println("conexion exitosa");
            try{
                String query = "CALL NuevoEmpleado(?,?,?,?,?,?,?,?,?,?)";
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, empleados.getNombre());
                ps.setString(2, empleados.getApellido_Paterno());
                ps.setString(3, empleados.getApellido_Materno());
                ps.setString(4, empleados.getEmail());
                ps.setString(5, empleados.getPassword());
                ps.setString(6, empleados.getColonia());
                ps.setString(7, empleados.getCalle());
                ps.setDate(8, empleados.getEmp_Fecha_Nacimiento());
                ps.setString(9, empleados.getTelefono());
                ps.setInt(10, empleados.getEmp_Tipo().getTipo_Id());
                
                ps.executeUpdate();
                return 0;
                
            }catch(SQLException e){
                System.out.println(e);
                String correo = "java.sql.SQLException: Check constraint 'empleados_chk_1' is violated.";
                String pass = "java.sql.SQLException: Check constraint 'empleados_chk_2' is violated.";
                String num = "java.sql.SQLException: Check constraint 'empleados_chk_3' is violated.";
                
                if(correo.equals(e.toString())){
                    return 1;
                }else if(pass.equals(e.toString())){
                    return 2;
                }else if(num.equals(e.toString())){
                    return 3;
                }else{
                    return 4;
                }
            }
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
    }
     
    public static ArrayList<Platillos> traerPlatillos(){
        Platillos platillo;
        Menus menuDePlatillo;
        Categorias categoria;
        ArrayList<Platillos> arrayPlatillos = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try(Connection conexion = db_connect.getConnection()){
            String query = "SELECT * FROM traerPlatillos";    
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                categoria = new Categorias(rs.getInt("Cat_Id"), rs.getString("Cat_Nombre"));
                menuDePlatillo = new Menus(rs.getInt("Menu_Id"), rs.getString("Menu_Tipo"));
                platillo = new Platillos(rs.getInt("Pla_Id"), rs.getString("Pla_Nombre"),
                                         rs.getString("Pla_Descripcion"),(double)rs.getInt("Pla_Precio"),
                                         rs.getInt("Pla_Cantidad"), rs.getString("Pla_Estatus"), 
                                         categoria, menuDePlatillo);
                arrayPlatillos.add(platillo);
            }
            
            return arrayPlatillos;
            
        }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo leer los mensajes");
                return arrayPlatillos;
        }
    }
      
    public static void ActualizarPlatillos(ArrayList<Platillos> arrayPlatillos){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
           
            try{
                for(Platillos pla : arrayPlatillos){
                    String query = "CALL ActualizarPlatillos(?,?)";
                    ps = conexion.prepareStatement(query);

                    ps.setInt(1,pla.getPla_Id() );
                    ps.setString(2,pla.getPla_Estatus());

                    ps.executeUpdate();
                }
                
            }catch(SQLException e){
                System.out.println(e); 
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static int actualizarEmpleado(Empleados empleados,boolean correo){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            
            try{
                if(correo){
                    String query = "CALL ActualizarEmpleadoConCorreo(?,?,?,?,?,?)";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, empleados.getEmp_Id());
                    ps.setString(2, empleados.getCalle());
                    ps.setString(3, empleados.getColonia());
                    ps.setString(4, empleados.getPassword());
                    ps.setString(5, empleados.getTelefono());
                    ps.setString(6, empleados.getEmail());
                    ps.executeUpdate();
                }else{
                    String query = "CALL ActualizarEmpleadoSinCorreo(?,?,?,?,?)";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, empleados.getEmp_Id());
                    ps.setString(2, empleados.getCalle());
                    ps.setString(3, empleados.getColonia());
                    ps.setString(4, empleados.getPassword());
                    ps.setString(5, empleados.getTelefono());
                    ps.executeUpdate();
                }
                
                return 0;
                
            }catch(SQLException e){
                System.out.println(e);
                String correoEr = "java.sql.SQLException: Check constraint 'empleados_chk_1' is violated.";
                String pass = "java.sql.SQLException: Check constraint 'empleados_chk_2' is violated.";
                String num = "java.sql.SQLException: Check constraint 'empleados_chk_3' is violated.";
                
                if(correoEr.equals(e.toString())){
                    return 1;
                }else if(pass.equals(e.toString())){
                    return 2;
                }else if(num.equals(e.toString())){
                    return 3;
                }else{
                    return 4;
                }
            }
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
    }
    
    public static int actualizarCliente(Clientes cliente,boolean correo){
        Conexion db_connect = new Conexion();
        
        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps = null;
            
            try{
                if(correo){
                    String query = "CALL ActualizarClienteConCorreo(?,?,?,?,?,?)";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, cliente.getCli_Id());
                    ps.setString(2, cliente.getCalle());
                    ps.setString(3, cliente.getColonia());
                    ps.setString(4, cliente.getPassword());
                    ps.setString(5, cliente.getTelefono());
                    ps.setString(6, cliente.getEmail());
                    ps.executeUpdate();
                }else{
                    String query = "CALL ActualizarClienteSinCorreo(?,?,?,?,?)";
                    ps = conexion.prepareStatement(query);
                    ps.setInt(1, cliente.getCli_Id());
                    ps.setString(2, cliente.getCalle());
                    ps.setString(3, cliente.getColonia());
                    ps.setString(4, cliente.getPassword());
                    ps.setString(5, cliente.getTelefono());
                    ps.executeUpdate();
                }
                
                return 0;
                
            }catch(SQLException e){
                System.out.println(e);
                String correoEr = "java.sql.SQLException: Check constraint 'empleados_chk_1' is violated.";
                String pass = "java.sql.SQLException: Check constraint 'empleados_chk_2' is violated.";
                String num = "java.sql.SQLException: Check constraint 'empleados_chk_3' is violated.";
                
                if(correoEr.equals(e.toString())){
                    return 1;
                }else if(pass.equals(e.toString())){
                    return 2;
                }else if(num.equals(e.toString())){
                    return 3;
                }else{
                    return 4;
                }
            }
        }catch(SQLException e){
            System.out.println(e);
            return 0;
        }
    }
}
