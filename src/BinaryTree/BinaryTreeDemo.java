package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int data){
        this.data=data;
    }
}
public class BinaryTreeDemo {
    static Scanner scanner = new Scanner(System.in);
    static BinaryTreeNode buildTree(){
    System.out.println("enter the data ,if exit  type -1");
    int data=scanner.nextInt();
    if(data==-1){
        return null;
    }
    //create a node
    BinaryTreeNode node = new BinaryTreeNode(data); 
    System.out.println("enter the data " + node.data + " of left child");
    node.left=buildTree();
    System.out.println("enter the data " + node.data + " of right child");
    node.right=buildTree();
    return node; 
   }
   //DFT
    static void print(BinaryTreeNode root){
    if(root==null){
        return ;
    }
    System.out.println(root.data);
    print(root.left);
    print(root.right);
   }
    static void printBFT(BinaryTreeNode root){
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    if(root==null){
        return ;
    }
    queue.add(root);
    while(!queue.isEmpty()){
        int queueSize= queue.size();
        for(int i=1;i<=queueSize;i++){
        BinaryTreeNode node=queue.poll();
        System.out.print(node.data +" ");
        if(node.left!= null){
            queue.add(node.left);
        }
        if(node.right!=null){
            queue.add(node.right);
        }
        }
       System.out.println();
    }
   }
   public static void main(String[] args) {
    BinaryTreeNode root = buildTree();
    print(root);
    System.out.println("now print using DFT");
    printBFT(root);
   }
}
