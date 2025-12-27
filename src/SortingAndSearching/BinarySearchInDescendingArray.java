package SortingAndSearching;

public class BinarySearchInDescendingArray {
     public static void main(String[] args) {
        int arr[]={19,17,15,5,4,2,0};
        int low=0,high=arr.length-1,target=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target)high=mid-1;
            else if(arr[mid]>target)low=mid+1 ;
            else {
                System.out.println("elment present at "+mid);
                break;
            }
        }
     }
}
