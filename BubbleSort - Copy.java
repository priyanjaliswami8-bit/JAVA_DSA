public class BubbleSort {
    public static void Bubble(int[] arr){
        int n = arr.length;

        for (int i=0; i< n-1; i++){
            boolean swap = false;

            for (int j=0; j < n- 1; j++){
                if (arr[j] > arr[j+1]){
                    //now swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap)break;  //if no swapping happened

        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};

        Bubble(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
