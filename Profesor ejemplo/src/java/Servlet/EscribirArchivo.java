package Servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author junio
 */
@WebServlet(name = "EscribirArchivo", urlPatterns = {"/EscribirArchivo"})
public class EscribirArchivo extends HttpServlet {

  public static String metLeerConsola() {
        InputStreamReader vISR = new InputStreamReader(System.in);
        BufferedReader vBR = new BufferedReader(vISR);

        try {
            return vBR.readLine();
        } catch (IOException e) {
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Introduzca el nombre del archivo: (Ej: c:\\directorio\\archivo.txt) ");
        String vRuta = metLeerConsola();

        System.out.println("Introduzca la cadena a guardar en el archivo: ");
        String vCadena = metLeerConsola();

        File vArchivo = new File(vRuta);

        try {
            try (BufferedWriter vBW = new BufferedWriter(new FileWriter(vArchivo))) {
                vBW.write(vCadena);
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error " + e.getMessage());
        }
    }       
    
}

