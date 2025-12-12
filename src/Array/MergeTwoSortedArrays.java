package Array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
         int a[]= {2,4,6,8,9,12};
         int b[]={1,5,7,10,13,15,17};
          int c[] = new int[ a.length+b.length];
           
          merge(a,b,c);
          for(int x:c){
            System.out.print(x+" ");
          }
    }
     public static void merge(int[]a ,int[]b ,int[]c){
         int i=0,j=0,k=0;
         while(i<a.length&&j<b.length){
            if(a[i]>b[j]){
                c[k]=b[j];
                j++;
            }
            else{
                c[k]=a[i];
                i++;
            }
            k++;  
         }
            //two handle the remaining element if  left in any array
             while(i<a.length){
                c[k++]=a[i++];
             } 
             while (j<b.length){
                c[k++]=b[j++]; 
             }
         
     }
}
