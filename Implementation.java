package Tree;

public class Implementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+"->");
       if(root.left!=null) System.out.print(root.left.val+" ");
      if(root.right!=null)  System.out.print(root.right.val);
      System.out.println(); 
      display(root.left);
        display(root.right);

    }
    public static void preordertraversals(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preordertraversals(root.left);
        preordertraversals(root.right);
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.val+",");
        inOrder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+",");
    }
    public static int size(Node root){
        int size=0;
        if(root==null)return 0;
        size=size(root.left)+size(root.right)+1;
        return size;

    }
    public static int sum(Node root){
       
        if(root==null)return 0;
       return root.val+sum(root.left)+sum(root.right);
        
    }
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    
    }

    public static int maxVal(Node root){
        //max(root)= max[root.val, max(root.left),max(root.rigth)]
        if(root==null)return Integer.MIN_VALUE;
        return max(root.val,maxVal(root.left),maxVal(root.right));
    }

    public static int height(Node root){
        if(root==null)return 0;
        if(root.left==null&& root.right==null)return 0;
        return 1+ Math.max(height(root.left),height( root.right)); 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        // root.val=10;
       // System.out.println(root.val);
       Node a=new Node(2);
       Node b= new Node(3);
       root.left=a;
       root.right=b;
       Node c= new Node(4);
       Node d= new Node(5);
       a.left=c;
       a.right=d;
       Node e= new Node(6);
       Node f=new Node(7);
       b.left=e;
       b.right=f;
       display(root);
       System.out.println("Size of tree: "+size(root));
       System.out.print("Traverse: ");
       preordertraversals(root);
       System.out.println("Sum"+sum(root));
       System.out.println("Maximum"+ maxVal(root));
       System.out.println("Height"+ height(root));
       System.out.println("INORDER: ");inOrder(root);
       System.out.println();
       System.out.println("POSTORDER:");postOrder(root);

    }

}
