import java.util.*;
public class condtional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Write a program to check whether a given number is even or odd.
        // System.out.println("Enter the number:");
        // int a = sc.nextInt();
        // if(a%2==0){
        //     System.out.println("The number is even");
        // }else{
        //     System.out.println("The number is odd");
        // }

        //Take a number as input and print whether it is positive, negative, or zero.
        // System.out.println("Enter the number:");
        // int a = sc.nextInt();
        // if(a==0){
        //     System.out.println("The number is zero");
        // }else if(a<0){
        //     System.out.println("The number is negative");
        // }else{
        //     System.out.println("The number is positive");
        // }

        //Write a program to find the largest of two numbers.
        // System.out.println("Enter the first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number:");
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("The first number is greater");
        // }else{
        //     System.out.println("The second number is greater");
        // }

        //Check whether a given year is a leap year or not.
        // System.out.println("Enter the year:");
        // int year = sc.nextInt();
        // if(year%400==0 && (year%4==0 || year%100!=0)){
        //     System.out.println("The year is leap");
        // }else{
        //     System.out.println("The year is not leap");
        // }

        //Ask the user’s age and check if they are eligible to vote (age ≥ 18).
        // System.out.println("Enter the age:");
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("You are eligible to vote");
        // }else{
        //     System.out.println("You are not eligible to vote");
        // }

        //Take three numbers as input and print the largest using conditional statements.
        // System.out.println("Enter the first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number:");
        // int b = sc.nextInt();
        // System.out.println("Enter the third number:");
        // int c = sc.nextInt();
        // if(a>=b && a>=c){
        //     System.out.println("The first number is greater");
        // }else if(b>=c){
        //     System.out.println("The second number is greater");
        // }else{
        //     System.out.println("The third number is greater");
        // }

        //Write a program that checks if a number is divisible by both 3 and 5.
        // System.out.println("Enter the number:");
        // int a = sc.nextInt();
        // boolean res = (a%3==0 && a%5==0)? true : false;
        // System.out.println(res);

        //Take marks (0–100) and print the grade:
        // 90–100 → A // 75–89 → B // 50–74 → C // 35–49 → D // <35 → Fail
        // System.out.println("Enter the marks:");
        // int marks= sc.nextInt();
        // if(marks>=90 && marks<=100){
        //     System.out.println("Grade A");
        // }else if(marks>=75 && marks<=89){
        //     System.out.println("Grade B");
        // }else if(marks>=50 && marks<=74){
        //     System.out.println("Grade C");
        // }else if(marks>=35 && marks<=49){
        //     System.out.println("Grade D");
        // }else{
        //     System.out.println("Fail!!!");
        // }

        //Take a number and print whether it is
        // Odd Positive // Odd Negative // Even Positive// Even Negative
        // System.out.println("Enter the number:");
        // int a = sc.nextInt();
        // if(a%2==0 && a>0){
        //     System.out.println("Even and Positive");
        // }else if(a%2==0 && a<0){
        //     System.out.println("Even and Negative");
        // }else if(a%2!=0 && a>0){
        //     System.out.println("Odd and Positive");
        // }else{
        //     System.out.println("Odd and Negative");
        // }

        //Input a character and check if it is:
        // Uppercase letter // Lowercase letter // Digit // Special character
        // System.err.println("Enter the character:");
        // char a = sc.next().charAt(0);
        // if(a>='A' && a<= 'Z'){
        //     System.out.println("UpperCase Letter");
        // }else if(a>='a' && a<='z'){
        //     System.out.println("Lowercase Letter");
        // }else if(a>='0' && a<='9'){
        //     System.out.println("Digit");
        // }else{
        //     System.out.println("Special Character");
        // }

    //Input three sides of a triangle and check whether it is:
    // Equilateral // Isosceles // Scalene // Valid or not (sum of two sides > third side)
        // System.out.println("Enter the first number:");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number:");
        // int b = sc.nextInt();
        // System.out.println("Enter the third number:");
        // int c = sc.nextInt();
        // if(a==b && b==c){
        //     System.out.println("Equilateral");
        // }else if (a==b || b==c || c==a){
        //     System.out.println("Isosceles");
        // }else if (a!=b && b!=c && a!=c){
        //     System.out.println("Scalene");
        // }else if((a+b==c || b+c==a || a+c==b)){
        //     System.out.println("Valid Triangle");
        // }

    }
}
