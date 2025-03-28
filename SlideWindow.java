import java.util.*;
public class slideWindow{
    // create a helper class called pair 
    static class Pair implements Comparable<Pair>{
        int val ; 
        int index ; 
        // calll constructor
        Pair(int val, int index){
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.val,this.val);
        }
    }

    public static int[] slidingWindow( int nums[], int k ){
        //base case 
        if(nums==null||nums.length==0){
            return new int[0];
        }
        //decleration of variables
            int n = nums.length;
            int[] result = new int[n-k+1];
        // now make a priority queue 
        PriorityQueue<Pair>pq = new PriorityQueue<>();
            //fill the heap with first k element 
            for( int i=0 ; i<k;i++){
                    pq.add(new Pair(nums[i], i));
            }
            //store the max element 
             result[0] = pq.peek().val;
             //automattically pq handle large val on top 
            for( int i=k;i< n ; i++){
                pq.add(new Pair(nums[i], i));
            
            //remove that elements which are out of the windows 
                while(pq.peek().index<=i-k){
                    pq.poll();
                }
                result[i-k+1]= pq.peek().val;
            }


        return result;//here 0 is not final ans it can be anything

    }
    public static void main(String[] args) {
        int nums[] = { 1,3,-1,-1,5,3,6,7};
        //call the method of sliding window and passing value of k 
        System.out.print(Arrays.toString(slidingWindow(nums, 3)));
    }
}
