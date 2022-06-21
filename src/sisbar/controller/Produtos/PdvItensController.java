/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.MoVendaItens;
import sisbar.model.ModelClientes;
import sisbar.model.ModelPdvItens;
import sisbar.model.ModelProdutos;


public class PdvItensController {
    
    private ArrayList<ModelPdvItens> listacli = new ArrayList<>();

    private ModelPdvItens mod = new ModelPdvItens();

    public PdvItensController() {

    }
    
    public void inseir(ModelPdvItens pdvitens){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();

        if (pdvitens.getIdPdv()> 0) {
            gerente.merge(pdvitens);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } else {

            gerente.persist(pdvitens);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            gerente.close();

        }
    }
        public List<MoVendaItens> getListaPdv() {
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<MoVendaItens> consulta = gerente.createNamedQuery("produtopdv.todos", MoVendaItens.class);

        // return listaProd;
        return consulta.getResultList();
    }

    /**
     * @return the listacli
     */
    public ArrayList<ModelPdvItens> getListacli() {
        return listacli;
    }

    /**
     * @param listacli the listacli to set
     */
    public void setListacli(ArrayList<ModelPdvItens> listacli) {
        this.listacli = listacli;
    }

    /**
     * @return the mod
     */
    public ModelPdvItens getMod() {
        return mod;
    }

    /**
     * @param mod the mod to set
     */
    public void setMod(ModelPdvItens mod) {
        this.mod = mod;
    }

    /**
     * @return the mod
     */
 
    
    
}
