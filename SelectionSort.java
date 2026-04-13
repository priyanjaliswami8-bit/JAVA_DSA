public class SelectionSort {
    static void selection(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n -1; i++){  //go or traverse through all array elements

            int minIndex = i;     //take as if it holds the minimum
            for (int j = i+1; j<n; j++){ //now finding the minimum element in the array
                if (arr[j] < arr[minIndex]){
                    minIndex = j;  //if smaller is found update minIndex
                }
            }
            if (minIndex != i){  //now swap the minimum element with the first unsorted element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
//print the sorted array
    public static void main(String[] args) {
        int[] arr = {45,12,35,78,32};

        selection(arr);

        System.out.print("after sorting: ");
        for (int x : arr) System.out.println(x + "  ");
    }
}
