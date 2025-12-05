package Array;

import java.util.Scanner;

public class MaxAndMinELement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array\t"); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the elment at\t" +i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
         int max = arr[0]; // max  elements to be declared outside loop 
         for( int j=0; j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[j]<min){
                min = arr[j];
            }
         }
         System.out.println("max element is\t"+max+"\tmin elment is\t" + min);
         sc.close();
    }
    //  \t to give tab space \n to  next line
}
