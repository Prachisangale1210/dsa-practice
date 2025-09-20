import java.util.*;
public class basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //arrayList Syntax
        ArrayList<Integer>list = new ArrayList<>();

        //add and input
        for(int i=0;i<5;i++){
            sc.nextInt();
        }
        System.out.println(list);

        //get element at particular index
        System.out.println("The element at the index 2 is: "+list.get(2));

        //remove element from the particular index
        list.remove(2);
        System.out.println(list);

        //set the element at the particular index
        list.set(2, 10);
        System.out.println(list);

        //if element are present in the arrayList or not
        System.out.println(list.contains(3));

        //add at the particular index
        list.add(2,20);
        System.out.println(list);
    }
}
