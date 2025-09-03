package array;
import java.util.*;
public class delete {
    public static int delete1(int arr[],int size,int pos){
            if(pos<0||pos>=size){
                System.out.println("The position is invalid");
                return size;
            }else{
                for(int i=pos;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
            }
         return size-1;
    }
    public static void display(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
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
        display(arr, n);
        delete1(arr, n, 2);
        display(arr, n-1);
    }
}
