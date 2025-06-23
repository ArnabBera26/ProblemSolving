package SlidingWindow;

import java.util.HashMap;

public class LongestSubstr_no_repeatingChar_07 {
    public static void main(String[] args) {
        String str = "pwwkew";
        int result = lengthOfLongestSubstring(str);
        System.out.println("Length of longest substring with no repeating character is: "+result);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = 0;
        int i=0,j=0;
        while (j<s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==j-i+1){
                result = Math.max(result,j-i+1);
                j++;
            }else if(map.size()<j-i+1){
                while (map.size()<j-i+1){
                    char temp = s.charAt(i);
                    map.put(temp,map.get(temp)-1);
                    if(map.get(temp)==0)
                        map.remove(temp);
                    i++;
                }
                j++;
            }
        }
        return result;
    }
}
