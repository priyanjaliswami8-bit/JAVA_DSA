import java.util.Arrays;

class Arry{
    public static void getElement(int [] arr , int n){  //to find the second smallest element and second largest element
      if (n == 0 || n==1){
          //when the array has less than 2 elements
          System.out.println(-1 +" " + 1); //if so then print -1 for both  second smallest and largest element
          return;



      }
        Arrays.sort(arr);
      int small = arr[1];  //after sorting its easy to find the elements just by giving the index
      int large = arr[n-2];

        System.out.println("second smllest is " + small);
        System.out.println("second largest is " + large);

    }
}

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,7,10,6};

        int n = arr.length; //calculate the size of array

        Arry.getElement(arr , n); //calling the method to find the second smallest and largest element
    }

    
}
