
package sisbar.DAO;

import java.security.spec.ECField;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import sisbar.model.ModelClientes;

public class GenericoDao<T extends EntidadeBase>{
    
    EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
    
    public T inserir(T t) { // teste de metodo

        
        
        gerente.getTransaction().begin();

        //   if (cli != null ){
        if (t.getId() != 0) {
            gerente.merge(t);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } else {

            gerente.persist(t);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            gerente.close();
           
        }
        getListaCli();
        return t;
    }

    public void excluir(Class<T> clazz,int codigo) {

      
       T t = gerente.find(clazz , codigo);
        
      
            gerente.getTransaction().begin();
            gerente.remove(t);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "excluido aqui");
        
        gerente.close();
    }

    public void alterarCliente(ModelClientes cli) {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        gerente.getTransaction().begin();

        gerente.merge(cli);
        gerente.getTransaction().commit();
        gerente.close();

    }

    public T pesquisaCliente(Class<T> clazz, int codigo) {

        T t = null;
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        t = gerente.find(clazz, codigo);
        gerente.close();
        return t;

    }

    public java.util.List<ModelClientes> getListaCli() {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.todos", ModelClientes.class);

        // return listaProd;
        return consulta.getResultList();
    }
    
}
