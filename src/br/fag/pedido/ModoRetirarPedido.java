package br.fag.pedido;

import br.fag.cadastro.Cadastro;
import br.fag.menu.Menu;
import br.fag.pagamentos.Pagamentos;
import br.fag.pedido.tipoPedido.EnumTipoPedido;
import br.fag.produtos.tamanho.EnumTamanho;

import java.util.Scanner;

public class ModoRetirarPedido {

    public Scanner leia = new Scanner(System.in);

    private Cadastro cadastro = new Cadastro();

    private int modoEntrega;

    private Menu menu = new Menu();

    public void EscolherEntrega() throws InterruptedException {

        System.out.println("===== TIPO DO PEDIDO =====\n");
        Thread.sleep(2000);

        System.out.println("1. RETIRADA NO BALCÃO\n"
                + "2. ENTREGA A DOMICÍLIO\n"
                + "3. ALACARTE");
        System.out.println("-> Selecione a melhor opção para você: ");

        int tipoPedido = leia.nextInt();

        System.out.println(EnumTipoPedido.values()[tipoPedido]);
        menu.Cardapio();


        do {
            System.out.println("Escolha uma opção válida!"
                    + "\n 'Digite 1 para retornar as opções...");
            Thread.sleep(1500);
            tipoPedido = leia.nextInt();
        } while (tipoPedido != 1 && tipoPedido != 2 && tipoPedido != 3);

        EscolherEntrega();
        Pagamentos.telaInicialPagamentos();

    }
}
