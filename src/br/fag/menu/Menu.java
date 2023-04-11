package br.fag.menu;

import br.fag.produtos.Opcionais;

import java.util.Scanner;

public class Menu {

    private static int totalPizza;
    private static double valorPizza;
    private static Scanner sc;

    public void Cardapio() throws InterruptedException {

        Opcionais opcionais = new Opcionais();

        sc = new Scanner(System.in);

        int pizza = 0, quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0, quant6 = 0, quant7 = 0, quant8 = 0, quant9 = 0, quant10 = 0;
        String continuar;

        do {
            System.out.println("=========== CATALOGO ===========");
            System.out.println("Escolha o sabor da sua pizza!");

            System.out.println("1. Muçarela		            R$36,00");
            System.out.println("2. Calabresa		        R$36,00");
            System.out.println("3. Moda da casa		        R$36,00");
            System.out.println("4. Frango c/ Catupiry	    R$36,00");
            System.out.println("5. Portuguesa		        R$36,00");
            System.out.println("6. Marguerita		        R$36,00");
            System.out.println("7. Napolitana		        R$36,00");
            System.out.println("8. 4 Queijos		        R$36,00");
            System.out.println("9. Atum com cebola	    	R$36,00");
            System.out.println("10. Milho		            R$36,00");

            System.out.println("Digite o número da pizza que você quer:");

            pizza = sc.nextInt();

            switch(pizza) {
                case 1:
                    System.out.println("Você escolheu a pizza de Mussarela!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant1 = sc.nextInt();
                    System.out.println("-> Deseja mais alguma pizza? (S ou N)");
                    Thread.sleep(1560);
                    break;
                case 2:
                    System.out.println("Você escolheu a pizza de Calabresa!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant2 = sc.nextInt();
                    System.out.println("-> Deseja mais alguma pizza? (S ou N)");
                    Thread.sleep(1560);
                    break;
                case 3:
                    System.out.println("Você escolheu a pizza de Moda da casa!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant3 = sc.nextInt();
                    System.out.println("-> Deseja mais alguma pizza? (S ou N)");
                    Thread.sleep(1560);
                    break;
                case 4:
                    System.out.println("Você escolheu a pizza de Frango c/ Catupiry!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant4 = sc.nextInt();
                    System.out.println("-> Deseja mais alguma pizza? (S ou N)");
                    Thread.sleep(1560);
                    break;
                case 5:
                    System.out.println("Você escolheu a pizza de Portuguesa! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant5 = sc.nextInt();
                    System.out.println("-> Deseja mais alguma pizza? (S ou N)");
                    Thread.sleep(1560);

                    break;
                default:
                    System.out.println("Opção inválida!");
                    Thread.sleep(800);
                    System.out.println("Deseja escolher alguma pizza? (S ou N)");
                    Thread.sleep(1060);
                    break;
            }

            totalPizza = quant1 + quant2 + quant3 + quant4 + quant5 + quant6 + quant7 + quant8 + quant9 + quant10;

        }
        while(!sc.next().equals("n".toLowerCase()));

        System.out.println("Você está pedindo " + totalPizza + " pizzas");
        Thread.sleep(1500);



        opcionais.EscolherOpcoes();
    }

    public static double getValorPizza() {
        return Menu.totalPizza * 36;
    }

    public void setValorPizza(double valorPizza) {
        this.valorPizza = totalPizza;
        System.out.println(valorPizza);
    }
}
