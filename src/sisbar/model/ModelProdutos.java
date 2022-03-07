/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// alter + inser gerar codigo get e set e hascode
package sisbar.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author coreo
 */
@Entity
@Table(name = "produtos")
public class ModelProdutos implements Serializable {

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
   
    @Column(name = "descricao", length = 100)
    private String descricao;
    
    @Column(name = "unid_medida", length = 20)
    private String unid_medida;
   
    @Column(name = "preco_venda")
    private double preco_venda;
    
    @Column(name = "qde")
    private double qde;
    
    @Column(name= "grupo", length = 30)
    private String grupo;
    
/*  id-produtos INT PRIMARY KEY AUTO_INCREMENT,
  descricao VARCHAR(100),
  unid_medida VARCHAR(20),
  preco_venda DOUBLE,
  qde DOUBLE,
  grupo VARCHAR(30) */

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the id_produtos
     */
    public int getId_produtos() {
        return id_produtos;
    }

    /**
     * @param id_produtos the id_produtos to set
     */
    public void setId_produtos(int id_produtos) {
        this.id_produtos = id_produtos;
    }

    /**
     * @return the unid_medida
     */
    public String getUnid_medida() {
        return unid_medida;
    }

    /**
     * @param unid_medida the unid_medida to set
     */
    public void setUnid_medida(String unid_medida) {
        this.unid_medida = unid_medida;
    }

    /**
     * @return the preco_venda
     */
    public double getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the qde
     */
    public double getQde() {
        return qde;
    }

    /**
     * @param qde the qde to set
     */
    public void setQde(double qde) {
        this.qde = qde;
    }
    
    
    
    
}
