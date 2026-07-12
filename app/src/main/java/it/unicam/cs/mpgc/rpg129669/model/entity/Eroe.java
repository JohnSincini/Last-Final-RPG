package it.unicam.cs.mpgc.rpg129669.model.entity;

import java.io.Serializable;
import java.util.HashMap;

import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoStat;

public class Eroe implements Serializable{
    private String nome;
    private int lv;
    private int exp;
    private HashMap<TipoStat, Integer> statistiche;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public HashMap<TipoStat, Integer> getStatistiche() {
        return statistiche;
    }

    public void setStatistiche(HashMap<TipoStat, Integer> statistiche) {
        this.statistiche = statistiche;
    }

}
