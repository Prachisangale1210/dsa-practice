package loops;
import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n =123;
        while(n>0){
            int digit = n%10;
            rev = (rev*10)+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
