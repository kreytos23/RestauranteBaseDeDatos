package RestauranteConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConnection(){
        Connection conection = null;
        
        try {


            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoteam?serverTimezone= America/Mexico_City","root","CabVar2000");


        }catch (SQLException e) {
            System.out.println(e);
        }
        
        return conection;
    }
}