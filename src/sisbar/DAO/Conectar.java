
package sisbar.DAO;

//import com.mysql.jdbc.Connection;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import java.sql.Connection;

public class Conectar { // nao esta sendo usanda a q esta em uso é conexcaobco
    
   private static final String usuario = "root";
   private static final String senha   = "";
   private static final String url = "jdbc:mysql://localhost:3306/bar"; 
   
   //public static Connection getConectar(){
    //   Connection con = null;
   //    try{
   //       Class.forName("con.mysql.jdbc.Driver");
  //        con = (Connection) DriverManager.getConnection(url, usuario, senha);
  //     }catch(ClassNotFoundException | SQLException ex){
  //         JOptionPane.showInternalMessageDialog(null,"Erro de conexao" + ex.getMessage());
       }
       
  //     return con;
 //  }

    
//}
// obs nao esta sendo usada