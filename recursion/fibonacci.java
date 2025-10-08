package recursion;

public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int n1 = fib(n-1);
        int n2 = fib(n-2);
        return n1+n2;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(fib(n));
    }
}
