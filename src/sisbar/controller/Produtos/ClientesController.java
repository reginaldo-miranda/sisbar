/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.DAO.GenericoDao;
import sisbar.model.ModelClientes;
//import static sisbar.model.ModelClientes_.nome;
import sisbar.model.ModelProdutos;
import sisbar.view.Clientes;
import net.proteanit.sql.DbUtils;

public class ClientesController extends GenericoDao<ModelClientes> {

    private ArrayList<ModelClientes> listacli = new ArrayList<ModelClientes>();
    ModelClientes mod = new ModelClientes();

    public ClientesController() {

        getListaCli();

    }

    /* este metodo esta bom
    public void inserir(ModelClientes cli){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(cli);
        gerente.getTransaction().commit();
        gerente.close();
    }
     

    public void inserir(ModelClientes cli) { // teste de metodo

        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();

        //   if (cli != null ){
        if (cli.getId_clientes() > 0) {
            gerente.merge(cli);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } else {

            gerente.persist(cli);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            gerente.close();
           
        }
        getListaCli();
    }

    public void excluir(int codigo) {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        ModelClientes cli = gerente.find(ModelClientes.class, codigo);

        if (cli != null) {
            gerente.getTransaction().begin();
            gerente.remove(cli);
            gerente.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "aqui");
        }
        gerente.close();
    }

    public void alterarCliente(ModelClientes cli) {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        gerente.getTransaction().begin();

        gerente.merge(cli);
        gerente.getTransaction().commit();
        gerente.close();

    }

    public ModelClientes pesquisaCliente(int codigo) {

        ModelClientes cli;
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        cli = gerente.find(ModelClientes.class, codigo);
        gerente.close();
        return cli;

    }
*/
    public java.util.List<ModelClientes> getListaCli() {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.todos", ModelClientes.class);

        // return listaProd;
        return consulta.getResultList();
    }
    
    public java.util.List<ModelClientes> pesquisarCli(String nome){
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.porNome", ModelClientes.class);

        // return listaProd;
        return consulta.getResultList();
        
    }

   
}
