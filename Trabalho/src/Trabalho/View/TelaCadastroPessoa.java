package Trabalho.View;

import Trabalho.Controller.FicharioLogin;
import Trabalho.Model.Cliente;
import javax.swing.JOptionPane;

public class TelaCadastroPessoa extends javax.swing.JDialog {

    FicharioLogin fl;

    public TelaCadastroPessoa(java.awt.Frame parent, boolean modal, FicharioLogin filog) {
        super(parent, modal);
        initComponents();
        fl = filog;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNum = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfContato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfNumRes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPontoReferencia = new javax.swing.JTextField();
        btConcluirCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfNum.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        tfCpf.setBackground(new java.awt.Color(102, 153, 255));
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfSomenteNumeros(evt);
            }
        });

        tfEmail.setBackground(new java.awt.Color(102, 153, 255));

        tfContato.setBackground(new java.awt.Color(102, 153, 255));
        tfContato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contatoSomenteNumeros(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Senha");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Contato");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dados para endereço");
        jLabel7.setMinimumSize(new java.awt.Dimension(370, 35));
        jLabel7.setPreferredSize(new java.awt.Dimension(370, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome");

        tfSenha.setBackground(new java.awt.Color(102, 153, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("CPF");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/icon-cad.png"))); // NOI18N
        jLabel1.setText("  Cadastro");
        jLabel1.setMaximumSize(new java.awt.Dimension(370, 35));

        tfNome.setBackground(new java.awt.Color(102, 153, 255));
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeSomenteLetras(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Rua");

        tfRua.setBackground(new java.awt.Color(102, 153, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Bairro");

        tfBairro.setBackground(new java.awt.Color(102, 153, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Número da residência");

        tfNumRes.setBackground(new java.awt.Color(102, 153, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ponto de refência");

        tfPontoReferencia.setBackground(new java.awt.Color(102, 153, 255));

        btConcluirCad.setBackground(new java.awt.Color(0, 0, 102));
        btConcluirCad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConcluirCad.setForeground(new java.awt.Color(255, 255, 255));
        btConcluirCad.setText("Concluir cadastro");
        btConcluirCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfNumLayout = new javax.swing.GroupLayout(tfNum);
        tfNum.setLayout(tfNumLayout);
        tfNumLayout.setHorizontalGroup(
            tfNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(tfNumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tfNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail)
                    .addComponent(tfSenha)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfContato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNumRes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPontoReferencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tfNumLayout.createSequentialGroup()
                        .addGroup(tfNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfNumLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btConcluirCad)))
                .addContainerGap())
        );
        tfNumLayout.setVerticalGroup(
            tfNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfNumLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btConcluirCad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //============================================================= RESTRIÇÃO DE TEXTS

    private void nomeSomenteLetras(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeSomenteLetras
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nomeSomenteLetras

    private void cpfSomenteNumeros(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfSomenteNumeros
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_cpfSomenteNumeros

    private void contatoSomenteNumeros(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contatoSomenteNumeros
        String caracteres = "()0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_contatoSomenteNumeros

    //============================================================= AÇÕES BOTÕES

    private void btConcluirCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirCadActionPerformed
        Cliente novoCliente = new Cliente();

        if (tfEmail.getText().trim().equals("")) {//verifica email
            JOptionPane.showMessageDialog(this, "Preencha seu e-mail");
        } else {
            novoCliente.setEmail(tfEmail.getText());
            if (tfSenha.getText().trim().equals("")) {//verifica senha
                JOptionPane.showMessageDialog(this, "Preencha sua senha");
            } else {
                novoCliente.setSenha(tfSenha.getText());
                if (tfNome.getText().trim().equals("")) {//verifica nome
                    JOptionPane.showMessageDialog(this, "Preencha seu nome");
                } else {
                    novoCliente.setNome(tfNome.getText());
                    if (tfCpf.getText().trim().equals("")) {//verifica cpf
                        JOptionPane.showMessageDialog(this, "Preencha seu CPF");
                    } else {
                        if (fl.verificaCpf(tfCpf.getText())) {// modifica~ção aqui
                            JOptionPane.showMessageDialog(this, "CPF não valido");
                        } else {
                            novoCliente.setCpf(tfCpf.getText());
                            if (tfContato.getText().trim().equals("")) {//verifica contato
                                JOptionPane.showMessageDialog(this, "Preencha seu contato");
                            } else {
                                novoCliente.setContato(tfContato.getText());
                                // VERIFICAR ENDEREÇO
                                if (tfRua.getText().trim().equals("")) {//verifica rua
                                    JOptionPane.showMessageDialog(this, "Preencha a rua");
                                } else {
                                    novoCliente.setRua(tfRua.getText());
                                    if (tfBairro.getText().trim().equals("")) {//verifica bairro
                                        JOptionPane.showMessageDialog(this, "Preencha o bairro");
                                    } else {
                                        novoCliente.setBairro(tfBairro.getText());
                                        if (tfNumRes.getText().trim().equals("")) {//verifica numero da casa
                                            JOptionPane.showMessageDialog(this, "Digite o número da residência");
                                        } else {
                                            novoCliente.setNumero(tfNumRes.getText());
                                            if (tfPontoReferencia.getText().trim().equals("")) {//verifica ponto de referencia
                                                JOptionPane.showMessageDialog(this, "Coloque um ponto de referência");
                                            } else {
                                                novoCliente.setPontoReferencia(tfPontoReferencia.getText());

                                                if (fl.cadastrarCliente(novoCliente)) {
                                                    JOptionPane.showMessageDialog(this, "Você foi cadastrado, faça login");
                                                    this.dispose();
                                                } else {
                                                    JOptionPane.showMessageDialog(this, "Email já existe, use outro email");
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

    }//GEN-LAST:event_btConcluirCadActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConcluirCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPanel tfNum;
    private javax.swing.JTextField tfNumRes;
    private javax.swing.JTextField tfPontoReferencia;
    private javax.swing.JTextField tfRua;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
