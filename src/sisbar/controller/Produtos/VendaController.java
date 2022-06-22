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

public class VendaController implements Serializable {

    public List<MoVenda> listaVendas() {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        TypedQuery<MoVenda> consulta = (TypedQuery<MoVenda>) gerente.createNamedQuery("vendaeclientes", MoVenda.class);

        return consulta.getResultList();

    }

}
