package pl.edu.wszib.kotarba.shoeFactory.Builder.enums;

import java.util.concurrent.ThreadLocalRandom;

public enum UpperMaterial {
    SKÓRA,
    ZAMSZ,
    TEKSTYLIA,
    SYNTETYK;

    public static UpperMaterial getRandom() {
        UpperMaterial[] values = UpperMaterial.values();
        int index = ThreadLocalRandom.current().nextInt(values.length);

        return values[index];
    }
}
