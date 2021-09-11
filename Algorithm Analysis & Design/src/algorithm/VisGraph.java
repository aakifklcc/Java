/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemeeee;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class VisGraph {
    
    double vertex[][];
    boolean edge[][];
    int parent[];
    double cost[];

    // constructor using a filename
    VisGraph(String filename) throws IOException {
	// create a File
	File fp = new File(filename);

	// open a Scanner for the file
	Scanner fin = new Scanner(fp);

	// read in the number of nodes
	int N = fin.nextInt();

	// allocate vertex and edge
	vertex = new double[N][2];
	edge = new boolean[N][N];
	parent = new int[N];
	cost = new double[N];

	// initialize edge costs to very large values (no edge)
	for(int i=0;i<N;i++) {
	    vertex[i][0] = 0.0;
	    vertex[i][1] = 0.0;
	    parent[i] = -1;
	    cost[i] = 1e+9;
	    for(int j=0;j<N;j++) {
		edge[i][j] = false;
	    }
	}

	// read in each node
	for(int i=0;i<N;i++) {
	    // read in the index of this node
	    int dummy = fin.nextInt();

	    // read in the location of the node
	    vertex[i][0] = fin.nextDouble();
	    vertex[i][1] = fin.nextDouble();

	    // read in the number of edges for this node
	    int E = fin.nextInt();

	    // read in the edges as index/cost pairs
	    for(int j=0;j<E;j++) {
		int index = fin.nextInt();
		edge[i][index] = true;
		edge[index][i] = true;
	    }
	}
    } // end of file based constructor

    // converts the graph to a diagnostic string
    public String toString() {
	String s = "";

	for(int i=0;i<vertex.length;i++) {
	    s += "V("+i+"/"+vertex[i][0]+", "+vertex[i][1]+"/"+parent[i]+"/"+cost[i]+"): ";
	    for(int j=0;j<vertex.length;j++) {
		if(edge[i][j]) {
		    s += j+" ";
		}
	    }
	    s += "\n";
	}

	return(s);
    }


    // runs Dijkstra's algorithm from the given node fills out parent
    // and cost given the vertex locations and the edge matrix
    public void Dijkstra(int root) {


    }

    /*
      The main function executes if you call it from the command line using

      java VisGraph myfile.vis

      The filename is passed to the main function as args[0] and the
      information in the file is used to initialize the visiblity
      graph.
     */
    public static void main(String args[]) throws IOException {
	// initialize a new graph from a file
	VisGraph vg = new VisGraph(args[0]);

	// print out the graph
	System.out.println(vg.toString());

	// run Dijkstra's algorithm
	vg.Dijkstra(0);

	// print out the graph
	System.out.println(vg.toString());

    }
    
    
}
