package org.model.entity;
import org.controller.Azione;
public class CreaturaCombattente extends Creatura {
    private Azione[] Combatti;;

    public CreaturaCombattente(String nome, int vitaMassima, Azione[] combatti) {
        super(nome, vitaMassima);
        this.Combatti = combatti;
    }

    public Azione[] getCombatti() {
        return Combatti;
    }

    public Azione[] getCombatti() {
        return Combatti;
    }
}
