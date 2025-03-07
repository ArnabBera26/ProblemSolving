package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class N_bitNumber_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of binary: ");
        int num = sc.nextInt();
        ArrayList<String> result = NBitBinary(num);
        for(String str:result)
            System.out.print(str+", ");

    }

    public static ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        int count_one= 1;
        int count_zero = 0;
        String result = "1";
        binaryResult(N-1,count_one,count_zero,result,list);
        return list;
    }

    private static void binaryResult(int n, int countOne, int countZero, String result, ArrayList<String> list) {
        if(n==0){
            list.add(result);
            return;
        }

        binaryResult(n-1,countOne+1,countZero,result+"1",list);
        if(countOne>countZero){
            binaryResult(n-1,countOne,countZero+1,result+"0",list);
        }
    }
}
