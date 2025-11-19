package Recursion;

public class CountZero {
    static void  countZero(long num ,int count){
         if(num==0){
           System.out.println(count);
            return;
         }
          int remainder =(int)(num%10); //explicit type conversion
          if (remainder==0){
            count++;
          }
           countZero(num/10, count);
    }
    public static void main(String[] args) {
        countZero(100000100200300L,0);
    }
}

// long remainder = num % 10; - store the value inside long variable ,no data loss but space is consumed
// int remainder = (int) num % 10; - this first convert the long variable into int then modulus bu 10 ,causese data loss
// int remainder = ((int) num) % 10;- same as int remainder = (int) num % 10;
