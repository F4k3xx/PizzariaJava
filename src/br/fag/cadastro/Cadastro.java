package br.fag.cadastro;

import java.util.Scanner;

public class Cadastro {

    public Scanner leitor = new Scanner(System.in);

    private static String nome;
    private static String telefone;
    private static String endereco;
    private static String usuario;
    private static String senha;

    public void cadastrarUsuario() throws InterruptedException {

        System.out.println(">>>>>> CADASTRO <<<<<<");
        System.out.println("-> Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("-> Digite seu telefone:");
        telefone = leitor.nextLine();

        System.out.println("-> Digite seu endereço:");
        endereco = leitor.nextLine();

        System.out.println("-> Digite seu nome de usuario:");
        usuario = leitor.nextLine();

        System.out.println("-> Digite sua senha:");
        senha = leitor.nextLine();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Cadastro.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        Cadastro.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        Cadastro.endereco = endereco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        Cadastro.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Cadastro.senha = senha;
    }
}
