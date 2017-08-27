package Graphs;

public class Transforms {

    public static boolean[][] transformEtoA(int vertexNumber, int edgesNumber, Edge[] edgesArray) {
        boolean[][] resultMatrixA = new boolean[vertexNumber][vertexNumber];
        int h = edgesArray.length;

        /* Przechodzimy po K elementach tablicy e */
        for (int i = h-1; i > h-1-edgesNumber;i--) {
            /* uzupełniamy elementy i/j i j/i w tablicy a */
            resultMatrixA[edgesArray[i].getFirstVertex()][edgesArray[i].getSecondVertex()] = true;
            resultMatrixA[edgesArray[i].getSecondVertex()][edgesArray[i].getFirstVertex()] = true;
        }

        return resultMatrixA;
    }

    public static Edge[] transformAtoE(boolean[][] matrixA, int vertexNumber){
        Edge[] resultEdgesArray = Structures.generateEdgeArray(vertexNumber);
        /* index z którym zamieniamy wylosowany element */
        int lastMovableIndex = resultEdgesArray.length-1;

        for (int i = 0; i < vertexNumber -1;i++) {
            for (int j = i + 1; j < vertexNumber; j++) {
                /* jeśli krawędź istnieje w tablicy matrixA */
                if (matrixA[i][j]){
                    Edge edge = new Edge(i,j);
                    /* znajdź ją w strukturze E i przesuń na ostatnie miejsce z niewylosowanych krawędzi */
                    resultEdgesArray = moveItem(resultEdgesArray, edge, lastMovableIndex);
                    lastMovableIndex--;
                }
            }
        }
        return resultEdgesArray;
    }

    private static Edge[] moveItem(Edge[] edgesArray, Edge edge, int lastMovableIndex)
    {
        for(int i = 0; i < edgesArray.length; i++) {
            /* jeśli znajdziemy w E krawędź {i:j} */
            if (edgesArray[i].getFirstVertex() == edge.getFirstVertex() && edgesArray[i].getSecondVertex() == edge.getSecondVertex()) {
                /* zamieniamy ją z ostatnim nieprzesuniętym elementem */
                Edge temp = edgesArray[i];
                edgesArray[i] = edgesArray[lastMovableIndex];
                edgesArray[lastMovableIndex] = temp;
                break;
            }
        }

        return edgesArray;
    }

    public static StructS[] transformAtoS(boolean[][] matrixA, int vertexNumber) {
        StructS[] result = new StructS[vertexNumber];

        /* Inicjowanie elementów tablicy result */
        for(int i = 0; i < vertexNumber; i++) {
            StructS temp = new StructS();
            result[i] = temp;
        }

        for (int i = 0; i < vertexNumber -1;i++) {
            for (int j = i + 1; j < vertexNumber; j++) {
                /* jeśli krawędź istnieje */
                if(matrixA[i][j]) {
                    /* Dodaj do wierzchołka i informację, że ma sąsiada j
                    result[i].getNeighborsCollection().add(j);
                    /* zwiększ licznik sąsiadów i */
                    result[i].setNeighborsCounter(result[i].getNeighborsCounter()+1);

                    /* Dodaj do wierzchołka i informację, że ma sąsiada i */
                    result[j].getNeighborsCollection().add(i);
                    /* zwiększ licznik sąsiadów j */
                    result[j].setNeighborsCounter(result[j].getNeighborsCounter()+1);
                }
            }
        }

        return result;
    }


}
