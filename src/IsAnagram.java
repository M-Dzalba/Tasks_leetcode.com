//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

import java.util.Arrays;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {

        char[]s_ch=s.toCharArray();
        char[]t_ch=t.toCharArray();

        Arrays.sort(s_ch);
        Arrays.sort(t_ch);
        return Arrays.equals(s_ch, t_ch);

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat",  "car"));
    }
}
