package sisbar.controller.Produtos;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import sisbar.DAO.FabricaGerenciadorEntidades;
//import sisbar.DAO.Conectar;
import sisbar.DAO.conexcaobco;
import sisbar.model.ModelClientes;
import sisbar.model.ModelProdutos;

public class ProdutosController extends sisbar.model.ModelProdutos {

    private ArrayList<ModelProdutos> listaProd = new ArrayList<>();

    public ProdutosController() {

      //  getListaProd();

    }
    

    public void cadastrar(ModelProdutos prod) {
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        gerente.getTransaction().begin();
        gerente.persist(prod);
        gerente.getTransaction().commit();
        gerente.close();
       
      
        
    }

    public void PesquisarProd(ModelProdutos id) {
        conexcaobco cone = new conexcaobco();
        cone.conexao();
        String sql1 = "select * from produtos WHERE id_produto = id";

    }

  
    public static void listarProd() {
        conexcaobco cone = new conexcaobco();
        cone.conexao();
        ArrayList arryProd = new ArrayList();

        String sqll = "select * from produtos ";
        ResultSet st = cone.rs;//BuscaSql(sqll);

        try {
            while (st.next()) {
                ModelProdutos produtos = new ModelProdutos();

                produtos.setDescricao(st.getString("descricao"));
                produtos.setGrupo(st.getString("grupo"));
                produtos.setId_produtos(st.getInt("id_produtos"));
                arryProd.add(produtos);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutosController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cone.desconetar();
        }

    }

    /**
     * @return the listaProd
     */
    public java.util.List<ModelProdutos> getListaProd() {
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();

        TypedQuery<ModelProdutos> consulta = gerente.createNamedQuery("produto.todos", ModelProdutos.class);

        // return listaProd;
        return consulta.getResultList();
    }

    /**
     *
     * @param nomeprod
     * @return
     */
    public java.util.List<ModelProdutos> pesquisarProd(String nomeprod) {

        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        Query query = gerente.createQuery("SELECT prod FROM ModelProdutos prod WHERE prod.descricao LIKE :descricao");
        query.setParameter("descricao", "%" + nomeprod + "%");
        java.util.List<ModelProdutos> lista = query.getResultList();
        return lista;

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

