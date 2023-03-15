package pl.edu.wszib.kotarba.shoeFactory.Facade;

import pl.edu.wszib.kotarba.shoeFactory.Builder.Shoes;
import pl.edu.wszib.kotarba.shoeFactory.Iterator.ShoesIterator;
import pl.edu.wszib.kotarba.shoeFactory.Singleton.Database;

import java.util.Iterator;
import java.util.List;

public class Menu {
    private Database database;

    public Menu() {
        this.database = Database.getInstance();
    }

    public void showAvailableShoes() {
        System.out.println("\nButy dostępne w magazynie:");
        ShoesIterator iterator = database.getAvailableShoes();
        while (iterator.hasNext()) {
            Shoes shoes = iterator.next();
            System.out.println(shoes.toString());
        }
    }

    public void orderNewShoes(int size) {
        Shoes newShoes = database.orderNewShoes(size);
        System.out.println("\nTwoje buty: ");
        System.out.println(newShoes);
        System.out.println("zamówione i wytworzone. Możesz już je kupić");
    }

    public void sellShoes(int id) {
        boolean soldShoe = database.sellShoes(id);
        if (soldShoe == true) {
            System.out.println("\nButy kupione!");
        } else {
            System.out.println("\nNie ma butów o podanym ID. Spróbuj ponownie");
        }
    }
}
