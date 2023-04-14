package br.fag.pedido;

import br.fag.cadastro.Cadastro;
import br.fag.pedido.tipoPedido.EnumTipoPedido;

public class EntregarRetirar{

    Cadastro dados = new Cadastro();

    public void Finalizar() throws InterruptedException {

        System.out.println("Olá seu pedido foi feito com sucesso!");

        for(int i = 0; i <= 1; i++){
            System.out.println(".");
        }
        System.out.println("Obrigado por realizar seu pedido na Pizzaria FAG! Até logo!");

    }
}
