package br.fag.cadastro;

import br.fag.menu.Menu;
import br.fag.pedido.ModoRetirarPedido;

import java.util.Scanner;

public class TelaInicial {

    private static Scanner sc;

    private static Cadastro cadastro = new Cadastro();

    public static Scanner entrada = new Scanner(System.in);

    private Menu menu = new Menu();

    private ModoRetirarPedido modoRetirarPedido = new ModoRetirarPedido();

    public void SaudarUsuario() throws InterruptedException {

        int opcao = 0;
        System.out.println("Olá! Seja bem-vinde a Pizzaria FAG!");
        modoRetirarPedido.EscolherEntrega();
        //EscolherOpcoesMenu();
    }
}
