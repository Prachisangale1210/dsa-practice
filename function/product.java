package function;
import java.util.*;
public class product {
    public static int Product(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of the b:");
        int b = sc.nextInt();
        int products = Product(a,b);
        System.out.println("The product of a and b:"+products);
    }
}
