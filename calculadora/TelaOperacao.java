/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import java.text.DecimalFormat;

/**
 *
 * @author Layanne55896236
 */
public class TelaOperacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaOperacao
     */
    public TelaOperacao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        lbResultado = new javax.swing.JLabel();
        btSoma = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        cbOperacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero1:");

        jLabel2.setText("Numero2:");

        lbResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbResultado.setText("Resultado:");

        btSoma.setText("Soma");
        btSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSomaMouseClicked(evt);
            }
        });

        btMultiplicacao.setText("Multiplicacao");
        btMultiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMultiplicacaoMouseClicked(evt);
            }
        });

        btDivisao.setText("Divisao");
        btDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDivisaoMouseClicked(evt);
            }
        });

        cbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma operacao", "Divisao", "Multiplicacao", "Soma", "Subtracao" }));
        cbOperacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOperacaoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(numero2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(cbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1002, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btSoma)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btMultiplicacao)
                .addGap(19, 19, 19)
                .addComponent(lbResultado)
                .addGap(18, 18, 18)
                .addComponent(btDivisao)
                .addGap(83, 83, 83)
                .addComponent(cbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSomaMouseClicked
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double soma = num1+num2;
        lbResultado.setText("Resultado: "+soma);
        
       
    }//GEN-LAST:event_btSomaMouseClicked

    private void btMultiplicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMultiplicacaoMouseClicked
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double multiplicacao = num1*num2;
        lbResultado.setText("Resultado: "+multiplicacao);
    }//GEN-LAST:event_btMultiplicacaoMouseClicked

    private void btDivisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDivisaoMouseClicked
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double divisao = num1/num2;
        DecimalFormat formatarDecimal = new DecimalFormat("###,##0.00");
        lbResultado.setText("Resultado: "+formatarDecimal.format(divisao));
    }//GEN-LAST:event_btDivisaoMouseClicked

    private void cbOperacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOperacaoItemStateChanged
        if(cbOperacao.getSelectedItem().equals("Soma")){
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double soma= num1+num2;
        lbResultado.setText("Resultado: "+soma);
        
        }else if(cbOperacao.getSelectedItem().equals("Multiplicacao")){
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double multiplicacao = num1*num2;
        lbResultado.setText("Resultado: "+multiplicacao);
        
        }else if(cbOperacao.getSelectedItem().equals("Divisao")){
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double divisao = num1/num2;
        DecimalFormat formatarDecimal = new DecimalFormat("###,##0.00");
        lbResultado.setText("Resultado: "+formatarDecimal.format(divisao));
        
        }else if (cbOperacao.getSelectedItem().equals("Subtracao")){
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        double Subtracao = num1-num2;
        lbResultado.setText("Resultado: "+Subtracao);
        
        
    }//GEN-LAST:event_cbOperacaoItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOperacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btSoma;
    private javax.swing.JComboBox<String> cbOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    // End of variables declaration//GEN-END:variables
}
