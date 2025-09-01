package array;
import java.util.*;
public class passingArgument {
    public static void update(int num[],int unchangeable){
        unchangeable =10;
        for(int i=0;i<num.length;i++){
            num[i]=num[i]+1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int unchangeable = 5;
        int marks[]={97,98,99};
        update(marks, unchangeable);
        System.out.println("The value of the unchangeable : "+unchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
