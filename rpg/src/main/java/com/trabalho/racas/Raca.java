package com.trabalho.racas;

import com.trabalho.armas.Arma;

public abstract class Raca {
  private String nome;
  private String descricao;
  private String habilidade;
  private String fraqueza;
  private Arma arma;
  private int forca;
  private int agilidade;
  private int inteligencia;

  public Raca(String nome, String descricao, String habilidade, String fraqueza, Arma arma, int forca, int agilidade, int inteligencia) {
    this.nome = nome;
    this.descricao = descricao;
    this.habilidade = habilidade;
    this.fraqueza = fraqueza;
    this.arma = arma;
    this.forca = forca;
    this.agilidade = agilidade;
    this.inteligencia = inteligencia;
  }

  public Raca(String name) {
    this.nome = name;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public String getHabilidade() {
    return this.habilidade;
  }

  public String getFraqueza() {
    return this.fraqueza;
  }

  public Arma getArma() {
    return this.arma;
  }

  public int getForca() {
    return this.forca;
  }

  public int getAgilidade() {
    return this.agilidade;
  }

  public int getInteligencia() {
    return this.inteligencia;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setHabilidade(String habilidade) {
    this.habilidade = habilidade;
  }

  public void setFraqueza(String fraqueza) {
    this.fraqueza = fraqueza;
  }

  public void setArma(Arma arma) {
    this.arma = arma;
  }
}
