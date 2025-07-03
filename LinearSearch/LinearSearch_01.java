package LinearSearch;

public class LinearSearch_01 {
    public static void main(String[] args) {
        int[] arr = {9,6,7,3,2,5,4};
        int item = 10;
        int result = linearSearch(arr,item);
        if(result==-1)
            System.out.println("The item is not present in the array.");
        else
            System.out.println("The position of the item is: "+(result+1));
    }

    public static int linearSearch(int[] arr,int item){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item)
                return i;
        }
        return index;
    }
}
