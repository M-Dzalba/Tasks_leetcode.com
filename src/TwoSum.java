//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
// to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.


import java.util.Arrays;


public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i< nums.length;i++){
            for (int j=1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));

    }
}
