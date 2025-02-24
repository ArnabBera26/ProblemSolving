package TimeComplexity;

import java.util.Scanner;

public class RecurenceRelation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
//        fun1(num);
        fun2(num);
    }

    static void fun1(int num){
        if(num<=0)
            return;
        System.out.println("Arnab Bera is a good boy.");
        fun1(num/2);
        fun1(num/2);
    }

    static void fun2(int num){
        if(num<1)
            return;
        System.out.println(num);
        fun2(num-1);
    }



}
