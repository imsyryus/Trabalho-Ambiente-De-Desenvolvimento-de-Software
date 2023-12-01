package com.trabalho;

import com.trabalho.racas.*;
import com.trabalho.tribos.*;

public class App {
    public static void main(String[] args) {
        final ReinoAgua reinoAgua = new ReinoAgua();
        final ReinoMago reinoMago = new ReinoMago();
        final Elfo racaElfo = new Elfo();
        final Humano racaHumano = new Humano();
        final Mago racaMago = new Mago ();
        final Personagem elfo1 = new Personagem("Elfo1", 100, racaElfo);
        final Personagem elfo2 = new Personagem("Elfo2", 100, racaElfo);
        final Personagem humano = new Personagem("syryus", 100, racaHumano);
        final Personagem mago = new Personagem ("Vanessa", 100, racaMago);
        reinoAgua.addPersonagem(humano);
        reinoAgua.addPersonagem(elfo1);
        reinoAgua.addPersonagem(elfo2);
        reinoAgua.mostrarPersonagens();
        elfo1.atacar(elfo2);
        reinoAgua.mostrarPersonagens();
        humano.atacar(humano);
        reinoMago.addPersonagem(mago);
    }
}
