/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 
 *  José Luis Isabel Matos 2018-2394
    Anthony Cruz Reynoso – 20172077 
    María Alexandra Adames Trinidad - 20191311
 */

public class Conexion {

    private static String ConectionString="jdbc:sqlserver://DESKTOP-FCT62AU;databaseName=InventarioPoo;integratedsecurity=true;";
    private static Connection conexion = null;
    
    
    public static Connection conexion()
    {
        try {
            if(conexion == null)
            {
                conexion = DriverManager.getConnection(ConectionString,"","");
                System.out.println("Conectado a la base de datos");
            }
            
            return conexion;
        }
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        return null;
    }
}
