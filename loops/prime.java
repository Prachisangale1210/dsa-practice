package loops;
import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<=1){
            System.out.println("The number is not Prime Number");
            return;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println("The number is prime");
            }else{
                System.out.println("The number is not prime");
            }
        }
    }
}
