import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("Enter the elements in the arraylist: ");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max= list.get(i);
            }
        }
        System.out.println("The maximum in the arrayList is "+max);
    }
}
