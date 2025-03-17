class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer  , Integer> hm  = new HashMap<>();

        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }

        int count = 0;
        for(Map.Entry<Integer , Integer> en : hm.entrySet()){
            int val = en.getValue();
           
            if(val%2!=0) return false;
        } 
        return true;
        // return false;

        
    }
}