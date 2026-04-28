import java.util.*;

class ArrayLeader {
    public static List<Integer> leaders(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        // Outer loop: pick each element
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Inner loop: check elements to the right
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            // If no greater element found → leader
            if (isLeader) {
                result.add(arr[i]);
            }
        }

        return result;
    }


        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};

            List<Integer> leaders = leaders(arr);

            System.out.println("Leaders in array: " + leaders);
        }
    }


