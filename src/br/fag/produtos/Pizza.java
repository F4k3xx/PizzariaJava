package br.fag.produtos;

public class Pizza {

    private static String tamanho;

    public Pizza() {
    }

    public static String getTamanho() {
        return tamanho;
    }

    public static void setTamanho(String tamanho) {
        Pizza.tamanho = tamanho;
    }
}
