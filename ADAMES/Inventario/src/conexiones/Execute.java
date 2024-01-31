/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author 
 *  José Luis Isabel Matos 2018-2394
    Anthony Cruz Reynoso – 20172077 
    María Alexandra Adames Trinidad - 20191311
 */
public class Execute {
    
    
    public boolean ExecuteQueryInserts(String Query)
    {

        try {
            Connection conexion = Conexion.conexion();
            
            Statement statement = conexion.createStatement();
            
            statement.executeUpdate("INSERT INTO " + Query);

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } 
        return true;
    }
    
    public boolean ExecuteQueryUpdate(String Query)
    {

        try {
            Connection conexion = Conexion.conexion();
            
            Statement statement = conexion.createStatement();
            
            // insertar data
            statement.executeUpdate("UPDATE " + Query);
            //conexion.close();
                        

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } 
        return true;
    }
    public boolean ExecuteQueryReats(String Query)
    {
         try {
            Connection conexion = Conexion.conexion();
            
            Statement statement = conexion.createStatement();
            
            // insertar data
            statement.executeUpdate("INSERT INTO " + Query);
            conexion.close();
                        
            System.out.println("El registro se inserta en la tabla Cliente!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
         return true;
    }
    
    
    public Connection GetConnection( )
    {
        return Conexion.conexion();
    }
}
