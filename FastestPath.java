import java.util.*;


class RoadSegment {
    int to;
    double distance; // in km
    double speed;    // in km/h

    RoadSegment(int to, double distance, double speed) {
        this.to = to;
        this.distance = distance;
        this.speed = speed;
    }

    double getTime() {
        return distance / speed;
    }
}

class Pair {
    int node;
    double time;

    Pair(int node, double time) {
        this.node = node;
        this.time = time;
    }
}

public class FastestPath {

    static double dijkstraFastestPath(Map<Integer, List<RoadSegment>> graph, int start, int end) {
        double[] minTime = new double[graph.size()];
        Arrays.fill(minTime, Double.MAX_VALUE);
        minTime[start] = 0.0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingDouble(p -> p.time));// here i used lembda fundtion 
//         PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
//         public int compare(Pair a, Pair b) {
//         return Double.compare(a.time, b.time);
//     }
// });

        pq.add(new Pair(start, 0.0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.node;
            double timeSoFar = current.time;

            if (u == end) return timeSoFar;

            for (RoadSegment neighbor : graph.get(u)) {
                double timeToNeighbor = timeSoFar + neighbor.getTime();
                if (timeToNeighbor < minTime[neighbor.to]) {
                    minTime[neighbor.to] = timeToNeighbor;
                    pq.add(new Pair(neighbor.to, timeToNeighbor));
                }
            }
        }

        return -1.0; // Path not found
    }

    public static void main(String[] args) {
        Map<Integer, List<RoadSegment>> graph = new HashMap<>();

        // Example graph
        // 0 - highway to 1 (45 km at 90 km/h)
        // 0 - street to 1 (44 km at 40 km/h)
        graph.put(0, new ArrayList<>());
        graph.put(1, new ArrayList<>());

        graph.get(0).add(new RoadSegment(1, 45, 90));  // 0.5 hours
        graph.get(0).add(new RoadSegment(1, 44, 40));  // 1.1 hours

        double fastestTime = dijkstraFastestPath(graph, 0, 1);
        System.out.println("Fastest time from 0 to 1: " + fastestTime + " hours");
    }
}
