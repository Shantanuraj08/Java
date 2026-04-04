package LinkedList;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedListDemo {
    public static void displayRec(Node head){
       
         if(head==null){
            return;
         }
         
         System.out.print(head.val + " ");
         head=head.next;
         displayRec(head);
     }
    // public static void displayRec(Node head){
    //      Node temp=head;
    //      if(temp==null){
    //         return;
    //      }
         
    //      System.out.print(temp.val + " ");
    //      temp=temp.next;
    //      displayRec(temp);
    //  }
    //  public static void display(Node head){
    //      for(Node temp= head;temp!=null;temp=temp.next){
    //         System.out.print(temp.val +" ");
    //      }
    //  }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        // displayRec(a);
        System.out.println(get(a,2));
    }

    // public static int get(Node head, int idx) {
        
    //     int localIdx=0;
    //     int data=head.val;
    //     while(localIdx!=idx){
    //         head=head.next;
    //         data=head.val;
    //         localIdx++;
    //     }
    //     return data;
    // }
     public static int get(Node head, int idx) {
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
}
