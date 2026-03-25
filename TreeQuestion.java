package Tree;

import java.util.*;

public class TreeQuestion {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;

        }
    }

    private static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void Inorder(Node root){
        if(root==null)return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    private static void Postorder(Node root){
        if(root==null)return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");

    }
    private static void levelsearch(Node root, int n){

        if(root==null)return;

        if(n==1)System.out.print(root.val+" ");
        levelsearch(root.left, n-1);
        levelsearch(root.right, n-1);

    }
    private static int height(Node root){
        if(root==null)return 0;
        if(root.left==null&& root.right==null)return 0;
      return 1+ Math.max(height(root.left),height(root.right));

    }
    
    private static void BFS(Node root){
       Queue<Node>qu= new LinkedList<>();
       if(root!=null)
       qu.add(root);

       while(qu.size()>0){
        Node temp=qu.peek();
        if(temp.left!=null)qu.add(temp.left);
        if(temp.right!=null)qu.add(temp.right);
       System.out.print(temp.val+"-");
       qu.remove();
       }
       

    }
    public static void main(String[] args) {
        Node root = new Node(5);

        Node a = new Node(1);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c= new Node(43);
        Node d= new Node(3);

        a.left=c;
        a.right=d;

        Node e= new Node(45);
        Node f= new Node(534);
        Node g= new Node(453);

        c.left=e;
        d.left=f;
        d.right=g;
        System.out.println("INORDER");
        Inorder(root);
        System.out.println();
        System.out.println("Preorder");
        preorder(root);
        System.out.println();
        System.out.println("PoSTORDER");
        Postorder(root);
        System.out.println();
        int level= height(root)+1;
        // for(int i=1;i<=level;i++){
        //     levelsearch(root, i);
        //     System.out.println();
        // }

        BFS(root);


    }

}