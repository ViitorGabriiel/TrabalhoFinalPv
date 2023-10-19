package Trabalho.View;

import Trabalho.Controller.FicharioLogin;
import Trabalho.Model.Cliente;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    Cliente clienteAcessado = null;
    FicharioLogin fl = new FicharioLogin();

    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        mmLoginCadastro.setEnabled(true);
        mmLogout.setEnabled(false);
        mmaltera.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        mmLoginCadastro = new javax.swing.JMenuItem();
        mmLogout = new javax.swing.JMenuItem();
        mmaltera = new javax.swing.JMenuItem();
        menuPizza = new javax.swing.JMenu();
        menuPedido = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/telaacessoconta.jpeg"))); // NOI18N

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/usuario.png"))); // NOI18N
        menuUsuario.setText("Usuário");

        mmLoginCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/login.png"))); // NOI18N
        mmLoginCadastro.setText("Login / Cadastro");
        mmLoginCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmLoginCadastroDadosUsuario(evt);
            }
        });
        menuUsuario.add(mmLoginCadastro);

        mmLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/sair.png"))); // NOI18N
        mmLogout.setText("Logout");
        mmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmLogoutActionPerformed(evt);
            }
        });
        menuUsuario.add(mmLogout);

        mmaltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/dadoscadastrados.png"))); // NOI18N
        mmaltera.setText("Alterar dados cadastrais");
        mmaltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmalteraActionPerformed(evt);
            }
        });
        menuUsuario.add(mmaltera);

        jMenuBar1.add(menuUsuario);

        menuPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/pizza.png"))); // NOI18N
        menuPizza.setText("Pizzas +");
        jMenuBar1.add(menuPizza);

        menuPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/pedido.png"))); // NOI18N
        menuPedido.setText("Pedido");
        jMenuBar1.add(menuPedido);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmLoginCadastroDadosUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmLoginCadastroDadosUsuario
        TelaLogin tl = new TelaLogin(this, true, fl, this);
        tl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tl.setLocationRelativeTo(this);
        tl.setVisible(true);
    }//GEN-LAST:event_mmLoginCadastroDadosUsuario

    private void mmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmLogoutActionPerformed
        clienteAcessado = null;
        mmLoginCadastro.setEnabled(true);
        mmLogout.setEnabled(false);
        mmaltera.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Usuário deslogado com sucesso");
    }//GEN-LAST:event_mmLogoutActionPerformed

    private void mmalteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmalteraActionPerformed
       TelaAlterarDados tad = new TelaAlterarDados(this, true, fl, clienteAcessado, this);
       tad.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       tad.setLocationRelativeTo(this);
       tad.setVisible(true);
    }//GEN-LAST:event_mmalteraActionPerformed

    public void receberLogin(Cliente cli) {
        clienteAcessado = cli;

        if (clienteAcessado != null) {
            mmLoginCadastro.setEnabled(false);
            mmLogout.setEnabled(true);
            mmaltera.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JMenu menuPizza;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem mmLoginCadastro;
    private javax.swing.JMenuItem mmLogout;
    private javax.swing.JMenuItem mmaltera;
    // End of variables declaration//GEN-END:variables

}
