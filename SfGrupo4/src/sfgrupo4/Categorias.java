/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfgrupo4;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author junio
 */
@Entity
@Table(name = "CATEGORIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorias.findAll", query = "SELECT c FROM Categorias c")
    , @NamedQuery(name = "Categorias.findByIdcategoria", query = "SELECT c FROM Categorias c WHERE c.idcategoria = :idcategoria")
    , @NamedQuery(name = "Categorias.findByNombrecategoria", query = "SELECT c FROM Categorias c WHERE c.nombrecategoria = :nombrecategoria")
    , @NamedQuery(name = "Categorias.findByDescripcion", query = "SELECT c FROM Categorias c WHERE c.descripcion = :descripcion")})
public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCATEGORIA")
    private String idcategoria;
    @Column(name = "NOMBRECATEGORIA")
    private String nombrecategoria;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Categorias() {
    }

    public Categorias(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoria != null ? idcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias)) {
            return false;
        }
        Categorias other = (Categorias) object;
        if ((this.idcategoria == null && other.idcategoria != null) || (this.idcategoria != null && !this.idcategoria.equals(other.idcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Categorias[ idcategoria=" + idcategoria + " ]";
    }
    
}
