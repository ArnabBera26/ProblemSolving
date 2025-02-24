//Here we are trying to print the n th fibonacci number
package TimeComplexity;

import java.util.Scanner;

public class FibonacciNumber_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = fibonacci3(num);
        System.out.println("The result is: "+result);
    }

    //using recursion
    static int fibonacci1(int num){
        if(num<=0 || num==1)
            return num;
        return fibonacci1(num-1)+fibonacci1(num-2);
    }

    static int fibonacci2(int num){
        int a = 0;
        int b = 1;

        if(num==a || num==b)
            return num;
        int c = 0;
        for(int i=2;i<=num;i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }

    static int fibonacci3(int num){
        int[] arr = new int[num+1];
        arr[0] =0;
        arr[1] = 1;
        for(int i=2;i<=num;i++){
            arr[i] = arr[i-1]+arr[i-2];
//            System.out.println(arr[i]);
        }
        return arr[num];
    }

}
