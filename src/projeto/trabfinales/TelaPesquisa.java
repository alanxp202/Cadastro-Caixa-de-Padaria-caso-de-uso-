package projeto.trabfinales;

import javax.swing.JOptionPane;

public class TelaPesquisa extends javax.swing.JFrame {
    
    public static boolean escolha;
    
    public TelaPesquisa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInfo = new javax.swing.JTextField();
        txtSelecionar = new javax.swing.JComboBox<>();
        pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar");
        setResizable(false);

        txtSelecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Código", "Nome" }));

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisar))
                    .addComponent(txtSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

    int c = TelaPrincipal.p.procuraCod(txtInfo.getText());
    int n = TelaPrincipal.p.procuraNom(txtInfo.getText());
    
        if(txtSelecionar.getSelectedItem().equals("Código")){
            
            if(c!=-1){
                if(escolha){
                    TelaEditar.indice = c;
                    TelaEditar.main(null);
                    dispose();
                }
                else {
                    TelaExcluir.indice = c;
                    TelaExcluir.main(null);
                    dispose();
                }
            }
            else
            JOptionPane.showMessageDialog(null, "Código não Encontrado!");
        }
        else if(txtSelecionar.getSelectedItem().equals("Nome")){
            if(n!=-1){
                if(escolha){
                    TelaEditar.indice = n;
                    TelaEditar.main(null);
                    dispose();
                }
                else{
                    TelaExcluir.indice = n;
                    TelaExcluir.main(null);
                    dispose();
                }
            }
            else
            JOptionPane.showMessageDialog(null, "Nome não Encontrado!");

        }
        else
        JOptionPane.showMessageDialog(null, "Escolha um Tipo de Pesquisa!");

    }//GEN-LAST:event_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField txtInfo;
    private javax.swing.JComboBox<String> txtSelecionar;
    // End of variables declaration//GEN-END:variables

    /**
     * @param escolha the escolha to set
     */
    public static void setEscolha(boolean escolha) {
        TelaPesquisa.escolha = escolha;
    }

    /**
     * @return the escolha
     */
    public boolean isEscolha() {
        return escolha;
    }
    
}
