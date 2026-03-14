package datastructures.nonlinear.binarytree;

public class GenericTree<X> {
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data = data;
        this.left=this.right=null;
    }

    void preOrder(){
        System.out.print(this.data + " ");
        if(this.left != null)this.left.preOrder();
        if(this.right != null)this.right.preOrder();

    }
    void inOrder(){
        if(this.left != null)this.left.inOrder();
        System.out.print(this.data + " ");
        if(this.right != null)this.right.inOrder();

    }
    void postOrder(){
        if(this.left != null)this.left.postOrder();
        if(this.right != null)this.right.postOrder();
        System.out.print(this.data + " ");

    }
    static void main(String[] args) {
        GenericTree<Integer> integerRoot = new GenericTree<>(1);
        integerRoot.left= new GenericTree<>(2);
        integerRoot.right= new GenericTree<>(3);
        System.out.println("Preorder integer tree");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("inorder integer tree");
        integerRoot.inOrder();
        System.out.println();
        System.out.println("Postorder integer tree");
        integerRoot.postOrder();
        System.out.println();
        //This is the tree of floats
        GenericTree<Float>floatRoot = new GenericTree<>(1.2f);
        floatRoot.left = new GenericTree<>(2.4f);
        floatRoot.right = new GenericTree<>(4.6f);
        System.out.println("Preorder float tree");
        floatRoot.preOrder();
        System.out.println();
        System.out.println("inorder float tree");
        floatRoot.inOrder();
        System.out.println();
        System.out.println("Postorder float tree");
        floatRoot.postOrder();
        System.out.println();
        //tree of booleans
        GenericTree<Boolean> booleanRoot = new GenericTree<>(true);
        booleanRoot.left = new GenericTree<>(false);
        booleanRoot.right = new GenericTree<>(true);
        System.out.println("Preorder boolean tree");
        booleanRoot.preOrder();
        System.out.println();
        System.out.println("inorder boolean tree");
        booleanRoot.inOrder();
        System.out.println();
        System.out.println("Postorder boolean tree");
        booleanRoot.postOrder();
        System.out.println();
    }
}
