
package sisbar.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class conexaobanco {
    
 
  //  private static class DAO {

      //  public DAO() {
    //    }
  //  }
//public class conexaobd {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/bar";
    private String usuario = "root";
    private String senha = "";
    public Connection conn;

    public void conexao() throws java.sql.SQLException {

        System.setProperty("jdbc.Drivers", driver);
        conn = (Connection) DriverManager.getConnection(caminho, usuario, senha);
        //JOptionPane.showMessageDialog(null, "conectado blz ");
    }

    public void desconetar() throws java.sql.SQLException {
        conn.close();
    }

    public ResultSet consultarGenerico(String sqlC) throws java.sql.SQLException {
        stm = (Statement) conn.createStatement();
        ResultSet rs = stm.executeQuery(sqlC);
        return rs;
    }

    public void executaSql(String Sql) throws java.sql.SQLException {
        stm = (Statement) conn.createStatement();
        rs = stm.executeQuery(Sql);
     }
    
    public ResultSet executaSqlTabela(String Sql) throws java.sql.SQLException {
        stm = (Statement) conn.createStatement();
        return stm.executeQuery(Sql);
     }
    
    public boolean executaSqlDelete(String Sql) throws java.sql.SQLException {
        stm = (Statement) conn.createStatement();
        stm.execute(Sql);
        return true;
     }
    
    
    
}




    

// https://www.youtube.com/watch?v=VTGE4lkyxeo&list=PLWaWJaNCDTKCQXGO34NJcPz--vZ-SFVi9&index=3&ab_channel=EliasAbreuDomingosSilva    

