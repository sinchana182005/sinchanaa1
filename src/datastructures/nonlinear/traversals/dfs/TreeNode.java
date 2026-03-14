package datastructures.nonlinear.traversals.dfs;

public class TreeNode{
    int data;// data of the node
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        this.left = this.right =null; // Initially the node has no children
    }
    public static void preOrder(TreeNode root){//DLR
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);//Print the data go the left go the right using recursion
        }
    }
    public static void inOrder(TreeNode root){//LDR
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);//Go the left print  the data go the right using recursion
        }
    }
    public static void postOrder(TreeNode root){//LRD
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);//Go the left go the right print data using recursion
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        //Rule for constructing the Binary Tree=>Top to Bottom & left to right
        //Level 0
        TreeNode root=new TreeNode(1);
        //Level 1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //Level 2
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        //level 3
        root.left.right.left=new TreeNode(9);
        root.right.right.left=new TreeNode(15);
        System.out.println("PreOrder Traversal:");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrder(root);
        System.out.println();
    }
}

