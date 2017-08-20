package Graphs;

public class Structures {
    public static Edge[] generateEdgeArray(int n) {

        /* wyliczamy maksymalną liczbę krawędzi */
        int h = n*(n-1)/2;
        Edge[] result = new Edge[h];

        int index = 0;
        /* przechodzimy przez "prawy trójkąt" tablicy A */
        for (int i = 0; i < n -1;i++) {
            for (int j = i + 1; j < n;j++) {

                /* dla każdej krawędzi A tworzymy nowy element
                typu Edge i wstawiamy go w wynikową tablicę
                 */
                Edge newEdge = new Edge(i,j);
                result[index] = newEdge;
                index++;
            }
        }
        return result;
    }
}
