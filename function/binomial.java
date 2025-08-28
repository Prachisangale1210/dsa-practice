package function;
import java.util.*;
public class binomial {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bioCof(int n ,int r){
        int a = fact(n);
        int b = fact(r);
        int nmr = fact(n-r);
        int bic = a/(b*nmr);
        return bic;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        System.out.println("The binomial cofficient :"+bioCof(n, r));
    }
}
