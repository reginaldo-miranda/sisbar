/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisbar.view;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sisbar.DAO.conexcaobco;
import sisbar.model.ModelProdutos;

import sisbar.controller.Produtos.ProdutosController;

/**
 *
 * @author suporte11-pc
 */
public class pesquisarProdutos extends javax.swing.JFrame {

    private Iterable<Object> myArrayList;

    /**
     * Creates new form pesquisarProdutos
     */
    public pesquisarProdutos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableListaProd.getModel();
        modelo.setNumRows(0);
        jTableListaProd.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    public void readJTable(){
            
             conexcaobco cone = new conexcaobco();
             DefaultTableModel modelo = (DefaultTableModel) jTableListaProd.getModel();
             modelo.setNumRows(0);
            // jTableListaProd.getColumnModel().getColumn(0).setPreferredWidth(20);
            // jTableListaProd.getColumnModel().getColumn(1).setPreferredWidth(80);
           //  jTableListaProd.getColumnModel().getColumn(2).setPreferredWidth(50);
                    JOptionPane.showMessageDialog(null, "Estou na readJtable");      
              ArrayList myArrayList = new ArrayList();
            
              ModelProdutos pro = new ModelProdutos();
              ProdutosController prodc = new ProdutosController();
              
               
               myArrayList.add(pro);               
              JOptionPane.showMessageDialog(null, "Estou antes do for");  
               for(Object p: myArrayList){
                    
                    modelo.addRow(new Object[]{
                        pro.getId_produtos(),
                        pro.getDescricao(),
                        pro.getGrupo()
                    });
                     JOptionPane.showMessageDialog(null, "passei o for"); 
               }

               
                // https://www.youtube.com/watch?v=_XtR56iXRdM&t=244s&ab_channel=MarcioTostes
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPesquisaProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProd = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Produtos");

        jLabel1.setText("Pesquisar");

        jTableListaProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_produtos", "descricao", "grupo"
            }
        ));
        jScrollPane1.setViewportView(jTableListaProd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPesquisaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPesquisaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesquisarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesquisarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaProd;
    private javax.swing.JTextField jTextFieldPesquisaProd;
    // End of variables declaration//GEN-END:variables

    private Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
