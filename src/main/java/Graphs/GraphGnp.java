package Graphs;

public class GraphGnp {

    /* Dla każdej możliwej krawędzi losujemy liczbę losową i jeśli
    jest mniejsza niż p to dodajemy ją do grafu
     */
    public static boolean[][] generateGnp(int vertexNumber, double probability) {
        boolean[][] matrixA = new boolean[vertexNumber][vertexNumber];

        /* Przechodzimy po "prawym trójkącie" w tablicy A */
        for (int i = 0; i < vertexNumber -1;i++) {
            for (int j = i + 1; j < vertexNumber;j++) {
                /* Losujemy liczbę od 0 do 1 i sprawdzamy z p */
                if (Math.random() < probability) {
                    /* jesli liczba jest mniejsza niż p ustawiamy flagę na true*/
                    matrixA[i][j] = true;
                    matrixA[j][i] = true;
                }
            }
        }
        return matrixA;
    }

}
