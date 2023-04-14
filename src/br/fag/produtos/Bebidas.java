package br.fag.produtos;

import br.fag.pagamentos.Pagamentos;
import br.fag.pedido.ModoRetirarPedido;

import java.util.Scanner;

public class Bebidas {

    private static Scanner sc;

    private static int totalbebidas = 0;

    private int soma;

    public int catalogoBebidas() throws InterruptedException {

        ModoRetirarPedido retirar = new ModoRetirarPedido();

        sc = new Scanner(System.in);

        int bebidas = 0, quant1 = 0, quant2 = 0, quant3 = 0, totalBebidas = 0;
        String continuar;

        do {
            System.out.println("======= BEBIDAS =======");
            Thread.sleep(2000);

            System.out.println("1. Refrigerante - R$5.0");
            System.out.println("2. Água - R$6.0");
            System.out.println("3. Suco - R$7.0");
            System.out.println(">>>>> Escolha o número da sua bebida! <<<<<<");
            bebidas = sc.nextInt();
            int valorBebida = 0;

            switch(bebidas) {
                case 1:
                    System.out.println("Você escolheu Refrigerante!");
                    System.out.println("Quantos você deseja?");
                    quant1 = sc.nextInt();
                    valorBebida += 5;
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 2:
                    System.out.println("Você escolheu Água!");
                    System.out.println("Quantas você deseja?");
                    quant2 = sc.nextInt();
                    valorBebida += 6;
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 3:
                    System.out.println("Você escolheu Suco!");
                    System.out.println("Quantos você deseja?");
                    quant3 = sc.nextInt();
                    valorBebida += 7;
                    System.out.println("Deseja mais alguma bebida? (S ou N)");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            continuar = sc.next();
            totalBebidas = quant1 + quant2 + quant3;
            soma = totalBebidas * valorBebida;

        }
        while(continuar.equals("s") || continuar.equals("S"));

        System.out.println("Valor bebidas " + soma);

        return soma;
    }
}