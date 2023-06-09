/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.sql.*;
import Conecte.Conexao;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class TelaCadastro extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst =null;
    ResultSet rs = null;

    /**
     * Creates new form Cadastro
     */
    public TelaCadastro() {
        initComponents();
        
        conexao = Conexao.conector();
        System.out.println(conexao);
    }
    
    
    private void cadastrar(){
        String sql ="insert into usuario(nome_usuario,cpf_cnpj_usuario,telefone_usuario,email_usuario,dt_nascimento_usuario,logradouro_usuario,numero_usuario,bairro_usuario,complemento_usuario,cidade_usuario,estado_usuario,cep_usuario,username_usuario,senha_usuario,senha_confirm_usuario) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
    
        
        try {
            pst=conexao.prepareStatement(sql);
            pst.setString(1,Inome.getText());
            pst.setString(2,Icpfcnpj.getText());
            pst.setString(3,Itelefone.getText());
            pst.setString(4,Iemail.getText());
            pst.setString(5,Inascimento.getText());
            pst.setString(6,Ilogradouro.getText());
            pst.setString(7,Inumero.getText());
            pst.setString(8,Ibairro.getText());
            pst.setString(9,Icomplemento.getText());
            pst.setString(10,Icidade.getText());
            pst.setString(11,Iestado.getText());
            pst.setString(12,Icep.getText());
            pst.setString(13,Iusuario.getText());
            pst.setString(14,Isenha.getText());
            pst.setString(15,Iconfirmesenha.getText());
            
            pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
           
                TelaDoacao doacao = new TelaDoacao();
                doacao.setVisible(true);
                this.dispose();
                conexao.close();
            
          
            
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Itelefone = new javax.swing.JTextField();
        Iemail = new javax.swing.JTextField();
        Inascimento = new javax.swing.JTextField();
        Inumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Icomplemento = new javax.swing.JTextField();
        Icep = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Iestado = new javax.swing.JTextField();
        Iconfirmesenha = new javax.swing.JPasswordField();
        Isenha = new javax.swing.JPasswordField();
        Iusuario = new javax.swing.JTextField();
        Icpfcnpj = new javax.swing.JTextField();
        Ibairro = new javax.swing.JTextField();
        Icidade = new javax.swing.JTextField();
        Ilogradouro = new javax.swing.JTextField();
        Inome = new javax.swing.JTextField();
        Btmcadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(480, 380));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF/CNPJ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        Itelefone.setBackground(new java.awt.Color(255, 255, 255));
        Itelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Itelefone.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Itelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, -1));

        Iemail.setBackground(new java.awt.Color(255, 255, 255));
        Iemail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Iemail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Iemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, -1));

        Inascimento.setBackground(new java.awt.Color(255, 255, 255));
        Inascimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Inascimento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Inascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 170, -1));

        Inumero.setBackground(new java.awt.Color(255, 255, 255));
        Inumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Inumero.setForeground(new java.awt.Color(0, 0, 0));
        Inumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InumeroActionPerformed(evt);
            }
        });
        jPanel1.add(Inumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 80, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefone");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dt de nascimento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Login");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cadastre-se");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Número");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 20));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dados Pessoais");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nome");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Bairro");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 20));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CEP");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 20));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Complemento");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, 20));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cidade");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, 20));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Confirme Senha");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, -1, 20));

        Icomplemento.setBackground(new java.awt.Color(255, 255, 255));
        Icomplemento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Icomplemento.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Icomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, -1));

        Icep.setBackground(new java.awt.Color(255, 255, 255));
        Icep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Icep.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Icep, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Estado");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 20));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Endereço");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Logradouro");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 20));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Usuario");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, 20));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Senha");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, 20));

        Iestado.setBackground(new java.awt.Color(255, 255, 255));
        Iestado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Iestado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Iestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, 30));

        Iconfirmesenha.setBackground(new java.awt.Color(255, 255, 255));
        Iconfirmesenha.setForeground(new java.awt.Color(0, 0, 0));
        Iconfirmesenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconfirmesenhaActionPerformed(evt);
            }
        });
        jPanel1.add(Iconfirmesenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 260, 30));

        Isenha.setBackground(new java.awt.Color(255, 255, 255));
        Isenha.setForeground(new java.awt.Color(0, 0, 0));
        Isenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsenhaActionPerformed(evt);
            }
        });
        jPanel1.add(Isenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 230, 30));

        Iusuario.setBackground(new java.awt.Color(255, 255, 255));
        Iusuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Iusuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Iusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 230, -1));

        Icpfcnpj.setBackground(new java.awt.Color(255, 255, 255));
        Icpfcnpj.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Icpfcnpj.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Icpfcnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 270, 30));

        Ibairro.setBackground(new java.awt.Color(255, 255, 255));
        Ibairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ibairro.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Ibairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 30));

        Icidade.setBackground(new java.awt.Color(255, 255, 255));
        Icidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Icidade.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Icidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 270, 30));

        Ilogradouro.setBackground(new java.awt.Color(255, 255, 255));
        Ilogradouro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ilogradouro.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Ilogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, 30));

        Inome.setBackground(new java.awt.Color(255, 255, 255));
        Inome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Inome.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Inome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, 30));

        Btmcadastrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Btmcadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Btmcadastrar.setText("Cadastrar");
        Btmcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmcadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(Btmcadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_black.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InumeroActionPerformed

    private void IconfirmesenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconfirmesenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IconfirmesenhaActionPerformed

    private void IsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsenhaActionPerformed

    private void BtmcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmcadastrarActionPerformed
        cadastrar();
       
    }//GEN-LAST:event_BtmcadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btmcadastrar;
    private javax.swing.JTextField Ibairro;
    private javax.swing.JTextField Icep;
    private javax.swing.JTextField Icidade;
    private javax.swing.JTextField Icomplemento;
    private javax.swing.JPasswordField Iconfirmesenha;
    private javax.swing.JTextField Icpfcnpj;
    private javax.swing.JTextField Iemail;
    private javax.swing.JTextField Iestado;
    private javax.swing.JTextField Ilogradouro;
    private javax.swing.JTextField Inascimento;
    private javax.swing.JTextField Inome;
    private javax.swing.JTextField Inumero;
    private javax.swing.JPasswordField Isenha;
    private javax.swing.JTextField Itelefone;
    private javax.swing.JTextField Iusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
