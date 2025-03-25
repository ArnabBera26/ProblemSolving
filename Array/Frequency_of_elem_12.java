//finding the frequencies of elements in a sorted array

package Array;

public class Frequency_of_elem_12 {
    public static void main(String[] args) {
        int[] arr = {10,10,10,25,30,30};
        countFrequency(arr);
    }

    private static void countFrequency(int[] arr){
        int len = arr.length;
        int frequency = 1;
        int i=1;
        while (i<len){
            while (i<len && arr[i] == arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(arr[i-1] +" = "+frequency);
            i++;
            frequency=1;
        }
        if(len==1 || arr[len-1] != arr[len-2])
            System.out.println(arr[len-1]+" = "+ 1);
    }


}