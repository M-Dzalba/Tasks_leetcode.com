//Given a string columnTitle that represents the column title as appears in an Excel sheet, return
// its corresponding column number.
//
//For example:
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
//
//
//Example 1:
//
//Input: columnTitle = "A"
//Output: 1
//Example 2:
//
//Input: columnTitle = "AB"
//Output: 28
//Example 3:
//
//Input: columnTitle = "ZY"
//Output: 701

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch : columnTitle.toCharArray()) {
            int diff = ch-('A' - 1);
            sum = sum *26 + diff;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }
}
