package com.trabalho.armas;

import com.trabalho.armas.Arma;

public class Porrete extends Arma {
    public Porrete() {
        super("Porrete", " taco ou bastão mais grosso numa das extremidade", 15, 1);
    }

    public Porrete(String complemento, int nivel, int dano) {
        super("Porrete - " + complemento, "Arma Ogro", dano, nivel);
    }
}