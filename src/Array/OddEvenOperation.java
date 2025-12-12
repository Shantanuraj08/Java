package Array;

import java.util.Scanner;

public class OddEvenOperation {
    public static void Helper(int[] arr2){
        for(int j=0;j<arr2.length;j++){
            if(j%2==0){
                arr2[j] +=10;
            }
            else{
                arr2[j] *=2;
            }
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the sixe of array\t");
     int n = sc.nextInt() ;
       int arr[]= new int[n];
       for(int i=0;i<arr.length;i++){
        System.out.print("enter element at"+i+" ");
        arr[i]= sc.nextInt();
       }

       Helper(arr);
       for(int x : arr){
        System.out.print(x + " ");
       }
       sc.close();
   }
    
}
