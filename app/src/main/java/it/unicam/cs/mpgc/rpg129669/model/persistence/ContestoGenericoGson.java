package it.unicam.cs.mpgc.rpg129669.model.persistence;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public abstract class ContestoGenericoGson<T> implements ContestoGenerico<T> {
    
    protected String leggiFile(String nomeFile) {
        try (InputStream is = ContestoGenericoGson.class
                .getClassLoader()
                .getResourceAsStream(nomeFile)) {

            if (is == null) {
                throw new RuntimeException("File non trovato: " + nomeFile);
            }

            return new String(is.readAllBytes(), StandardCharsets.UTF_8);

        } catch (Exception e) {
            throw new RuntimeException("Errore lettura file: " + nomeFile, e);
        }
    }

}
