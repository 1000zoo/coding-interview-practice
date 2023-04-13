package chapter04_Tree_and_Graph;

public class TreeNode {
    public int val;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int val) {
        this.val = val;
        this.leftChild = null;
        this.rightChild = null;
    }

    public TreeNode(int val, TreeNode leftChild, TreeNode rightChild) {
        this.val = val;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}