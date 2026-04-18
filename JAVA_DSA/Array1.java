import java.util.Arrays;
class Ays {



        public static int sortArray(int[] arr) {
            Arrays.sort(arr);   //to sort the array in ascending order

            return arr[arr.length - 1];   //return the largest element after sorting


        }
    }
    public class Array1 {
        public static void main(String[] args) {

            int[] arr1 = {2,5,7,9,10};
            int[] arr2 = {3,6,1,8,12};

            System.out.println("The largest element in arr1 " + Ays.sortArray(arr1));
            System.out.println("The largest element in arr2 " + Ays.sortArray(arr2));
        }
}
