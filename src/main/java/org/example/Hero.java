package org.example;

public class Hero {
    private String name;
    private String superPower;
    private Integer powerLevel;

    public Hero(String n, String p, Integer pl){
        name = n;
        superPower = p;
        powerLevel = pl;
    }

    public String svolgimentoMissione(Integer num){
        if(powerLevel < num) {
            throw new EroeNonIdoneoException("L'eroe è troppo debole per la missione");
        }
        return "Eroe della potenza necessaria ha svolto la missione.";
    }

    public Integer getPowerLevel(){
        return powerLevel;
    }
}
