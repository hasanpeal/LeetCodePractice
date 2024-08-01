import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElem {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        PriorityQueue <Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b)-> b.getValue() - a.getValue());
        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(entry);
        }

        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
