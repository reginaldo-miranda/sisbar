package sisbar.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pdv")
@NamedQueries({
    @NamedQuery(name = "ModelPdv.findAll", query = "SELECT m FROM ModelPdv m"),
    @NamedQuery(name = "ModelPdv.findByIdPdv", query = "SELECT m FROM ModelPdv m WHERE m.idPdv = :idPdv"),
    @NamedQuery(name = "ModelPdv.findByNomeCliente", query = "SELECT m FROM ModelPdv m WHERE m.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "ModelPdv.findByTotalPdv", query = "SELECT m FROM ModelPdv m WHERE m.totalPdv = :totalPdv"),
    @NamedQuery(name = "ModelPdv.findByData", query = "SELECT m FROM ModelPdv m WHERE m.data = :data")})
public class ModelPdv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pdv")
    private Integer idPdv;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_pdv")
    private Double totalPdv;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public ModelPdv() {
    }

    public ModelPdv(Integer idPdv) {
        this.idPdv = idPdv;
    }

    public Integer getIdPdv() {
        return idPdv;
    }

    public void setIdPdv(Integer idPdv) {
        this.idPdv = idPdv;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getTotalPdv() {
        return totalPdv;
    }

    public void setTotalPdv(Double totalPdv) {
        this.totalPdv = totalPdv;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPdv != null ? idPdv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ModelPdv)) {
            return false;
        }
        ModelPdv other = (ModelPdv) object;
        if ((this.idPdv == null && other.idPdv != null) || (this.idPdv != null && !this.idPdv.equals(other.idPdv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisbar.model.ModelPdv[ idPdv=" + idPdv + " ]";
    }

}
