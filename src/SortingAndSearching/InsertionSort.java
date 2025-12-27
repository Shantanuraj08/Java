package SortingAndSearching;

public class InsertionSort {
   public static void main(String[] args) {
        int arr[] = {1,3,2,7,-2,4,2};
         print(arr);
        //  for(int i=1;i<arr.length;i++){
        //     for(int j=i;j>0;j--){
        //         if(arr[j]<arr[j-1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //         }
        //     }
        //  }
         for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                 int temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
                 j--;
            }
            }
            print(arr);
         }
     public static void print(int[] arr){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println( );
    }
}
