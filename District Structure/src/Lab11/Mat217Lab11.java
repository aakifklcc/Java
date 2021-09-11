/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author akifkilic
 */
public class Mat217Lab11 {

    public static void main(String[] args) {

        int Matrix[][] = {{0, 1, 1, 0},
        {1, 0, 0, 1},
        {1, 0, 0, 1},
        {0, 1, 1, 0}};

        System.out.println("is it simple Graph: " + isSimpleGraph(Matrix));
        System.out.println("Number of Edge :" + calculateNoEdges(Matrix));
        System.out.println("Number of degree :" + findDegree(Matrix, 0));
        isolatedVertices(Matrix);
        pendantVertices(Matrix);

        int[][] graph1 = {
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 0, 1}
        };

        int[][] graph2 = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0}
        };

        int[][] graph3 = graphUnion(graph1, graph2);
        for (int i = 0; i < graph3.length; i++) {
            for (int j = 0; j < graph3[i].length; j++) {
                System.out.print(graph3[i][j]);
            }
            System.out.println(" ");
        }

    }

    public static boolean isSimpleGraph(int[][] adjacencyMatrix) {

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {

                if (i == j && adjacencyMatrix[i][j] != 0) {
                    return false;
                }

                if (adjacencyMatrix[i][j] != adjacencyMatrix[j][i]) {

                    return false;
                }
            }

        }
        return true;

    }

    public static int calculateNoEdges(int[][] adjacencyMatrix) {

        int sum = 0;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                sum += adjacencyMatrix[i][j];
            }
        }
        sum = sum / 2;
        return sum;

    }

    public static int findDegree(int[][] adjacencyMatrix, int vertex) {

        int degree = 0;
        for (int i = 0; i < adjacencyMatrix[0].length; i++) {
            if (adjacencyMatrix[vertex][i] == 1) {
                degree++;
            }
        }
        return degree;
    }

    public static void isolatedVertices(int[][] adjacencyMatrix) {

        int degree = 0;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {

                if (adjacencyMatrix[j][i] == 1) {
                    degree++;
                }
            }
        }
        if (degree == 0) {

            System.out.println("this matrix is isolated");
        } else {
            System.out.println("It isn't isolated matrix");
        }

    }

    public static void pendantVertices(int[][] adjacencyMatrix) {

        int degree = 0;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {

                if (adjacencyMatrix[j][i] == 1) {
                    degree++;
                }
            }
        }
        for (int i = 0; i < degree; i++) {
            if (degree == 1) {

                System.out.println("this matrix is isolated");
            } else {
                System.out.println("It isn't isolated matrix");
            }
        }

    }

    public static int[][] graphUnion(int[][] graph1, int[][] graph2) {

        int[][] graph3 = new int[5][5];
        for (int i = 0; i < graph1.length; i++) {
            for (int j = 0; j < graph1[i].length; j++) {
                graph3[i][j] = graph1[i][j];
            }
        }
        for (int i = 0; i < graph2.length; i++) {
            for (int j = 0; j < graph2[i].length; j++) {
                if (graph3[i][j] != 1) {
                    graph3[i][j] = graph2[i][j];
                }

            }
        }

        return graph3;

    }

}
