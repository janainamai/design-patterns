package br.com.designpatterns.singleton;

import java.util.Objects;

public class Singleton {

    public static Singleton singleton;
    private String valor;

    private Singleton(String valor) {
        this.valor = valor;
    }

    public static Singleton getInstance(String valor) {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton(valor);
        }
        return singleton;
    }
    
}
