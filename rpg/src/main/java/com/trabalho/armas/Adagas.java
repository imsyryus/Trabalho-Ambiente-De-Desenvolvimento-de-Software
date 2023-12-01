package com.trabalho.armas;

public class Adagas extends Arma {
    public Adagas(){
        super("adagas","adagas muito afiadas,",10,1);
    }
    
    public Adagas(String complemento, int nivel, int dano) {
    super("Adaga - " + complemento, "Arma de curto alcance", dano, nivel);
  }
}
