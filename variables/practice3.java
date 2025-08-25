import java.util.*;
public class practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the pencil:");
        float pencil =sc.nextFloat();
        System.out.println("Enter the value of the eraser:");
        float eraser =sc.nextFloat();
        System.out.println("Enter the value of the pen:");
        float pen =sc.nextFloat();
        System.out.println("Total price with the 18% GST tax is:");
        float total = ((pencil + eraser + pen)*18)/100;
        System.out.println(total);
    }
}
