/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.util.List;
import javax.persistence.EntityManager;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;
import sisbar.model.ModelPdv;

/**
 *
 * @author suporte11-pc
 */
public class PdvController {
    
    public PdvController(){
        
    }
    
    public void inseir(ModelPdv pdv){
          
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
    }
    
   
}
