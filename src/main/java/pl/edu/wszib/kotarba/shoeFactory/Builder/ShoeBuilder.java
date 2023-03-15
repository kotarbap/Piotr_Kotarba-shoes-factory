package pl.edu.wszib.kotarba.shoeFactory.Builder;

import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Buckle;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.FootingMaterial;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.Type;
import pl.edu.wszib.kotarba.shoeFactory.Builder.enums.UpperMaterial;

public interface ShoeBuilder {
    void setId (int id);
    int getId ();
    void setSize(int size);
    void setUpperMaterial(UpperMaterial upperMaterial);
    void setFootingMaterial(FootingMaterial footingMaterial);
    void setBuckle(Buckle buckle);
    void setType(Type type);
}
