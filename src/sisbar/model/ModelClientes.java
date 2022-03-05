/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.model;


public class ModelClientes {
    
    private int id_clientes;
    private String nome;    
    private String fone;

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
}
