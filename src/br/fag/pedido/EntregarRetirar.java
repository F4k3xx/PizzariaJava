package br.fag.pedido;

import br.fag.cadastro.Cadastro;

public class EntregarRetirar{

    Cadastro dados = new Cadastro();

    public void Finalizar() throws InterruptedException {

        System.out.println("Olá " + dados.getNome() + " seu pedido foi feito com sucesso!");

        for(int i = 0; i <= 2; i++){
            System.out.println(".");
        }
        System.out.println("============ Dados do pedido ================");
        System.out.println("O pedido vai ser entrefue para " + dados.getNome());
        System.out.println("Numero de telefone: " + dados.getTelefone());
        System.out.println("Endereço de entrega: " + dados.getEndereco());
        System.out.println("Seu pedido saiu para entrega ou está pronto para ser retirado");
        System.out.println("Obrigado por realizar seu pedido na Pizzaria FAG! Até logo!");

    }
}
