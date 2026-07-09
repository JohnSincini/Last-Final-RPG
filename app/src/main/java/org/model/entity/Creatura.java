package org.model.entity;
import org.controller.Azione;
public class CreaturaCombattente {
    private  String nome;
    private int vitaMassima;
    private int vitaAttuale;
    private Azione[] Combatti;;

    public CreaturaCombattente(String nome, int vitaMassima, Azione[] combatti) {
        this.nome = nome;
        this.vitaMassima = vitaMassima;
        this.vitaAttuale = vitaMassima;
        this.Combatti = combatti;
    }

    

    public Creatura(String nome, int vitaMassima) {
        this.nome = nome;
        this.vitaMassima = vitaMassima;
        this.vitaAttuale = vitaMassima;
    }


    public String getNome() {
        return nome;
    }

    public int getVitaMassima() {
        return vitaMassima;
    }

    public int getVitaAttuale() {
        return vitaAttuale;
    }

    public void ferito(int danno) {
        vitaAttuale -= danno;
    }

    public boolean isVivo() {
        return vitaAttuale > 0;
    }


    public Azione[] getCombatti() {
        return Combatti;
    }

}
