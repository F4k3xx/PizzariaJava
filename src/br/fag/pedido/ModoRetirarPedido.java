package br.fag.pedido;

import br.fag.cadastro.Cadastro;
import br.fag.menu.Menu;
import br.fag.pagamentos.Pagamentos;
import br.fag.pedido.tipoPedido.EnumTipoPedido;
import br.fag.produtos.bebidas.Bebidas;

import java.util.Scanner;

public class ModoRetirarPedido {



    public Scanner leia = new Scanner(System.in);

    private Cadastro cadastro = new Cadastro();

    private int modoEntrega;

    private Menu menu = new Menu();

    public void EscolherEntrega() throws InterruptedException {

        int tipoPedido = 0;

        do {
            System.out.println("=========== TIPO DO PEDIDO ===========");
            System.out.println("[0]. RETIRADA NO BALCÃO\n"
                             + "[1]. ENTREGA A DOMICÍLIO\n"
                             + "[2]. ALACARTE");

            System.out.println("-> Selecione a melhor opção para você: ");

            tipoPedido = leia.nextInt();

            if (tipoPedido == 0 || tipoPedido == 1 || tipoPedido == 2){
                System.out.println(EnumTipoPedido.values()[tipoPedido]);
                menu.Cardapio();
            }

        } while (tipoPedido != 1 && tipoPedido != 2 && tipoPedido != 3);

    }
}
