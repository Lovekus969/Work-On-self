
public class Classroom {
    static int n = 7;
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

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            System.out.println("Cycle detected between " + a + " and " + b);
            return;
        }
        //what if rang get same 
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;  // INCREMENT because both trees are of same height
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

    public static void main(String[] args) {
        init();
        union(1, 2);
        union(2, 3);
        union(4, 5);
        union(6, 5);
        union(3, 4);
        union(1, 5); // This will trigger cycle detection
    }
}
