package Array;

import java.util.Scanner;

public class SumOfELments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array"); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elment at" +i);
            arr[i] = sc.nextInt();
        }
         int sum =0;
         for(int x:arr){
            sum+=x;
         }
         System.out.println("sum of array is"+sum);
         sc.close();
    }
}
