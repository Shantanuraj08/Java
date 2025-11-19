package Recursion;

public class IsArmstrong {
   static  int digitcount( int num ){
    if(num==0){
        return 0;
    }
     int count = digitcount(num/10);  // count is local to digitcount ,no duplciate error because of count in compute armstrong
     count = count +1;
     return count;
   }
   static void computeArmstrong(int num ,int sum , int copy ,int count){
     if(num==0){
       if(copy == sum){
        System.out.println("armstrong number");
       }
       else{
        System.out.println("not armstrong number");
       }
       return;
     }
    // logic
    // int count = digitcount(copy); // it is called again and again
    //  int count =0; Duplicatw var ,count already exist inside method
     int  digit = num %10;
     int result = (int) Math.pow(digit, count);
    //  logic
     computeArmstrong(num/10, sum +result , copy , count);

   }

    public static void main(String[] args) {
        int num =153;
        int count = digitcount(num);
        computeArmstrong(num, 0,num ,  count);
    }
}
