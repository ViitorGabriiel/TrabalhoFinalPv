package Trabalho.View;

public class TelaAdministrador extends javax.swing.JDialog {

    public TelaAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JMenuBar();
        menuPizza = new javax.swing.JMenu();
        cadPizza = new javax.swing.JMenuItem();
        menuPedido = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menuPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/pizza.png"))); // NOI18N
        menuPizza.setText("Pizzas +");

        cadPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/pizzadd.png"))); // NOI18N
        cadPizza.setText("Cadastrar pizza");
        cadPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPizzaActionPerformed(evt);
            }
        });
        menuPizza.add(cadPizza);

        menuPrincipal.add(menuPizza);

        menuPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trabalho/Imagens/pedido.png"))); // NOI18N
        menuPedido.setText("Log pedidos");
        menuPrincipal.add(menuPedido);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPizzaActionPerformed
        this.dispose();
        TelaCadastroPizza tcp = new TelaCadastroPizza(new javax.swing.JFrame(), true);
        tcp.setLocationRelativeTo(this);
        tcp.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_cadPizzaActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadPizza;
    private javax.swing.JMenu menuPedido;
    private javax.swing.JMenu menuPizza;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
