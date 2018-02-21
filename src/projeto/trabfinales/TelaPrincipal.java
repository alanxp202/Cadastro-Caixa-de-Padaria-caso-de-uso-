package projeto.trabfinales;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    
    
    public static Produtos p = new Produtos();
    private static int indice = -1;
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opções = new javax.swing.JPanel();
        AddProduto = new javax.swing.JButton();
        EditProduto = new javax.swing.JButton();
        ExcProduto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        Pesquisa = new javax.swing.JPanel();
        Codigo = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        OKcod = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        OKnom = new javax.swing.JButton();
        Quantidade = new javax.swing.JLabel();
        txtQua = new javax.swing.JTextField();
        Descricao = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        ValorUnitario = new javax.swing.JLabel();
        txtVal = new javax.swing.JTextField();
        Tabela = new javax.swing.JPanel();
        Scroll = new javax.swing.JScrollPane();
        tabProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Opções.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        AddProduto.setText("Adicionar");
        AddProduto.setToolTipText("");
        AddProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProdutoActionPerformed(evt);
            }
        });

        EditProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        EditProduto.setText("Editar");
        EditProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProdutoActionPerformed(evt);
            }
        });

        ExcProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        ExcProduto.setText("Excluir");
        ExcProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExcProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExcProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcProdutoActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpçõesLayout = new javax.swing.GroupLayout(Opções);
        Opções.setLayout(OpçõesLayout);
        OpçõesLayout.setHorizontalGroup(
            OpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExcProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OpçõesLayout.setVerticalGroup(
            OpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(OpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExcProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        Pesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisa Rápida"));

        Codigo.setText("Código:");

        OKcod.setText("OK");
        OKcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKcodActionPerformed(evt);
            }
        });

        Nome.setText("Nome:");

        OKnom.setText("OK");
        OKnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKnomActionPerformed(evt);
            }
        });

        Quantidade.setText("Quantidade:");

        txtQua.setEditable(false);

        Descricao.setText("Descrição:");

        txtDes.setEditable(false);

        ValorUnitario.setText("Valor Unitário:");

        txtVal.setEditable(false);

        javax.swing.GroupLayout PesquisaLayout = new javax.swing.GroupLayout(Pesquisa);
        Pesquisa.setLayout(PesquisaLayout);
        PesquisaLayout.setHorizontalGroup(
            PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesquisaLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Codigo)
                    .addComponent(Descricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PesquisaLayout.createSequentialGroup()
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKcod)
                        .addGap(18, 18, 18)
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(OKnom))
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PesquisaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PesquisaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ValorUnitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PesquisaLayout.setVerticalGroup(
            PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesquisaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(Nome)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKnom)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKcod)
                    .addComponent(txtQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade))
                .addGap(18, 18, 18)
                .addGroup(PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descricao)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorUnitario)
                    .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Tabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Produtos"));

        tabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição", "QTD", "Valor UN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProdutos.getTableHeader().setReorderingAllowed(false);
        ListSelectionModel selectionModel = tabProdutos.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                tabProdutos.scrollRectToVisible(tabProdutos.getCellRect(
                    tabProdutos.getSelectedRow(), 0, true));
        } /* Finaliza o método valueChanged. */
    }); /* Finaliza a classe interna abstrata ListSelectionListener. */
    Scroll.setViewportView(tabProdutos);
    if (tabProdutos.getColumnModel().getColumnCount() > 0) {
        tabProdutos.getColumnModel().getColumn(0).setResizable(false);
        tabProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabProdutos.getColumnModel().getColumn(1).setResizable(false);
        tabProdutos.getColumnModel().getColumn(1).setPreferredWidth(140);
        tabProdutos.getColumnModel().getColumn(2).setResizable(false);
        tabProdutos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabProdutos.getColumnModel().getColumn(3).setResizable(false);
        tabProdutos.getColumnModel().getColumn(3).setPreferredWidth(5);
        tabProdutos.getColumnModel().getColumn(4).setResizable(false);
        tabProdutos.getColumnModel().getColumn(4).setPreferredWidth(25);
    }

    javax.swing.GroupLayout TabelaLayout = new javax.swing.GroupLayout(Tabela);
    Tabela.setLayout(TabelaLayout);
    TabelaLayout.setHorizontalGroup(
        TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
    );
    TabelaLayout.setVerticalGroup(
        TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Opções, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(Opções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
            .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProdutoActionPerformed
        TelaProduto.main(null);
    }//GEN-LAST:event_AddProdutoActionPerformed

    private void EditProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProdutoActionPerformed
        TelaPesquisa.setEscolha(true);
        TelaPesquisa.main(null);
    }//GEN-LAST:event_EditProdutoActionPerformed

    private void ExcProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcProdutoActionPerformed
        TelaPesquisa.setEscolha(false);
        TelaPesquisa.main(null);
    }//GEN-LAST:event_ExcProdutoActionPerformed

    private void OKcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKcodActionPerformed
        if(getIndice()!=-1)
            tabProdutos.removeRowSelectionInterval(indice, indice);
        
        setIndice(p.procuraCod(txtCod.getText()));
            
            if(getIndice() !=-1){
                txtNom.setText(p.getProduto().get(getIndice()).getNome());
                txtDes.setText(p.getProduto().get(getIndice()).getDescrição());
                txtQua.setText(String.valueOf(p.getProduto().get(getIndice()).getQuantidade()));
                txtVal.setText(String.valueOf(p.getProduto().get(getIndice()).getValor()));
                
                tabProdutos.addRowSelectionInterval(getIndice(), getIndice());
                
            }
            else
                JOptionPane.showMessageDialog(null, "Código não Encontrado!");
        
    }//GEN-LAST:event_OKcodActionPerformed

    private void OKnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKnomActionPerformed
        if(getIndice()!=-1)
            tabProdutos.removeRowSelectionInterval(indice, indice);        
        
        setIndice(p.procuraNom(txtNom.getText()));
        
            if(getIndice() !=-1){
                txtCod.setText(p.getProduto().get(indice).getCodigo());
                txtDes.setText(p.getProduto().get(indice).getDescrição());
                txtQua.setText(String.valueOf(p.getProduto().get(indice).getQuantidade()));
                txtVal.setText(String.valueOf(p.getProduto().get(indice).getValor()));
                
                tabProdutos.addRowSelectionInterval(getIndice(), getIndice());
            }
            else
                JOptionPane.showMessageDialog(null, "Nome não Encontrado!");
    }//GEN-LAST:event_OKnomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      
        File arq = new File("Produtos.txt"); 
                
        try{
            FileWriter fw = new FileWriter(arq);
            BufferedWriter buffW = new BufferedWriter (fw);
            for(int i=0; i< p.getProduto().size(); i++){
                buffW.write(p.getProduto().get(i).getCodigo()+ "|" + p.getProduto().get(i).getNome() + "|" + p.getProduto().get(i).getDescrição()
                        + "|" + p.getProduto().get(i).getQuantidade() + "|" + p.getProduto().get(i).getValor());
                
                buffW.newLine();//vai pra proxima linha uma linha
            }
            buffW.close();
            fw.flush();
        }catch(IOException e){ 
        
        }
      
                
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                File arq = new File("Produtos.txt"); 
                
        try{
            FileWriter fw = new FileWriter(arq);
            BufferedWriter buffW = new BufferedWriter (fw);
            for(int i=0; i< p.getProduto().size(); i++){
                buffW.write(p.getProduto().get(i).getCodigo()+ "|" + p.getProduto().get(i).getNome() + "|" + p.getProduto().get(i).getDescrição()
                        + "|" + p.getProduto().get(i).getQuantidade() + "|" + p.getProduto().get(i).getValor());
                
                buffW.newLine();//vai pra proxima linha uma linha
            }
            buffW.close();
            fw.flush();
        }catch(IOException e){ 
        
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProduto;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Descricao;
    private javax.swing.JButton EditProduto;
    private javax.swing.JButton ExcProduto;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton OKcod;
    private javax.swing.JButton OKnom;
    private javax.swing.JPanel Opções;
    private javax.swing.JPanel Pesquisa;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JPanel Tabela;
    private javax.swing.JLabel ValorUnitario;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable tabProdutos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtQua;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the indice
     */
    public static int getIndice() {
        return indice;
    }

    /**
     * @param aIndice the indice to set
     */
    public static void setIndice(int aIndice) {
        indice = aIndice;
    }
}
