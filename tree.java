package Tree;

public class tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val= val;
        }
    }

    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+"->");
        if(root.left!=null)
        System.out.print(root.left.val+",");
        if(root.right!=null)
            System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static int  size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);

    }
    public static void traverse(Node root){
        if(root==null)return;
        System.out.print(root.val+",");
        traverse(root.left);
        traverse(root.right);
    }
    public static int sum(Node root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);

    }
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static int maximum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        // Maximum(root)= max(maimum(root.left),maximum(root.right),root.val)
        return max(root.val, maximum(root.left), maximum(root.right));
    }
    public static int height(Node root){
        if(root==null)return 0;
        if(root.left==null&& root.right==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int min(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
    public static int min(Node root){
        if(root==null)return Integer.MAX_VALUE;
        return min(root.val,min(root.left),min(root.right));

    }
    public static int product(Node root){
        if(root== null)return 1;
        return root.val*product(root.left)*product(root.right);

    }

   public static void main(String[]args){
    Node root= new Node(1);
    Node a= new Node(2);
    Node b= new Node(3);
    root.left=a;
    root.right=b;
    Node c= new Node(4);
    Node d= new Node(5);
    a.left=c;
    a.right=d;
    Node e= new Node(6);
    b.right=e;
    display(root);
    System.out.println("SIZE :"+ size(root));
   System.out.print("TRAVERSE"); traverse(root);
   System.out.println();
   System.out.println("SUM :"+sum(root));
   System.out.println("MAXIMUM :"+maximum(root));
   System.out.println("HEIGHT :"+height(root));
   System.out.println("MINIMUM :"+ min(root));
   System.out.println("PRODUCT :"+ product(root));

   }
    
}
