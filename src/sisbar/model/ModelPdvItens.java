package sisbar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ModelPdvItens {

    public ModelPdvItens(Double qtde, Double preco, ModelPdv pdv, ModelProdutos produtos) {
        this.setQtde(qtde);
        this.setPdv(pdv);
        this.setProdutos(produtos);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPdv;
    private Double qtde;
    private Double preco;
    
    @ManyToOne
    private ModelPdv pdv;
    
    @ManyToOne
    private ModelProdutos produtos;

  private ModelPdvItens(){
      
  }
  
  
    public int getIdPdv() {
        return idPdv;
    }

    /**
     * @param idPdv the idPdv to set
     */
    public void setIdPdv(int idPdv) {
        this.idPdv = idPdv;
    }

    /**
     * @return the qtde
     */
    public Double getQtde() {
        return qtde;
    }

    /**
     * @param qtde the qtde to set
     */
    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the pdv
     */
    public ModelPdv getPdv() {
        return pdv;
    }

    /**
     * @param pdv the pdv to set
     */
    public void setPdv(ModelPdv pdv) {
        this.pdv = pdv;
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
        if(produtos != null && this.preco == null){
            this.setPreco(produtos.getPreco_venda());
        }
    }
    
    
    
}
