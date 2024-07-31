import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] ans = {0, 0};
        for(int i = 0; i < nums.length; i++) map.put(nums[i], i);

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])) {
                int index1 = i;
                int index2= map.get(target - nums[i]);

                if(index1 == index2) continue;
                else {
                    if(index1 < index2){
                        ans[0] = index1;
                        ans[1] = index2;
                        
                    } 
                    else {
                        ans[0] = index2;
                        ans[1] = index1;
                    }
                }
            }
        }
        return ans;
    }
}
