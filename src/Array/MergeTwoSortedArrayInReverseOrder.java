package Array;

public class MergeTwoSortedArrayInReverseOrder {
    public static void main(String[] args) {
        int a[]= {2,4,6,8,9,12};
         int b[]={1,5,7,10,13,15};
          int c[] = new int[ a.length+b.length];

            mergeInRev(a,b,c);
          for(int x:c){
            System.out.print(x+" ");
          }
    }
    public static void mergeInRev(int[]a ,int[]b ,int[]c){
         int i=a.length-1,j=b.length-1,k=c.length-1;
         while(i>=0&&j>=0){
            if(a[i]>b[j] ){
                c[k]=a[i];
                i--;
            }
            else{
                c[k]=b[j];
                j--;
            }
            k--;  
         }
            //two handle the remaining element if  left in any array
             while(i>=0){
                c[k--]=a[i--];
             } 
             while (j>=0){
                c[k--]=b[j--]; 
             }
         
     }
}
