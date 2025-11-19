package Recursion;

public class SumOfDigit {

    static int SumofDigit2(int num){
   //  base case
      if(num==0){
         return 0; //this code inside base case run only once
      }
    int sum = SumofDigit2(num/10);
     int digit =num%10;
    sum =sum +digit;
    return sum;

    }
   // this is void type function
     static void sumOfDigit(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
         sumOfDigit(num/10,sum =sum+num%10);
        //  System.out.println(sum); - if i do tail recursion when stack is falling then it  print sum value while return in each
        // stack fall
     }
     public static void main(String[] args) {
        sumOfDigit(12345,0);
        System.out.println(SumofDigit2(123456));
     }
}
