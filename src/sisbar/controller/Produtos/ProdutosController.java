
package sisbar.controller.Produtos;


import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import sisbar.DAO.conexaobanco;
import sisbar.model.ModelProdutos;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutosController {
  
   public void cadastrar(ModelProdutos prod, Connection Connection) {
      Connection conn = new conexaobanco().getConnection();
      String sql = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
       prepareStatement = null;
      try{PreparedStatement ps = conn.prepareStatement("sql");
      }catch(SQLException e){
          throw new RuntimeException(e);

      }
   }
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


