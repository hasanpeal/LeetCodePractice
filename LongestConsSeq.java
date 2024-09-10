import java.util.HashSet;

public class LongestConsSeq {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        HashSet <Integer> set = new HashSet<>();
        int count = 1;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(!set.contains(curr-1)) {
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                } 
                res = Math.max(count, res);
                count = 1;
            }
            
        }
        return res; 
    }
}
