import java.util.*;
public class function4 {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of the digits : "+sum(123));
    }
}
