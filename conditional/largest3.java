package conditional;

public class largest3 {
    public static void main(String args[]){
        int a =10;
        int b =20;
        int c=30;
        if(a>=b && a>=c){
            System.out.println("The a is greater");
        }else if(b>=c){
            System.out.println("The b is greater");
        }else{
            System.out.println("The c is greater");
        }
    }
}
