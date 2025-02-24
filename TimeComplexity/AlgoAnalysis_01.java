//There are 3 types of function for same task
package TimeComplexity;

import java.util.Scanner;

public class AlgoAnalysis_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        int result1 = func1(num);
//        int result2 = func2(num);
        int result3 = func3(num);
        System.out.println("Sum of 1st "+num+" natural number is: "+result3);
    }

    static int func1(int num){
        int sum = 0;
        sum = num*(num+1)/2;
        return sum;
    }

    static int func2(int num){
        int sum = 0;
        for (int i=1;i<=num;i++)
            sum = sum+i;
        return  sum;
    }

    static int func3(int num){
        int sum = 0;
        for(int i=1;i<=num;i++)
            for(int j=1;j<=i;j++)
                sum++;
        return sum;
    }

}
