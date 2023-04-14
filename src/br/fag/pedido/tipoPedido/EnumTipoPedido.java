package br.fag.pedido.tipoPedido;

public enum EnumTipoPedido {

    RETIRADA_NO_BALCÃO(1, 0),
    ENTREGA_A_DOMICÍLIO(2, 1),
    ALACARTE(3, 2);

    private int numeroDoTipoDoPedido;
    public int valorConstante;

    EnumTipoPedido() {
    }

    EnumTipoPedido(int numeroDoTipoDoPedido, int valorConstante) {
        this.numeroDoTipoDoPedido = numeroDoTipoDoPedido;
        this.valorConstante = valorConstante;
    }

    public int getNumeroDoTipoDoPedido() {
        return numeroDoTipoDoPedido;
    }

    public int getValorConstante() {
        return valorConstante;
    }
}
