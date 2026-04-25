class Solution {
    // Function to find maximum sum of subarrays
    public int arrayMaxSub(int[] nums) {


        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {

            /* Variable to store the sum
               of the current subarray */
            int sum = 0;

            /* Iterate over each ending index
               of subarrays starting from i */
            for (int j = i; j < nums.length; j++) {

                /* Add the current element nums[j] to
                   the sum i.e. sum of nums[i...j-1] */
                sum += nums[j];

                /* Update maxi with the maximum of its current
                   value and the sum of the current subarray */
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }
}

// Separate Main class in the same file
public class ArrayLeet53Ext {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Create an instance of Solution class
        Solution sol = new Solution();

        int maxSum = sol.arrayMaxSub(arr);

        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}


