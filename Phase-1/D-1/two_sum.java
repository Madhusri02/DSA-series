/**
 * This class provides a solution to the "Two Sum" problem.
 * The `twoSum` method finds two numbers in the given array that add up to the target value.
 * 
 * @param nums The array of integers.
 * @param target The target sum.
 * @return An array of two integers representing the indices of the two numbers that add up to the target.
 * 
 * The algorithm uses a HashMap to store the difference between the target and each element in the array.
 * It then checks if the current element exists in the HashMap, indicating that the pair has been found.
 * 
 * Time Complexity: O(n) - We traverse the list containing n elements exactly once.
 * Each lookup in the HashMap costs O(1) on average.
 * 
 * Space Complexity: O(n) - The extra space required depends on the number of items stored in the HashMap,
 * which stores at most n elements.
 */

import java.util.HashMap;
class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int ar[] = new int[2];
        for(int i = 0 ; i<nums.length ; i++){
            int temp = target - nums[i];
            if(hm.containsKey(temp)){
                ar[0] = hm.get(temp);
                ar[1] = i;
                return ar;
            }
            hm.put(nums[i] , i);
        } 
        return ar;
        
    }
    
}

