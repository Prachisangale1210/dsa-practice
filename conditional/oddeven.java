package conditional;
import java.util.*;
public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is even or it is odd:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
