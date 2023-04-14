package br.fag.produtos.bebidas;

public enum EnumBebidas {

    AGUA(5),
    REFRIGERANTE(6),
    SUCO(6);

    private int preco;

    public int getPreco() {
        return preco;
    }

    EnumBebidas(int preco) {
        this.preco = preco;
    }
}
