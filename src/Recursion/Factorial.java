package Recursion;

public class Factorial {
     static void fact(int num ,int res){
        if(num==0){
            System.out.println(res);
            return;
        }
        fact(num-1,res * num );
     }
     static  int fact2(int digit){
        if(digit==0){
        //    int result =1; this is local to if block
        //     return result; 
        return 1;
        }
         return digit *fact2(digit-1);
     }
    public static void main(String[] args) {
        fact(12,1);
        // max value is 12 ,after that use bigint,long to get answer
        System.out.println(fact2(5));
    }
}
