package Array;

import java.util.Scanner;

public class SearchinArray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         System.out.print("enter the traget lement\t");
          int target =sc.nextInt();
          int arr[]={10,20,40,50};
           int found = -1;
          for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
               
                found = i;
                break;
            }
          }
          if(found!=-1){
            System.out.println(" present hai"+ found);
          }
          else{
            System.out.println("nahi hai");
          }
        
        sc.close();
    }
}
