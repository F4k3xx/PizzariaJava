package br.fag.cadastro;

import java.util.Scanner;

public class Cadastro {

    //commit
    public Scanner leitor = new Scanner(System.in);

    private static String nome;
    private static String telefone;
    private static String endereco;

    public void cadastrarUsuario() {

        System.out.println(">>>>>> CADASTRO <<<<<<");
        System.out.println("-> Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("-> Digite seu telefone:");
        telefone = leitor.nextLine();

        System.out.println("-> Digite seu endereço:");
        endereco = leitor.nextLine();

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

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) {
        Cadastro.endereco = endereco;
    }

}
