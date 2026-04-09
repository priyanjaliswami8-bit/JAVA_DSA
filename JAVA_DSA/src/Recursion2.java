public class Recursion2 {
    static void print1toN(int i  , int n){
        if(i>n) return;
        print1toN(i+n, n);
        System.out.println(i);
        print1toN(i+1 , n);

    }

    public static void main(String[] args) {
        print1toN(1, 9);
    }
}
