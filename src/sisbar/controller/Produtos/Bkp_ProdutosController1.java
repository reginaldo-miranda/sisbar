
package sisbar.controller.Produtos;


//import com.mysql.jdbc.PreparedStatement;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import sisbar.DAO.Conectar;
import sisbar.DAO.conexcaobco;
import sisbar.model.ModelProdutos;
import sisbar.view.produtos;
//import sisbar.view.pesquisarProdutos;

public class Bkp_ProdutosController1 extends sisbar.model.ModelProdutos{
  
   public void cadastrar(ModelProdutos prod) {
       
         conexcaobco cone = new conexcaobco();
         cone.conexao();
         String sql1 = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
         
      try {
    //        PreparedStatement  stm = (PreparedStatement) cone.conn.prepareStatement(sql1);
            
   //         stm.setString(1,prod.getDescricao());
   //         stm.setString(2,prod.getGrupo());
     //       stm.executeUpdate();
            
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
   public void listarProdutos(){
       
       conexcaobco cone = new conexcaobco();
         cone.conexao();
         String sql1 = "select * from produtos ";
          try {
        //    PreparedStatement  stm = (PreparedStatement) cone.conn.prepareStatement(sql1);
          //  stm.executeQuery();
            
       } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro ao listar o produto" + ex.getMessage());
       }finally {
          JOptionPane.showMessageDialog(null, "listado com sucesso");
          //cone.desconetar();
      }
          
   }
 //  public ArrayList listarPord(){
  public static void listarProd(){        
         conexcaobco cone = new conexcaobco();
         cone.conexao();
         ArrayList arryProd = new ArrayList();
        
        String sqll = "select * from produtos ";
        ResultSet st =  cone.rs;//BuscaSql(sqll);
         
            try {
                while (st.next()){    
                   ModelProdutos produtos = new ModelProdutos();
                                      
                   produtos.setDescricao(st.getString("descricao"));
                   produtos.setGrupo(st.getString("grupo"));
                   produtos.setId_produtos(st.getInt("id_produtos"));
                   arryProd.add(produtos);
                   
               }               
                   
               } catch (SQLException ex) {
                   Logger.getLogger(Bkp_ProdutosController1.class.getName()).log(Level.SEVERE, null, ex);
               }finally{
                    cone.desconetar();
               }
              
   }

 
}

           
            
           
      
    

   
    
 // https://www.youtube.com/watch?v=fBe0uD9BWeU&ab_channel=williamsantos pesquisar produtos


  




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


