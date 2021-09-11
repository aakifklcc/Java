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
public class Exercise_1 {

// Write a method to determine whether a graph is simple graph with the following header:
// public static boolean isSimpleGraph (int [][]adjacencyMatrix)
    public static void main(String[] args) {

        /*
        
        int adjacencyMatrix[4][4]={{0,0,1,1}, 
                                   {0,0,1,1}, 
                                   {1,1,0,1}, 
                                   {1,1,1,0}
        };

         */
        int Matrix[][] = {{0, 0, 1, 1}, 
                          {0, 0, 1, 1}, 
                          {1, 1, 0, 1}, 
                          {1, 1, 1, 0}};

        System.out.println("Is this matrix simplegraph? :"+isSimpleGraph(Matrix));
      

    }

    public static boolean isSimpleGraph(int[][] adjacencyMatrix) {

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                
                 if(i==j && adjacencyMatrix [i][j]!=0){
                      return false;
                      } 
                  
                     if (adjacencyMatrix[i][j] != adjacencyMatrix[j][i]) {
                    
                         return false;   
                }
        }

        }
        return true;
      

    }

}
