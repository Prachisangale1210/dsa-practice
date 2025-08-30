package pattern2;
import java.util.*;
public class soildRom {
    public static void solid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n:");
        int n = sc.nextInt();
        solid(n);
    }
}
