package array;
import java.util.*;
public class subarray {
    public static int[] create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void subarr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int first = i;
            for(int j=i;j<arr.length-1;j++){
                int last = j;
                for(int k=first;k<=last;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=create();
        System.out.println("Original array:");
        display(arr);
        subarr(arr);
    }
}
