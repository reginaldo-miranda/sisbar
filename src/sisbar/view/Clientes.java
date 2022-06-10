package sisbar.view;

import javax.persistence.Table;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sisbar.controller.Produtos.ClientesController;
import sisbar.model.ModelClientes;

public class Clientes extends javax.swing.JFrame {

    ClientesController controla = new ClientesController();
    ModelClientes model = new ModelClientes();
    
    private String clienteselecionado;

    public Clientes(java.awt.Frame parent, boolean modal) {
        initComponents();
        carregarClientes();
        jButtonGravar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFielNome.requestFocus();
        jTableClientes.setEnabled(false);
        Table table = null;
/*
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        for (ModelClientes cli : controla.getListaCli()) {

            modelo.addRow(new Object[]{cli.getId_clientes(), cli.getNome(), cli.getFone()});
        }
*/
    }
    
    public void carregarClientes(){
           DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        for (ModelClientes cli : controla.getListaCli()) {

            modelo.addRow(new Object[]{cli.getId_clientes(), cli.getNome(), cli.getFone()});
        }
    }

    Clientes() {
    }

    public void listaPersona(Table table) {

        DefaultTableModel modelo = (DefaultTableModel) getjTableClientes().getModel();
        modelo.setRowCount(0);
        for (ModelClientes cli : controla.getListaCli()) {

            modelo.addRow(new Object[]{cli.getId_clientes(), cli.getNome(), cli.getFone()});
            modelo.fireTableDataChanged();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFielNome = new javax.swing.JTextField();
        jTextFieldFone = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldId_cliente = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFielNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFielNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFielNomeKeyReleased(evt);
            }
        });

        jTextFieldFone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFoneKeyPressed(evt);
            }
        });

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Fone");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Fone"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyReleased(evt);
            }
        });

        jLabel3.setText("Pesquisar");

        jTextFieldId_cliente.setEditable(false);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIncluirMouseClicked(evt);
            }
        });
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldId_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFielNome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSair))
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldId_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFielNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonIncluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

        ModelClientes cliente = new ModelClientes();

        if (jTextFieldId_cliente.getText().isEmpty()) {
            cliente.setNome(jTextFielNome.getText());
            cliente.setFone(jTextFieldFone.getText());
            ClientesController contr = new ClientesController();
            contr.inserir(cliente);
        } else {

            cliente.setId_clientes(Integer.parseInt(jTextFieldId_cliente.getText()));
            cliente.setNome(jTextFielNome.getText());
            cliente.setFone(jTextFieldFone.getText());
            ClientesController contr = new ClientesController();
            contr.inserir(cliente);

        }

    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int linha;
        String codigo = "0";

        linha = getjTableClientes().getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "escolha uma linha");
        } else {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "deseja apagar");
            if (resposta == JOptionPane.YES_OPTION) {
                ClientesController contr = new ClientesController();
                //   contr.excluir(ModelClientes.class, Integer.valueOf(jTextFieldId_cliente.getText()));
                JOptionPane.showMessageDialog(this, "excluido" + linha);
            } else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "na confirmado");
            } else if (resposta == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "cancelado");
            }
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed


    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        // TODO add your handling code here:
        int linha = getjTableClientes().getSelectedRow();
        jTextFieldId_cliente.setText(getjTableClientes().getValueAt(linha, 0).toString());
        jTextFielNome.setText(getjTableClientes().getValueAt(linha, 1).toString());
        jTextFieldFone.setText(getjTableClientes().getValueAt(linha, 2).toString());
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:

        getjTableClientes().setEnabled(true);
        JOptionPane.showMessageDialog(null, "Escolha uma linha");

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFielNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielNomeKeyPressed
        // TODO add your handling code here:
        jButtonGravar.setEnabled(true);

    }//GEN-LAST:event_jTextFielNomeKeyPressed

    private void jTextFieldFoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFoneKeyPressed
        // TODO add your handling code here:
        jButtonGravar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldFoneKeyPressed

    private void jButtonIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIncluirMouseClicked
        // TODO add your handling code here:
        jTextFieldId_cliente.setText("");
        jTextFielNome.setText("");
        jTextFieldFone.setText("");
        jButtonAlterar.setEnabled(false);
        jTextFielNome.requestFocus();

    }//GEN-LAST:event_jButtonIncluirMouseClicked

    private void jTextFieldPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyReleased
        // TODO add your handling code here:
        ClientesController contr = new ClientesController();
        //  contr.pesquisarCli(jTextFieldPesquisar.getText());
    }//GEN-LAST:event_jTextFieldPesquisarKeyReleased

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jTextFielNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFielNomeKeyReleased
        DefaultTableModel modelo = (DefaultTableModel) getjTableClientes().getModel();
        modelo.setRowCount(0);

        for (ModelClientes cli : controla.pesquisarCli(jTextFielNome.getText())) {

            modelo.addRow(new Object[]{cli.getId_clientes(), cli.getNome(), cli.getFone()});
        }


    }//GEN-LAST:event_jTextFielNomeKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFielNome;
    private javax.swing.JTextField jTextFieldFone;
    private javax.swing.JTextField jTextFieldId_cliente;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the clienteselecionado
     */
    public String getClienteselecionado() {
        return clienteselecionado;
    }

    /**
     * @param clienteselecionado the clienteselecionado to set
     */
    public void setClienteselecionado(String clienteselecionado) {
        this.clienteselecionado = clienteselecionado;
    }

    /**
     * @return the jTableClientes
     */
    public javax.swing.JTable getjTableClientes() {
        return jTableClientes;
    }

    /**
     * @param jTableClientes the jTableClientes to set
     */
    public void setjTableClientes(javax.swing.JTable jTableClientes) {
        this.jTableClientes = jTableClientes;
    }
}

//      // LINK https://www.youtube.com/watch?v=OfOvYbgEthU
