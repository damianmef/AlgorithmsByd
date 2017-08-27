package Graphs;

public class Triangles {

    public static int getGraphTrianglesCounter(boolean[][] matrixA, int vertexNumber) {
        int trianglesCounter = 0;

        for (int i = 0; i < vertexNumber -1;i++) {
            for (int j = i + 1; j < vertexNumber; j++) {
                /* jeśli krawędź istnieje */
                if(matrixA[i][j]) {
                    /* znajdź innych sąsiadów wierzchołka */
                    for(int k = j+1;k < vertexNumber;k++) {
                        /* sprawdź czy dany sąsiad dla "i" istnieje dla wierzchołka "j" */
                        if(matrixA[i][k] && matrixA[j][k]) {
                            trianglesCounter++;
                        }
                    }
                }
            }
        }

        return trianglesCounter;
    }

}
