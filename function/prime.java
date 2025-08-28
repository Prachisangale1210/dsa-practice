package function;
import java.util.*;
public class prime {
    public static boolean prime1(int n){
        //corner case
        if(n==2){
            System.out.println("The number is even and prime");
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(prime1(n)){
            System.out.println("The number is Prime");
        }else{
            System.out.println("The number is not Prime");
        }
    }
}
