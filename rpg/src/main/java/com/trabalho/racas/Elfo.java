package com.trabalho.racas;

import com.trabalho.armas.ArcoFlecha;

public class Elfo extends Raca{
  public Elfo() {
    super(
      "Elfo",
      "Elfos são criaturas mágicas da floresta, que vivem em harmonia com a natureza. São conhecidos por sua beleza e destreza.",
      "Visão Aguçada",
      "Fragilidade",
      new ArcoFlecha(),
      5,
      5,
      10
      );
  }
}
