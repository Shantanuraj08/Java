package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;
    public void addAtHead(int x) {
     Node temp= new Node(x);
     if(head==null){
        head=tail=temp;
     }else{
        temp.next=head;
        head=temp;
     }
     size++;
    }
    public void addAttail(int y) {
       Node temp=new Node(y);
       if(tail==null){
        head=tail=temp;
       }else{
        tail.next=temp;
        tail=temp;
       }
       size++;
    }
    public void display() {
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
    }
    public void deleteAtHead() {
      if(head==null){
        return ;
      }
      head=head.next;
      if(head==null) tail=null;
      size--;
    }
  public boolean search(int val){
    Node temp= head;
    if(head==null){
        return false;
    }
    while(temp!=null){
        if(temp.val==val){
            return true;
        }
        temp=temp.next;
    }
    return false;
  }
  public void insert(int idx, int val) {
    if(head==null || idx>size){
        return;
    } 
    if(idx==0){
        addAtHead(val);
        return;
    }
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    Node t=new Node(val);
    t.next=temp.next;
    temp.next=t;
    size++;
  }
  public void delete(int idx) {
    if(tail==null || idx>=size){
        return;
    }
    if(idx==0){
        deleteAtHead();
        return;
    }
    
    Node temp=head;
    for(int i=1;i<idx;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    if(idx==size-1){
        tail=temp;
    }
    size--;
  }

}
public class LinkedLIstDsRevise {
   public static void main(String[] args) {
     Linkedlist l=new Linkedlist();
     l.addAtHead(10); 
     l.addAttail(20);
     l.addAtHead(40);
     l.addAttail(30);
     l.addAtHead(50);
     l.deleteAtHead();
     
     l.display();
     System.out.println(l.size);
     System.out.println(l.search(10));
     System.out.println(l.search(100));
     l.insert(3,70);
     l.insert(0,70);
     l.insert(20,70);
     l.insert(6,70);
     l.display();
     System.out.println();
    System.out.println(l.size);
    l.delete(3);
    l.delete(0);
    l.display();
    System.out.println(l.size);

   }
   
}
