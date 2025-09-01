package array;
import java.util.*;
public class largest {
    public static int large(int arr[]){
        int largest1 = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest1){
                largest1 = arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smaller value in the array is "+smallest);
        return largest1;
    }
    public static void print(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr []= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println("The largest value in the array is "+large(arr));
    }
}
