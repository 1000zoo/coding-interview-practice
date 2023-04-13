package chapter04_Tree_and_Graph;

/*
4.3 깊이의 리스트: 이진 트리가 주어졌을 때, 같은 깊이에 있는 노드를 연결리스트로 연결해 주는 알고리즘을 설계하라.
                즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야한다.
 */

import java.util.*;

public class Prob03 {

    public List<List<TreeNode>> getListOfLevel(TreeNode root) {
        if (root == null) return null;

        List<List<TreeNode>> answer = new ArrayList<>();
        List<TreeNode> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(){{add(root);}};
        TreeNode lastNode = root;
        TreeNode prev = root;

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            levelList.add(curr);

            if (curr.leftChild != null) {
                queue.add(curr.leftChild);
                if (hasChild(curr.leftChild)) prev = curr.leftChild;
            }
            if (curr.rightChild != null) {
                queue.add(curr.rightChild);
                if (hasChild(curr.rightChild)) prev = curr.rightChild;
            }

            if (curr == lastNode) {
                answer.add(levelList);
                levelList = new ArrayList<>();
                lastNode = getLastChild(curr) != null ? getLastChild(curr) : prev;
            }
        }

        if (!levelList.isEmpty()) answer.add(levelList);

        return answer;
    }

    private TreeNode getLastChild(TreeNode node) {
        if (node.rightChild != null) return node.rightChild;
        else if (node.leftChild != null) return node.leftChild;
        else return null;
    }

    private boolean hasChild(TreeNode node) {
        if (node == null) throw new NullPointerException();
        return node.leftChild != null || node.rightChild != null;
    }
}
