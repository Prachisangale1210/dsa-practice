import java.util.*;
public class practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        int side = sc.nextInt();
        float area = side * side;
        System.out.println("Area of the square of the given side is:");
        System.out.println(area);
    }
}
