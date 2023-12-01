package com.trabalho.armas;

public class ArmaFaca extends Arma {
  public ArmaFaca() {
    super("Faca", "Arma de curto alcance", 10, 1);
  }

  public ArmaFaca(String complemento, int nivel, int dano) {
    super("Faca - " + complemento, "Arma de curto alcance", dano, nivel);
  }
}
