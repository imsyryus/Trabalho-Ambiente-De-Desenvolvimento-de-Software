package com.trabalho.racas;

import com.trabalho.armas.Porrete;

public class Ogro extends Raca{
  public Ogro() {
    super(
      "Ogro",
      "Ogros são gigantes de aparência grotesca e ameaçadora, que se alimentam de carne humana.",
      "Grande força e defesa",
      "Fragilidade",
      new Porrete(),
      10,
      1,
      1
      );
  }
}
