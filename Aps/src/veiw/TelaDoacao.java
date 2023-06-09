/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.sql.*;
import Conecte.Conexao;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

/**
 *
 * @author User
 */
public class TelaDoacao extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst =null;
    ResultSet rs = null;

    /**
     * Creates new form Doacao
     */
    public TelaDoacao() {
        initComponents();
        
        conexao = Conexao.conector();
        System.out.println(conexao);
    }
    
    
    private void doar(){
        String sql ="insert into doacoes(alimento,quantidade,peso,validade) values(?,?,?,?)";
       
    
        
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1,Ialimento1.getSelectedItem().toString());
            pst.setString(2,Iquantidade1.getText());
            pst.setString(3,Ipeso1.getText());
            pst.setString(4,Ivalidade1.getText());
            
        
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Doação realizada com sucesso");
          
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Ivalidade1 = new javax.swing.JTextField();
        Ipeso1 = new javax.swing.JTextField();
        Iquantidade1 = new javax.swing.JTextField();
        Btmdoar = new javax.swing.JButton();
        Ialimento1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_black.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doação");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faça sua doação");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 80, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Validade");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 70, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alimento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, -1));

        Ivalidade1.setBackground(new java.awt.Color(255, 255, 255));
        Ivalidade1.setForeground(new java.awt.Color(0, 0, 0));
        Ivalidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ivalidade1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ivalidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 320, 30));

        Ipeso1.setBackground(new java.awt.Color(255, 255, 255));
        Ipeso1.setForeground(new java.awt.Color(0, 0, 0));
        Ipeso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ipeso1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ipeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 320, 30));

        Iquantidade1.setBackground(new java.awt.Color(255, 255, 255));
        Iquantidade1.setForeground(new java.awt.Color(0, 0, 0));
        Iquantidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iquantidade1ActionPerformed(evt);
            }
        });
        jPanel1.add(Iquantidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 320, 30));

        Btmdoar.setBackground(new java.awt.Color(153, 153, 153));
        Btmdoar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btmdoar.setForeground(new java.awt.Color(255, 255, 255));
        Btmdoar.setText("Doar");
        Btmdoar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmdoarActionPerformed(evt);
            }
        });
        jPanel1.add(Btmdoar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 270, 50));

        Ialimento1.setBackground(new java.awt.Color(255, 255, 255));
        Ialimento1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Ialimento1.setForeground(new java.awt.Color(0, 0, 0));
        Ialimento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "Feijão", "Arroz", "Macarrão", "Açucar", "Sal", "Òleo", "Farinha de Trigo", "Vinagre", "Bolacha" }));
        Ialimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ialimento1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ialimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 320, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_black.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmdoarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmdoarActionPerformed
       doar();
    }//GEN-LAST:event_BtmdoarActionPerformed

    private void Iquantidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iquantidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iquantidade1ActionPerformed

    private void Ipeso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ipeso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ipeso1ActionPerformed

    private void Ivalidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ivalidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ivalidade1ActionPerformed

    private void Ialimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ialimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ialimento1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btmdoar;
    private javax.swing.JComboBox<String> Ialimento1;
    private javax.swing.JTextField Ipeso1;
    private javax.swing.JTextField Iquantidade1;
    private javax.swing.JTextField Ivalidade1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
