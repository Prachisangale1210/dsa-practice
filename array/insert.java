package array;
import java.util.*;
public class insert {
    public static int insert(int arr[],int size,int pos,int val){
        if(pos<0 || pos>size){
            System.out.println("Invalid position");
        }else{
            for(int i=size;i>pos;i--){
                arr[i]=arr[i-1];
            }
        }
        arr[pos]=val;
        return size+1;
    }
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        display(arr,n);
        insert(arr, n, 3, 60);
        display(arr,n+1);
    }
}
