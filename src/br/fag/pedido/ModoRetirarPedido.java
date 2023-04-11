package br.fag.pedido;

import br.fag.cadastro.Cadastro;
import br.fag.pagamentos.Pagamentos;

import java.util.Scanner;

public class ModoRetirarPedido {

    public Scanner leia = new Scanner(System.in);

    private Cadastro cadastro = new Cadastro();

    @SuppressWarnings("unused")
    private int modoEntrega;

    public void EscolherEntrega() throws InterruptedException{

        System.out.println("===== ENTREGA DO PEDIDO =====\n");
        Thread.sleep(2000);

        System.out.println("1. RETIRADA NO LOCAL\n"
                + "2. ENTREGA A DOMICÍLIO ");
        Thread.sleep(1000);
        System.out.println("-> Selecione a melhor opção para você: ");

        int modoEntrega = leia.nextInt();

        switch(modoEntrega) {
            case 1:
                System.out.println("===== RETIRADA NO LOCAL ====="
                        + "\n**Após confirmação do pagamento!!** ");
                Thread.sleep(2500);
                break;
            case 2:
                System.out.println("===== ENTREGA A DOMOCÍLIO ====="
                        + "\n*** Frete GRÁTIS *** "
                        + "\nEndereço de entrega registrado em cadastro: " + cadastro.getEndereco());
                Thread.sleep(2500);
                break;
            default:
                do {
                    System.out.println("Escolha uma opção válida!"
                            + "\n 'Digite 1 para retornar as opções...");
                    Thread.sleep(1500);
                    modoEntrega = leia.nextInt();
                } while (modoEntrega != 1 && modoEntrega != 2);

                EscolherEntrega();
        }

        Pagamentos.telaInicialPagamentos();

    }
}
