package array;
import java.util.*;
public class pairs {
    public static void print(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void pairs(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int curr = arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("( "+curr+" , "+arr[j]+ " )");
            }
            System.out.println();
        }
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
        pairs(arr);
    }
}
