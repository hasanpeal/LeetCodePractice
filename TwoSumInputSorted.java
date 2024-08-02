import java.util.HashMap;

public class TwoSumInputSorted {
    public int[] twoSum(int[] numbers, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                if(i != map.get(target-numbers[i])){
                    int item1 = i + 1;
                    int item2 = map.get(target-numbers[i]) + 1;
                    if(item1 < item2){
                        ans[0] = item1;
                        ans[1] = item2;
                    } else {
                        ans[0] = item2;
                        ans[1] = item1;
                    }
                }
            }
        }
        return ans;
    }
}
