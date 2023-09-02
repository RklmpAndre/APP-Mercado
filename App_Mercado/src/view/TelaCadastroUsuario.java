/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import models.beans.Usuario;
import models.dao.UsuarioDAO;
import util.ValidaCPF;

/**
 *
 * @author 08050431
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    private UsuarioDAO uDAO;
    private Usuario usuario;
    
    
    public TelaCadastroUsuario() {
        uDAO = UsuarioDAO.getInstance();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        MaskFormatter CpfMask = null;
        try{
            CpfMask= new MaskFormatter("###.###.###-##");
        } catch (Exception e){
            e.printStackTrace();
        }
        cpfCampo = new javax.swing.JFormattedTextField(CpfMask);
        dataNascLabel = new javax.swing.JLabel();
        MaskFormatter dataMask = null;
        try{
            dataMask= new MaskFormatter("##/##/####");
        } catch (Exception e){
            e.printStackTrace();
        }
        dataCampo = new javax.swing.JFormattedTextField(dataMask);
        emailLabel = new javax.swing.JLabel();
        emailCampo = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JPasswordField();
        confirmarSenhaLabel = new javax.swing.JLabel();
        confirmarSenhaCampo = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        voltarButton = new javax.swing.JButton();
        logoIFRSTORE = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeLabel.setText("Nome");

        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        cpfLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cpfLabel.setText("CPF");

        cpfCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfCampoActionPerformed(evt);
            }
        });

        dataNascLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dataNascLabel.setText("Data de Nascimento");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emailLabel.setText("Email");

        emailCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCampoActionPerformed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        senhaLabel.setText("Senha");

        senhaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCampoActionPerformed(evt);
            }
        });

        confirmarSenhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmarSenhaLabel.setText("Confirmar senha");

        btnCadastro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeLabel)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(dataNascLabel)
                    .addComponent(senhaLabel)
                    .addComponent(senhaCampo)
                    .addComponent(dataCampo))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmarSenhaLabel)
                    .addComponent(emailLabel)
                    .addComponent(emailCampo)
                    .addComponent(cpfLabel)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmarSenhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataNascLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarSenhaLabel)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarSenhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        voltarButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        logoIFRSTORE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/APP-MERCADO__IFRStore_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(logoIFRSTORE)
                .addGap(300, 300, 300))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(logoIFRSTORE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed

    private void emailCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailCampoActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        boolean status = true;
        
        String nome = nomeCampo.getText();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Erro ao informar nome");
            nomeCampo.grabFocus();
            status = false;
        }
        
        String cpf = cpfCampo.getText();
        if (!ValidaCPF.isValido(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido !");
            status = false;
        }
        
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String email = emailCampo.getText();
        if (!email.matches(EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(null, "Endereço de email errado !");
            status = false;
        }
        

        String data = dataCampo.getText();
        LocalDate dataAniversario = null;
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            dataAniversario = LocalDate.parse(data, formato);
            if (dataAniversario.compareTo(hoje) > 0) {
                status = false;
                JOptionPane.showMessageDialog(this, "A data de aniversario deve ser anterior ao dia de hoje");
            }

        } catch (DateTimeParseException dex) {
            JOptionPane.showMessageDialog(this, "Erro ao informar a data de aniversario");
            status = false;
        }
        
        String senha = senhaCampo.getText();
        if (senha.isEmpty() || senha.length()<8){
            JOptionPane.showMessageDialog(this, "A senha deve ter pelo menos 8 digitos");
            senhaCampo.grabFocus();
            status = false;
        }
        
        String senha2 = confirmarSenhaCampo.getText();
        if (!senha.equals(senha2)){
            JOptionPane.showMessageDialog(this, "As senhas não conferem");
            confirmarSenhaCampo.grabFocus();
            status = false;
        }

        if (status) {
            usuario = new Usuario(nome, cpf, dataAniversario, email, senha);
            
            
            
            if (uDAO.create(usuario)) {
                JOptionPane.showMessageDialog(this, "Usuario cadastrado com sucesso!");
                new TelaPrincipal().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "CPF já cadastrado");
            }
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void cpfCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfCampoActionPerformed

    private void senhaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaCampoActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new TelaInicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JPasswordField confirmarSenhaCampo;
    private javax.swing.JLabel confirmarSenhaLabel;
    private javax.swing.JFormattedTextField cpfCampo;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JFormattedTextField dataCampo;
    private javax.swing.JLabel dataNascLabel;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoIFRSTORE;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPasswordField senhaCampo;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
