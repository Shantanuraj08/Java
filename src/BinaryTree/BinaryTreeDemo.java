package BinaryTree;

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
    static void print(BinaryTreeNode root){
    if(root==null){
        return ;
    }
    System.out.println(root.data);
    print(root.left);
    print(root.right);
   }
   public static void main(String[] args) {
    BinaryTreeNode root = buildTree();
    print(root);
   }
}
