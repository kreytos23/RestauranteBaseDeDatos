package RestauranteConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection getConnection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/technoteam?serverTimezone=UTC","root","PasswordSQL");
        }catch (SQLException e) {
            System.out.println(e);
        }
        
        return conection;
    }
}