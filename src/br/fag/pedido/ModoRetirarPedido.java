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

        System.out.println("1. RETIRADA NO BALCÃO\n"
                        + "2. ENTREGA A DOMICÍLIO\n "
                        + "3. ALACARTE");
        Thread.sleep(1000);
        System.out.println("-> Selecione a melhor opção para você: ");

        int tipoPedido = leia.nextInt();

        switch(tipoPedido) {
            case 1:
                System.out.println("===== RETIRADA NO BALCÃO ====="
                        + "\n**Após confirmação do pagamento!!** ");
                Thread.sleep(2500);
                break;
            case 2:
                System.out.println("===== ENTREGA A DOMOCÍLIO ====="
                        + "\n*** Frete GRÁTIS *** "
                        + "\nEndereço de entrega registrado em cadastro: " + cadastro.getEndereco());
                Thread.sleep(2500);
                break;
            case 3:
                System.out.println("===== ALACARTE ====="
                        + "\nNos informe o número da sua mesa");
                int numeroDaMesa = leia.nextInt();
                System.out.println("Sua mesa é: " + numeroDaMesa);
                Thread.sleep(2500);
                break;
            default:
                do {
                    System.out.println("Escolha uma opção válida!"
                            + "\n 'Digite 1 para retornar as opções...");
                    Thread.sleep(1500);
                    tipoPedido = leia.nextInt();
                } while (tipoPedido != 1 && tipoPedido != 2 && tipoPedido != 3);

                EscolherEntrega();
        }

        Pagamentos.telaInicialPagamentos();

    }
}
