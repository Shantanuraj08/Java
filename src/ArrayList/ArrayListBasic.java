package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(07);
        arr.add(18);
        arr.add(172);
        arr.add(42);
        arr.add(13);

        System.out.println(arr.get(1)); // this get method to print  ,analogous to arr[1]
        arr.set(4,96); // to modify existing value , analgous to arr[4]=96
        System.out.println(arr.get(4));

        System.out.println(arr); // this  print entire arraylist ,which is better than normal array which require for loop. intrinsically it is using a for loop

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println( );
        arr.add(1, 50); // this  method insert elment at any index arbirary while simple add() only insert from behind
        System.out.println(arr);
        arr.remove(arr.size()-1); // remove element at particular index

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
