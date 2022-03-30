/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.awt.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;
import static sisbar.model.ModelClientes_.nome;
import sisbar.model.ModelProdutos;
import sisbar.view.Clientes;


public class ClientesController {
    
   private ArrayList<ModelClientes> listacli = new ArrayList<ModelClientes>();
   
   public ClientesController(){
      
       getListaCli();
       
   }     
    public void carregartela(){
        
       EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        
        ModelClientes mod = new ModelClientes();
       
    }
    public void inserir(ModelClientes cli){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(cli);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void excluir(int codigo){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        
        ModelClientes cli = gerente.find(ModelClientes.class, codigo);
        
                
        if (cli != null){
            gerente.getTransaction().begin();
            gerente.remove(cli);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "aqui");
        }
        gerente.close();
    }
    
    public void alterarCliente(ModelClientes cli){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(cli);
        gerente.getTransaction().commit();
        gerente.close();
        
    }
    
    public ModelClientes pesquisaCliente(int codigo){
        
        ModelClientes cli;
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        
        cli = gerente.find(ModelClientes.class, codigo);
        gerente.close();
        return cli;
        
    }

 public java.util.List<ModelClientes> getListaCli() {
     
         
        
         EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
         
        
        TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.todos",  ModelClientes.class);
          
        // return listaProd;
        return consulta.getResultList();
    }
    
}
