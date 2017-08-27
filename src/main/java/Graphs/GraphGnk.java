package Graphs;

public class GraphGnk {

    /*
    Do pustego grafu dodajemy k krawędzi, losowo wybranych
    spośród puli jeszccze nie wylosowanych
     */
    public static Edge[] generateGnk(int vertexNumber, int edgesNumber) {
        Edge[] result = Structures.generateEdgeArray(vertexNumber);

        /* liczba elementów tablicy typów Edge */
        int maxEdgesNumber = vertexNumber*(vertexNumber-1)/2;

        /* warunek, czy uzytkownik nie podał K większego niż k
        maksymalne dla danego grafu
         */
        if (edgesNumber <= maxEdgesNumber) {
            /* k razy wykonujemy losowanie krawędzi */
            for(int i =0;i < edgesNumber;i++) {
                int random = (int)(Math.random()*maxEdgesNumber);

                /* zamieniamy wylosowaną krawędź z ostatnim
                elementem z "niewylosowanych"
                 */
                Edge temp = result[random];
                result[random] = result[maxEdgesNumber-1];
                result[maxEdgesNumber-1] = temp;
                /* zmniejszamy zakres losowania */
                maxEdgesNumber--;
            }
        }

        return result;
    }
}
