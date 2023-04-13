package br.fag.produtos.tamanho;

public enum EnumTamanho {
    PEQUENA(1, 0),
    GRANDE(2, 1),
    GIGANTE(3, 2);

    private int quantidadesDesabor;
    public int valorConstante;

    EnumTamanho() {
    }

    EnumTamanho(int quantidadesDesabor, int valorConstante) {
        this.quantidadesDesabor = quantidadesDesabor;
        this.valorConstante = valorConstante;
    }

    public int getQuantidadesDesabor() {
        return quantidadesDesabor;
    }
    public int getValorConstante() {
        return valorConstante;
    }
}
