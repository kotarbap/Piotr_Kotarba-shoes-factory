package pl.edu.wszib.kotarba.shoeFactory.Builder;

import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Buckle;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.FootingMaterial;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Type;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.UpperMaterial;

import java.util.concurrent.ThreadLocalRandom;

public class ShiftManager {
    public void buildRandomShoes(ShoeBuilder builder) {
        builder.setId(ThreadLocalRandom.current().nextInt(1, 100 + 1));
        builder.setSize(ThreadLocalRandom.current().nextInt(30, 45 + 1));
        builder.setUpperMaterial(UpperMaterial.getRandom());
        builder.setFootingMaterial(FootingMaterial.getRandom());
        builder.setBuckle(Buckle.getRandom());
        builder.setType(Type.getRandom());

    }
    public void buildSizedShoes(ShoeBuilder builder, int size) {
        builder.setId(ThreadLocalRandom.current().nextInt(1, 100 + 1));
        builder.setSize(size);
        builder.setUpperMaterial(UpperMaterial.getRandom());
        builder.setFootingMaterial(FootingMaterial.getRandom());
        builder.setBuckle(Buckle.getRandom());
        builder.setType(Type.getRandom());

    }

}
