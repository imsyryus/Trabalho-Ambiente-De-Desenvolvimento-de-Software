package com.trabalho.armas;

public abstract class Arma {
  private String nome;
  private String descricao;
  private int dano;
  private int nivel;

  public Arma(String nome, String descricao, int dano, int nivel) {
    this.nome = nome;
    this.descricao = descricao;
    this.dano = dano;
    this.nivel = nivel;
  }

  public String getNome() {
    return this.nome;
  }

  public int getNivel() {
    return this.nivel;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public int getDano() {
    return this.dano * this.nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
}
