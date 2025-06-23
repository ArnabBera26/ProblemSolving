package SlidingWindow;

import java.util.HashMap;

public class Longest_Substring_kUnique_06 {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        int result = longestSubstringKuniqueChar(str,k);
        System.out.println("The length of longest substring with K unique character is: "+result);
    }

    public static int longestSubstringKuniqueChar(String str,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int result = -1;
        while (j<str.length()){
            char ch = str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()<k)
                j++;
            else if(map.size()==k){
                result = Math.max(result,j-i+1);
                j++;
            }else{
                while (map.size()>k){
                    char temp = str.charAt(i);
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
