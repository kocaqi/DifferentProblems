package bpp;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private int capacity;
    private List<Integer> weights;

    public Container(int capacity) {
        this.capacity = capacity;
        this.weights = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Integer> getWeights() {
        return weights;
    }

    public void setWeights(List<Integer> weights) {
        this.weights = weights;
    }
}
