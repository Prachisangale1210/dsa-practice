package array;
import java.util.*;
public class reverse {
    public static void reverse(int arr[]){
        int l=0,h=arr.length-1;
        while(l<h){
            int temp;
            temp = arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array:");
        print(arr);
        reverse(arr);
        System.out.println("The reverse array:");
        print(arr);
    }
}
