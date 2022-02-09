
package sisbar.DAO;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Reginaldo
 */
public class conexcaobco {
  public  Statement stm;
  public  ResultSet rs;
  private  String driver ="com.mysql.jdbc.Driver";
  private  String caminho ="jdbc:mysql://localhost:3306/bar" ;
  private  String usuario = "root";
  private  String senha = "";
  public  Connection conn;
    private Object ex;
  
  public void conexao(){
      
      try {
          System.setProperty("jdbc.Drivers", driver);
          conn = DriverManager.getConnection(caminho, usuario, senha);
          JOptionPane.showMessageDialog(null, "conectado blz ");
                  
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao conectado" + ex.getMessage());
      }
  }
  public void desconetar(){
      try {
          conn.close();
        //  rs.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao fechar a conexcao" + ex.getMessage());
      }
  }

  public ResultSet BuscaSql(String sql){
      try {
        stm = conn.createStatement();
        rs = stm.executeQuery(sql);
       // conn.close();
        return rs;
      } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "Erro ao fechar a conexcao" + ex.getMessage());  
         return null;
      }
  }
 
}

    

// https://www.youtube.com/watch?v=VTGE4lkyxeo&list=PLWaWJaNCDTKCQXGO34NJcPz--vZ-SFVi9&index=3&ab_channel=EliasAbreuDomingosSilva    

