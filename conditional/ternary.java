package conditional;

public class ternary {
    public static void main(String args[]){
        int number =20;
        String type = (number%2==0)? "Even":"Odd";
        System.out.println(type);

        int marks = 66;
        String res = (marks>=33)? "Pass":"Fail";
        System.out.println(res);
    }
}
