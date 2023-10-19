package Trabalho.Model;

import java.awt.Image;

public class Pizza {

    private String nome;
    private String preco;
    private String ingredientes;
    private Image imagem;

    public Pizza(String nome, String preco, String ingredientes, Image imagem) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.imagem = imagem;
    }

    public Pizza(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }
}
