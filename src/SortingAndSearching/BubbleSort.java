package SortingAndSearching;

public class BubbleSort {
    
    public static void main(String[] args) {
        int arr[]= {-1,3,2,8,6,9,2,4};
        int n= arr.length;
        print(arr);
        // for(int i=0;i<n-1;i++){
        //      for(int j=0;j<n-1-i;j++){
        //     if(arr[j]>arr[j+1]){
        //         int temp =arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;
        //     }
        // }
        // }
        //  print(arr);   

        //better bubble sort
    // for(int i=0;i<n-1;i++){
    //     boolean isSorted=true;
    //      for(int k=0;k<n-1;k++){
    //         if(arr[k]>arr[k+1]){ 
    //            isSorted = false;
    //             break;  //this check if not sorted then break from the loop and move to next loop
    //         }
    //      }
    //      if(isSorted==true){
    //         break; // this break entire loop if array is sorted
    //      }
    //      for(int j=0;j<n-1-i;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp =arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }
    // }
    //      print(arr);   


    //better bubble sot
    for(int i=0;i<n-1;i++){
        int swap=0;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }
            if(swap==0) break;
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
