package chapter04_Tree_and_Graph;

/*
4.6 후속자: BST에서 주어진 노드의 '다음' 노드 (in-order successor)를 찾는 알고리즘을 작성하라.
          각 노드에는 부모 노드를 가리키는 링크가 존재한다고 가정한다.
 */

import java.util.*;

public class Prob06 {
    public List<PTNode> inorderList;
    public PTNode nextInorder(PTNode node) {
        if (node == null || (node.parent == null && node.right == null && node.left == null)) return null;

        // space: O(N)
        inorderList = new ArrayList<>();
        PTNode root = node;

        // time: O(logN)
        while (root.parent != null) {
            root = root.parent;
        }

        // time: O(N)
        setInorderList(root);

        int index = inorderList.indexOf(node);
        return index == inorderList.size() - 1 ? null : inorderList.get(index + 1);
    }

    private void setInorderList(PTNode node) {
        if (node.left != null) setInorderList(node.left);
        inorderList.add(node);
        if (node.right != null) setInorderList(node.right);
    }

    public PTNode nextInorder2(PTNode node) {
        if (node == null) return null;

        //탐색 방향을 따라가서 찾는 방법
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            PTNode curr = node;
            PTNode parent = node.parent;
            while (parent != null && parent.left != curr) {
                curr = curr.parent;
                parent = parent.parent;
            }
            return parent;
        }
    }


}
