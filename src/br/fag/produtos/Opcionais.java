package br.fag.produtos;

import br.fag.produtos.Bebidas;

import java.util.Scanner;

public class Opcionais {

    private Scanner sc;

    public void EscolherOpcoes() throws InterruptedException {

        Bebidas bebidas = new Bebidas();

        sc = new Scanner(System.in);

        @SuppressWarnings("unused")
        int opcionais, quant1 = 0, quant2 = 0, totalop = 0;

        do {
            System.out.println("======= OPCIONAIS =======");
            System.out.println();

            System.out.println("1. Borda recheada");
            System.out.println("2. Catupiry Extra");
            Thread.sleep(1500);
            System.out.println("==== ESCOLHA UMA OPÇÃO ====");
            Thread.sleep(800);

            opcionais = sc.nextInt();

            switch(opcionais) {
                case 1:
                    System.out.println("Você escolheu borda recheada!");
                    Thread.sleep(1500);
                    break;
                case 2:
                    System.out.println("Você escolheu catupiry extra!");
                    Thread.sleep(1500);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    Thread.sleep(1500);
            }




            System.out.println("Deseja outra opcional? [s,n]-->");
            Thread.sleep(1000);
        }
        while(sc.next().equals("s".toLowerCase()));

        bebidas.catalogoBebidas();

    }
}
