package org.controller;

import org.model.entity.Creatura;
public class Squadra {
    private Creatura[] membri;

    public Squadra(Creatura[] membri) {
        this.membri = membri;
    }

    public Creatura[] getMembri() {
        return membri;
    }

    public boolean contieneMembro(Creatura creatura) {
        for (Creatura membro : membri) {
            if (membro.equals(creatura)) {
                return true;
            }
        }
        return false;
    }

    public boolean squadraVuota() {
        return membri.length == 0;
    }

    public void aggiungiMembro(Creatura creatura) {
        Creatura[] nuoviMembri = new Creatura[membri.length + 1];
        for (int i = 0; i < membri.length; i++) {
            nuoviMembri[i] = membri[i];
        }
        nuoviMembri[membri.length] = creatura;
        membri = nuoviMembri;
    }

    public boolean rimuoviMembro(Creatura creatura) {
        Creatura[] nuoviMembri = new Creatura[membri.length - 1];
        int indiceNuovo = 0;
        boolean trovato = false;
        for (int i = 0; i < membri.length; i++) {
            if (!membri[i].equals(creatura)) {
                nuoviMembri[indiceNuovo] = membri[i];
                indiceNuovo++;
            }
            else {
                trovato = true;
            }
        }
        membri = nuoviMembri;
        return trovato;
    }

    private boolean isVivo(Creatura creatura) {
        return creatura.getVitaAttuale() > 0;
    }

    public int getNumeroMembriVivi() {
        int count = 0;
        for (Creatura creatura : membri) {
            if (isVivo(creatura)) {
                count++;
            }
        }
        return count;
    }
    
    public boolean teamSconfitto() {
        for (Creatura creatura : membri) {
            if (isVivo(creatura)) {
                return false; 
            }
        }
        return true; 
    }

}
