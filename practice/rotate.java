public class rotate {
    public static int search(int arr[],int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target || arr[mid]>arr[mid]+1){
                l=mid+1;
            }
            if(arr[mid]>target || arr[mid]>arr[mid]-1){
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int binary = search(arr, 4);
        System.out.println("The index of the value is "+binary);
    }
}
