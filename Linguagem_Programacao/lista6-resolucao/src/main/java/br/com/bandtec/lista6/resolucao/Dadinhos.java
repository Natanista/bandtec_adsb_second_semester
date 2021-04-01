/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista6.resolucao;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author natanista
 */
public class Dadinhos extends javax.swing.JFrame {
    
    private Integer dadinho1 = 0;
    private Integer dadinho2 = 0;
    private Integer vitoriasDado1 = 0;
    private Integer vitoriasDado2 = 0;
    

    /**
     * Creates new form Dadinhos
     */
    public Dadinhos() {
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

        btnSorteio = new javax.swing.JButton();
        lblDescricaoDado1 = new javax.swing.JLabel();
        lblDescricaoDado2 = new javax.swing.JLabel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblVitorias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSorteio.setText("Sortear dadinhos");
        btnSorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteioActionPerformed(evt);
            }
        });

        lblDescricaoDado1.setFont(new java.awt.Font("Hack", 0, 24)); // NOI18N
        lblDescricaoDado1.setText("Dadinho 1:");

        lblDescricaoDado2.setFont(new java.awt.Font("Hack", 0, 24)); // NOI18N
        lblDescricaoDado2.setText("Dadinho 2:");

        lblDado1.setFont(new java.awt.Font("Hack", 0, 24)); // NOI18N
        lblDado1.setText("0");

        lblDado2.setFont(new java.awt.Font("Hack", 0, 24)); // NOI18N
        lblDado2.setText("0");

        jLabel2.setText("Resultado:");

        lblResultado.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblResultado.setText("<>");

        lblVitorias.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricaoDado2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDado2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricaoDado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDado1))
                            .addComponent(btnSorteio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblResultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblVitorias)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoDado1)
                    .addComponent(lblDado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoDado2)
                    .addComponent(lblDado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSorteio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(lblVitorias)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String gerarAleatorio(){
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,7);
        return numeroAleatorio.toString();
    }
    
    public void apurarResultado(){
     String resultadoFinal = String.format("Vitórias dado 1: %d | Vitórias dado 2: %d", vitoriasDado1, vitoriasDado2);
    lblVitorias.setText(resultadoFinal);
    }
    
    
    public void verificarCampeao(Integer a, Integer b){
        if(a > b){
            lblResultado.setText("O dadinho 1 venceu!!!");
            vitoriasDado1++;
           
        }else if(a < b){
            lblResultado.setText("O dadinho 2 venceu!!!");
            vitoriasDado2++;
        }else{
            lblResultado.setText("Empate!!");
        }
    }
    
    private void btnSorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteioActionPerformed
           String dado1 = gerarAleatorio();
           String dado2 = gerarAleatorio();
           lblDado1.setText(dado1);
           lblDado2.setText(dado2);
           verificarCampeao(Integer.valueOf(dado1),Integer.valueOf(dado2));
           apurarResultado();
    }//GEN-LAST:event_btnSorteioActionPerformed

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
            java.util.logging.Logger.getLogger(Dadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dadinhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSorteio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblDescricaoDado1;
    private javax.swing.JLabel lblDescricaoDado2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblVitorias;
    // End of variables declaration//GEN-END:variables
}