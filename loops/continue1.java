package loops;
import java.util.*;
public class continue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            if(num==3){
                continue;
            }
            System.out.println(num);
        }
    }
}