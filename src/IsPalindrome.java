//Given an integer x, return true if x is a
//palindrome, and false otherwise.

public class IsPalindrome {
    public static   boolean isPalindrome(int x) {
        int tmp=x;
        int reversed = 0;
        if(x<0){
            return false;
        }else {
            while (x != 0) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }
            return tmp == reversed;
        }
   }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
