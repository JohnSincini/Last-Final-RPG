package it.unicam.cs.mpgc.rpg129669.model.persistence;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import it.unicam.cs.mpgc.rpg129669.model.entity.Oggetto;

public class ContestoOggettiGson  extends ContestoGenericoGson<List<Oggetto>> {

    @Override
    public void salva(List<Oggetto> entity) {
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        try {
            Files.writeString(Path.of("oggetti.json"), json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Oggetto> carica() {
        String json = leggiFile("oggetti.json");
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Oggetto>>(){}.getType();
        return gson.fromJson(json, listType);
    }
    
    

    @Override
    public void elimina() {
        try {
            Files.delete(Path.of("oggetti.json"));
        } catch (Exception e) {
        }
    }
}
