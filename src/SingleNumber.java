//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Map<Integer,Integer>map=new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            } else
                map.put(num, map.get(num) + 1);
        }
        int min = Integer.MAX_VALUE;
        int minKeys = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() < min) {
                min = entry.getValue();
                minKeys=0;
            }
            if(entry.getValue() == min) {
                minKeys=(entry.getKey());
            }
        }
        return minKeys;
    }
    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }
}
