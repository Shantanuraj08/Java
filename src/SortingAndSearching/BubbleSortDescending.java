package SortingAndSearching;

public class BubbleSortDescending {
    public static void main(String[] args) {
         int arr[] = {1,3,2,7,-2,4,2};
         print(arr);
         for(int i=0;i<arr.length-1;i++){
            boolean isSorted=true;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true)break;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
