/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

//import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import sisbar.DAO.FabricaGerenciadorEntidades;
//import sisbar.DAO.GenericoDao;
import sisbar.model.ModelClientes;
import static sisbar.model.ModelClientes_.nome;
//import static sisbar.model.ModelClientes_.nome;
import sisbar.model.ModelProdutos;
import sisbar.view.Clientes;

import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.Table;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.ModelClientes;

//import net.proteanit.sql.DbUtils;
public class ClientesController {

    private ArrayList<ModelClientes> listacli = new ArrayList<ModelClientes>();

    ModelClientes mod = new ModelClientes();

    public ClientesController() {

        //     getListaCli();
    }

    /* este metodo esta bom

    public void inserir(ModelClientes cli){
        
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(cli);
        gerente.getTransaction().commit();
        gerente.close();
    }
     /*
     */
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
        // getListaCli();
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

    public java.util.List<ModelClientes> getListaCli() {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.todos", ModelClientes.class);

        // return listaProd;
        return consulta.getResultList();
    }
    
    public List<ModelClientes> pesquisarCli(String nome) {
       
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        //  TypedQuery<ModelClientes> consulta = (TypedQuery<ModelClientes>) gerente.createNamedQuery("clientes.todos", ModelClientes.class);
        Query query = gerente.createQuery("SELECT cli FROM ModelClientes cli WHERE cli.nome LIKE :nome");
        query.setParameter("nome", "%" + nome + "%");
        List<ModelClientes> lista = query.getResultList();
        return lista;
    }

    public List<ModelClientes> findModelClientesEntities() {
        return findModelClientesEntities();
    }

}

// pesquisa table por vector https://www.youtube.com/watch?v=cBU372RfWDI&t=11s&ab_channel=ConhecendoPrograma%C3%A7%C3%A3o
// https://www.youtube.com/watch?v=jn8wIoqcjjc&ab_channel=RodrigoSPEABT
// rafael sakurai
// https://www.youtube.com/watch?v=DN8Jh-xdejU&list=PLSbRNf-AJDe-EBUYfQGf1UB94ZxFeTjgc&index=8 
