package Frames;

import java.sql.*;

public class ConecxionBD {
    Connection cn;
    Statement st;

    String url;
    public ConecxionBD(String url) {
        this.url = url;
        
    }
   
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","123");
            System.out.println("Se hizo la conecion exitosa"); 
        }catch ( Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    
}
