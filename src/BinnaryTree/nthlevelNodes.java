package BinnaryTree;

public class nthlevelNodes {
    public static int n=2;
    public static void preoder(Node root,int level){
        if(root==null) return;
        if(level==n){
            System.out.print(root.val+" ");
        }
        preoder(root.left,level+1);
        preoder(root.right,level+1);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        c.right = e;
        for(int i=0;i<=2;i++) {
            n = i;
            preoder(a, i);
            System.out.println();
        }
    }
}
