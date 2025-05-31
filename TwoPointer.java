import java.util.*;

public class TwoPointer{
  

    public static void main(String[] args) {
        int[] nums = {10, 3, 5, 2, 8, 7};
        int target = 15;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("✅ Pair found: " + nums[i] + " + " + complement + " = " + target);
                return;
            }

            map.put(nums[i], i); // store value and index
        }

        System.out.println("❌ No pair found");
    }
 }


