package Recursion;
public class PrintName{

    static void  printName(int num){
         if(num==0){//termination case/base case - it runs only once
            return; 
         }
         System.out.println("Shantanu");//logic of code
         printName(num-1);//function calling itself  and decrimenting the value to stop the recursion
         System.out.println("Raj"); // post calling logic
    }
    public static void main(String[] args) {
     printName(5);
}
}
