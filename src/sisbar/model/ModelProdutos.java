/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// alter + inser gerar codigo get e set e hascode
package sisbar.model;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author coreo
 */
@Entity

@NamedQueries({
    @NamedQuery(name = "produto.todos", query = "SELECT P FROM ModelProdutos p"
    
    )

})


@Table(name = "produtos")
public  class ModelProdutos implements Serializable {

   //   private  ArrayList<ModelProdutos> listaProd = new ArrayList<>();
          
       public ModelProdutos() {
    }
       
    
    public ModelProdutos(String descricao, String  grupo) {
        
        setDescricao(descricao);
        setGrupo(grupo);
            
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id_produtos;
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
        final ModelProdutos other = (ModelProdutos) obj;
        return this.id_produtos == other.id_produtos;
    }
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_produtos")
    private int id_produtos;
   
    @Column(name = "descricao", nullable = true ,length = 100)
    private String descricao;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Column(name = "unid_medida", nullable = true, length = 20)
    private String unid_medida;
   
    @Column(name = "preco_venda")
    private double preco_venda;
    
    @Column(name = "qde")
    private double qde;
    
    @Column(name= "grupo", nullable = true, length = 30)
    private String grupo;
    
    public String getDescricao() {
        return descricao;
    }

    public int getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(int id_produtos) {
        this.id_produtos = id_produtos;
    }

    public String getUnid_medida() {
        return unid_medida;
    }

    public void setUnid_medida(String unid_medida) {
        this.unid_medida = unid_medida;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public double getQde() {
        return qde;
    }

    public void setQde(double qde) {
        this.qde = qde;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    
    
}
