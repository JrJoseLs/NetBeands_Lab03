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
@Table(name = "PAGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p")
    , @NamedQuery(name = "Pagos.findByIdpagos", query = "SELECT p FROM Pagos p WHERE p.idpagos = :idpagos")
    , @NamedQuery(name = "Pagos.findByIdcliente", query = "SELECT p FROM Pagos p WHERE p.idcliente = :idcliente")
    , @NamedQuery(name = "Pagos.findByIdempleado", query = "SELECT p FROM Pagos p WHERE p.idempleado = :idempleado")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPAGOS")
    private String idpagos;
    @Column(name = "IDCLIENTE")
    private String idcliente;
    @Column(name = "IDEMPLEADO")
    private String idempleado;

    public Pagos() {
    }

    public Pagos(String idpagos) {
        this.idpagos = idpagos;
    }

    public String getIdpagos() {
        return idpagos;
    }

    public void setIdpagos(String idpagos) {
        this.idpagos = idpagos;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpagos != null ? idpagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.idpagos == null && other.idpagos != null) || (this.idpagos != null && !this.idpagos.equals(other.idpagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sfgrupo4.Pagos[ idpagos=" + idpagos + " ]";
    }
    
}
