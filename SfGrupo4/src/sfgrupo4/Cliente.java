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
@Table(name = "CLIENTE", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByClienteid", query = "SELECT c FROM Cliente c WHERE c.clienteid = :clienteid")
    , @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cliente.findByApellidos", query = "SELECT c FROM Cliente c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Cliente.findByTelefono", query = "SELECT c FROM Cliente c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Cliente.findByCorreo", query = "SELECT c FROM Cliente c WHERE c.correo = :correo")})
public class Cliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLIENTEID")
    private String clienteid;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "TELEFONO")
    private Long telefono;
    @Column(name = "CORREO")
    private String correo;

    public Cliente() {
    }

    public Cliente(String clienteid) {
        this.clienteid = clienteid;
    }

    public String getClienteid() {
        return clienteid;
    }

    public void setClienteid(String clienteid) {
        String oldClienteid = this.clienteid;
        this.clienteid = clienteid;
        changeSupport.firePropertyChange("clienteid", oldClienteid, clienteid);
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        Long oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteid != null ? clienteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clienteid == null && other.clienteid != null) || (this.clienteid != null && !this.clienteid.equals(other.clienteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Cliente[ clienteid=" + clienteid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
