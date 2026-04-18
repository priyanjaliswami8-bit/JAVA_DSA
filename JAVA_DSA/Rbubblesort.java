public class Rbubblesort {
    static void bubbleSort(int[] arr, int n){
        if (n==1) return;

        for (int j =0; j <= n - 2; j++){
            if (arr[j] > arr[j + 1]){

                //swap now
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        bubbleSort(arr, n-1);
        }

    public static void main(String[] args) {
        int[] arr = {12,11,45,7,34};
        int n = arr.length;

        System.out.println("before using Rbubble: ");
        for (int i : arr)
            System.out.println(i + " ");
        System.out.println();

        bubbleSort(arr , n);

        System.out.println("after using Rbubble: ");
        for (int i : arr)
            System.out.print(i + " ");
    }
    }


