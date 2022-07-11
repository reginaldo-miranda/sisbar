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
import sisbar.model.MoVenda;
import sisbar.model.MoVendaItens;
import static sisbar.model.MoVendaItens_.id;
import static sisbar.model.MoVendaItens_.venda;
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
        
           
    public List<MoVendaItens> listaVendaId(int v){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        MoVendaItens vi = gerente.find(MoVendaItens.class, v);
        if(vi == null){
            System.out.println("nao achei nemhuma venda");
        }else{
            List<MoVendaItens> lista = new ArrayList<>();
            lista.add(vi);
            
            for(MoVendaItens vend : lista){
            System.out.println("a numero da venda é "+ vi.getId());
            }
        }
        
      //  TypedQuery<MoVendaItens> covendid = (TypedQuery<MoVendaItens>) gerente.createNamedQuery("itensdaVenda", MoVendaItens.class);
     ///   covendid.setParameter(v, venda);
        
        return null;
    }
    
     public MoVendaItens pesquisaVendaItens(int codigo) {

        MoVendaItens veIt;
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        veIt = gerente.find(MoVendaItens.class, codigo);
        gerente.close();
        return veIt;

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
