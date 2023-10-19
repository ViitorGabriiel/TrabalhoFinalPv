package Trabalho.Controller;

import Trabalho.Model.Cliente;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FicharioLogin {

    ArrayList<Cliente> clientes = new ArrayList<>();

    public FicharioLogin() {
        clientes = lerClientesDoArquivo("cliente.txt");
    }

    private boolean verificaEmail(String emailverif) {

        for (Cliente cli : clientes) {
            if (cli.getEmail().equals(emailverif)) {
                return true;
            }
        }
        return false;

    }

    public boolean verificaCpf(String cpfverif) {

        for (Cliente cli : clientes) {
            if (cli.getCpf().equals(cpfverif)) {
                return true;
            }
        }
        return false;

    }

    // MEXER COM ARRAYLIST
    public boolean cadastrarCliente(Cliente cliente) {

        if (clientes.size() == 0) {
            salvarCliente(cliente);
            clientes.add(cliente);
            return true;
        } else {
            if (verificaEmail(cliente.getEmail())) {
                return false;
            } else {
                salvarCliente(cliente);
                clientes.add(cliente);
                return true;
            }
        }
    }

    //====== funções que nao sei fazer por que edwar nao ensinou
    private void salvarCliente(Cliente cliente) {
        String senhaCriptografada = criptografarSenha(cliente.getSenha());
        cliente.setSenha(senhaCriptografada);

        try {
            FileWriter fileWriter = new FileWriter("cliente.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("CPF: " + cliente.getCpf());
            bufferedWriter.newLine();
            bufferedWriter.write("Nome: " + cliente.getNome());
            bufferedWriter.newLine();
            bufferedWriter.write("Email: " + cliente.getEmail());
            bufferedWriter.newLine();
            bufferedWriter.write("Senha: " + cliente.getSenha());
            bufferedWriter.newLine();
            bufferedWriter.write("Contato: " + cliente.getContato());
            bufferedWriter.newLine();
            bufferedWriter.write("Rua: " + cliente.getRua());
            bufferedWriter.newLine();
            bufferedWriter.write("Bairro: " + cliente.getBairro());
            bufferedWriter.newLine();
            bufferedWriter.write("Numero: " + cliente.getNumero());
            bufferedWriter.newLine();
            bufferedWriter.write("PontoReferencia: " + cliente.getPontoReferencia());
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
        }
    }

    private String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(senha.getBytes());

            StringBuilder senhaCriptografada = new StringBuilder();
            for (byte b : bytes) {
                senhaCriptografada.append(String.format("%02x", b));
            }

            return senhaCriptografada.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public ArrayList<Cliente> lerClientesDoArquivo(String nomeArquivo) {
        try ( BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String line;
            Cliente cliente = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("CPF: ")) {
                    cliente = new Cliente();
                    cliente.setCpf(line.substring("CPF: ".length()));
                } else if (line.startsWith("Nome: ")) {
                    cliente.setNome(line.substring("Nome: ".length()));
                } else if (line.startsWith("Email: ")) {
                    cliente.setEmail(line.substring("Email: ".length()));
                } else if (line.startsWith("Senha: ")) {
                    cliente.setSenha(line.substring("Senha: ".length()));
                } else if (line.startsWith("Contato: ")) {
                    cliente.setContato(line.substring("Contato: ".length()));
                } else if (line.startsWith("Rua: ")) {
                    cliente.setRua(line.substring("Rua: ".length()));
                } else if (line.startsWith("Bairro: ")) {
                    cliente.setBairro(line.substring("Bairro: ".length()));
                } else if (line.startsWith("Numero: ")) {
                    cliente.setNumero(line.substring("Numero: ".length()));
                } else if (line.startsWith("PontoReferencia: ")) {
                    cliente.setPontoReferencia(line.substring("PontoReferencia: ".length()));
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
        }
        return clientes;
    }

    public void atualizarCliente(String cpf, Cliente clienteAtualizado) {
        try {
            File file = new File("cliente.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String linha;

            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("CPF: " + cpf)) {
                    // Encontrou o cliente a ser atualizado
                    writer.write("CPF: " + cpf);
                    writer.newLine();
                    writer.write("Nome: " + clienteAtualizado.getNome());
                    writer.newLine();
                    writer.write("Email: " + clienteAtualizado.getEmail());
                    writer.newLine();
                    writer.write("Senha: " + clienteAtualizado.getSenha());
                    writer.newLine();
                    writer.write("Contato: " + clienteAtualizado.getContato());
                    writer.newLine();
                    writer.write("Rua: " + clienteAtualizado.getRua());
                    writer.newLine();
                    writer.write("Bairro: " + clienteAtualizado.getBairro());
                    writer.newLine();
                    writer.write("Numero: " + clienteAtualizado.getNumero());
                    writer.newLine();
                    writer.write("PontoReferencia: " + clienteAtualizado.getPontoReferencia());
                    writer.newLine();

                    // Pule as linhas do cliente antigo no arquivo original
                    for (int i = 0; i < 8; i++) {
                        reader.readLine();
                    }
                } else {
                    // Copie as informações dos outros clientes
                    writer.write(linha);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            // Renomeie o arquivo temporário para o original
            if (file.delete()) {
                tempFile.renameTo(file);
            }
        } catch (IOException e) {
            // Lide com exceções, se necessário
        }
    }

    public boolean alteraSenha(Cliente cliente, String senhaNov, String senhaAntig) {
        String senhaAntiga = criptografarSenha(senhaAntig);
        String senhaNova = criptografarSenha(senhaNov);
        if (cliente.getSenha().equals(senhaAntiga)) {
            cliente.setSenha(senhaNova);
            atualizarCliente(cliente.getCpf(), cliente);
            return true;
        } else {
            return false;
        }
    }

    //============= funções para acessar tela
    public Cliente verificaLogin(String email, String senha) {
        Cliente cliAcess = null;
        String senhaComparada = criptografarSenha(senha);

        for (Cliente cli : clientes) {
            if (cli.getEmail().equals(email) && cli.getSenha().equals(senhaComparada)) {
                cliAcess = cli;
                return cliAcess;
            }
        }
        return cliAcess;
    }
}
