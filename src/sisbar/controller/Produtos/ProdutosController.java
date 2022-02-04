/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisbar.controller.Produtos;
import sisbar.DAO.Conectar;
import sisbar.model.ModelProdutos;
import com.sun.jdi.connect.spi.Connection;
import sisbar.view.produtos;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutosController {
    
   public void cadastrar(ModelProdutos prod) {
     Connection con = Conectar.getConectar();
   
     String sql = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
     try(PreparedStatement stm = prepareStatement(sql)){
         stm.setString(1, prod.getDescricao());
         stm.setString(2, prod.getGrupo());
         stm.executeUpdate();
         stm.close();
         con.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
     }
   }
     public void atualizar(ModelProdutos prod){
          Connection con = Conectar.getConectar();
          String sql = "UPDATE produtos set descricao = ?, grupo = ? WHERE id_produtos = ?";
           try(PreparedStatement stm = prepareStatement(sql)){
                stm.setString(1, prod.getDescricao());
                stm.setString(2, prod.getGrupo());
                stm.executeUpdate();
                stm.close();
                con.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao atualizar");
            }
     }
     
     public void excluir(ModelProdutos prod){
         Connection con = Conectar.getConectar();
         String sql = "DELETE FROM produtos WHERE id_produtos = ?";
           try(PreparedStatement stm = prepareStatement(sql)){
                stm.setInt(1, prod.getId_produtos());
                 stm.executeUpdate();
                stm.close();
                con.close();
               
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao excluir");
            }
         
     }

    private PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
}

          
    

