/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.model.MoVenda;
import sisbar.model.MoVendaItens;
import sisbar.model.ModelClientes;
import sisbar.model.ModelProdutos;

/**
 *
 * @author suporte11-pc
 */

public class testeVenda {

    public testeVenda() {
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
       
        ModelProdutos p = gerente.find(ModelProdutos.class, 2);
        ModelClientes c = gerente.find(ModelClientes.class, 2);
        MoVenda v = new MoVenda();
        v.setData(Calendar.getInstance());
        v.setParcelas(3);
        v.setMoclientes(c);
        MoVendaItens v1 = new MoVendaItens();
        v1.setProdutos(p);
        v1.setQuantidade(5.0);
        v1.setValorUnitario(p.getPreco_venda());
        v1.setValorTotal(v1.getQuantidade() * v1.getValorUnitario());
        v.adicionarItens(v1);
        gerente.getTransaction().begin();
        gerente.persist(v);
        gerente.getTransaction().commit();
        gerente.close();

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
