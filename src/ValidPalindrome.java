//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.


public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String ans=sb.toString();
        return str.equals(ans);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
