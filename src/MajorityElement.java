import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than n / 2 times.
// You may assume that the majority element always exists in the array.
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
    public static int majorityElement(int[] nums) {

        Map<Integer,Integer>map=new HashMap<>();
        for (int n:nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else
                map.put(n,1);
        }
        Map.Entry<Integer,Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
