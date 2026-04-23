class Yes{
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0;

        for (int startIndex = 0; startIndex < n; startIndex++) {

            for (int endIndex= startIndex; endIndex< n; endIndex++){

                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++){
                    currentSum += nums[i];
                }
                if (currentSum==k){
                    maxLength = Math.max(maxLength, endIndex - startIndex+1);

                }
            }
        }
        return maxLength;
    }
}



public class ArrayLongest {
    public static void main(String[] args) {
        int[] a = {-1 , 1, 1};
        int k =1;

         Yes obj = new Yes();

         int len = obj.longestSubarray(a,k);

        System.out.println("The length of the longest subarray is: " + len);
    }

    //longest subarrayy with given sum k

}
