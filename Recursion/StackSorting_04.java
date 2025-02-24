package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class StackSorting_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            st.push(sc.nextInt());
        }

        sort(st);

        while (!st.isEmpty())
            System.out.print(st.pop()+", ");
    }

    static void sort(Stack<Integer> st){
        if(st.size()==1)
            return;

        int temp = st.pop();
        sort(st);
        insert(st,temp);
    }

    static void insert(Stack<Integer> st, int temp){
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }

        int last = st.pop();
        insert(st,temp);
        st.push(last);

    }

}
