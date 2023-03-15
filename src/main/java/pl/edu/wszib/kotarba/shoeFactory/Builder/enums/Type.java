package pl.edu.wszib.kotarba.shoeFactory.Builder.enums;

import java.util.concurrent.ThreadLocalRandom;

public enum Type {
    SPORTOWE,
    FORMALNE,
    ROBOCZE,
    KALOSZE,
    WOSJKOWE;

    public static Type getRandom() {
        Type[] values = Type.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);

        return values[index];
    }
}
