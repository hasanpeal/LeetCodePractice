public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < temp.length(); i++){
            
            char curr = temp.charAt(i);
            
            if((curr >= 48 && curr <= 57) || (curr >= 97 && curr <= 122)){
                
                str.append(curr);
                
            }
        }

        String s1 = str.toString();
        String s2 = str.reverse().toString();

        return s1.equals(s2);
    }
}
