/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.awt.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;
import sisbar.view.Clientes;


public class ClientesController {
    
   private ArrayList<ModelClientes> listacli = new ArrayList<ModelClientes>();
   
   public ArrayList<ModelClientes> getListaCliente(){
       
       EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
       
       TypedQuery<ModelClientes> consulta = gerente.createNamedQuery("clinetes.todos", ModelClientes.class);
       
       
       return (ArrayList<ModelClientes>) consulta.getResultList();
       
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

 
    
}
