
package sisbar.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = "produtopdv1.todos", query = "SELECT P FROM MoVendaItens p"
    
    )

})

@Entity
@Table(name = "vendaitens")
public class MoVendaItens implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "quantidade", nullable = false)
    private Double quantidade;
    @Column(name = "valorUnitario")
    private Double valorUnitario;
    @Column(name = "valorTotal")
    private Double valorTotal;
    @ManyToOne
    @JoinColumn(name = "venda", referencedColumnName = "id" )
    private MoVenda venda;
    @ManyToOne
    @JoinColumn(name = "produtos" , referencedColumnName = "id_produtos")
    private ModelProdutos produtos;

    public MoVendaItens() {
    }

 
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the quantidade
     */
    public Double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public Double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the venda
     */
    public MoVenda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(MoVenda venda) {
        this.venda = venda;
    }

    /**
     * @return the produtos
     */
    public ModelProdutos getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(ModelProdutos produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MoVendaItens other = (MoVendaItens) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
