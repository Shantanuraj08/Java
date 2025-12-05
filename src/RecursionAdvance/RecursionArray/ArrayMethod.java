package RecursionAdvance.RecursionArray;

import java.util.Arrays;

public class ArrayMethod {
     public static void main(String[] args) {
        int arr[] = new int[5]; // create an integer array with deafult value zero
        System.out.println(arr); // print the hashcode
        System.out.println(Arrays.toString(arr)); // print the actual array
        for(int i =0 ; i <arr.length ; i++){
            System.out.print(arr[i] + " "); // printing through for loop , print  on same line
        }
        System.out.println(" ");
        for(int element : arr){ // printing thorugh enhanced for loop
            
            System.out.print(element);
        }

        // 2d array 
        boolean twodim[][] = new boolean[3][4];
        System.out.println(Arrays.deepToString(twodim)); // for two dim ,deeptwosting method
        for(int row =0 ;row< twodim.length ; row++){
            for(int col =0 ; col < twodim[row].length ; col++){
                System.out.print(twodim[row][col] + " ");
            }
            System.out.println(" ");
        }

        for(boolean rows[]: twodim){
            for(boolean cols :  rows){
                System.out.print(cols);
            }
            System.out.println("");
        }
     }
}
