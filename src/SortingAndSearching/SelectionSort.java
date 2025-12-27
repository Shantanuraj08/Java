package SortingAndSearching;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,3,2,7,-2,4,2};
        print(arr);
        for(int i=arr.length-1;i>0;i--){
            int max =Integer.MIN_VALUE; //-infinity
            int maxindex =-1;
            for(int j=0;j<=i;j++){
                if(arr[j]>max){
                    max =arr[j];
                    maxindex=j; // finde index of max value to replaced
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxindex];
            arr[maxindex]=temp;
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
