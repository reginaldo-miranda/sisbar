
package sisbar.view;

import javax.swing.table.DefaultTableModel;
import sisbar.controller.Produtos.GrupoController;
import sisbar.model.ModelGrupo;

public class DialogGrupo extends javax.swing.JDialog {
    
    private GrupoController controlag = new GrupoController();

    public DialogGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarDadosG();
    }
    
       public void carregarDadosG() {
        DefaultTableModel modelo = (DefaultTableModel) jTableDialogGrupo .getModel();
        modelo.setRowCount(0);
        for (ModelGrupo gru : getControlag().getListaGrupo()) {

            modelo.addRow(new Object[]{gru.getDescricao(), gru.getDesconto()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDialogGrupo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableDialogGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "descricao", "desconto"
            }
        ));
        jScrollPane1.setViewportView(jTableDialogGrupo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogGrupo dialog = new DialogGrupo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDialogGrupo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the controlag
     */
    public GrupoController getControlag() {
        return controlag;
    }

    /**
     * @param controlag the controlag to set
     */
    public void setControlag(GrupoController controlag) {
        this.controlag = controlag;
    }
}
