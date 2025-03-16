class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        int nega = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > 0) { 
                hs.add(num);
            }
            else{
                nega = Math.max(nega , num);
            }
        }

        for(int num : hs){
            sum+=num;
        }

        if(sum==0 && nega!=0) return nega;

        return sum;
    }
}