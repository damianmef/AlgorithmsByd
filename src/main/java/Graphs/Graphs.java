package Graphs;

public class Graphs {
    public static void main(String[] args) {

//        generateGnk(4,3);
//        generateGnp(4, 0.5);
//        transformEtoA(4,3);
//        transformAtoE(4,0.5);
//        getTrianglesCounter(4, 0.99);
        generateGnf(4, 2);
    }

    private static void generateGnp(int vertexNumber, double probability) {
        boolean[][] matrixA = GraphGnp.generateGnp(vertexNumber, probability);

        PrintStructures.printA(matrixA);
    }

    private static void generateGnk(int vertexNumber, int edgesNumber) {
        Edge[] edgesArray = GraphGnk.generateGnk(vertexNumber, edgesNumber);

        PrintStructures.printE(edgesArray);
    }

    private static void generateGnf(int vertexNumber, int maxVertexDegree) {
        Edge2[] edges2Array = GraphGnf.generateGraphGnf(vertexNumber, maxVertexDegree);
        PrintStructures.printE2(edges2Array);
    }

    private static void transformAtoE(int vertexNumber, double probability) {
        boolean[][] matrixA = GraphGnp.generateGnp(vertexNumber, probability);

        PrintStructures.printA(matrixA);
        Edge[] edgesArray = Transforms.transformAtoE(matrixA, vertexNumber);
        PrintStructures.printE(edgesArray);
    }

    private static void transformEtoA(int vertexNumber, int edgesNumber) {
        Edge[] graphGnk = GraphGnk.generateGnk(vertexNumber,edgesNumber);

        PrintStructures.printE(graphGnk);
        boolean[][] result = Transforms.transformEtoA(vertexNumber, edgesNumber, graphGnk);
        PrintStructures.printA(result);
    }

    private static void getTrianglesCounter(int vertexNumber, double probability) {
        boolean[][] matrixA = GraphGnp.generateGnp(vertexNumber, probability);

        PrintStructures.printA(matrixA);
        System.out.println(Triangles.getGraphTrianglesCounter(matrixA, vertexNumber));
    }
}
