package recursion;

public class optiPower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pow = power(x,n/2);
        int pow1 = pow*pow;
        if(n%2==0){
            pow1 = x*pow1;
        }
        return pow1;
    }
    public static void main(String args[]){
        int x = 2;
        int n =10;
        System.out.println(power(x,n));
    }
}
