import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if (map.containsKey(str)) {
                map.get(str).add(strs[i]);
            } else {
                map.put(str, new ArrayList<>());
                map.get(str).add(strs[i]);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }
}
