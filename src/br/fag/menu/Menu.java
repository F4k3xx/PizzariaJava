package br.fag.menu;

import br.fag.produtos.Opcionais;
import br.fag.produtos.pizzaSabores.Sabores;
import br.fag.produtos.tamanho.EnumTamanho;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static int totalPizza;
    private static double valorPizza;
    private static Scanner sc;

    public Menu() {
    }

    public void Cardapio() throws InterruptedException {

        Opcionais opcionais = new Opcionais();

        sc = new Scanner(System.in);

        int tamanho = 0;
        int pizza = 0;
        String continuar;

        do {
            System.out.println("=========== CATALOGO ===========");
            System.out.println("Pequena = 1 Sabor");
            System.out.println("Grande =  2 Sabor");
            System.out.println("Gigante = 3 Sabor");
            System.out.println("Escolha o tamanho da sua Pizza:");
            System.out.println("[0]- Pequena, [1]- Grande, [2]- Gigante");
            tamanho = sc.nextInt();

            System.out.println(EnumTamanho.values()[tamanho]);

            System.out.println("Escolha o sabor da sua pizza!");

            for (Sabores s : Sabores.values()) {
                System.out.println(s.ordinal() +"-" + "Sabor: " + s.name() + ": " + s.getPreco());
            }

            int tamanhoSelecionado = List.of(EnumTamanho.values()).get(tamanho).getQuantidadesDesabor();
            for (int i = 0;  i <= tamanhoSelecionado; i++) {
                System.out.println("Digite o número da pizza que você quer:");
                pizza = sc.nextInt();
                System.out.println(Sabores.values()[pizza]);
            }
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
