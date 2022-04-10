package less1;

import less1.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits <T extends Fruit>{

    private List<T> container;

    public BoxWithFruits() {
        this.container = new ArrayList<>();
    }

    public BoxWithFruits(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeith() {

        float w = 0.0f;
        for (T fruit : container) {
            w += fruit.getWeith();
        }
        return w;
    }

    public boolean avg(BoxWithFruits<?> another) {
        return Math.abs(this.getWeith() - another.getWeith()) < 0.001;
    }

    public void transfer(BoxWithFruits<T> another) {
        if (another == this) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T fruit) {
        container.add(fruit);
    }

}
