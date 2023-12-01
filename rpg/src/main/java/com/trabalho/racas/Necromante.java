package com.trabalho.racas;

import com.trabalho.armas.ArmaFaca;

public class Necromante extends Raca{
  public Necromante() {
    super(
      "Necromante",
      "Necromantes são magos que mechem com magia das Trevas",
      "Magia",
      "Cura",
      new ArmaFaca(),
      5,
      7,
      10
      );
  }
}
