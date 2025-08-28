import java.util.*;
public class loops1 {
    public static void main(String[] args) {
        //Take a number N and print all numbers from 1 to N using a loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        //using for loop
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        // }
        //using while loop
        // int i=1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }
        //using do-while loop
        // int i=1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=n);

        // Sum of first N natural numbers
        // Input: N = 5 → Output = 15 (1+2+3+4+5).
        //using for loop
        //int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println("The sum of the range: "+sum);
        //using while loop
        // int i=1;
        // while(i<=n){
        //     sum=sum+i;
        //     i++;
        // }
        // System.out.println(sum);
        //using do-while loop
        // int i=1;
        // do{
        //     sum=sum+i;
        //     i++;
        // }while(i<=n);
        // System.out.println("The sum of the range: "+sum);

        //Multiplication Table
        //Input: 7 → Output the multiplication table of 7 up to 10.
        //Using for loop
        // int table = 1;
        // for(int i=1;i<=10;i++){
        //     table = n*i;
        //     System.out.println(n+ " * "+i+ " = " +table);
        //}
        //using while loop
        // int table=1;
        // int i=1;
        // while(i<=10){
        //     table = n*i;
        //     System.out.println(n+ " * "+i+ " = " +table);
        //     i++;
        // }
        // int i=1;
        // int table=1;
        // do{
        //     table=n*i;
        //     System.out.println(n+ " * "+i+ " = " +table);
        // }while(i<=10);

        //Factorial of a Number
        //Input: 5 → Output = 120 (5×4×3×2×1).
        //using while loop
        // int fact=1;
        // int i=1;
        // while(i<=n){
        //     fact= fact*i;
        //     i++;
        // }
        // System.out.println(fact);
        //using for loop
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);
        //using do while loop
        // int fact =1;
        // int i=1;
        // do{
        //     fact=fact*i;
        //     i++;
        // }while(i<=n);
        // System.out.println(fact);

        //Reverse a Number
        //Input: 1234 → Output = 4321.
        int num=n;
        int digit = 0;
        while(num>0){
            int rem = num%10;
            digit = (digit*10)+rem;
            num=num/10;
        }
        System.out.println(digit);
    }
}
