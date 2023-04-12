package br.fag.produtos.pizzaSabores;



public enum Sabores {

        // Sabores salgados
        CALABRESA(1, 35.0, "Calabresa"),
        MUSSARELA(2, 30.0, "Mussarela"),
        PORTUGUESA(3, 40.0, "PORTUGUESA"),
        FRANGO_COM_CATUPIRY(4,38.0, "FRANGO_COM_CATUPIRY"),
        QUATRO_QUEIJOS(5, 42.0, "QUATRO_QUEIJOS"),
        ATUM(6,36.0, "ATUM"),
        BACON(7, 39.0, "BACON"),
        MARGUERITA(8, 33.0, "MARGUERITA"),
        PALMITO(9,37.0, "PALMITO"),
        ESCAROLA(10,38.0, "ESCAROLA"),

        // Sabores doces
        CHOCOLATE(30.0),
        BRIGADEIRO(32.0),
        ROMEU_E_JULIETA(34.0),
        BANANA_COM_CANELA(31.0),
        MORANGO_COM_NUTELLA(35.0),

        // Sabores mistos
        FRANGO_COM_REQUEIJAO(40.0),
        CALABRESA_COM_CREAM_CHEESE(43.0),
        QUATRO_QUEIJOS_COM_CALABRESA(45.0),
        BACON_COM_FRANGO(42.0),
        PALMITO_COM_BACON(44.0);

        private final int chave;

        private final String saborPizza;

        private final double preco;

        public String getSaborPizza() {
                return saborPizza;
        }

        public void setSaborPizza(String saborPizza) {
                this.saborPizza = saborPizza;
        }

        Sabores(int chave, double preco, String sabor) {
            this.chave = chave;
            this.preco = preco;
            this.saborPizza = sabor;
        }

        public double getPreco() {
            return preco;
        }
    }
