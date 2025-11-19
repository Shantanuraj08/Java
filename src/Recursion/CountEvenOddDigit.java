package Recursion;

public class CountEvenOddDigit {
     static void count( int num , int oddcount , int evencount){
         if(num == 0 && oddcount==0 && evencount ==0){
            evencount++; // only enter when above all is true
         }
        if(num==0){
            System.out.println("oddcount is "+oddcount + "\nevencount is "+evencount);
            return;
         }
    
         int remainder = num%10;
         count(num/10, oddcount + (remainder%2==0?0:1), evencount + (remainder%2==0?1:0));
     }
     static int count2(int digit){
        if(digit==0){
            return 0;
        }
        
        int evencount = count2( digit/10);
        int rem =  digit%10;
        if(rem%2==0){
            evencount++;
        }
        return evencount;
     }
    public static void main(String[] args) {
         count( 10,0,0);
        //  how to handle if input is only 0
        System.out.println(count2(12340));
    }
}
