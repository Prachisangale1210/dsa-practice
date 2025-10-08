package recursion;

public class increase {
    public static void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.print(n+"");
    }
    public static void main(String args[]){
        int n=10;
        print(n);
    }
}
