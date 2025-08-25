import java.util.*;
public class variable2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Find the roots of a quadratic equation (ax^2 + bx + c = 0) using double variables and typecasting.
        // System.out.println("Enter the value of a:");
        // double a = sc.nextDouble();
        // System.out.println("Enter the value of b:");
        // double b = sc.nextDouble();
        // System.out.println("Enter the value of c:");
        // double c = sc.nextDouble();
        // double D = (b*b)-(4*a*c);
        // if(D>0){
        //     System.out.println("The roots are real and distinct");
        //     double root1 = (-b+Math.sqrt(D))/(2*a);
        //     double root2 = (-b-Math.sqrt(D))/(2*a);
        //     System.out.println("Root 1 and Root is "+root1+" and "+root2+" respectively" );
        // }else if(D==0){
        //     System.out.println("Roots are real and equal");
        //     double root = -b/(2*a);
        //     System.out.println("Root: "+root);
        // }else{
        //     System.out.println("The roots are complex");
        //     double real = -b/(2*a);
        //     double img = Math.sqrt(-D)/(2*a);
        //     System.out.println("Root 1 = " + real + " + " + img + "i");
        //     System.out.println("Root 2 = " + real + " - " + img + "i");
        // }

        //Take an integer, store it in a double (widening), then convert back to byte (narrowing). Print the results.
        // System.out.println("Enter the number:");
        // int a = sc.nextInt();
        // double c = (double) a;
        // byte b = (byte) c;
        // System.out.println(c);
        // System.out.println(b);

        //Convert INR to USD, EUR, and YEN using double and print formatted results with 2 decimal places.
        // System.out.println("Enter the currency in india: ");
        // int a = sc.nextInt();
        // double usd = (double) a/83;
        // double eur = (double) a/99;
        // double yen = (double) a/0.55;
        // System.out.printf("The INR TO STD: %.2f",usd);
        // System.out.printf("The INR TO EUR: %.2f",eur);
        // System.out.printf("The INR TO YEN: %.2f",yen);

        //Take an integer as input and calculate the sum of its digits using operators.
        // System.out.println("Enter the number:");
        // int num = sc.nextInt();
        // int res=0;
        // while(num!=0){
        //     int rem = num%10;
        //     res += rem;
        //     num = num/10;
        // }
        // System.out.println(res);

        //Check if a given 3-digit number is an Armstrong number (e.g., 153 → 1³ + 5³ + 3³ = 153).
        System.out.println("Enter the three digit number:");
        int a = sc.nextInt();
        int res = 0;
        int org = a;
        while(a!=0){
            int rem = a%10;
            res += rem*rem*rem;
            a=a/10;
        }
        if(org==res){
            System.out.println("The number is armstrong");
        }else{
            System.out.println("The number is not armstrong");
        }
    }
}
