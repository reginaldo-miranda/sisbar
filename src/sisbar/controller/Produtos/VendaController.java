package sisbar.controller.Produtos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import sisbar.DAO.EntidadeBase;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.MoVenda;
import sisbar.model.ModelClientes;

@NamedQueries({
    @NamedQuery(name = "vendas.todos",
            query = "SELECT cli FROM MoVenda cli"
    )

})
@Table(name = "vendas")
public class VendaController implements EntidadeBase, Serializable{
    
    public List<MoVenda> listaVendas(){
        
          EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
            TypedQuery<MoVenda> consulta = (TypedQuery<MoVenda>) gerente.createNamedQuery("vendas.todos", MoVenda.class);

        return consulta.getResultList();
     
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
