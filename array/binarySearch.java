package array;
import java.util.*;
public class binarySearch {
    public static int search(int arr[],int key){
        int l=0;
        int h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

public static void print(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr []= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        print(arr);
        System.out.println("Enter the key to be found:");
        int key = sc.nextInt();
        int binary = search(arr, key);
        if(binary==-1){
            System.out.println("The key is not Found");
        }else{
            System.out.println("The key "+key+ " is found at the index "+binary);
        }
    }
}
