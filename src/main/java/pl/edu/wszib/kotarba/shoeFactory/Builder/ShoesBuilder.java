package pl.edu.wszib.kotarba.shoeFactory.Builder;

import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Buckle;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.FootingMaterial;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Type;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.UpperMaterial;

public class ShoesBuilder implements ShoeBuilder{
    private int id;
    private int size;
    private UpperMaterial upperMaterial;
    private FootingMaterial footingMaterial;
    private Buckle buckle;
    private Type type;

    public Shoes getResult() {
        return new Shoes(id, size, upperMaterial, footingMaterial, buckle, type);
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setUpperMaterial(UpperMaterial upperMaterial) {
        this.upperMaterial = upperMaterial;
    }

    @Override
    public void setFootingMaterial(FootingMaterial footingMaterial) {
        this.footingMaterial = footingMaterial;
    }

    @Override
    public void setBuckle(Buckle buckle) {
        this.buckle = buckle;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ShoesBuilder{" +
                "id=" + id +
                ", size=" + size +
                ", upperMaterial=" + upperMaterial +
                ", footingMaterial=" + footingMaterial +
                ", buckle=" + buckle +
                ", type=" + type +
                '}';
    }
}
