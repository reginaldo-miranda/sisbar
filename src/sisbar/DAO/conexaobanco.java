
package sisbar.DAO;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaobanco {
    
   
  //  public Statement stm;
  //  public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/bar";
    private final String usuario = "root";
    private final String senha = "";
    public Connection conn;
   // public PreparedStatement p;

    public void conexao() throws SQLException{

        System.setProperty("jdbc.Drivers", driver);
        conn =  (Connection) DriverManager.getConnection(caminho, usuario, senha);
        
       }

    public void desconetar() throws java.sql.SQLException, IOException {
        conn.close();
    }
   
}




    

// https://www.youtube.com/watch?v=VTGE4lkyxeo&list=PLWaWJaNCDTKCQXGO34NJcPz--vZ-SFVi9&index=3&ab_channel=EliasAbreuDomingosSilva    

