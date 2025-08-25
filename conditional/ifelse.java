package conditional;
import java.util.*;
public class ifelse {
    public static void main(String args[]){
        int age =16;
        if(age>=18){
            System.out.println("Adult: drive , vote");
        }
        if(age>13 && age<=16){
            System.out.println("Teenagers");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
