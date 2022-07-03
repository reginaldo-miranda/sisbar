package sisbar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.annotations.Noncacheable;
import sisbar.DAO.FabricaGerenciadorEntidades;

@NamedQueries({
    @NamedQuery(name = "vendas.todos", query = "SELECT P FROM MoVenda p"
    ),
    @NamedQuery(name = "vendasclientes", query = "SELECT v FROM MoVenda v join v.moclientes c")

})

@Entity
@Table(name = "venda")

public class MoVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Calendar data;
    @Column(name = "valorTotal", nullable = false)// columnDefinition = "decimal(12,2)")
    private Double valorTotal;

    @Column(name = "parcelas", nullable = false)
    private Integer parcelas;

    @ManyToOne
    @JoinColumn(name = "Clientes", referencedColumnName = "id_clientes")
    private ModelClientes moclientes;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<MoVendaItens> itens = new ArrayList<>();

    public MoVenda() {
        this.valorTotal = 0.0;
        moclientes = new ModelClientes();

    }

    public void adicionarItens(MoVendaItens obj) {
        obj.setVenda(this);
        this.valorTotal += obj.getValorTotal();
        this.itens.add(obj);

    }

    public void removerItens(int index) {
        MoVendaItens obj = this.itens.get(index);
        this.valorTotal = obj.getValorTotal();
        this.itens.remove(index);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public ModelClientes getMoclientes() {

        return moclientes;
    }

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

    public List<MoVendaItens> getItens() {
        return itens;
    }

    public void setItens(List<MoVendaItens> itens) {
        this.itens = itens;
    }

}
