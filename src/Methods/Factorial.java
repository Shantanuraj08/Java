package Methods;
import java.util.Scanner;
public class Factorial {
     public static int  factorial(int f){
        int fact=1;
          for(int i=1;i<=f;i++){
            fact*=i;
          }
        return fact;
     }
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
          int n=sc.nextInt();
          int r =sc.nextInt();

          int ncr =factorial(n)/(factorial(r)*factorial(n-r));
          int npr =factorial(n)/factorial(n-r);
          System.out.println(ncr);
          System.out.println(npr);
    }
    
}
