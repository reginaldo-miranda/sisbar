package sisbar.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(name = "produtopdv.todos", query = "SELECT P FROM MoVendaItens p"
    )

})

@Entity
public class ModelPdvItens implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pdvItens")
    private int idPdv;

    @Column(name = "qde")
    private Double qtde;

    @Column(name = ("preco_venda"))
    private Double preco;

    private Double precoTotal;

    @ManyToOne
    private ModelPdv pdv;

    @ManyToOne
    private ModelProdutos produtos;
    
    @ManyToOne
    private MoVenda movenda;
    
    @ManyToOne
    private ModelPdvItens pdvItens;

    public ModelPdvItens() {

    }

    /*
   public ModelPdvItens(Double qtde, Double preco, ModelPdv pdv, ModelProdutos produtos) {
        this.setQtde(qtde);
        this.setPdv(pdv);
        this.setProdutos(produtos);
    }  
     */

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.idPdv;
        hash = 13 * hash + Objects.hashCode(this.pdv);
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
        final ModelPdvItens other = (ModelPdvItens) obj;
        if (this.idPdv != other.idPdv) {
            return false;
        }
        if (!Objects.equals(this.pdv, other.pdv)) {
            return false;
        }
        return Objects.equals(this.produtos, other.produtos);
    }

    public void setProdutos(ModelPdvItens produtosItens) {
        this.produtos = produtos;
        if (produtos != null && this.getPreco() == null) {
            this.setPreco(produtos.getPreco_venda());
        }
    }

    public int getIdPdv() {
        return idPdv;
    }

    public void setIdPdv(int idPdv) {
        this.idPdv = idPdv;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public ModelPdv getPdv() {
        return pdv;
    }

    public void setPdv(ModelPdv pdv) {
        this.pdv = pdv;
    }

    public ModelProdutos getProdutos() {
        return produtos;
    }

    /**
     * @return the pdvItens
     */
    public ModelPdvItens getPdvItens() {
        return pdvItens;
    }

    /**
     * @param pdvItens the pdvItens to set
     */
    public void setPdvItens(ModelPdvItens pdvItens) {
        this.pdvItens = pdvItens;
    }

}
