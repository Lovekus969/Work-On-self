
public class C{
    //method for the tabulaisation for fibbonacchi
    public static int fibTabulation(int n){
        //base case 
        int dp[] = new int[n+1];
        // initialise as we do for the base cases in the begining in the recusrsion 
        dp[0] = 0;
        dp[1]= 1;
            //run a loop throughout the entire array 
            for(int i=2; i<=n;i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[n];
    }

    public static void main(String[] args){
            int n =5;
            System.out.print(fibTabulation(n));
    }
}