package SlidingWindow;

import java.util.HashMap;

public class Min_window_substring_08 {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String t = "BANC";
        String result = minWindow(str,t);
        System.out.println("The minimum window substring will be: "+result);

    }

    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        //populate the map with t string
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int uniqueCharCount = map.size();
        int startIndex = -1;
        int windowStart = 0;
        int windowEnd  = 0;
        int minLength = Integer.MAX_VALUE;

        while (windowEnd<s.length()){
            //expand phase
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    uniqueCharCount--;
            }

            //shrinking phase
            while (uniqueCharCount==0){
                int len = windowEnd-windowStart+1;
                if(len<minLength) {
                    minLength = len;
                    startIndex = windowStart;
                }

                ch = s.charAt(windowStart);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0)
                        uniqueCharCount++;
                }
                windowStart++;
            }
            windowEnd++;
        }
        if(startIndex==-1)
            return "";
        return s.substring(startIndex,startIndex+minLength);
    }
}
