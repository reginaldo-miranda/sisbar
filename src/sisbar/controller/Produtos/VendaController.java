package sisbar.controller.Produtos;

import java.io.Serializable;
import java.util.Calendar;
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
import sisbar.model.MoVendaItens;
import static sisbar.model.MoVendaItens_.venda;
import sisbar.model.ModelClientes;
import sisbar.model.ModelProdutos;

public class VendaController implements Serializable {

    private String receber, receberProd, receberPreco = null;
    private Integer id_prod;

    public List<MoVenda> listaVendas() {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        TypedQuery<MoVenda> consulta = (TypedQuery<MoVenda>) gerente.createNamedQuery("itensdaVenda", MoVenda.class);

        return consulta.getResultList();

    }

    public void gravarVenda() {

    }

}
