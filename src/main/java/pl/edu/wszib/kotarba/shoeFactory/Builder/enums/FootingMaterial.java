package pl.edu.wszib.kotarba.shoeFactory.Builder.enums;

import java.util.concurrent.ThreadLocalRandom;

public enum FootingMaterial {
    GUMA,
    KAUCZUK,
    SKÓRA,
    SYNTETYK,
    STAL;

    public static FootingMaterial getRandom() {
        FootingMaterial[] values = FootingMaterial.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);

        return values[index];
    }
}
