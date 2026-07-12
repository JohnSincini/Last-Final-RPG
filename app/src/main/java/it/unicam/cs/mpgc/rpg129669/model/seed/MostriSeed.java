package it.unicam.cs.mpgc.rpg129669.model.seed;

import java.util.HashMap;
import java.util.List;

import it.unicam.cs.mpgc.rpg129669.model.entity.Mostro;
import it.unicam.cs.mpgc.rpg129669.model.entity.enums.TipoDanno;
import it.unicam.cs.mpgc.rpg129669.model.persistence.ContestoMostriGson;

public class MostriSeed {
    public void popola() {
        ContestoMostriGson contestoMostriGson = new ContestoMostriGson();
        List<Mostro> mostri = contestoMostriGson.carica();
        if (mostri == null || mostri.isEmpty()) {
            Mostro mostro1 = new Mostro("Goblin", 1, 5, 1, 5, 3, TipoDanno.ACCIAIO, TipoDanno.FUOCO);
            HashMap<Float, Integer> map1 = new HashMap<>();
            map1.put(20f, 1);
            map1.put(5f, 2);
            mostro1.setDrop(map1);
            Mostro mostro2 = new Mostro("Drago", 20, 15, 8,3, 2, TipoDanno.OSCURITA, TipoDanno.FUOCO);
            Mostro mostro3 = new Mostro("Scheletro", 3, 8, 3, 5, 10, TipoDanno.FUOCO, TipoDanno.OSCURITA);
            mostri = List.of(mostro1, mostro2, mostro3);
            contestoMostriGson.salva(mostri);
        }
    }
}
