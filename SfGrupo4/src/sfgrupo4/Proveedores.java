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
@Table(name = "PROVEEDORES", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findByIdproveedor", query = "SELECT p FROM Proveedores p WHERE p.idproveedor = :idproveedor")
    , @NamedQuery(name = "Proveedores.findByNombreproveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreproveedor = :nombreproveedor")
    , @NamedQuery(name = "Proveedores.findByApellidosproveedor", query = "SELECT p FROM Proveedores p WHERE p.apellidosproveedor = :apellidosproveedor")
    , @NamedQuery(name = "Proveedores.findByTelefonoproveedor", query = "SELECT p FROM Proveedores p WHERE p.telefonoproveedor = :telefonoproveedor")})
public class Proveedores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPROVEEDOR")
    private String idproveedor;
    @Column(name = "NOMBREPROVEEDOR")
    private String nombreproveedor;
    @Column(name = "APELLIDOSPROVEEDOR")
    private String apellidosproveedor;
    @Column(name = "TELEFONOPROVEEDOR")
    private Long telefonoproveedor;

    public Proveedores() {
    }

    public Proveedores(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        String oldIdproveedor = this.idproveedor;
        this.idproveedor = idproveedor;
        changeSupport.firePropertyChange("idproveedor", oldIdproveedor, idproveedor);
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        String oldNombreproveedor = this.nombreproveedor;
        this.nombreproveedor = nombreproveedor;
        changeSupport.firePropertyChange("nombreproveedor", oldNombreproveedor, nombreproveedor);
    }

    public String getApellidosproveedor() {
        return apellidosproveedor;
    }

    public void setApellidosproveedor(String apellidosproveedor) {
        String oldApellidosproveedor = this.apellidosproveedor;
        this.apellidosproveedor = apellidosproveedor;
        changeSupport.firePropertyChange("apellidosproveedor", oldApellidosproveedor, apellidosproveedor);
    }

    public Long getTelefonoproveedor() {
        return telefonoproveedor;
    }

    public void setTelefonoproveedor(Long telefonoproveedor) {
        Long oldTelefonoproveedor = this.telefonoproveedor;
        this.telefonoproveedor = telefonoproveedor;
        changeSupport.firePropertyChange("telefonoproveedor", oldTelefonoproveedor, telefonoproveedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedor != null ? idproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idproveedor == null && other.idproveedor != null) || (this.idproveedor != null && !this.idproveedor.equals(other.idproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Proveedores[ idproveedor=" + idproveedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
