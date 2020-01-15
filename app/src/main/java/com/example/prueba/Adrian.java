package com.example.prueba;

public class Adrian {

    int poder;

    public Adrian(int poder) {
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Adrian{" +
                "poder=" + poder +
                '}';
    }
}
