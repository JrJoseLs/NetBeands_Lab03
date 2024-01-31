/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfgrupo4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author junio
 */
@Entity
@Table(name = "EMPLEADOS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByIdempleado", query = "SELECT e FROM Empleados e WHERE e.idempleado = :idempleado")
    , @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleados.findByApellidos", query = "SELECT e FROM Empleados e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empleados.findByCargo", query = "SELECT e FROM Empleados e WHERE e.cargo = :cargo")
    , @NamedQuery(name = "Empleados.findByDireccion", query = "SELECT e FROM Empleados e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empleados.findByTelefono", query = "SELECT e FROM Empleados e WHERE e.telefono = :telefono")})
public class Empleados implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMPLEADO")
    private String idempleado;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private Long telefono;

    public Empleados() {
    }

    public Empleados(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        String oldIdempleado = this.idempleado;
        this.idempleado = idempleado;
        changeSupport.firePropertyChange("idempleado", oldIdempleado, idempleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        changeSupport.firePropertyChange("cargo", oldCargo, cargo);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        Long oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Empleados[ idempleado=" + idempleado + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
