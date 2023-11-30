package com.trabalho.armas;

public class Espada extends Arma {
  public Espada() {
    super("Espada", "Espada afiada", 10, 1);
  }

  public Espada(String complemento, int nivel, int dano) {
    super("Espada - " + complemento, "Arma Humana", dano, nivel);
  }
}
