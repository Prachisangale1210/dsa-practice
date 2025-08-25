import java.util.*;
public class areaCircle {
    public static void main(String args[]){
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = pi * rad *rad ;
        System.out.println(area);
    }
}
