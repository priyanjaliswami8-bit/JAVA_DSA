public class Recursion1 {
    static void printN(int n){  //print something n times
        if(n==0) return;
        //base case
        System.out.println("priyanjali");
        printN(n-1 );

    }

    public static void main(String[] args) {
        printN(5);
    }
}
