package Tree;

public class Zigzag {
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
        this.val= val;
    }
    }
    public static int height(Node root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void zigzag_LtoR(Node root, int i){
        if(root==null)return;
        if(i==1){
        System.out.print(root.val+" ");
        return;
        }
        zigzag_LtoR(root.left, i-1);
        zigzag_LtoR(root.right, i-1);

    }
    public static void zigzag_RtoL(Node root, int i){
        if(root==null)return;
        if(i==1){
        System.out.print(root.val+" ");
        return;
        }
       zigzag_RtoL(root.right, i-1);
        zigzag_RtoL(root.left, i-1);
        return;

    }

    
    
    public static void main(String[] args) {

        Node root= new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right=b;
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(5);
        Node f= new Node(7);
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        Node g= new Node(6);
        f.right=g;
        Node h= new Node(7);
        f.left=h;
        Node m=new Node(67);
        Node k= new Node(4);
        h.left=m;
        h.right=k;
        int height= height(root);
        System.out.println("Height: "+height);
        for(int i=1;i<=height;i++){
            if(i%2!=0){
                zigzag_LtoR(root,i);
            }
            else{
                zigzag_RtoL(root,i);
            }
        }

        
    }
    
}
