package br.fag.pagamentos;

import br.fag.cadastro.Cadastro;
import br.fag.menu.Menu;
import br.fag.pedido.EntregarRetirar;

import java.util.Scanner;

import br.fag.cadastro.Cadastro;
import br.fag.pedido.ModoRetirarPedido;
import br.fag.pedido.tipoPedido.EnumTipoPedido;

public class Pagamentos {


    private static Cadastro cadastro = new Cadastro();

    private static EntregarRetirar finalizarPedido = new EntregarRetirar();

    public static Scanner entrada = new Scanner(System.in);

    private static double valorPago;

    public static void telaInicialPagamentos() throws InterruptedException {

        System.out.println("O valor total foi de R$" + Menu.getValorPizza());
        escolhaDoPagamento();
    }

    public static void escolhaDoPagamento() throws InterruptedException {
        System.out.println("\nEscolha o meio de pagamento:\n\n0. Cartão de Crédito/Débito/VR."
                + "\n1. Dinheiro.\n2. Pix.");
        Thread.sleep(1000);
        System.out.println("\nDigite o número do meio escolhido: ");
        Thread.sleep(1000);
        byte meioDePagamento = entrada.nextByte();
        Thread.sleep(1000);

        switch (meioDePagamento) {
            case 0:
                pagamentoPorCartao();
                break;
            case 1:
                pagamentoDinheiro();
                break;
            case 2:
                pagamentoEmPix();
                break;
            default:
                do {
                    System.out.println("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
                    meioDePagamento = entrada.nextByte();
                } while (meioDePagamento != 1 && meioDePagamento != 2 && meioDePagamento != 3);
                escolhaDoPagamento();
        }

    }

    public static void pagamentoDinheiro() throws InterruptedException {
        System.out.println("Pagamento em Dinheiro selecionado.\nPrecisa de troco?\n0. Sim.\n1. Não.");
        byte troco = entrada.nextByte();

        if (troco == 0) {
            sistemaDeTroco();
        } else if (troco == 1) {

        } else {
            do {
                System.out.println("Opção inválida. Digite 1 para tentar novamente.");
                troco = entrada.nextByte();
            } while (troco != 1 && troco != 2);

            pagamentoDinheiro();
        }
        finalizarPedido.Finalizar();
    }

    public static void sistemaDeTroco() throws InterruptedException {
        System.out.println("Para quanto?");
        valorPago = entrada.nextDouble();
        Thread.sleep(500);

        double troco = valorPago - Menu.getValorPizza();
        System.out.printf("Levaremos seu troco de R$" + troco);
    }

    public static void pagamentoEmPix() throws InterruptedException {
        System.out.println(
                "Pagamento por PIX selecionando.\nPara efetuar o pagamento copie e cole o código abaixo na aba PIX do aplicativo do seu banco.");
        Thread.sleep(1500);
        System.out.println("\n7163e29e-bdaf-4f02-b492-90e161b9ede7");
        Thread.sleep(10000);
        System.out.println("\nPagamento confirmado.");
        Thread.sleep(1500);

        finalizarPedido.Finalizar();
    }

    public static void pagamentoPorCartao() throws InterruptedException {
        System.out.println("Pagamento por cartão selecionado.\nSelecione a opção: ");
        Thread.sleep(500);

        System.out.println("\n1- Débito.\n2- Crédito (não parcelamos)\n3- Vale Refeição (VR).");
        byte opcaoDePagamento = entrada.nextByte();
        Thread.sleep(500);

        if (opcaoDePagamento == 1) {
            System.out.println("Cartão de Débito selecionado.");
            Thread.sleep(500);
            System.out.println("Escolha a bandeira referente ao seu cartão: ");
            Thread.sleep(500);
            System.out.println("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das opções acima.");
            byte bandeiraCartaoDebito = entrada.nextByte();
            Thread.sleep(500);

            switch (bandeiraCartaoDebito) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("O motoboy levará a máquininha.");
                    Thread.sleep(500);
                    break;
                case 5:
                    System.out.println(
                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
                    Thread.sleep(500);
                    mudarPagamento();
                default: do {
                    System.out.println("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
                    Thread.sleep(500);
                    bandeiraCartaoDebito = entrada.nextByte();
                } while(bandeiraCartaoDebito != 1);
                    escolhaDoPagamento();
            }
        } else if (opcaoDePagamento == 2) {
            System.out.println("Cartão de Crédito selecionado.");
            System.out.println("Escolha a bandeira referente ao seu cartão: ");
            System.out.println("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das opções acima.");
            byte bandeiraCartaoCredito = entrada.nextByte();

            switch (bandeiraCartaoCredito) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("O motoboy levará a máquininha.");
                    break;
                case 5:
                    System.out.println(
                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
                    mudarPagamento();
                default:
                    do {
                        System.out.println("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
                        bandeiraCartaoCredito = entrada.nextByte();
                        Thread.sleep(500);
                    } while (bandeiraCartaoCredito != 1);
                    escolhaDoPagamento();
            }

        } else if (opcaoDePagamento == 3) {
            System.out.println("Cartão Vale-Refeição selecionado.");
            Thread.sleep(500);
            System.out.println("Escolha a bandeira referente ao seu cartão: ");
            Thread.sleep(500);
            System.out.println("1- Alelo.\n2- Sodexo.\n3- Visa\n4- MasterCard\n5- Elo\n6- Nenhuma das opções acima.");
            byte bandeiraValeRefeicao = entrada.nextByte();
            Thread.sleep(500);

            switch (bandeiraValeRefeicao) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("O motoboy levará a máquininha.");
                    Thread.sleep(500);
                    break;
                case 6:
                    System.out.println(
                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
                    Thread.sleep(500);
                    mudarPagamento();
                default:
                    do {
                        System.out.println("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
                        bandeiraValeRefeicao = entrada.nextByte();
                        Thread.sleep(500);
                    } while (bandeiraValeRefeicao != 1);
                    escolhaDoPagamento();
            }

        } else if (opcaoDePagamento > 3 || opcaoDePagamento < 1) {
            do {
                System.out.println("Opção inválida. Digite 1 para tentar novamente.");
                opcaoDePagamento = entrada.nextByte();
                Thread.sleep(500);
            } while (opcaoDePagamento != 1 && opcaoDePagamento != 2 && opcaoDePagamento != 3);

            pagamentoPorCartao();
        }

        finalizarPedido.Finalizar();

    }

    public static void mudarPagamento() throws InterruptedException {
        escolhaDoPagamento();
    }
}
