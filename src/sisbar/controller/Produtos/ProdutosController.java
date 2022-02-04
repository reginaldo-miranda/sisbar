
package sisbar.controller.Produtos;


import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import sisbar.DAO.conexaobanco;
import sisbar.model.ModelProdutos;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutosController {
   private Connection conn = null; 
   public void cadastrar(ModelProdutos prod, Connection Connection) {
  
     String sql = "INSERT INTO produtos (descricao,grupo) VALUES (?,?)";
     PreparedStatement stmt = null;
     try(
         PreparedStatement PreparedStatement = stmtPrepareStatement(sql);
         stmt.setString(1, prod.getDescricao());
         stmt.setString(2, prod.getGrupo());
         stmt.executeUpdate(sql);
        // stm.close();
        // conexaobanco.close();
         JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
     }

    private PreparedStatement stmtPrepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
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


