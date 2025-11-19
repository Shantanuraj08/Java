package Recursion;

public class Power {
    static void power(int num ,int exp , int result){
        if(exp==0){
           System.out.println(result);
            return;
        }
        power(num,exp-1, result*num);
        // num*num does not work since it is squaring the num  , make the call stack and visualise
    } 
    // same problem usign return type 
    static int power2(int digit , int power){
        if(power==0){
            return 1;
        }
        int result= power2(digit ,power-1);
         result =result *digit;
         return result;
    }

    public static void main(String[] args) {
        power(5 ,3 ,1);
         System.out.println(power2(5,3));
    }
}
