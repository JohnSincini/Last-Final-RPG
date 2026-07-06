package org.model.entity;

public abstract class creatura {
    //una qualsiasi creatura, non necessariamente capace di combattere, quindi sia un cavaliere che un albero
    private  String nome;
    private int vitaMassima;
    private int vitaAttuale;

    public creatura(String nome, int vitaMassima) {
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
        if (danno < 0) {
            return; // Non si può infliggere danno negativo
        }
        vitaAttuale -= danno;
        if (vitaAttuale < 0) {
            vitaAttuale = 0;
        }
    }

}