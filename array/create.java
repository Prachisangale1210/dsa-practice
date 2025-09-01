package array;
import java.util.*;
public class create {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //size input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        //creation of the array using new keyword
        int numbers[] = new int[size];

        //input the array using loop
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        //output or print the array using loop
        System.out.println("The original array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
            System.out.println();

        //update the value of the one index
        numbers[2] = 12;
        System.out.println("The updated array:");
            for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        //another format of the declaration of the array
        int marks[] = {98,99,100};
        String fruits[] = {"Apple","Mango","Orange"};
        float prices[]={1.1f,3.4f,9.9f};

        //default array - store the value as null
        char b[];
        int a[];

        //length of the array
        System.out.println("Length of the array = "+marks.length);
    }
}
