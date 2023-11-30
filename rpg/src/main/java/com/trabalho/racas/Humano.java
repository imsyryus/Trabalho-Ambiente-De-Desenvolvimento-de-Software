package com.trabalho.racas;

import com.trabalho.armas.Espada;

public class Humano extends Raca{
    public Humano() {
        super(
            "Humano",
            "Versáteis e adaptáveis, os humanos destacam-se pela diversidade em habilidades",
            "Adaptabilidade Inata",
            "Limitação Efêmera",
            new Espada(),
            8,
            7,
            6
        );
    }
}
