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
public class Exercise_2 {
    
    /* Programming Exercise #2
        
    Write a program that finds the number of edges, and the degree of
    each vertex in the given undirected graph represented by the adjacency
    matrix. Identify all isolated and pendant vertices.
    
    public static int calculateNoEdges(int[][]adjacencyMatrix)
    public static int findDegree(int[][]adjacencyMatrix, int vertex)
    public static void isolatedVertices(int[][]adjacencyMatrix)
    public static void pendantVertices(int[][]adjacencyMatrix)
    
    
   
    
    Adjacency matris have to be simetric
    
    matrixteki tüm elemanları toplayıp ikiye bölüyortuz çünkü 
   indirect yani matrisimiz yukarısı ile aşağısı birbirinin 
    
    degreede ikinci metotda satırı alcaz satırdaki loppları kontrol etmek lazım 
    o yüzden looplar çarpı 2 olcak
    
    üçüncü method isolated
    degresini bulduktan sonra degresini sıfır olan matrix demek
    
    pendant ise degreesi bir ise yazdıracağız değilse bir sonrakine bakıcaz..
    3x3 matrix verilmişse 3 tane nood vertex var demek
    4 kez isolated yazdırma olabilir
    
 */
    
    public static void main(String[] args) {
        int Matrix[][] = {{0, 1, 1, 0}, 
                          {1, 0, 0, 1}, 
                          {1, 0, 0, 1}, 
                          {0, 1, 1, 0}};
        
        System.out.println("Number of Edge :"+calculateNoEdges(Matrix));
        
        System.out.println(findDegree(Matrix, 3));
        
        isolatedVertices(Matrix);
        pendantVertices(Matrix);
        
    }
    
    
       
     public static int calculateNoEdges(int[][]adjacencyMatrix){
      
         int sum=0;
         
           for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
              sum+=adjacencyMatrix[i][j];
               
                
//                if (adjacencyMatrix[i][j]!=0){
//                    no++;
//                }
           
            }
    }
        sum=sum/2;
      return sum;
    }
    public static int findDegree(int[][]adjacencyMatrix, int vertex){
   
         int degree = 0; 
        for (int i = 0; i <adjacencyMatrix[0].length; i++) { 
            if (adjacencyMatrix[vertex][i] == 1) 
                degree++; 
        } 
        return degree; 
  
      
    }
    public static void isolatedVertices(int[][]adjacencyMatrix){
    
          int degree = 0; 
          for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j <adjacencyMatrix[0].length; j++) { 
            
                if (adjacencyMatrix[j][i] == 1) 
                degree++; 
        } 
        }
          if(degree==0){
              
              System.out.println("this matrix is isolated");
          }
          else{
              System.out.println("It isn't isolated matrix");
          }
        
       
    
    }
    public static void pendantVertices(int[][]adjacencyMatrix){
   
     int degree = 0; 
          for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j <adjacencyMatrix[0].length; j++) { 
            
                if (adjacencyMatrix[j][i] == 1) 
                degree++; 
        } 
        }
          for (int i = 0; i < degree; i++) {
              if(degree==1){
              
              System.out.println("this matrix is isolated");
          }
          else{
              System.out.println("It isn't isolated matrix");
          }
        }
        
        
        
        
    }
    
    
    
}
