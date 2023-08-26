package BinPackingProblem;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] weights = {7, 5, 2, 3, 5, 8};
        int capacity = 10;
        Solution.nextFit(weights, capacity);
        Solution.firstFit(weights, capacity);
    }

}
