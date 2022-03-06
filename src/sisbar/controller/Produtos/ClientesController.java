/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import javax.persistence.EntityManager;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;


public class ClientesController {
    
    public void inserir(ModelClientes cli){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(cli);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
}
