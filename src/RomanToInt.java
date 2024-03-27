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

    public static int romanToInt(String s) {
        int result=0;
        char[]chars=s.toCharArray();
        int symToVal;
        for (char aChar : chars) {
            switch (aChar) {
                case 'I' -> {
                    symToVal = 1;
                    result += symToVal;
                }
                case 'V' -> {
                    symToVal = 5;
                    result += symToVal;
                }
                case 'X' -> {
                    symToVal = 10;
                    result += symToVal;
                }
                case 'L' -> {
                    symToVal = 50;
                    result += symToVal;
                }
                case 'C' -> {
                    symToVal = 100;
                    result += symToVal;
                }
                case 'D' -> {
                    symToVal = 500;
                    result += symToVal;
                }
                case 'M' -> {
                    symToVal = 1000;
                    result += symToVal;
                }
                default -> System.out.println("invalid symbol");
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(romanToInt("LVIII"));
    }
}
