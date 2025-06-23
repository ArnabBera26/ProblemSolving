package SlidingWindow;

import java.util.Arrays;
public class Count_Occurence_03 { 
    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";
        int result = search(pat,txt);
        System.out.println("The occurrences of anagram is: "+result);
    }

    private static int search(String pat,String txt){
        int[] patFreq = new int[26];
        int[] txtFreq = new int[26];
        int k = pat.length();
        for(int i=0;i<k;i++){
            int index = pat.charAt(i)-97;
            patFreq[index]++;
        }

        int n = txt.length();
        for(int i=0;i<k;i++){
            int index = txt.charAt(i)-97;
            txtFreq[index]++;
        }

        int count = 0;
        if(Arrays.equals(txtFreq,patFreq)){
            count++;
        }

        for(int i=1;i<n-k+1;i++){
            int removeCharIndex = txt.charAt(i-1)-97;
            int addCharIndex = txt.charAt(i+k-1)-97;
            txtFreq[removeCharIndex]--;
            txtFreq[addCharIndex]++;
            if(Arrays.equals(txtFreq,patFreq))
                count++;
        }
        return count;
    }
}
