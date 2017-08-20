package Graphs;

public class GraphGnk {

    public static Edge[] generateGnk(int n, int k) {
        Edge[] result = Structures.generateEdgeArray(n);

        /* liczba elementów tablicy typów Edge */
        int h = n*(n-1)/2;

        /* warunek, czy uzytkownik nie podał K większego niż k
        maksymalne dla danego grafu
         */
        if (k <= h) {
            /* k razy wykonujemy losowanie krawędzi */
            for(int i =0;i < k;i++) {
                int random = (int)(Math.random()*h);

                /* zamieniamy wylosowaną krawędź z ostatnim
                elementem z "niewylosowanych"
                 */
                Edge temp = result[random];
                result[random] = result[h-1];
                result[h-1] = temp;
                /* zmniejszamy zakres losowania */
                h--;
            }
        }

        return result;
    }
}
