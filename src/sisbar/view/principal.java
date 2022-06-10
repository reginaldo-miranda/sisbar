package sisbar.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemPdv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 300));

        jMenu1.setText("Cadastros");

        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemProdutosMouseClicked(evt);
            }
        });
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProdutos);

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemClientesMouseClicked(evt);
            }
        });
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClientes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("vendas");

        jMenuItemPdv.setText("pdv");
        jMenuItemPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPdvActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPdv);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        // TODO add your handling code here:
        produtos prod = new produtos();
        prod.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProdutosMouseClicked

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        // TODO add your handling code here:
        Clientes clie = new Clientes (new javax.swing.JFrame(), true);
        clie.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemClientesMouseClicked

    private void jMenuItemPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPdvActionPerformed
        // TODO add your handling code here:
        Pdv pdv = new Pdv();
        pdv.setVisible(true);
    }//GEN-LAST:event_jMenuItemPdvActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemPdv;
    private javax.swing.JMenuItem jMenuItemProdutos;
    // End of variables declaration//GEN-END:variables
}
