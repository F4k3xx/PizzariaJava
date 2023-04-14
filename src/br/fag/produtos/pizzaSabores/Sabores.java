package br.fag.produtos.pizzaSabores;



public enum Sabores {

        // Sabores salgados
        CALABRESA(35.0),
        MUSSARELA(30.0),
        PORTUGUESA(40.0),
        FRANGO_COM_CATUPIRY(38.0),
        QUATRO_QUEIJOS(42.0),
        ATUM(36.0),
        BACON(39.0),
        MARGUERITA(33.0),
        PALMITO(37.0),
        ESCAROLA(38.0),

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

        private double preco;

        Sabores(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }
    }
