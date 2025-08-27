package loops;
import java.util.*;
public class break1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
        System.out.println("Out of the loop");
    }
}
