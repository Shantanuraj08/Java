package Array;

public class MissinginArray {
   
   public static void main(String[] args) {
     int[] arr ={1,3,5,6,7,2};
    long n = arr.length +1 ;
    long sum = (n*(n+1))/2; 
     long arrsum =0;
     for(int val:arr){
        arrsum+=val;
     }
    System.out.println(sum-arrsum);
   }
   

}
