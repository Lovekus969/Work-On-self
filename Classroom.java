
import java.util.ArrayList;
import java.util.Collections;


public class Classroom {
    static int n = 4;//vertices
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]); // Path compression
    }
        static class Edge implements Comparable<Edge>{
            int src , dst , wt;
            public Edge( int src , int dst , int wt){
                this.src = src ;
                 this.dst = dst ; 
                 this.wt = wt ; 
            }
            @Override
            public int compareTo(Edge e2){
                return this.wt - e2.wt;
            }
        }
        //create graph here based on src dst and weight 
         static void createGraph(ArrayList<Edge> egdes){
                egdes.add(new Edge(0, 1, 10));
                egdes.add(new Edge(0, 2, 15));
                egdes.add(new Edge(0, 3,30));
                egdes.add(new Edge(1, 3, 40));
                egdes.add(new Edge(2, 3, 50));
                

                }
        public static void union(int a, int b) {
            int parA = find(a);
            int parB = find(b);

            if (parA == parB) {
                System.out.println("Cycle detected between " + a + " and " + b);
                return;
            }

            // Union by rank
            if (rank[parA] < rank[parB]) {
                par[parA] = parB;
            } else if (rank[parA] > rank[parB]) {
                par[parB] = parA;
            } else {
                par[parB] = parA;
                rank[parA]++;
            }
        }
    
    
    public static void krauskalMST(ArrayList<Edge>edges, int V) {
        init();
        Collections.sort(edges);
        int mstcost = 0 ;
        int count =0 ; 

            for (int i = 0; count < V - 1 && i < edges.size(); i++) {
                Edge e = edges.get(i);

                int parA = find(e.src);
                int parB = find(e.dst);

                if (parA != parB) {
                    union(e.src, e.dst);
                    mstcost += e.wt;
                    count++; // Increment count when edge is added to MST
                }
            }
        System.out.println(" cost is "+ mstcost);
    }
    public static void main(String[] args) {
        int V =4 ;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        krauskalMST(edges, V);
    }
}
