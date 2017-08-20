package Graphs;

public class GraphGnp {

    public static boolean[][] generateGnp(int n, double p) {
        boolean[][] result = new boolean[n][n];


        /* Przechodzimy po "prawym trójkącie" w tablicy A */
        for (int i = 0; i < n -1;i++) {
            for (int j = i + 1; j < n;j++) {
                /* Losujemy liczbę od 0 do 1 i sprawdzamy z p */
                if (Math.random() < p) {
                    /* jesli liczba jest mniejsza niż p ustawiamy flagę na true*/
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
        }
        return result;
    }

}
