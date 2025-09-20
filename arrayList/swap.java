import java.util.*;
public class swap {
    public static void swap(ArrayList<Integer>list){
        int l = 0;
        int h= list.size()-1;
        while(l<=h){
            int temp = list.get(l);
            list.set(l, list.get(h));
            list.set(h, temp);
            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("Enter the elements of arrayList");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("After Swapping:");
        swap(list);
        System.out.println(list);
        System.out.println("After Sorting:");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("After Descending order Sorting:");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
