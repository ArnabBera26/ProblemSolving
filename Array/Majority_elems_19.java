// Majority elements are those elements which appears more than n/2 times in the array
package Array;

public class Majority_elems_19 {
    public static void main(String[] args) {
        int[] arr = {8,3,4,8,5,8};
        int index = findMajority(arr);
        if(index==-1)
            System.out.println("No majority element found");
        else
            System.out.println("The majority elemts is: "+arr[index]);
    }

    //Naive solution
    private static int findMajority(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    temp++;
            }
            if(temp>arr.length/2)
                return i;
        }

        return -1;
    }

    //Moore's voting algo
    private static int majorityElem(int[] arr){
        int count = 1;
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                count=1;
                res=i;
            }
        }

        count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i])
                count++;
        }

        if(count<=arr.length/2) return -1;
        return res;
    }
}
