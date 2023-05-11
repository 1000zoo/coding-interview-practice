package chapter04_Tree_and_Graph;
/*
4.8 첫 번째 공통 조상: 이진 트리에서 노드 두 개가 주어졌을 때,
                   이 두 노드의 첫 번째 공통 조상을 찾는 알고리즘을 설계하고 그 코드를 작성하라.
                   자료구조 내에 추가로 노드를 저장해 두면 안 된다. 반드시 이진 탐색 트리일 필요는 없다.
 */
public class Prob08 {
    // 부모에 대한 링크가 있는 경우
    public PTNode getCommonAncestor(PTNode node1, PTNode node2) {
        int depth1 = getDepth(node1);
        int depth2 = getDepth(node2);

        PTNode upper = depth1 < depth2 ? node1 : node2;
        PTNode lower = depth1 > depth2 ? node1 : node2;
        lower = goUp(lower, Math.abs(depth1 - depth2));

        while (upper != lower) {
            upper = upper.parent;
            lower = lower.parent;
        }

        return upper;
    }

    private PTNode goUp(PTNode node, int delta) {
        for (int i = 0; i < delta; i++) {
            if (node == null) break;
            node = node.parent;
        }
        return node;
    }

    private int getDepth(PTNode node) {
        int depth = 0;
        PTNode curr = node;
        while (curr.parent != null) {
            depth++;
            curr = curr.parent;
        }
        return depth;
    }

    // 부모에 대한 링크가 없는 경우 (node1과 node2는 반드시 같은 노드에 있다.)
    public TreeNode getCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null || root == node1 || root == node2) return root;

        boolean n1OnLeft = isDescendant(root.leftChild, node1);
        boolean n2OnLeft = isDescendant(root.leftChild, node2);

        if (n1OnLeft ^ n2OnLeft) {
            return root;
        }

        TreeNode temp = n1OnLeft ? root.leftChild : root.rightChild;

        return getCommonAncestor(temp, node1, node2);
    }

    private boolean isDescendant(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return isDescendant(root.leftChild, node) || isDescendant(root.rightChild, node);
    }
}
