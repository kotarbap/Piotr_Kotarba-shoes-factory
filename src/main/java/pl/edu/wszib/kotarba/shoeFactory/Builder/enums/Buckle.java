package pl.edu.wszib.kotarba.shoeFactory.Builder.enums;

import java.util.concurrent.ThreadLocalRandom;

public enum Buckle {
    SZNURÓWKI,
    RZEPY,
    KLAMRY;

    public static Buckle getRandom() {
        Buckle[] values = Buckle.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);

        return values[index];
    }
}