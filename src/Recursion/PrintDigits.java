 package Recursion;
public class PrintDigits {
     static void printDigit(int num ){
        if(num==0){
             return; //stack fall
        }
       
        printDigit(num/10);
        System.out.println(num%10);
     }
    public static void main(String[] args) {
        printDigit(12345);
    }
}


// public class PrintDigits {
//      static void printDigit(int num ,int result){
//         if(num==0){
//              return;
//         }
//         result= num%10;
//         printDigit(num/10, result);
//         System.out.println(result);
//      }
//     public static void main(String[] args) {
//         printDigit(12345 ,0);
//     }
// }
//  in my approach i used extra variable which is useless