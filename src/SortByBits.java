import java.util.Arrays;
import java.util.Comparator;
//You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's
// in their binary representation and in case of two or more integers have the same number of 1's you have to sort
// them in ascending order.
//
//Return the array after sorting it.
class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (Integer.bitCount(a) == Integer.bitCount(b)) {
            return a - b;
        }
        return Integer.bitCount(a) - Integer.bitCount(b);
    }
}
public class SortByBits {
    public static int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comparator = new CustomComparator();
        Arrays.sort(nums, comparator);
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
    }
}
