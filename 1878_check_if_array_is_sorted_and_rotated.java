class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        if(nums[0]<nums[nums.length-1]) c++;
        for(int i = 0 ; i< nums.length-1 ; i++){
            if(nums[i] > nums[i+1]) c++;
        }
        if (c<=1) return true;
        return false;

        
    }
}