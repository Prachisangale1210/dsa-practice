package sorting;
import java.util.*;
public class bubble {
    public static int bubbleSort(int arr[]){
        int swap =0;
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return swap;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int swap = bubbleSort(arr);
        System.out.println("The Sorted array: "+Arrays.toString(arr));
        System.out.println("The total swaps: "+swap);
    }
}
