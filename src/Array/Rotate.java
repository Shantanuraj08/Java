package Array;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        Scanner sc =new Scanner(System.in);
        int d =sc.nextInt();
        int n =arr.length;
         d =d % n;

         reverse(arr,0,d-1);
         reverse(arr, d, n-1);
         reverse(arr, 0, n-1);

         for(int val :arr){
            System.out.print(val + " ");
         }
         sc.close();
    }
    static void reverse(int[] arr ,int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
}
