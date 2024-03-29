//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.

public class RomanToInt {
    public static int NumValue(char rom) {
        if (rom == 'I')
            return 1;
        if (rom == 'V')
            return 5;
        if (rom == 'X')
            return 10;
        if (rom == 'L')
            return 50;
        if (rom == 'C')
            return 100;
        if (rom == 'D')
            return 500;
        if (rom == 'M')
            return 1000;
        return -1;
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            int s1 = NumValue(s.charAt(i));
            if (i+1 <s.length()) {
                int s2 = NumValue(s.charAt(i+1));
                if (s1 >= s2) {
                    sum = sum + s1;
                }
                else{
                    sum = sum - s1;
                }
            }
            else {
                sum = sum + s1;
            }
        }
        return sum;


    }
    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
