package Array;
public class Segregrate01 {
    public static void main(String[] args) {

        // two pass solution  array is traversed two times completely 
         int numOfZero =0;
        //  int numOfOne =0; no need of this ,unused in code
         int arr[]= {0,0,1,0,1,1,0,0,0,1};
         for(int ele : arr){
            if(ele==0) numOfZero++; //count zero and one
            // else numOfOne++;  
         }
         for( int i =0;i<numOfZero;i++){
            
                arr[i]=0;
         }
         for(int i = numOfZero;i<arr.length;i++){
            arr[i]=1;
         }

         for(int x:arr){
            System.out.print(x+"");
         }
    }
}
