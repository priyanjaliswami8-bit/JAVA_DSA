public class InsertionSort {
    public static void Insertion(int[] arr){
        int n = arr.length;
        for(int i = 1; i< n; i++){
            int key = arr[i];  //insertion element or key
            int j = i - 1;

            //shift element greater than key
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            //place key at correct position
            arr[j +1 ]= key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,2,1,4};

        Insertion(arr);

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
