/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.swing.JTextField;

@Entity
@NamedQueries({
    @NamedQuery(name = "clientes.todos",
                query = "SELECT cli FROM ModelClientes cli"
    ),
    @NamedQuery(name = "clientes.porNome",
             query = "SELECT cli FROM ModelClientes cli WHERE cli.nome LIKE :nomeprocurar" 
    ),
    
     //  @NamedQuery(name = "clientes.fone",
     //  query = "SELECT cli FROM ModelClientes cli WHERE cli.fone LIKE :fomeprocurar"
     // ),
    @NamedQuery(name = "clientes.porFone",
            query = "SELECT CLI FROM ModelClientes cli where cli LIKE :foneprocurar"
            )
}

)
@Table(name = "Clientes")

public class ModelClientes implements Serializable{
    
    public ModelClientes(){
        
    }
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_clientes")
    private int id_clientes;
    
    @Column(name = "nome",nullable = false, length = 80)
    private String nome;    
    
    @Column(name = "fone", length = 40)
    private String fone;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id_clientes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelClientes other = (ModelClientes) obj;
        return this.id_clientes == other.id_clientes;
    }

    /**
     * @return the id_clientes
     */
    public int getId_clientes() {
        return id_clientes;
    }

    /**
     * @param id_clientes the id_clientes to set
     */
    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sisbarPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

  /*  public void setId_clientes(JTextField jTextFieldId_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
