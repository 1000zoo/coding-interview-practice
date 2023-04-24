package chapter04_Tree_and_Graph;

public class PTNode {
    public int val;
    public PTNode parent;
    public PTNode left;
    public PTNode right;

    public PTNode(int val) {
        this.val = val;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public PTNode(int val, PTNode left, PTNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = null;
    }

    public PTNode(int val, PTNode parent, PTNode left, PTNode right) {
        this.val = val;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
