package Recursion;

public class PrintTable {
    static void print( int num , int range ){
        if(range==0){
            return;
        }
        print(num, range-1);
        System.out.println(num + "x" + range + "=" + num*range );
    }
    // this is second method of printing table

    static void print2(int digit , int upto , String result){
        if(upto ==0){
            System.out.println( result);
            return;
        }
        String expression = digit+ "x" + upto + "=" + digit*upto;
        print2(digit, upto-1,  expression+" \n" + result ); // this print in right order since  exression is being added form 
        // front  ,and result is benig pushed back (visualize) ,everthin iteration is being stored in loop
        // try to make callstack for above
        // print2(digit , upto- 1, result + expression +"\n" ); print in reverse order
    }

     static String printtable(int num ,int val){
        if(val ==0){
            return " ";
        }
        String result = printtable(num, val -1);
        String expression = num +"x"+ val + "=" + num*val;
        return  result + expression + "\n";
     }
     public static void main(String[] args) {
        print(5, 10);
        print2(5 ,10 ,"");
        System.out.println(printtable(5,10));
     }
}

