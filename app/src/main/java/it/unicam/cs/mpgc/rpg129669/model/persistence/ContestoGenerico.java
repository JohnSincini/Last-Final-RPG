package it.unicam.cs.mpgc.rpg129669.model.persistence;

public interface ContestoGenerico<T> {
    void salva(T entity);
    T carica();
    void elimina();
}

