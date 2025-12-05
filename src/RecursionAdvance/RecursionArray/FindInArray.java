package RecursionAdvance.RecursionArray;

public class FindInArray {
   
    static void searchArray(int arr[], int target , int index , int check ){
        if(index == arr.length  ){
            if(check==0){
                System.out.println("no element found");
            }
            return;
        }
        if(target == arr[index]){
            System.out.println("element is at index " + index);
            check++;
        }
        searchArray(arr, target , index + 1  ,check );  
    }
    public static void main(String[] args) {
          int search[] = { 1 ,3,1};
        searchArray(search, 12, 0 , 0);
        
    }
}
