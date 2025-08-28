import java.util.*;
public class function1 {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        //write a java method to compute avg of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the second Number:");
        int b = sc.nextInt();
        System.out.println("Enter the third Number:");
        int c = sc.nextInt();
        System.out.println("The sum of the three numbers is: "+(sum(a,b,c)));
    }
}
