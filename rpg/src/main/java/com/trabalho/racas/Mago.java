package com.trabalho.racas;

import com.trabalho.armas.Cajado;

public class Mago extends Raca{
    public Mago() {
        super(
                "Mago",
                "Poderosos usam armas mágicas para poder abater os inimigos",
                "Poder magico ",
                "pouca resistencia a armas fisicas",
                new Cajado(),
                5,
                4,
                10
                );
    }
}
