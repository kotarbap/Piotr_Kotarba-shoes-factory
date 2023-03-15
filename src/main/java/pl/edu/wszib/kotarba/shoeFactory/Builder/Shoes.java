package pl.edu.wszib.kotarba.shoeFactory.Builder;

import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Buckle;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.FootingMaterial;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Type;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.UpperMaterial;

public class Shoes {
    private final int id;
    private final int size;
    private final UpperMaterial upperMaterial;
    private final FootingMaterial footingMaterial;
    private final Buckle buckle;
    private final Type type;

    public Shoes(int id, int size, UpperMaterial upperMaterial, FootingMaterial footingMaterial, Buckle buckle, Type type) {
        this.id = id;
        this.size = size;
        this.upperMaterial = upperMaterial;
        this.footingMaterial = footingMaterial;
        this.buckle = buckle;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "id=" + id +
                ", size=" + size +
                ", upperMaterial=" + upperMaterial +
                ", footingMaterial=" + footingMaterial +
                ", buckle=" + buckle +
                ", type=" + type +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public UpperMaterial getUpperMaterial() {
        return upperMaterial;
    }

    public FootingMaterial getFootingMaterial() {
        return footingMaterial;
    }

    public Buckle getBuckle() {
        return buckle;
    }

    public Type getType() {
        return type;
    }
}
