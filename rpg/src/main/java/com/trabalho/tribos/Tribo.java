package com.trabalho.tribos;

import java.util.ArrayList;
import java.util.List;

public abstract class Tribo<T> {
  private String nome;
  private String descricao;
  private List<T> personagens = new ArrayList<T>();

  public Tribo(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public String toString() {
    return this.nome + " - " + this.descricao;
  }

  public void addPersonagem(T personagem) {
    this.personagens.add(personagem);
  }

  public void removePersonagem(T personagem) {
    this.personagens.remove(personagem);
  }

  public void mostrarPersonagens() {
    for (T personagem : this.personagens) {
      System.out.println(personagem);
    }
  }

  public List<T> getPersonagens() {
    return this.personagens;
  }

  public T getPersonagem(int index) {
    return this.personagens.get(index);
  }
}
