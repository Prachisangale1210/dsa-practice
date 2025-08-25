import java.util.*;
public class practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Write a program to swap the values of two integer variables without using a third variable.
        // System.out.println("Enter first number:");
        // int first = sc.nextInt();
        // System.out.println("Enter the second number:");
        // int second = sc.nextInt();
        // first=first+second;
        // second = first-second;
        // first = first-second;
        // System.out.println("The number first and second after swapping the value is " +first+ " and " +second+ " respectively.");

        //Write a program that prints the size (in bytes) of different data types: int, float, double, char, and bool.
        // System.out.println("Size of an Int is " +Integer.BYTES);
        // System.out.println("Size of an Float is " +Float.BYTES);
        // System.out.println("Size of an Double is " +Double.BYTES);
        // System.out.println("Size of an Char is " +Character.BYTES);

        //Write a program to take a character input and print its ASCII value.
        // char a = 'A';
        // int val = (int)(a);
        // System.out.println(val);

        // Write a program to demonstrate type conversion:
        // 1.Convert a float to an int
        // 2.Convert an int to a float
        // int a =10;
        // float b =(float) a;
        // System.out.println(b);
        // float c = 30.4f;
        // int d = (int) c;
        // System.out.println(d);

        //Take P (principal), R (rate), and T (time) as variables and calculate the simple interest using:
        // System.out.println("Enter the value of the principal:");
        // int p = sc.nextInt();
        // System.out.println("Enter the value of the rate:");
        // int r = sc.nextInt();
        // System.out.println("Enter the value of the time");
        // int t = sc.nextInt();
        // System.out.println("The simple interest is:");
        // float si = (p*r*t)/100;
        // System.out.println(si);

        //Print the minimum and maximum values of int, float, and double (hint: use libraries like <limits.h> in C++ or sys in Python).
        // System.out.println("The max and min value of the int is " +Integer.MAX_VALUE+ " and " +Integer.MIN_VALUE);
        // System.out.println("The max and min value of the float is " +Float.MAX_VALUE+ " and " +Float.MIN_VALUE);
        // System.out.println("The max and min value of the double is " +Double.MAX_VALUE+ " and " +Double.MIN_VALUE);

        //Write a program using a boolean variable to check if a number is greater than 100 and print true or false.
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean great = num>100;
        System.out.println(great);
    }
}
