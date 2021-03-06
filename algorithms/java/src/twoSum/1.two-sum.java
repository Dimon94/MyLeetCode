import java.util.HashMap;

/*
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (38.53%)
 * Total Accepted:    987.5K
 * Total Submissions: 2.6M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int add = nums[i];
            int added = target - add;
            if (hashMap.containsKey(added)) {
                result[1] = i;
                result[0] = hashMap.get(added);
                return result;
            }
            hashMap.put(add, i);
        }
        return result;
    }
}
