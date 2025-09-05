package array;
import java.util.*;
public class kadanes {
    public static int sum(int arr[]){
        int ms = arr[0];
        int cs = arr[0];
        for(int i=1;i<arr.length;i++){
            cs = Math.max(arr[i],arr[i]+cs);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("The maximum value of the sub array is "+sum(array));
    }
}
