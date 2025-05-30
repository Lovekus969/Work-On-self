import java.util.*;

public class TwoPointer{

    public static void main(String[] args) {
          int[] arr = {10, 3, 5, 2, 8, 7};
        int target = 15;

        Arrays.sort(arr);  // Step 1: Sort the ṇarray
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        // Step 2: Two-pointer loop
        while (left < right) {
            int sum = arr[left] + arr[right];
            System.out.println("Checking: " + arr[left] + " + " + arr[right] + " = " + sum);

            if (sum == target) {
                System.out.println("✅ Found pair: " + arr[left] + " + " + arr[right] + " = " + target);
                break;
            } else if (sum < target) {
                left++;  // Increase sum by moving left pointer right
            } else {
                right--; // Decrease sum by moving right pointer left
            }
        }

        if (left >= right) {
            System.out.println("❌ No pair found with sum = " + target);
        }
    }
}