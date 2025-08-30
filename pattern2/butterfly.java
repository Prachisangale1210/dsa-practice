package pattern2;
import java.util.*;
public class butterfly {
    public static void butter(int n){
        //1 st half
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n:");
        int n= sc.nextInt();
        butter(n);
    }
}
