package it.unicam.cs.mpgc.rpg129669.model.entity;

import java.io.Serializable;

import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoDanno;
import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoOggetto;
import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoStat;

public class Oggetto implements Serializable {
    private int id;
    private String nome;
    private int bonus;
    private TipoStat tipoStat;
    private TipoDanno tipoDanno;
    private TipoOggetto tipoOggetto;
    private boolean ottenuto;
    private boolean equipaggiato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public TipoStat getTipoStat() {
        return tipoStat;
    }

    public void setTipoStat(TipoStat tipoStat) {
        this.tipoStat = tipoStat;
    }

    public TipoDanno getTipoDanno() {
        return tipoDanno;
    }

    public void setTipoDanno(TipoDanno tipoDanno) {
        this.tipoDanno = tipoDanno;
    }

    public TipoOggetto getTipoOggetto() {
        return tipoOggetto;
    }

    public void setTipoOggetto(TipoOggetto tipoOggetto) {
        this.tipoOggetto = tipoOggetto;
    }

    public boolean isOttenuto() {
        return ottenuto;
    }

    public void setOttenuto(boolean ottenuto) {
        this.ottenuto = ottenuto;
    }

    public boolean isEquipaggiato() {
        return equipaggiato;
    }

    public void setEquipaggiato(boolean equipaggiato) {
        this.equipaggiato = equipaggiato;
    }

}
