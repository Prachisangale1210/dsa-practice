package array;
import java.util.*;
public class linearSearch {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                return i;
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
        int search = linearsearch(arr, key);
        if(search!=-1){
            System.out.println("The key "+key+ " found at the index "+search);
        }else{
            System.out.println("NOT FOUND !!!!");
        }
    }
}
