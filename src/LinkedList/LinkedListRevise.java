package LinkedList;

class Node{
 int val;
 Node next;
 Node(int val){
    this.val=val;
 }
}
public class LinkedListRevise {
//    public  static void display(Node head){
//     Node temp=head;
//     while(temp!=null){
//         System.out.println(temp.val);       
//         temp=temp.next;   //why did you upate temp after printing , because it will print give null pointer exception

//     }
//    } 
public  static void displayRec(Node head){
    Node temp=head;
    if(temp==null){
        return;
    }
    System.out.print(temp.val+ " ");
    // temp=temp.next;
    displayRec(temp.next);
    
}
public static int getNode(int idx, Node head) {
    Node temp=head;
    for(int i=1;i<idx;i++){
        temp=temp.next;
    }
    return temp.val;

}

public static void main(String[] args) {
Node a= new Node(10);
Node b= new Node(10);
Node c= new Node(30);
Node d= new Node(10);
a.next=b;
b.next=c;
c.next=d;
// display(a);
// displayRec(a);
System.out.println(getNode(3,a));

}

}
