package it.unicam.cs.mpgc.rpg129669.model.persistence;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import it.unicam.cs.mpgc.rpg129669.model.entity.Mostro;

public class ContestoMostriGson  extends ContestoGenericoGson<List<Mostro>> {

    @Override
    public void salva(List<Mostro> entity) {
        Gson gson = new Gson();
        String json = gson.toJson(entity);
        try {
            Files.writeString(Path.of("mostri.json"), json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Mostro> carica() {
        try {
            String json = leggiFile("mostri.json");
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Mostro>>(){}.getType();
            return gson.fromJson(json, listType);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void elimina() {
        try {
            Files.delete(Path.of("mostri.json"));
        } catch (Exception e) {
        }
    }
    
    
}
