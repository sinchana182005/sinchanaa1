package datastructures.nonlinear.traversals.bfs;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null; // Initially the node has no children
    }
}

public class BinaryTree {
    public static void levelOrderTraversalOrBFS(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll(); // removes and stores front node
            System.out.print(temp.data + " ");
            //left subtree
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //L0
        TreeNode root = new TreeNode(1);
        //L1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //L2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("BFS or level order traversal");
        levelOrderTraversalOrBFS(root);
    }
}
