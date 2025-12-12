package Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array\t");
         int n =sc.nextInt();
         int arr[] = new int[n];
         for(int k=0;k<n;k++){
            System.out.print("enter the"+ k+"element\t");
             arr[k]=sc.nextInt();
         }
          System.out.println("enter starting index"); 
         int i=sc.nextInt();
         System.out.println("enter th last index");
         int j=sc.nextInt();

         while(i<j){
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }
         for(int result : arr){
            System.out.print(result +" ");
         }
         sc.close();
    }
}
