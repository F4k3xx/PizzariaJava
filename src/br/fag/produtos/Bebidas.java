package br.fag.produtos;

import br.fag.pedido.ModoRetirarPedido;

import java.util.Scanner;

public class Bebidas {

    private static Scanner sc;

    public void catalogoBebidas() throws InterruptedException {

        ModoRetirarPedido retirar = new ModoRetirarPedido();

        sc = new Scanner(System.in);

        int bebidas = 0, quant1 = 0, quant2 = 0, quant3 = 0, totalBebidas = 0;
        String continuar;

        do {
            System.out.println("======= BEBIDAS =======");
            Thread.sleep(2000);

            System.out.println("1. Refrigerante");
            System.out.println("2. Água");
            System.out.println("3. Suco");
            System.out.println(">>>>> Escolha o número da sua bebida! <<<<<<");
            Thread.sleep(1000);
            bebidas = sc.nextInt();

            switch(bebidas) {
                case 1:
                    System.out.println("Você escolheu Refrigerante!");
                    Thread.sleep(1500);
                    System.out.println("Quantos você deseja?");
                    quant1 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 2:
                    System.out.println("Você escolheu Água!");
                    Thread.sleep(1500);
                    System.out.println("Quantas você deseja?");
                    quant2 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 3:
                    System.out.println("Você escolheu Suco!");
                    Thread.sleep(1500);
                    System.out.println("Quantos você deseja?");
                    quant3 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Thread.sleep(1500);
            }

            continuar = sc.next();
            totalBebidas = quant1 + quant2 + quant3;

        }
        while(continuar.equals("s") || continuar.equals("S"));

        System.out.println("Você escolheu " + totalBebidas + " bebidas");



        retirar.EscolherEntrega();

    }
}
