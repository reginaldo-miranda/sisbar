
package sisbar.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDao {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sisbarPU");
        return factory.createEntityManager();
    }
    public  ClienteDao salvar(ClienteDao clientedao) {
        EntityManager em = getEM();
        
        try {
              em.getTransaction().begin();
              em.persist(clientedao);
              em.getTransaction();
        } catch (Exception e) {
              em.getTransaction().rollback();
        }finally{
            em.close();
        }
      
        return clientedao;
    }
}
