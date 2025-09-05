package array;
import java.util.*;
public class trappingRainwater {
    public static int rain(int arr[]){
        int n = arr.length;
        //calculate left boundary
        int left[] = new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //calculate right boundary
        int right []= new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        //loop
        int trappedWater=0;
        for(int i=0;i<arr.length;i++){
            int waterLevel = Math.min(left[i],right[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }
public static void main(String args[]){
        int array[]={4,2,0,6,3,2,5};
        System.out.println("The total trapped rain water is "+rain(array));
    }
}
