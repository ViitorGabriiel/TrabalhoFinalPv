package Trabalho.Controller;

import Trabalho.Model.Pizza;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class PizzaTableModel extends AbstractTableModel {

    private List<Pizza> pizzas;
    private String[] colunas = {"Nome", "Preço", "Ingredientes", "Imagem"};

    public PizzaTableModel() {
        pizzas = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return pizzas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pizza pizza = pizzas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pizza.getNome();
            case 1:
                return pizza.getPreco();
            case 2:
                return pizza.getIngredientes();
            case 3:
                return pizza.getImagem();
            default:
                return null;
        }
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        fireTableRowsInserted(pizzas.size() - 1, pizzas.size() - 1);
    }

    public TableCellRenderer getTableCellRenderer(int largura, int altura) {
        return new ImagemRenderer(largura, altura);
    }

    private class ImagemRenderer extends JLabel implements TableCellRenderer {

        private int largura;
        private int altura;

        public ImagemRenderer(int largura, int altura) {
            setOpaque(true);
            this.largura = largura;
            this.altura = altura;
        }

        @Override
        public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Image) {
                ImageIcon icon = new ImageIcon(((Image) value).getScaledInstance(largura, altura, Image.SCALE_SMOOTH));
                setIcon(icon);
                setText("");
            } else {
                setIcon(null);
                setText("");
            }
            return this;
        }
    }
    
public void salvarPizza(Pizza pizza, String caminho) {
    try {
        FileWriter fileWriter = new FileWriter("pizza.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Nome: " + pizza.getNome());
        bufferedWriter.newLine();
        bufferedWriter.write("Ingredientes: " + pizza.getIngredientes());
        bufferedWriter.newLine();
        bufferedWriter.write("Preço: " + pizza.getPreco());
        bufferedWriter.newLine();
        bufferedWriter.write("Caminho: " + caminho);
        bufferedWriter.newLine();
        
        bufferedWriter.close();
        fileWriter.close();
    } catch (IOException e) {
    }
}
    
    
    
    
    
}
