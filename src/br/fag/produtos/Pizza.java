package br.fag.produtos;

public class Pizza {

    //Quantidade de sabores
    private int pizzaTamanhoPequena = 1;
    private int PizzaTamanhoGrande = 2;
    private int PizzaTamanhoGigante = 3;

    public Pizza() {
    }

    public Pizza(int pizzaTamanhoPequena, int PizzaTamanhoGrande, int PizzaTamanhoGigante) {
        this.pizzaTamanhoPequena = pizzaTamanhoPequena;
        this.PizzaTamanhoGrande = PizzaTamanhoGrande;
        this.PizzaTamanhoGigante = PizzaTamanhoGigante;
    }


    public int getPizzaTamanhoPequena() {
        return pizzaTamanhoPequena;
    }

    public void setPizzaTamanhoPequena(int pizzaTamanhoPequena) {
        this.pizzaTamanhoPequena = pizzaTamanhoPequena;
    }

    public int getPizzaTamanhoGrande() {
        return PizzaTamanhoGrande;
    }

    public void setPizzaTamanhoGrande(int PizzaTamanhoGrande) {
        this.PizzaTamanhoGrande = PizzaTamanhoGrande;
    }

    public int getPizzaTamanhoGigante() {
        return PizzaTamanhoGigante;
    }

    public void setPizzaTamanhoGigante(int PizzaTamanhoGigante) {
        this.PizzaTamanhoGigante = PizzaTamanhoGigante;
    }
}
