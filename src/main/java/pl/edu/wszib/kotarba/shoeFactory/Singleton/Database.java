package pl.edu.wszib.kotarba.shoeFactory.Singleton;

import pl.edu.wszib.kotarba.shoeFactory.Builder.ShiftManager;
import pl.edu.wszib.kotarba.shoeFactory.Builder.ShoeBuilder;
import pl.edu.wszib.kotarba.shoeFactory.Builder.Shoes;
import pl.edu.wszib.kotarba.shoeFactory.Builder.ShoesBuilder;
import pl.edu.wszib.kotarba.shoeFactory.Iterator.ShoesIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {
    private static Database instance;
    private List<Shoes> shoesList = new ArrayList<>();

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        ShiftManager shiftManager = new ShiftManager();
        ShoesBuilder builder = new ShoesBuilder();

        shiftManager.buildRandomShoes(builder);
        shoesList.add(builder.getResult());
        shiftManager.buildRandomShoes(builder);
        shoesList.add(builder.getResult());
        shiftManager.buildRandomShoes(builder);
        shoesList.add(builder.getResult());
    }

    public ShoesIterator getAvailableShoes() {
        return new ShoesIterator(shoesList);
    }

    public Shoes orderNewShoes(int size) {
        ShiftManager shiftManager = new ShiftManager();
        ShoesBuilder builder = new ShoesBuilder();
        shiftManager.buildSizedShoes(builder, size);
        shoesList.add(builder.getResult());
        return builder.getResult();
    }

    public boolean sellShoes(int id) {
        Iterator<Shoes> iterator = shoesList.iterator();
        while (iterator.hasNext()) {
            Shoes shoes = iterator.next();
            if (shoes.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
