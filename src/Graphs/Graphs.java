package Graphs;

import Queue.LinkedListQueue;

public class Graphs {
    public int vertices;
    public int adjMat[][];
    public int visited[];

    public Graphs(int n){
        vertices=n;
        adjMat=new int[n][n];
        visited=new int[vertices];
    }

    public void insertEdge(int u,int v,int x){
        adjMat[u][v]=x;
    }

    public void removeEdge(int u,int v){
        adjMat[u][v]=0;
    }

    public boolean existEdge(int u,int v){
        return adjMat[u][v]!=0;
    }

    public int vertexCcount(){
        return vertices;
    }
    public int edgeCount(){
        int count=0;
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++)
                if(adjMat[i][j]!=0)
                    count=count+1;
        }
            return count;
    }

    public void edges() {
        System.out.println("Edges");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++)
                if (adjMat[i][j] != 0)
                    System.out.println(i + "_____" + j);
        }
    }

    public int outdegree(int v){
        int count=0;
        for (int j = 0; j < vertices; j++)
            if(adjMat[v][j]!=0)
                count=count+1;
        return count;
    }

    public int indegree(int v){
        int count=0;
        for (int i = 0; i < vertices; i++)
            if(adjMat[v][i]!=0)
                count=count+1;
        return count;
    }

    public void display(){
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++)
                System.out.println(adjMat[i][j] + "\t");
            System.out.println();
        }
    }
    public void BFS(int s){
        int i=s;
        LinkedListQueue q=new LinkedListQueue();
        int visited[]=new int[vertices];
        System.out.println(i+" ");
        visited[i]=1;
        q.enqueue(i);
        while (!q.isEmpty()){
            i=(int)q.dequeue();
            for(int j=0;j<vertices;j++){
                if(adjMat[i][j]==1 &&visited[j]==0){
                    System.out.println(j+" ");
                    visited[j]=1;
                    q.enqueue(j);
                }
            }

        }
    }

    public void DFS(int s){
        if(visited[s]==0){
            System.out.println(s+" ");
            visited[s]=1;
            for(int j=0;j<vertices;j++)
                if(adjMat[s][j]==1&&visited[j]==0)
                    DFS(j);
        }

    }

    public static void main(String[] args) {
        Graphs g=new Graphs(4);
        System.out.println("Graphs Adjency Matrix");
        g.display();
        System.out.println("Vertices: "+g.vertexCcount());
        System.out.println("Edges: "+g.edgeCount());
        g.insertEdge(0,1,1);
        g.insertEdge(0,2,1);
        g.insertEdge(1,0,1);
        g.insertEdge(1,2,1);
        g.insertEdge(2,0,1);
        g.insertEdge(2,1,1);
        g.insertEdge(2,3,1);
        g.insertEdge(3,2,1);
        //weighted undirected graph
        // g.insertEdge(0,1,36);
        // g.insertEdge(0,2,30);
        // g.insertEdge(1,0,15);
        // g.insertEdge(1,2,10);
        // g.insertEdge(2,0,22);
        // g.insertEdge(2,1,7);
        // g.insertEdge(2,3,9);
        // g.insertEdge(3,2,12);
        //directed graph
        // g.insertEdge(0,1,1);
        // g.insertEdge(0,2,1);
        // g.insertEdge(1,2,1);
        // g.insertEdge(2,3,1);
        //weighted directed graph
        // g.insertEdge(0,1,26);
        // g.insertEdge(0,2,16);
        // g.insertEdge(1,2,12);
        // g.insertEdge(2,3,9);
        g.display();
        System.out.println("Edges: "+g.edgeCount());
        g.edges();
    }
}
