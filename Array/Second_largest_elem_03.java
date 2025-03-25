package Array;

public class Second_largest_elem_03 {
    public static void main(String[] args) {
        int[] arr = {1,23,41,25,10,13,11,19};
        int result = secondLargestElement(arr);
        if(result==-1)
            System.out.println("No second largest element is not there");
        else
            System.out.println("The second largest element is: "+arr[result]);
    }

    //this is the naive approach( 2 traversal approach)
    private static int secondLargest(int[] arr){
        int largest = largestElement(arr);
        int flag = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[largest]){
                if(flag == -1)
                    flag = i;
                else if(arr[i]>arr[flag])
                    flag = i;
            }
        }
        return flag;
    }

    private static int largestElement(int[] arr){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[pos])
                pos = i;
        }
        return pos;
    }

    //efficient solution(1 traversal approach)
    private static int secondLargestElement(int[] arr){
        int res = -1;
        int largest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res==-1 || arr[i]>arr[res])
                    res = i;
            }
        }
        return res;
    }
}
