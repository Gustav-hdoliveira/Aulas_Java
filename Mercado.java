/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ArrayList;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Mercado extends javax.swing.JFrame {

    /**
     * Creates new form Mercado
     */
    public Mercado() {
        initComponents();
        Eletronicos ProdutosEletronicos = new Eletronicos();
        Alimentos ProdutosAlimentos = new Alimentos();
        Utencilios ProdutosUtencilios = new Utencilios();
        String[] EletrosNomes = ProdutosEletronicos.nomes;
        double[] EletrosPrecos = ProdutosEletronicos.precos;
        ArrayList<EletrosNomes> NomeEletronicos = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        TituloAtacado = new javax.swing.JLabel();
        PainelPromotion = new javax.swing.JPanel();
        TextPromo = new javax.swing.JLabel();
        TextPromo1 = new javax.swing.JLabel();
        PainelProdutos = new javax.swing.JPanel();
        AlimentosBox = new javax.swing.JComboBox<>();
        ItensBox = new javax.swing.JComboBox<>();
        EletroBox = new javax.swing.JComboBox<>();
        TextProdutosDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTitulo.setBackground(new java.awt.Color(255, 51, 51));

        TituloAtacado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloAtacado.setText("Mercado Atacado");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloAtacado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(TituloAtacado)
                .addGap(22, 22, 22))
        );

        PainelPromotion.setBackground(new java.awt.Color(102, 102, 255));

        TextPromo.setBackground(new java.awt.Color(255, 204, 0));
        TextPromo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextPromo.setText("Fogão por 7% de desconto.");

        TextPromo1.setBackground(new java.awt.Color(255, 204, 0));
        TextPromo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextPromo1.setText("Promocão! 5 Alvejantes por 6");

        javax.swing.GroupLayout PainelPromotionLayout = new javax.swing.GroupLayout(PainelPromotion);
        PainelPromotion.setLayout(PainelPromotionLayout);
        PainelPromotionLayout.setHorizontalGroup(
            PainelPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPromotionLayout.createSequentialGroup()
                .addGroup(PainelPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPromotionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextPromo1))
                    .addGroup(PainelPromotionLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TextPromo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPromotionLayout.setVerticalGroup(
            PainelPromotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPromotionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TextPromo1)
                .addGap(18, 18, 18)
                .addComponent(TextPromo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PainelProdutos.setBackground(new java.awt.Color(255, 204, 0));

        AlimentosBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AlimentosBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlimentosBoxActionPerformed(evt);
            }
        });

        ItensBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ItensBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItensBoxActionPerformed(evt);
            }
        });

        EletroBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EletroBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EletroBoxActionPerformed(evt);
            }
        });

        TextProdutosDisp.setText("Produtos disponiveis.");

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextProdutosDisp)
                .addGap(58, 58, 58)
                .addComponent(AlimentosBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(ItensBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(EletroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlimentosBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItensBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EletroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextProdutosDisp))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(PainelPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlimentosBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlimentosBoxActionPerformed
        
    }//GEN-LAST:event_AlimentosBoxActionPerformed

    private void ItensBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItensBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItensBoxActionPerformed

    private void EletroBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EletroBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EletroBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AlimentosBox;
    private javax.swing.JComboBox<String> EletroBox;
    private javax.swing.JComboBox<String> ItensBox;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JPanel PainelPromotion;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JLabel TextProdutosDisp;
    private javax.swing.JLabel TextPromo;
    private javax.swing.JLabel TextPromo1;
    private javax.swing.JLabel TituloAtacado;
    // End of variables declaration//GEN-END:variables
}
