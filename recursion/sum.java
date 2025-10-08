package recursion;

public class sum {
    public static int add(int n){
        if(n==1){
            return 1;
        }
        int sum1 = n+add(n-1);
        return sum1;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(add(n));
    }
}
