public class ArrayLinearSearch {
    public static int search(int[] arr, int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return i ; //if found then return i unless -1
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int target = 30;

        int result = search(arr, target);
        System.out.println(result);
}


}
