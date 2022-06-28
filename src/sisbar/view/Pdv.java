/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sisbar.view;

import com.mysql.cj.x.protobuf.MysqlxResultset;
import java.util.Calendar;
import java.util.List;
import java.util.function.Function;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sisbar.DAO.FabricaGerenciadorEntidades;
import sisbar.controller.Produtos.PdvItensController;
import sisbar.controller.Produtos.ProdutosController;
import sisbar.controller.Produtos.VendaController;
import sisbar.model.MoVenda;
import sisbar.model.MoVendaItens;
import static sisbar.model.MoVenda_.moclientes;
import sisbar.model.ModelClientes;
import static sisbar.model.ModelClientes_.id_clientes;
import sisbar.model.ModelPdvItens;
import sisbar.model.ModelProdutos;

/**
 *
 * @author suporte11-pc
 */
public class Pdv extends javax.swing.JFrame {

    // ModelProdutos modelprod = new ModelProdutos();
    PdvItensController pdvcontrola = new PdvItensController();
    //  VendaController pdvcontrola = new VendaController();

    private String receber, receberProd, receberPreco, receberCli = null;
    private Integer id_prod, receb_id_cliente;
    
    public Pdv() {
        initComponents();
        desabilitarbtn();
        // carregaProdutosPdv();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIdPedido = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePdv = new javax.swing.JTable();
        jButtonNovaVenda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jTextFieldProduto2 = new javax.swing.JTextField();
        jButtonBuscaClientes = new javax.swing.JButton();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonBuscaProd = new javax.swing.JButton();
        jTextFieldQde = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPUnitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonBuscarVendas = new javax.swing.JButton();
        jTextFieldParcelas = new javax.swing.JTextField();
        jTextFieldIdClie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jTablePdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Qde", "Preco"
            }
        ));
        jTablePdv.setShowGrid(true);
        jScrollPane1.setViewportView(jTablePdv);

        jButtonNovaVenda.setText("novo");
        jButtonNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaVendaActionPerformed(evt);
            }
        });

        jLabel3.setText("Produtos");

        jButtonGravar.setText("gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jTextFieldProduto2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldProduto2InputMethodTextChanged(evt);
            }
        });
        jTextFieldProduto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProduto2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProduto2KeyReleased(evt);
            }
        });

        jButtonBuscaClientes.setText("Clientes");
        jButtonBuscaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClientesActionPerformed(evt);
            }
        });

        jButtonBuscaProd.setText("Busca Prod");
        jButtonBuscaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaProdActionPerformed(evt);
            }
        });

        jTextFieldQde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQdeActionPerformed(evt);
            }
        });

        jLabel4.setText("Qde");

        jTextFieldPUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPUnitarioActionPerformed(evt);
            }
        });

        jLabel5.setText("P Unit");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonBuscarVendas.setText("Buscar Vendas");
        jButtonBuscarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVendasActionPerformed(evt);
            }
        });

        jTextFieldParcelas.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovaVenda)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarVendas)
                        .addGap(125, 125, 125)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdClie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscaClientes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(226, 226, 226)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonBuscaProd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldQde, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jTextFieldProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jTextFieldPUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGravar)
                        .addGap(371, 371, 371)
                        .addComponent(jButtonSair))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(jTextFieldIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovaVenda)
                            .addComponent(jButtonBuscarVendas))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIdClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonBuscaClientes))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(jButtonBuscaProd))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldQde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonSair)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void carregaProdutosPdv() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTablePdv.getModel();
        modelo.setRowCount(0);
        for (MoVendaItens pdvitens : pdvcontrola.getListaPdv()) {
            modelo.addRow(new Object[]{pdvitens.getId(), pdvitens.getQuantidade(), pdvitens.getValorTotal()});
        }
    }

    private void jButtonBuscaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClientesActionPerformed
        
        BuscaClienteJdailog dialog = new BuscaClienteJdailog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
        receberCli = dialog.getClienteSelecionado();
        jTextFieldNomeCliente.setText(receberCli);
        
        receb_id_cliente = dialog.getId_cli_selecionado();
        jTextFieldIdClie.setText(Integer.toString(receb_id_cliente));
        jTextFieldParcelas.requestFocus();
       
        

    }//GEN-LAST:event_jButtonBuscaClientesActionPerformed
    
    private void desabilitarbtn() {
        
        jButtonBuscaClientes.setEnabled(false);
        jButtonBuscaProd.setEnabled(false);
        jButtonGravar.setEnabled(false);
        
    }
    
    private void habilitarbtn() {
        jButtonBuscaClientes.setEnabled(true);
        jButtonBuscaProd.setEnabled(true);
        // jButtonGravar.setEnabled(true);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jTextFieldProduto2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldProduto2InputMethodTextChanged

    }//GEN-LAST:event_jTextFieldProduto2InputMethodTextChanged

    private void jTextFieldProduto2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProduto2KeyPressed

    }//GEN-LAST:event_jTextFieldProduto2KeyPressed

    private void jTextFieldProduto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProduto2KeyReleased
        /*  modelprod.setDescricao(jTextFieldProduto2.getText());
        produtos prod = new produtos();
        prod.pegardados(modelprod);
        prod.setVisible(true);
         */
    }//GEN-LAST:event_jTextFieldProduto2KeyReleased

    private void jButtonBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaProdActionPerformed
        
        BuscaProdutosDialog dialog = new BuscaProdutosDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        receberProd = dialog.getProdSelecionado();
        receberPreco = dialog.getPrecoSelecionado();
        id_prod = dialog.getIdSelecionado();
        
        jTextFieldProduto2.setText(receberProd);
        jTextFieldPUnitario.setText(receberPreco);
        
        jTextFieldQde.requestFocus();
        jButtonGravar.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscaProdActionPerformed

    private void jButtonNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaVendaActionPerformed
        habilitarbtn();
        jTextFieldQde.requestFocus();
    }//GEN-LAST:event_jButtonNovaVendaActionPerformed

    private void jTextFieldQdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQdeActionPerformed

    private void jTextFieldPUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPUnitarioActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        
        if (jTextFieldParcelas.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "preencher as parcelas");
            jTextFieldParcelas.requestFocus();
        }
        EntityManager gerente = FabricaGerenciadorEntidades.getGerente();
        
        ModelProdutos p = gerente.find(ModelProdutos.class, id_prod);
        
        receberCli = jTextFieldNomeCliente.getText();
        
     //  ModelClientes c = gerente.find(ModelClientes.class, 2);
        
        ModelClientes cli = new ModelClientes();
        cli.setId_clientes(receb_id_cliente);
        
        
        ProdutosController prod = new ProdutosController();
        
        MoVenda v = new MoVenda();
        v.setData(Calendar.getInstance());
        v.setParcelas(Integer.parseInt(jTextFieldParcelas.getText()));
        //v.setId(Integer.valueOf(id_prod));
        v.setMoclientes(cli);
        
        MoVendaItens v1 = new MoVendaItens();
        v1.setProdutos(p);
        v1.setQuantidade(Double.valueOf(jTextFieldQde.getText()));
        v1.setValorUnitario(p.getPreco_venda());
        v1.setValorTotal(v1.getQuantidade() * v1.getValorUnitario());
        v1.setId(Integer.valueOf(id_prod));
        v.adicionarItens(v1);
        
        gerente.getTransaction().begin();
        gerente.persist(v);
        gerente.getTransaction().commit();
        gerente.close();
        carregaProdutosPdv();

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonBuscarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVendasActionPerformed
        BuscarVendasDialog dialog = new BuscarVendasDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarVendasActionPerformed

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
            java.util.logging.Logger.getLogger(Pdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pdv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscaClientes;
    private javax.swing.JButton jButtonBuscaProd;
    private javax.swing.JButton jButtonBuscarVendas;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovaVenda;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePdv;
    private javax.swing.JTextField jTextFieldIdClie;
    private javax.swing.JTextField jTextFieldIdPedido;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldPUnitario;
    private javax.swing.JTextField jTextFieldParcelas;
    private javax.swing.JTextField jTextFieldProduto2;
    private javax.swing.JTextField jTextFieldQde;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the pegue
     */
}
