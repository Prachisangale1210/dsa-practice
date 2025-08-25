package conditional;
import java.util.*;
public class elseif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else if(age>13 && age<16){
            System.out.println("Teenagers");
        }else{
            System.out.println("Not adult");
        }
    }
}
