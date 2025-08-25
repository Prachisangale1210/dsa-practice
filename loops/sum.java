package loops;
import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int range = sc.nextInt();
        int sum=0;
        int count = 0;
        while(count<=range){
            sum=sum+count;
            count++;
        }
        System.out.println(sum);
    }
}
