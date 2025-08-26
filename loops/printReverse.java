package loops;

public class printReverse {
    public static void main(String args[]){
        int n = 123;
        while(n>0){
            int l = n%10;
            System.out.print(l+" ");
            n=n/10;
        }
    }
}
