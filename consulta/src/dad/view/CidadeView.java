/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dad.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class CidadeView extends javax.swing.JFrame {
    private int codigoCidadeClicada;
    /**
     * Creates new form TelaPesquisarCidade
     */
    public CidadeView() {
        initComponents();
    }

    public String cidadePesquisada(){
        return campoPesquisarCidade.getText();
    }
    
    public void btnAddCidadeListener(ActionListener listener){
        btnAddCidade.addActionListener(listener);
    }
    
    public void btnVisualizarCidadeListener(MouseListener listener){
        btnVisualizarCidade.addMouseListener(listener);
    }
    
    public void btnPesquisarCidadeListener(ActionListener listener){
        btnPesquisarCidade.addActionListener(listener);
    }
    
    public int codigoCidadeClicada(){
        return codigoCidadeClicada;
    }
    
    public void setTabelaCidade(DefaultTableModel model){
        this.tabelaCidade.setModel(model);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloPesquisarCidade = new javax.swing.JLabel();
        campoPesquisarCidade = new javax.swing.JTextField();
        btnPesquisarCidade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCidade = new javax.swing.JTable();
        btnAddCidade = new javax.swing.JButton();
        btnVisualizarCidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotuloPesquisarCidade.setText("Digite o nome da cidade:");

        campoPesquisarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarCidadeActionPerformed(evt);
            }
        });

        btnPesquisarCidade.setText("Pesquisar");
        btnPesquisarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCidadeActionPerformed(evt);
            }
        });

        tabelaCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCidade);

        btnAddCidade.setText("Adicionar");

        btnVisualizarCidade.setText("Visualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloPesquisarCidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoPesquisarCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCidade))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnAddCidade)
                        .addGap(67, 67, 67)
                        .addComponent(btnVisualizarCidade))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rotuloPesquisarCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCidade))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCidade)
                    .addComponent(btnVisualizarCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisarCidadeActionPerformed

    private void btnPesquisarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarCidadeActionPerformed

    private void tabelaCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCidadeMouseClicked
        // TODO add your handling code here:
        this.codigoCidadeClicada = Integer.valueOf(tabelaCidade.getValueAt(tabelaCidade.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tabelaCidadeMouseClicked

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
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCidade;
    private javax.swing.JButton btnPesquisarCidade;
    private javax.swing.JButton btnVisualizarCidade;
    private javax.swing.JTextField campoPesquisarCidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotuloPesquisarCidade;
    private javax.swing.JTable tabelaCidade;
    // End of variables declaration//GEN-END:variables

   
}