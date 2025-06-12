public class Baisics {

    public static void main(String[] args) {
        
        int[] nums = new int[5];
        int multiplier = 3;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = multiplier * i;
            System.out.println("Index " + i + " → Value: " + nums[i]);
        }
    }
}
