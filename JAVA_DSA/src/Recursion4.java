public class Recursion4 {
    static int sum(int i ){
        if(i==0){
            return 0;
        }
        return i + sum(i - 1); //recursive case


    }

    public static void main(String[] args) {
        int i = 5;
        System.out.println(sum(i));
    }
}
