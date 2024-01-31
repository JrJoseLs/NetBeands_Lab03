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
@Table(name = "CARGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c")
    , @NamedQuery(name = "Cargos.findByIdcargos", query = "SELECT c FROM Cargos c WHERE c.idcargos = :idcargos")
    , @NamedQuery(name = "Cargos.findByNombrecargos", query = "SELECT c FROM Cargos c WHERE c.nombrecargos = :nombrecargos")})
public class Cargos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCARGOS")
    private String idcargos;
    @Column(name = "NOMBRECARGOS")
    private String nombrecargos;

    public Cargos() {
    }

    public Cargos(String idcargos) {
        this.idcargos = idcargos;
    }

    public String getIdcargos() {
        return idcargos;
    }

    public void setIdcargos(String idcargos) {
        this.idcargos = idcargos;
    }

    public String getNombrecargos() {
        return nombrecargos;
    }

    public void setNombrecargos(String nombrecargos) {
        this.nombrecargos = nombrecargos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargos != null ? idcargos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.idcargos == null && other.idcargos != null) || (this.idcargos != null && !this.idcargos.equals(other.idcargos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Cargos[ idcargos=" + idcargos + " ]";
    }
    
}
