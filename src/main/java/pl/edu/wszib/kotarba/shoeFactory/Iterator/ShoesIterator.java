package pl.edu.wszib.kotarba.shoeFactory.Iterator;

import pl.edu.wszib.kotarba.shoeFactory.Builder.Shoes;

import java.util.Iterator;
import java.util.List;

public class ShoesIterator implements Iterator<Shoes>{

    private List<Shoes> shoes;
    private int index;

    public ShoesIterator(List<Shoes> shoes) {
        this.shoes = shoes;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shoes.size();
    }

    @Override
    public Shoes next() {
        Shoes shoe = shoes.get(index);
        index++;
        return shoe;
    }

    @Override
    public void remove() {
        shoes.remove(index - 1);
    }

}
