/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author wallo
 */
public class Conexion1 extends Salvación {
    Connection cn;
    Statement st;
    
    
    @Override
    public void Conexion1(){
               try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","123");
            System.out.println("Se hizo la conecion exitosa"); 
        }catch ( Exception e){
            System.out.println(e.getMessage());
        }    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    
    
}
