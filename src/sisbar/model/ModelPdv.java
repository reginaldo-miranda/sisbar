/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "pdv")
public class ModelPdv {
    
    
    private int id_pdv; // INT not null PRIMARY KEY AUTO_INCREMENT,
    private String nomeCliente; // varchar(100),
    private Double total_pdv; // double,

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_pdv")
    public int getId_pdv() {
        return id_pdv;
    }

    public void setId_pdv(int id_pdv) {
        this.id_pdv = id_pdv;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getTotal_pdv() {
        return total_pdv;
    }

    public void setTotal_pdv(Double total_pdv) {
        this.total_pdv = total_pdv;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    private Date data; // datetime

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id_pdv;
        hash = 71 * hash + Objects.hashCode(this.nomeCliente);
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
        final ModelPdv other = (ModelPdv) obj;
        if (this.id_pdv != other.id_pdv) {
            return false;
        }
        return Objects.equals(this.nomeCliente, other.nomeCliente);
    }
    
    
    
}
