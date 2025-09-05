package array;
import java.util.*;
public class maxSubArraySum {
    public static void Sum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sub-array sum is "+maxSum);
    }
    public static void prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("The maximum sum is "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        Sum(arr);
        prefixSum(arr);
    }
}
