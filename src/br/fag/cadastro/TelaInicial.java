package br.fag.cadastro;

import br.fag.menu.Menu;
import br.fag.pedido.ModoRetirarPedido;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class TelaInicial {

    private static Cadastro cadastro = new Cadastro();

    public static Scanner entrada = new Scanner(System.in);

    private Menu menu = new Menu();

    private ModoRetirarPedido modoRetirarPedido = new ModoRetirarPedido();

    public void SaudarUsuario() throws InterruptedException {

        System.out.println("Olá! Seja bem-vinde a Pizzaria FAG!");
        System.out.println("Nesse aplicativo, você seleciona as opções selecionando os números correspondentes a ela");

        modoRetirarPedido.EscolherEntrega();
        EscolherOpcoesMenu();

    }

    public void EscolherOpcoesMenu() throws InterruptedException {

        System.out.println("Para iniciar, selecione uma opção: ");
        System.out.println("1. Quero me cadastrar");    //Ok
        System.out.println("2. Sair");  //Ok
        System.out.print("Digite sua escolha: ");

        int escolha = (entrada.nextInt());

        if (escolha == 1) {

            cadastro.cadastrarUsuario();
            menu.Cardapio();

        } else if (escolha == 2) {

            System.out.println("VocÃª saiu do programa");

        } else {
            System.out.println("Opção inválida!");
        }
    }
}
