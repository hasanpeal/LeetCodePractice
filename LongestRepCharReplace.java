class Solution {
    public int characterReplacement(String s, int k) {
        char[] ch = new char[26];
        int left = 0, right = 0, maxCount = 0, res = 0;

        while(right < s.length()){
            ch[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, ch[s.charAt(right) - 'A']);
            while(right - left + 1 - maxCount > k){
                ch[s.charAt(left) - 'A']--;
                left++;
                
            };
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
