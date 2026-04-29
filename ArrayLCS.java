import java.util.*;

class ArrayLCS {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        Arrays.sort(nums);

        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] - 1 == lastSmaller) {
                cnt += 1;
                lastSmaller = nums[i];
            }
            else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] a = {100, 4, 200, 1, 3, 2};


        ArrayLCS obj = new ArrayLCS();

        int ans = obj.longestConsecutive(a);

        System.out.println("The longest consecutive sequence is " + ans);
    }
}