package com.example.prueba;

public class PruebaCarlos {

    String causas;

    public PruebaCarlos() {
    }

    public PruebaCarlos(String causas) {
        this.causas = causas;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    @Override
    public String toString() {
        return "PruebaCarlos{" +
                "causas='" + causas + '\'' +
                '}';
    }
}
