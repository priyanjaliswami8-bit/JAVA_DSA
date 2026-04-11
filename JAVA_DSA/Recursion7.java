public class Recursion7 {
    public static void main(String[] args) {
        String s = "madam";

        int left = 0;
        int right = s.length() - 1;
        boolean HaiPallindrome = true;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                HaiPallindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (HaiPallindrome){
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}
