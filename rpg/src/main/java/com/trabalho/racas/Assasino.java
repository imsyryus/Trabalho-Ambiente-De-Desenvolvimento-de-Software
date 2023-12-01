package com.trabalho.racas;

import com.trabalho.armas.Adagas;

public class Assasino extends Raca {
    public Assasino() {
        super(
                "Assasino",
                "Habilidoso com adagas e movimentação stelf",
                "Modo sombra",
                "pouca dureza",
                new Adagas(),
                7,
                9,
                5
                );
    }

}
