
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int j = 0; j < strs[0].length(); j++){
            char curr = strs[0].charAt(j);
            for(int i = 1; i < strs.length ; i++){
                char ch = '0';
                try {
                    ch = strs[i].charAt(j);
                } catch (Exception ignored) {}
                if(ch != curr) return res;
            }
            res += curr;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }
}
