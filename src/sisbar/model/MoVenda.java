
package sisbar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@NamedQueries({
    @NamedQuery(name = "vendas.todos", query = "SELECT P FROM MoVenda p"
    
    ),
    @NamedQuery(name = "vendaeclientes", query = "SELECT v FROM MoVenda v")// join v.MOdelClientes c")

})

@Entity
@Table(name = "vendas")
        
public class MoVenda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data" , nullable = false)
    private Calendar data;
    @Column(name= "valorTotal", nullable = false )// columnDefinition = "decimal(12,2)")
    private Double valorTotal;
    @Column(name = "parcelas" , nullable = false)
    private Integer parcelas;
  //  @Column(name = "Clientes")
  //  private Integer Clientes;
    @ManyToOne
    @JoinColumn(name = "Clientes", referencedColumnName = "id_clientes")
    private ModelClientes moclientes;
    
    @OneToMany(mappedBy = "venda" , cascade = CascadeType.ALL , orphanRemoval = false, fetch = FetchType.LAZY)
    private List<MoVendaItens> itens = new ArrayList<>();

    public MoVenda() {
        this.valorTotal = 0.0;
    }

    public void adicionarItens(MoVendaItens obj){
        obj.setVenda(this);
        this.valorTotal += obj.getValorTotal();
        this.itens.add(obj);
        
    }
    public void removerItens(int index){
          MoVendaItens obj = this.itens.get(index);
          this.valorTotal = obj.getValorTotal();
          this.itens.remove(index);
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
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
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
     * @return the parcelas
     */
    public Integer getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    /**
     * @return the moclientes
     */
    public ModelClientes getMoclientes() {
        
        return moclientes;
    }

    /**
     * @param moclientes the moclientes to set
     */
    public void setMoclientes(ModelClientes moclientes) {
        this.moclientes = moclientes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final MoVenda other = (MoVenda) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * @return the itens
     */
    public List<MoVendaItens> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<MoVendaItens> itens) {
        this.itens = itens;
    }
/*
    public void setMoclientes(Integer receb_id_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/
}

