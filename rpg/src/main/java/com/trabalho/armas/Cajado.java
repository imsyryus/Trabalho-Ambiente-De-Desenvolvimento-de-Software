package com.trabalho.armas;

public class Cajado extends  Arma{
    public Cajado(){
        super("Cajado","cajado magico",10,1);
    }  

    public Cajado(String complemento, int nivel, int dano) {
        super("Cajado -" + complemento,"Arma do mago",dano,nivel);
    }
}
