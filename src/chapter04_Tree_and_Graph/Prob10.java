package chapter04_Tree_and_Graph;
/*
4.10 하위 트리 확인: 두 개의 커다란 이진 트리 T1과 T2가 있다고 하자.
                  T1이 T2보다 훨씬 크다고 했을 때, T2가 T1의 하위트리인지 판별하는 알고리즘을 만들어라.
                  T1안에 있는 노드 n의 하위 트리가 T2와 동일하면, T2는 T1의 하위트리이다.
                  다시 말해, T1에서 노드 n의 아래쪽을 끊어 냈을 때, 그 결과가 T2와 동일해야한다.
 */

import java.util.*;

public class Prob10 {

    public boolean isSubtree(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(t1);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == t2) return true;
            addChildren(curr, queue);
        }
        return false;
    }

    private void addChildren(TreeNode node, Queue<TreeNode> q) {
        if (node.leftChild != null) {
            q.add(node.leftChild);
        }
        if (node.rightChild != null) {
            q.add(node.rightChild);
        }
    }

    //t2가 실제 t1의 트리구조 내부에 있는 것이 아닌, t1의 subtree 의 값들이 t2 의 값들과 같을 경우
    public boolean containsTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        return subtree(t1, t2);
    }


    private boolean subtree(TreeNode n1, TreeNode n2) {
        if (n1 == null) return false;
        else if (n1.val == n2.val && matchTree(n1, n2)) return true;
        return subtree(n1.leftChild, n2) || subtree(n1.rightChild, n2);
    }

    private boolean matchTree(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) { // 둘 중 하나만 null 인 경우가 된다.
            return false;
        } else if (n1.val != n2.val) {
            return false;
        } else {
            return matchTree(n1.leftChild, n2.leftChild) && matchTree(n1.rightChild, n2.rightChild);
        }
    }
}
