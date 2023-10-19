package Trabalho.Controller;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.File;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    protected void setValue(Object value) {
        if (value instanceof File) {
            File imagemFile = (File) value;
            ImageIcon icon = new ImageIcon(imagemFile.getAbsolutePath());
            setIcon(icon);
            setText(""); // Remover texto para mostrar apenas a imagem
        } else {
            super.setValue(value);
        }
    }
}