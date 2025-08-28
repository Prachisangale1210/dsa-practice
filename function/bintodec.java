package function;

public class bintodec {
    public static void binToDec(int n){
        int real = n;
        int dec=0;
        int pow=0;
        while(n>0){
            int last = n%10;
            dec = dec+(last*(int) Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("The decimal number of binary number "+real+" = "+dec);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
