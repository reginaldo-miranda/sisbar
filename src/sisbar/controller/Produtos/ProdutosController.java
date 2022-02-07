
package sisbar.controller.Produtos;


import com.mysql.jdbc.PreparedStatement;
//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import javax.swing.JOptionPane;
//import sisbar.DAO.Conectar;
import sisbar.DAO.conexcaobco;
import sisbar.model.ModelProdutos;

public class ProdutosController {
  
   public void cadastrar(ModelProdutos prod) {
       
         conexcaobco cone = new conexcaobco();
         cone.conexao();
         String sql1 = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
         
      try {
            PreparedStatement  stm = (PreparedStatement) cone.conn.prepareStatement(sql1);
            
            stm.setString(1,prod.getDescricao());
            stm.setString(2,prod.getGrupo());
            stm.executeUpdate();
            
       } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro ao gravar o produto" + ex.getMessage());
       }finally {
          JOptionPane.showMessageDialog(null, "Gravado com sucesso");
          cone.desconetar();
      }
   }
   public void PesquisarProd(ModelProdutos id){
        conexcaobco cone = new conexcaobco();
         cone.conexao();
         String sql1 = "select * from produtos WHERE id_produto = id";
       
   }
   
 // https://www.youtube.com/watch?v=fBe0uD9BWeU&ab_channel=williamsantos pesquisar produtos
}

  




    // String sql = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
 //    PreparedStatement stmt = null;

   
     
     
     

   
   
   /*
     public void atualizar(ModelProdutos prod){
   //       Connection con = Conectar.getConectar();
          String sql = "UPDATE produtos set descricao = ?, grupo = ? WHERE id_produtos = ?";
           try(PreparedStatement stm = prepareStatement(sql)){
                stm.setString(1, prod.getDescricao());
                stm.setString(2, prod.getGrupo());
                stm.executeUpdate();
                stm.close();
      //          con.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao atualizar");
            }
     }
     
     public void excluir(ModelProdutos prod){
     //    Connection con = Conectar.getConectar();
         String sql = "DELETE FROM produtos WHERE id_produtos = ?";
  //         try(PreparedStatement stm = prepareStatement(sql)){
                stm.setInt(1, prod.getId_produtos());
                 stm.executeUpdate();
                stm.close();
       //         con.close();
               
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao excluir");
            }
         
     }
     
     
}
*/
          
    // http://www.universidadejava.com.br/java/java-jdbc/


