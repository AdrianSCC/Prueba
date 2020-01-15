package com.example.prueba;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adrian adrian = (Adrian) o;
        return poder == adrian.poder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(poder);
    }
}
