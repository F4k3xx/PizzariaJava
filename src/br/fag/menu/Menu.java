package br.fag.menu;

import br.fag.produtos.Opcionais;
import br.fag.produtos.Pizza;
import br.fag.produtos.pizzaSabores.Sabores;

import java.util.Scanner;

public class Menu {

    private static int totalPizza;
    private static double valorPizza;
    private static Scanner sc;

    private static int tamanhoPizza;

    private Pizza qtdSabor;

    public Menu() {
    }

    public void Cardapio() throws InterruptedException {

        Opcionais opcionais = new Opcionais();

        sc = new Scanner(System.in);

        int pizza = 0, quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0, quant6 = 0, quant7 = 0, quant8 = 0, quant9 = 0, quant10 = 0;

        String continuar;

        do {
            System.out.println("=========== CATALOGO ===========");
            System.out.println("Escolha o tamanho da sua Pizza:\n"
                                + "1- Pequena\n"
                                + "2- Grande\n"
                                + "3- Gigante");

            tamanhoPizza = sc.nextInt();

            do{
                System.out.println("Escolha o tamanho da sua Pizza:\n"
                        + "1- Pequena\n"
                        + "2- Grande\n"
                        + "3- Gigante");
                tamanhoPizza = sc.nextInt();

            }while(tamanhoPizza < 1 || tamanhoPizza > 3);

            pizza = sc.nextInt();
            if (tamanhoPizza == 1){
                System.out.println("Você escolheu a pizza Pequena");
            } else if(tamanhoPizza == 2){
                System.out.println("Você escolheu a pizza Grande");
            } else {
                System.out.println("Você escolheu a pizza Gigante");
            }

            for (Sabores s : Sabores.values()) {
                System.out.println(s.ordinal() +"-" + "Sabor: " + s.name() + ": " + s.getPreco());
            }
            System.out.println("Digite o número da pizza que você quer:");

            pizza = sc.nextInt();

            System.out.println("Você escolheu a pizza de " + Sabores.);
            System.out.println("-> Quantas você deseja?");
            Thread.sleep(1000);
            quant1 = sc.nextInt();
            System.out.println("-> Deseja mais algum sabor? (S ou N)");
            Thread.sleep(1000);

            switch (pizza) {
                case 1:
                    System.out.println("Você escolheu a pizza de Mussarela!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant1 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 2:
                    System.out.println("Você escolheu a pizza de Calabresa!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant2 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 3:
                    System.out.println("Você escolheu a pizza de Moda da casa!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant3 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 4:
                    System.out.println("Você escolheu a pizza de Frango c/ Catupiry!");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant4 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 5:
                    System.out.println("Você escolheu a pizza de Portuguesa! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant5 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 6:
                    System.out.println("Você escolheu a pizza de Marguerita! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant6 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 7:
                    System.out.println("Você escolheu a pizza de Napolitana! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant7 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 8:
                    System.out.println("Você escolheu a pizza de 4 Queijos! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant8 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 9:
                    System.out.println("Você escolheu a pizza de Atum com cebola! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant9 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
                    break;
                case 10:
                    System.out.println("Você escolheu a pizza de Milho! \n");
                    System.out.println("-> Quantas você deseja?");
                    Thread.sleep(1000);
                    quant10 = sc.nextInt();
                    System.out.println("-> Deseja mais algum sabor? (S ou N)");
                    Thread.sleep(1000);
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
        while (!sc.next().equals("n".toLowerCase()));

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
