import java.util.*;
public class function2 {
    public static boolean isEven(int n){
        if(n%2!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
