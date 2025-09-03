package array;
import java.util.*;
public class rotation {
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
    public static void left(int arr[]){
        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
    }
    public static void leftk(int arr[],int k,int n){
        k=k%n; //avoid overflow of the rotation
        for(int r=0;r<k;r++){
            int first = arr[0];
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=first;
        }
    }
    public static void right(int arr[]){
        int first = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=first;
    }
    public static void rigthk(int arr[],int k,int n){
        k=k%n;
        for(int r=0;r<k;r++){
            int last = arr[n-1];
            for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=last;
        }
    }
    public static void reverse(int arr[],int l,int r){
        l=0;
        r=arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=create();
        display(arr);
        right(arr);
        display(arr);
    }
}