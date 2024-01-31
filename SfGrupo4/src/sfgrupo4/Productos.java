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
@Table(name = "PRODUCTOS", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdproducto", query = "SELECT p FROM Productos p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Productos.findByNombreproducto", query = "SELECT p FROM Productos p WHERE p.nombreproducto = :nombreproducto")
    , @NamedQuery(name = "Productos.findByIdproveedor", query = "SELECT p FROM Productos p WHERE p.idproveedor = :idproveedor")
    , @NamedQuery(name = "Productos.findByIdcategoria", query = "SELECT p FROM Productos p WHERE p.idcategoria = :idcategoria")
    , @NamedQuery(name = "Productos.findByCantidad", query = "SELECT p FROM Productos p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Productos.findByPrecios", query = "SELECT p FROM Productos p WHERE p.precios = :precios")})
public class Productos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPRODUCTO")
    private String idproducto;
    @Column(name = "NOMBREPRODUCTO")
    private String nombreproducto;
    @Column(name = "IDPROVEEDOR")
    private String idproveedor;
    @Column(name = "IDCATEGORIA")
    private String idcategoria;
    @Column(name = "CANTIDAD")
    private String cantidad;
    @Column(name = "PRECIOS")
    private String precios;

    public Productos() {
    }

    public Productos(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        String oldIdproducto = this.idproducto;
        this.idproducto = idproducto;
        changeSupport.firePropertyChange("idproducto", oldIdproducto, idproducto);
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        String oldNombreproducto = this.nombreproducto;
        this.nombreproducto = nombreproducto;
        changeSupport.firePropertyChange("nombreproducto", oldNombreproducto, nombreproducto);
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        String oldIdproveedor = this.idproveedor;
        this.idproveedor = idproveedor;
        changeSupport.firePropertyChange("idproveedor", oldIdproveedor, idproveedor);
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        String oldIdcategoria = this.idcategoria;
        this.idcategoria = idcategoria;
        changeSupport.firePropertyChange("idcategoria", oldIdcategoria, idcategoria);
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        String oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        String oldPrecios = this.precios;
        this.precios = precios;
        changeSupport.firePropertyChange("precios", oldPrecios, precios);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Productos[ idproducto=" + idproducto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
