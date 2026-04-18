public class RInsertionSort {
    static void insertionSort(int[] arr , int i, int n){
        //base case
        if (i==n) return;

        int j = i;

        while (j>0 && arr[j - 1] > arr[j]){  //moving the current element back until its in the correct place
            //now swap
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        // R for next index
        insertionSort(arr, i+1, n);

    }

    public static void main(String[] args) {
        int[] arr = {11,34,67,89,43};
        int n = arr.length;

        System.out.println("before: ");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
        insertionSort(arr, 0, n);

        System.out.println("after: ");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
