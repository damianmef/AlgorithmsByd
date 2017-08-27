package Graphs;

import java.util.Arrays;

public class PrintStructures {

    public static void printA(boolean[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println(Arrays.toString(matrixA[i]));
        }
    }

    public static void printE(Edge[] edgesArray) {
        for (Edge item: edgesArray) {
            System.out.println(item);
        }
    }

}
