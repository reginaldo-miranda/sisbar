// link exemplo https://pt.stackoverflow.com/questions/139885/retornar-informa%C3%A7%C3%B5es-da-linha-da-jtable-ap%C3%B3s-sele%C3%A7%C3%A3o
package sisbar.view;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sisbar.controller.Produtos.ProdutosController;
import sisbar.model.ModelProdutos;
import javax.swing.table.DefaultTableModel;
import static sisbar.model.ModelPdvItens_.produtos;

public class produtos extends javax.swing.JFrame {

    ProdutosController controla = new ProdutosController();

    private String receber = null;

    public produtos() {
        initComponents();
        carregarDados();

    }
    public void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) jTableProd.getModel();
        for (ModelProdutos prod : controla.getListaProd()) {
            modelo.addRow(new Object[]{prod.getDescricao(), prod.getGrupo()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextPrecoVenda = new javax.swing.JTextField();
        jTextQtde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextGrupo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextUnidMed = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();
        jButtonProcurarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProd = new javax.swing.JTable();
        jButtonBuscarGrupo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jTextDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextDescricaoKeyReleased(evt);
            }
        });

        jLabel1.setText("Descricao");

        jLabel2.setText("Preco unitario");

        jLabel3.setText("quantidade");

        jLabel4.setText("Grupo");

        jLabel5.setText("unid med");

        jButtonGravar.setText("Gravar");
        jButtonGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGravarMouseClicked(evt);
            }
        });
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonProcurarProd.setText("Procurar");
        jButtonProcurarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarProdActionPerformed(evt);
            }
        });

        jTableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descricao", "grupo"
            }
        ));
        jTableProd.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jTableProdComponentMoved(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableProdComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProd);

        jButtonBuscarGrupo.setText("Grupo");
        jButtonBuscarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarGrupoMouseClicked(evt);
            }
        });
        jButtonBuscarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonBuscarGrupo))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButtonGravar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonProcurarProd)))
                        .addGap(0, 213, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProcurarProd)
                    .addComponent(jButtonGravar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
        ModelProdutos prod = new ModelProdutos();
        prod.setDescricao(jTextDescricao.getText());
        prod.setPreco_venda(Integer.parseInt(jTextPrecoVenda.getText()));
        prod.setQde(Integer.parseInt(jTextQtde.getText()));
        prod.setGrupo(jTextGrupo.getText());
        prod.setUnid_medida(jTextUnidMed.getText());
        ProdutosController produ = new ProdutosController();
        produ.cadastrar(prod);
        limparTela();
        carregarDados();

    }//GEN-LAST:event_jButtonGravarActionPerformed
    public void limparTela() {

        jTextDescricao.setText("");
        jTextGrupo.setText("");
        jTextGrupo.setText("");
        jTextPrecoVenda.setText("");
        jTextQtde.setText("");
    }
    private void jButtonGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGravarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonGravarMouseClicked

    private void jButtonProcurarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarProdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonProcurarProdActionPerformed

    private void jTableProdComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableProdComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProdComponentShown

    private void jTextDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescricaoKeyReleased
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTableProd.getModel();
        modelo.setRowCount(0);
        for (ModelProdutos prod : controla.pesquisarProd(jTextDescricao.getText())) {
            modelo.addRow(new Object[]{prod.getDescricao(), prod.getGrupo()});
        }
    }//GEN-LAST:event_jTextDescricaoKeyReleased

    private void jButtonBuscarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarGrupoActionPerformed

    }//GEN-LAST:event_jButtonBuscarGrupoActionPerformed

    private void jTableProdComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableProdComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProdComponentMoved

    private void jButtonBuscarGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarGrupoMouseClicked

        Grupo dialog = new Grupo(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        receber = dialog.getItenSelecionado();
        jTextGrupo.setText(receber);

    }//GEN-LAST:event_jButtonBuscarGrupoMouseClicked

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
            java.util.logging.Logger.getLogger(produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new produtos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarGrupo;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonProcurarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProd;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextGrupo;
    private javax.swing.JTextField jTextPrecoVenda;
    private javax.swing.JTextField jTextQtde;
    private javax.swing.JTextField jTextUnidMed;
    // End of variables declaration//GEN-END:variables

    public String getReceber() {
        return receber;
    }

    public void setReceber(String receber) {
        this.receber = receber;
    }

}
