/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;

import com.sun.jdi.connect.spi.Connection;
import com.mysql.jdbc.Statement;
import sisbar.DAO.conexaobanco;

/**
 *
 * @author suporte11-pc
 */
public class ProdutosController {
    
   conexaobanco cn = new conexaobanco();
  
   
     private String descricao;
     private float precounit;
     private float qde;
     private String unidade;
     private String grupo;
   
     String sql = "INSERT INTO produtos (descricao,precounit,qde,unidade,grupo) VALUES (?,?,?,?,?)";
 
               
    
}
