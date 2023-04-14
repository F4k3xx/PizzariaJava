package br.fag.produtos.bebidas;

import br.fag.pedido.ModoRetirarPedido;

import java.util.Scanner;

public class Bebidas {

    private static Scanner sc;

    public void catalogoBebidas() throws InterruptedException {

        sc = new Scanner(System.in);

        int bebidas = 0, quant1 = 0, quant2 = 0, quant3 = 0, totalBebidas = 0;
        String continuar;

        do {
            System.out.println("======= BEBIDAS =======");

            System.out.println("1. Refrigerante");
            System.out.println("2. Água");
            System.out.println("3. Suco");

            System.out.println(">>>>> Escolha o número da sua bebida! <<<<<<");
            bebidas = sc.nextInt();

            switch(bebidas) {
                case 1:
                    System.out.println("Você escolheu Refrigerante!");
                    System.out.println("Quantos você deseja?");
                    quant1 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 2:
                    System.out.println("Você escolheu Água!");
                    System.out.println("Quantas você deseja?");
                    quant2 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 3:
                    System.out.println("Você escolheu Suco!");
                    System.out.println("Quantos você deseja?");
                    quant3 = sc.nextInt();
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    catalogoBebidas();

            }

            continuar = sc.next();
            totalBebidas = quant1 + quant2 + quant3;

        }
        while(continuar.equals("s") || continuar.equals("S"));
    }
}
