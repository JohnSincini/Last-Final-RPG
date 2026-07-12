package it.unicam.cs.mpgc.rpg129669.model.persistence;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;

import it.unicam.cs.mpgc.rpg129669.model.entity.Eroe;

public class ContestoEroeGson extends ContestoGenericoGson<Eroe> {

    @Override
    public void salva(Eroe entity) {
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        try {
            Files.writeString(Path.of("eroe.json"), json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Eroe carica() {
        String json = leggiFile("eroe.json");
        Gson gson = new Gson();
        return gson.fromJson(json, Eroe.class);
    }

    @Override
    public void elimina() {
        try {
            Files.delete(Path.of("eroe.json"));
        } catch (Exception e) {
        }
    }
    
    
}
