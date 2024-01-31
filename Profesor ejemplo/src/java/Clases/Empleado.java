package Clases;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

public class Empleado {
        private int Id;
        private string Nombre;
        private string direccion;
        private string salario;

    public Empleado(int Id, string Nombre, string direccion, string Categoria) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.direccion = direccion;
        this.salario = Categoria;
    }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Empleado(int i, String nombre, String direccion, double salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public string getNombre() {
        return Nombre;
    }

    public void setNombre(string Nombre) {
        this.Nombre = Nombre;
    }

    public string getDireccion() {
        return direccion;
    }

    public void setDireccion(string direccion) {
        this.direccion = direccion;
    }

    public string getsalario() {
        return salario;
    }

    public void setsalario(string salario) {
        this.salario = salario;
    }

    void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDireccion(String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
