package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ClearDigits_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = clearDigits(str);
        System.out.println(result);
    }

    public static String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            int num = ch-'0';
            if(num>=0 && num<=9 && !st.isEmpty())
                st.pop();
            else
                st.push(ch);
        }
        StringBuffer sb = new StringBuffer();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
