import java.util.*;
public class multiDim {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        for(int i=0;i<3;i++){
            list1.add(sc.nextInt());
        }
        list.add(list1);
        ArrayList<Integer>list2 = new ArrayList<>();
        for(int i=0;i<3;i++){
            list2.add(sc.nextInt());
        }
        list.add(list2);

        for(int i=0;i<list.size();i++){
            ArrayList<Integer>list4 = list.get(i);
            for(int j=0;j<list4.size();j++){
                System.out.print(list4.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(list);
    }
}
