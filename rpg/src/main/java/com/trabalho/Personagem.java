package com.trabalho;

import com.trabalho.armas.Arma;
import com.trabalho.racas.Raca;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int agilidade;
    private int inteligencia;
    private Arma arma;
    private int nivel = 1;
    
    public Personagem(String nome, int vida, Raca raca) {
        this.nome = nome;
        this.vida = vida;
        this.arma = raca.getArma();
        this.forca = raca.getForca();
        this.agilidade = raca.getAgilidade();
        this.inteligencia = raca.getInteligencia();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getVida() {
        return this.vida * this.nivel;
    }
    
    public int getForca() {
        return this.forca * this.nivel;
    }
    
    public int getAgilidade() {
        return this.agilidade * this.nivel;
    }
    
    public int getInteligencia() {
        return this.inteligencia * this.nivel;
    }
    
    public Arma getArma() {
        return this.arma;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public void atacar(Personagem personagem) {
        personagem.setVida(personagem.getVida() - (this.getForca() + this.getArma().getDano()));
    }

    public void showStatus() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Vida: " + this.getVida());
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Inteligência: " + this.getInteligencia());
        System.out.println("Arma: " + this.getArma().getNome());
        System.out.println("Dano: " + this.getArma().getDano());
    }

    public String toString() {
        return "Nome: " + this.getNome() + " - Vida: " + this.getVida() + " - Força: " + this.getForca() + " - Agilidade: " + this.getAgilidade() + " - Inteligência: " + this.getInteligencia() + " - Arma: " + this.getArma().getNome() + " - Dano: " + this.getArma().getDano();
    }
}
