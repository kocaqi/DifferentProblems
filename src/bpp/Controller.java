package bpp;

import java.util.*;

public class Controller {

    public static void main(String[] args) {
        int[] weights = {7, 5, 2, 3, 5, 8};
        int capacity = 10;
        nextFit(weights, capacity);
        firstFit(weights, capacity);
    }

    public static void nextFit(int[] weights, int capacity){
        System.out.println("--Using nextFit() approach--");
        LinkedList<Container> containers = new LinkedList<>();
        Container firstContainer = new Container(capacity);
        containers.add(firstContainer);
        for (int weight : weights) {
            Container lastEnteredContainer = containers.getLast();
            if(weight < lastEnteredContainer.getCapacity()) {
                lastEnteredContainer.setCapacity(lastEnteredContainer.getCapacity()-weight);
                lastEnteredContainer.getWeights().add(weight);
            } else {
                Container newContainer = new Container(capacity);
                newContainer.setCapacity(newContainer.getCapacity()-weight);
                newContainer.getWeights().add(weight);
                containers.add(newContainer);
            }
        }
        for(Container container : containers){
            System.out.println(container.getWeights());
        }
    }

    public static void firstFit(int[] weights, int capacity) {
        System.out.println("--Using firstFit() approach--");
        LinkedList<Container> containers = new LinkedList<>();
        Container firstContainer = new Container(capacity);
        containers.add(firstContainer);
        for(int weight : weights){
            boolean notInserted = true;
            for(Container container : containers){
                if(weight < container.getCapacity()) {
                    container.getWeights().add(weight);
                    container.setCapacity(container.getCapacity()-weight);
                    notInserted = false;
                    break;
                }
            }
            if(notInserted)
            {
                Container container = new Container(capacity-weight);
                container.getWeights().add(weight);
                containers.add(container);
            }
        }
        for(Container container : containers){
            System.out.println(container.getWeights());
        }
    }

}
