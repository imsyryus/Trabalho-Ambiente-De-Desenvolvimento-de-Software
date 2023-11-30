package com.trabalho.armas;

public class ArcoFlecha extends Arma {
  public ArcoFlecha() {
    super("Arco e Flecha", "Arma de longo alcance", 10, 1);
  }

  public ArcoFlecha(String complemento, int nivel, int dano) {
    super("Arco e Flecha - " + complemento, "Arma de longo alcance", dano, nivel);
  }
}
