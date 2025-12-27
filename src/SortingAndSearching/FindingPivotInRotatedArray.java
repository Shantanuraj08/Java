package SortingAndSearching;

public class FindingPivotInRotatedArray {
    public static void main(String[] args) {
         int arr[]= {7,8,9,1,2,3,4,5,6};
         //pivot is 9
          int lo=1, high=arr.length-2;
          while(lo<=high){
             int mid =lo + (high-lo)/2;
             if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                 System.out.println(arr[mid]);
                 return;
             }
             else if (arr[mid]<arr[mid+1]){
                lo=mid+1;
             }
             else if (arr[mid]<arr[mid-1]){
                high =mid-1;
             }
          }
    }
}
