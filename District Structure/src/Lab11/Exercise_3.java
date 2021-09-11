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
public class Exercise_3 {   
    /*
  >>The union of 2 simple graphs G1=(V1,E1) and G2=(V2,E2) is the simple graph
 with vertex set V1UV2 and edge set E1UE2. The union of G1 and G2 denoted by G1UG2
    
    Write a method to find the union of two simple graph given by the adjacency
    matrices. Use the following header:
    public static int[][] graphUnion(int[][] graph1, int[][] graph2)
     */
    
    
    
    
    public static void main(String[] args) {
        
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

        
        int Matrix[][] = {{0, 1, 1, 0}, 
                         {1, 0, 0, 1}, 
                         {1, 0, 0, 1}, 
                         {0, 1, 1, 0}};
        
          int [][] graph3=graphUnion(graph1, graph2);
      for (int i = 0; i < graph3.length; i++) {
            for (int j = 0; j < graph3[i].length; j++) {
                System.out.print(graph3[i][j]);
            }
            System.out.println(" ");
        }
        
//        System.out.println(graphUnion(Matrix, Matrix));   
        
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
                if (graph3[i][j]!=1) {
                    graph3[i][j] = graph2[i][j];
                }
                
            }
        }

        return graph3;
    }
}

//    
//     public static int[][] graphUnion(int[][] graph1, int[][] graph2) {
//         
//        int [][] union=new int [graph1.length][graph2.length];
//         
//         for (int i = 0; i < graph1.length; i++) {
//             for (int j = 0; j < graph2[0].length; j++) {
//                 
//                 union [i][j]=graph1[i][j]+graph2[i][j];
//             }
//             
//         }
//          
//         return union ; 
//     }
//    
 
/*

 /*
     
 int [][] union=new int [graph1.length][graph2.length];
         
         for (int i = 0; i < graph1.length; i++) {
             for (int j = 0; j < graph2.length; j++) {
                 
                 union [i][j]=graph1[i][j]+graph2[i][j];
             }
             
         }
          
         return union ; 
     
     
     
     */
