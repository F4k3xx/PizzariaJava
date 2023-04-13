package br.fag.pedido.tipoPedido;

public enum EnumTipoPedido {
    RETIRADA_NO_BALCÃO(1),
    ENTREGA_A_DOMICÍLIO(2),
    ALACARTE(3);

    private int numeroDoTipoDoPedido;
    EnumTipoPedido() {
    }

    EnumTipoPedido(int numeroDoTipoDoPedido) {
        this.numeroDoTipoDoPedido = numeroDoTipoDoPedido;
    }

    public int getNumeroDoTipoDoPedido() {
        return numeroDoTipoDoPedido;
    }
}
