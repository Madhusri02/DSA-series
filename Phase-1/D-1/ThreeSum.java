import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer >> hs = new HashSet<>();

        for(int i = 0 ; i<nums.length ; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1 ; j <nums.length ; j++){
                int temp = -(nums[i]+nums[j]);

                if(set.contains(temp)){
                    List<Integer > sub = Arrays.asList(nums[i] , nums[j] , temp);
                    sub.sort(null);
                    hs.add(sub);
                }
                set.add(nums[j]);
            }
        }

        List<List<Integer>> res = new ArrayList<>(hs);
        return res;
        
    }
} 
