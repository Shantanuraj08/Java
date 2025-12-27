package Array;

public class Segregrate01UsingTwoPointer {
    public static void main(String[] args) {
        ///using slow and fast pointer
        int arr[] = {1,0,1,0,1,1};
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                j++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        } 
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
 
}
