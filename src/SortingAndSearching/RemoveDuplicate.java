package SortingAndSearching;

public class RemoveDuplicate {
    public static void main(String[] args) {
         int arr[]= {1,1,1,3,3,5,6,6,7,7,8,8};
          int i=0,j=i+1;
          int unique=1;
          while(j<arr.length){
            if(arr[j]!=arr[j-1]){
                i++;
                arr[i]=arr[j];
                unique++;
            }
            j++;
          }
          System.out.println(unique);
          for(int e:arr){
            System.out.print(e+" ");
          }
    }
}
