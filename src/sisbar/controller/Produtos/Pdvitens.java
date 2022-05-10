/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

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

/**
 *
 * @author suporte11-pc
 */
@Entity
@Table(name = "pdvitens")
@NamedQueries({
    @NamedQuery(name = "Pdvitens.findAll", query = "SELECT p FROM Pdvitens p"),
    @NamedQuery(name = "Pdvitens.findByIdpdvItens", query = "SELECT p FROM Pdvitens p WHERE p.idpdvItens = :idpdvItens"),
    @NamedQuery(name = "Pdvitens.findByIdCliente", query = "SELECT p FROM Pdvitens p WHERE p.idCliente = :idCliente"),
    @NamedQuery(name = "Pdvitens.findByIdProdutos", query = "SELECT p FROM Pdvitens p WHERE p.idProdutos = :idProdutos"),
    @NamedQuery(name = "Pdvitens.findByQde", query = "SELECT p FROM Pdvitens p WHERE p.qde = :qde"),
    @NamedQuery(name = "Pdvitens.findByPrecoVenda", query = "SELECT p FROM Pdvitens p WHERE p.precoVenda = :precoVenda"),
    @NamedQuery(name = "Pdvitens.findByPrecoTotal", query = "SELECT p FROM Pdvitens p WHERE p.precoTotal = :precoTotal"),
    @NamedQuery(name = "Pdvitens.findByData", query = "SELECT p FROM Pdvitens p WHERE p.data = :data")})
public class Pdvitens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pdvItens")
    private Integer idpdvItens;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "id_produtos")
    private Integer idProdutos;
    @Column(name = "qde")
    private Integer qde;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "preco_venda")
    private Double precoVenda;
    @Column(name = "precoTotal")
    private Double precoTotal;
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Pdvitens() {
    }

    public Pdvitens(Integer idpdvItens) {
        this.idpdvItens = idpdvItens;
    }

    public Integer getIdpdvItens() {
        return idpdvItens;
    }

    public void setIdpdvItens(Integer idpdvItens) {
        this.idpdvItens = idpdvItens;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Integer idProdutos) {
        this.idProdutos = idProdutos;
    }

    public Integer getQde() {
        return qde;
    }

    public void setQde(Integer qde) {
        this.qde = qde;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
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
        hash += (idpdvItens != null ? idpdvItens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pdvitens)) {
            return false;
        }
        Pdvitens other = (Pdvitens) object;
        if ((this.idpdvItens == null && other.idpdvItens != null) || (this.idpdvItens != null && !this.idpdvItens.equals(other.idpdvItens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sisbar.controller.Produtos.Pdvitens[ idpdvItens=" + idpdvItens + " ]";
    }
    
}
