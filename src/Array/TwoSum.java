package Array;

import java.util.Scanner;

public class TwoSum {
     public static String Helper(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
              int a =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(a+arr[j]==target){   
                     return "element are" + a +"and" + arr[j];
                }
            }
        }
        return "no pair found";
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array"); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elment at" +i);
            arr[i] = sc.nextInt();
        }
        System.out.print("enter target"); 
         int target =sc.nextInt();
         System.out.println( Helper(arr,target));

         sc.close();
    }
}
