package chapter04_Tree_and_Graph;

/*
4.4 균형 확인: 이진 트리가 균형 잡혀있는지 확인하는 함수를 작성하라.
             이 문제에서 균형 잡힌 트리란 모든 노드에 대해서 왼쪽 부분 트리의 높이와
             오른쪽 부분 트리의 높이의 차이가 최대 하나인 트리를 의미한다.
 */

public class Prob04 {
    public boolean isBalancedTree(TreeNode root) {
        if (root == null) throw new NullPointerException();
        boolean isAlone = root.leftChild != null ^ root.rightChild != null;
        return dfs(root, isAlone);
    }

    private boolean dfs(TreeNode node, boolean isAlone) {
        if (isAlone && (node.leftChild != null || node.rightChild != null)) {
            return false;
        }
        if (node.leftChild != null && node.rightChild != null) {
            boolean l = dfs(node.leftChild, false);
            boolean r = dfs(node.rightChild, false);
            return l && r;
        }
        if (node.leftChild != null) {
            return dfs(node.leftChild, true);
        }
        if (node.rightChild != null) {
            return dfs(node.rightChild, true);
        }
        return true;
    }
}
