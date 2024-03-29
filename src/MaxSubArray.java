
//Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.
//
//
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

        public static void main(String[] args) {
            System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
            System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
