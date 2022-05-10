/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sisbar.DAO.exceptions.NonexistentEntityException;
import sisbar.model.ModelPdv;

/**
 *
 * @author suporte11-pc
 */
public class PdvController implements Serializable {

    public PdvController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ModelPdv modelPdv) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(modelPdv);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ModelPdv modelPdv) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            modelPdv = em.merge(modelPdv);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = modelPdv.getIdPdv();
                if (findModelPdv(id) == null) {
                    throw new NonexistentEntityException("The modelPdv with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ModelPdv modelPdv;
            try {
                modelPdv = em.getReference(ModelPdv.class, id);
                modelPdv.getIdPdv();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The modelPdv with id " + id + " no longer exists.", enfe);
            }
            em.remove(modelPdv);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ModelPdv> findModelPdvEntities() {
        return findModelPdvEntities(true, -1, -1);
    }

    public List<ModelPdv> findModelPdvEntities(int maxResults, int firstResult) {
        return findModelPdvEntities(false, maxResults, firstResult);
    }

    private List<ModelPdv> findModelPdvEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ModelPdv.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ModelPdv findModelPdv(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ModelPdv.class, id);
        } finally {
            em.close();
        }
    }

    public int getModelPdvCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ModelPdv> rt = cq.from(ModelPdv.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
