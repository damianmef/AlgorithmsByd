package Graphs;

public class GraphGnp {

    public static boolean[][] generateGnp(int n, double p) {
        boolean[][] result = new boolean[n][n];

        for (int i = 0; i < n -1;i++) {
            for (int j = i + 1; j < n;j++) {
                if (Math.random() < p) {
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
        }
        return result;
    }

}
