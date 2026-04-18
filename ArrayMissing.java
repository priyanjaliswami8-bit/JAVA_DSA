public class ArrayMissing {
    public static int missing(int[] arr){
        int n = arr.length + 1;

        for (int i=1; i<=n; i++){
            boolean found = false;

            for (int j = 0; j< n-1; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8,7,2,4,3,5,1};
        System.out.println(missing(arr));
    }
}
