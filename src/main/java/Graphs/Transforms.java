package Graphs;

public class Transforms {

    public static boolean[][] transformEtoA(int n, int k, Edge[] e) {
        boolean[][] result = new boolean[n][n];
        int h = e.length;

        /* Przechodzimy po K elementach tablicy e */
        for (int i = h-1; i > h-1-k;i--) {
            /* uzupełniamy elementy i/j i j/i w tablicy a */
            result[e[i].getA()][e[i].getB()] = true;
            result[e[i].getB()][e[i].getA()] = true;
        }

        return result;
    }

//    public static Edge[] transformAtoE(boolean[][] a, int n){
//        Edge[] result = Structures.generateEdgeArray(n);
//
//        for (int i = 0; i < n -1;i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i][j]){
//
//                }
//            }
//        }
//        return result;
//    }
}
