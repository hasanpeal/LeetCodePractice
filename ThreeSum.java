import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        HashSet <List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        int i = 0;
        while(i < nums.length){
            for(int j = i + 1; j < nums.length; j++){
                if(i != j){
                    int num = 0 - nums[i] - nums[j];
                    if(map.containsKey(num)){
                        if(map.get(num) != i && map.get(num) != j){
                            List<Integer> tuples = Arrays.asList(nums[i], nums[j], num);
                            Collections.sort(tuples);
                            if(!set.contains(tuples)){
                                set.add(tuples);
                            }
                        }
                    }
                }
            }
            i++;
        }
        return new ArrayList<>(set);
    }
}
