package Recursion;

public class CountEvenOdd {
     static void count( int range, int evencount ,int oddcount){
        if(range==0){
            System.out.println(evencount +" "+ oddcount);
            return;
        }
       
        count(range-1,evencount + (range%2==0?1:0),oddcount + (range%2==0?0:1));
        if(true){
           System.out.println(range%2==0? range + " is even " :range+ " is odd"); 
        }
     }
 // we use array since it is returing two value ,even adn odd
     static int[] countevenodd(int range){
         if(range==0){
            int result[] = new int[2];
            return result;
         }
           int result[] = countevenodd(range-1);
           if( range%2 ==0){
              result[0] = result[0] + 1;
           }
           else{
              result[1] =result[1] + 1;
           }
           return result;
     }
    public static void main(String[] args) {
        count(100, 0, 0);

        
         int  arr[] = countevenodd(100);
        System.out.println("evencount" + arr[0]);
        System.out.println("oddcount" + arr[1]);
    }
}

// this code prit number of odd and even num between a range ,does not count 0
// while stack fall it will print whether number is odd or even 