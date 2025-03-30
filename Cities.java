import java.util.*;
public class Cities{
static class Edge implements  Comparable<Edge>{
        int cost ; 
        int dst ; 
        public Edge( int c , int d){
            this.cost = c;
            this.dst = d;
        }
    
    @Override 
    
        public int compareTo(Edge e2){
           return  this.cost-e2.cost; 
            }
    }
    // find the minimL cost to reach through out all the cities 
  public static int connectingCities(int[][] cities) {
    PriorityQueue<Edge> pq = new PriorityQueue<>();
    boolean[] vis = new boolean[cities.length];
    
    pq.add(new Edge(0, 0)); // Start from city 0
    int finalCost = 0;

    while (!pq.isEmpty()) {
        Edge curr = pq.remove();

        if (!vis[curr.dst]) {
            vis[curr.dst] = true;
            finalCost += curr.cost;

            // Add all unvisited neighbors to the priority queue
            for (int i = 0; i < cities[curr.dst].length; i++) {
                if (!vis[i] && cities[curr.dst][i] != 0) {
                    pq.add(new Edge(cities[curr.dst][i], i));
                }
            }
        }
    }

    return finalCost;
}


    public static void main(String[] args) {
        int cities[][] = { {0,1,2,3,4},                     
                           {1,0,5,0,7},
                           {2,5,0,6,0},
                           {3,0,6,0,0},
                           {4,7,0,0,0}};
       int result=  connectingCities(cities);
       System.out.println("Ans"+result);
    } 

}