/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;
import sisbar.model.ModelPdvItens;


public class PdvItensController {
    
    private ArrayList<ModelPdvItens> listacli = new ArrayList<>();

    ModelPdvItens mod = new ModelPdvItens();

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
    
    
    
}
