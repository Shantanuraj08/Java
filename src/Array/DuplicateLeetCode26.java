package Array;

public class DuplicateLeetCode26 {
    public static void main(String[] args) {
         int[ ] arr={1,1,2,2,3,3,3,4,4};
        int k=1;
        int i=0,j=i+1;
        while(j<arr.length){
            if(arr[j]!=arr[j-1]){
                i++;
                arr[i]=arr[j];
                k++;  
            }
            j++;
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println(" ");
        System.out.println(k);
    }
}
