package Recursion;

public class SumOfNaturalNum {
    // static void sumOfNatural(int num ,int sum ,int range){
    //     if(range==0){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sumOfNatural(num+1, sum= sum+num, range-1);
    // }
    static int SumOfNaturalNum2(int range){
        if(range==0){
            return 0;
        }
        int Sum = SumOfNaturalNum2(range-1);
        Sum = Sum +range; 
        return Sum; 
    }
    public static void main(String[] args) {
        // sumOfNatural(1, 0, 100);
        System.err.println(SumOfNaturalNum2(10));
    }
}
