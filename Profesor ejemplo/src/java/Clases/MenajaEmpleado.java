
package Clases;

import java.util.Scanner;

public class MenajaEmpleado {
    public static void main (String[] args)
    {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el Id");
            int id = entrada.nextInt();
            System.out.println("Introduzca el Nombre");
            String nombre = entrada.next();
            System.out.println("Introduzca el direccion");
            String direccion = entrada.next();
            double salario = 50000.0;
            
            Empleado emple = new Empleado();
            emple.setId(id);
            emple.setNombre(nombre);
            emple.setDireccion(direccion);
            emple.setsalario(salario);
            
            Empleado emp2 = new Empleado(id+1, nombre, direccion, salario);
            
            System.out.println("Empleado 1:");
            System.out.println("id: "+ emple.getId());
            System.out.println("Nombre:"+ emple.getNombre());
            System.out.println("Empleado 2");
            System.out.println("id: "+ emp2.getId());
            System.out.println ("Nombre: "+ emp2.getNombre());
            System.out.println ("Salario: "+ emp2.getsalario());
            
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. " + e.getMessage());
        }
 
    }
}
