import java.util.HashMap;

public class Hasing2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,7,6,8,6,7};

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+1);

        }

        int maxFrequency = 0;
        int result = -1;

        for (int key : map.keySet()){
            if (map.get(key) > maxFrequency){
                maxFrequency = map.get(key);
                result = key;
            }
        }
        System.out.println("Highest occuring element " + result);
    }
}
