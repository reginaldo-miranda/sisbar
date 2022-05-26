
package sisbar.controller.Produtos;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelGrupo;
import sisbar.model.ModelProdutos;


public class GrupoController {

    public GrupoController() {
        
    }
    
    public void cadastrar(ModelGrupo grup) {
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(grup);
        gerente.getTransaction().commit();
        gerente.close();
        
    }
    
       
    public java.util.List<ModelGrupo> getListaGrupo() {
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelGrupo> consulta = (TypedQuery<ModelGrupo>) gerente.createNamedQuery("grupo.todos", ModelGrupo.class);

        // return listaProd;
        return consulta.getResultList();
    }
}
