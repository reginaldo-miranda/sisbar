/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.exceptions.PersistenceUnitLoadingException;

/**
 *
 * @author Reginaldo
 */
public class FabricaGerenciadorEntidades {
    private static EntityManagerFactory emf;
    
    public static  EntityManager getGerente(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("sisbarPU");
        }
        return emf.createEntityManager();
    }
    
}
