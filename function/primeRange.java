package function;

public class primeRange {
        public static boolean prime1(int n){
        //corner case
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void range(int n){
        for(int i=2;i<=n;i++){
            if(prime1(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        range(16);
    }
}
