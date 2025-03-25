package Array;

public class Trapping_RainWater_14 {
    public static void main(String[] args) {
        int[] arr = {5,0,6,2,3};
//        int result = maxTrap(arr);
        int result = maximumTrap(arr);
        System.out.println("The maximum water can trap by slabs is: "+result);
    }

    //naive solution
    private static int maxTrap(int[] arr){
        int water = 0;
        int len = arr.length;
        for(int i=1;i<len-1;i++){
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax,arr[j]);
            }

            int rmax = arr[i];
            for(int j=i+1;j<len;j++){
                rmax = Math.max(rmax,arr[j]);
            }

            water = water+ Math.min(rmax,lmax)-arr[i];
        }
        return water;
    }

    //efficient solution
    private static int maximumTrap(int[] arr){
        int len = arr.length;
        int[] lmax = new int[len];
        int[] rmax = new int[len];
        int water = 0;

        lmax[0] = arr[0];
        for(int i=1;i<len;i++){
            lmax[i] = Math.max(arr[i],lmax[i-1]);
        }

        rmax[len-1] = arr[len-1];
        for(int j=len-2;j>=0;j--){
            rmax[j] = Math.max(arr[j],rmax[j+1]);
        }

        for(int i=1;i<len-1;i++) {
            water = water + Math.min(rmax[i], lmax[i]) -arr[i];
        }
        return water;
    }

}
