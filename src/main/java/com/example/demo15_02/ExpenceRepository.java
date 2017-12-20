package com.example.demo15_02;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenceRepository {

    private List<Expence> lista;

    public ExpenceRepository() {
        lista = new ArrayList<>();
        lista.add(new Expence("lody", 12.50, Category.ENTERTAINEMENT));
        lista.add(new Expence("kino", 122.50, Category.ENTERTAINEMENT));
        lista.add(new Expence("jedzenie", 12.20, Category.LIFE));
    }


    public List<Expence> getAllExpences() {
        return lista;
    }

    public void addExpence(Expence expence) {
        lista.add(expence);

    }

    ;


}
