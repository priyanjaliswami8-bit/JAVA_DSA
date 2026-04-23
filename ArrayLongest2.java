import java.util.HashMap;
import java.util.Map;

class Solution{
    public int maxLen(int[] a , int n){
        Map<Integer, Integer> mpp = new HashMap<>();
        int maxi = 0;

        int sum = 0;

        for (int i=0; i< n; i++){
            sum += a[i];

            if (sum ==0){
                maxi = i+1;
            }
            else {
                if (mpp.containsKey(sum)) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }

            }
    }
    return maxi;
}

}

public class ArrayLongest2 {
    public static void main(String[] args) {
        int[] a = new int[] {9, -3,3,-1,6,-5};

        int n = a.length;

        int ans = new Solution().maxLen(a,n);

        System.out.println(ans);
    }

}
