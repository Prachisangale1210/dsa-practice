import java.util.*;
public class function3 {
    public static boolean palindrome(int n){
        int num = n;
        int reverse = 0;
        while(num>0){
            int rem = num%10;
            reverse = reverse*10+rem;
            num=num/10;
        }
        if(n==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        //check if number is palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        if(palindrome(n)){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("The number is not Palindrome");
        }
    }
}
