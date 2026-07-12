package it.unicam.cs.mpgc.rpg129669.model.entity;

import java.io.Serializable;
import java.util.HashMap;

import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoDanno;
import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoStat;

public class Mostro implements Serializable{
    private String nome;
    private int lv;
    private HashMap<TipoStat, Integer> stats;
    private TipoDanno debolezza;
    private TipoDanno resistenza;
    private HashMap<Float, Integer> drop = new HashMap<>();

    public Mostro(String nome, int lv, int pot, int def, int vel, int elu, TipoDanno deb, TipoDanno res) {
        this.nome = nome;
        this.lv = lv;
        stats = new HashMap<>();
        stats.put(TipoStat.POTENZA, pot);
        stats.put(TipoStat.VELOCITA, vel);
        stats.put(TipoStat.DIFESA, def);
        stats.put(TipoStat.ELUSIONE, elu);
        debolezza = deb;
        resistenza = res;
    }
    public Mostro() {}

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

    public HashMap<TipoStat, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<TipoStat, Integer> stats) {
        this.stats = stats;
    }

    public TipoDanno getDebolezza() {
        return debolezza;
    }

    public void setDebolezza(TipoDanno debolezza) {
        this.debolezza = debolezza;
    }

    public TipoDanno getResistenza() {
        return resistenza;
    }

    public void setResistenza(TipoDanno resistenza) {
        this.resistenza = resistenza;
    }

    public HashMap<Float, Integer> getDrop() {
        return drop;
    }

    public void setDrop(HashMap<Float, Integer> drop) {
        this.drop = drop;
    }

}
