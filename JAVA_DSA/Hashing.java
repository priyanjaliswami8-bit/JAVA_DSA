import java.util.HashMap;

public class Hashing {   //prestoring or fetching someting
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,6};
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int num : arr){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else{
                map.put(num , 1);
            }
            
        }
        for (int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
