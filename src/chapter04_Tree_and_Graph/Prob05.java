package chapter04_Tree_and_Graph;

/*
4.5 BST 검증: 주어진 이진 트리가 BST인지 확인하는 함수를 작성하라.
 */

import java.util.*;

public class Prob05 {
    public boolean isBST(TreeNode root) {
        if (root == null) throw new NullPointerException();
        Stack<TreeNode> stack = new Stack<>(){{push(root);}};

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if (curr.leftChild != null && curr.rightChild != null) {
                if (curr.leftChild.val > curr.val || curr.val > curr.rightChild.val) {
                    return false;
                }
                stack.push(curr.leftChild);
                stack.push(curr.rightChild);
            } else if (curr.leftChild != null) {
                if (curr.leftChild.val > curr.val) {
                    return false;
                }
                stack.push(curr.leftChild);
            } else if (curr.rightChild != null) {
                if (curr.rightChild.val < curr.val) {
                    return false;
                }
                stack.push(curr.rightChild);
            }
        }

        return true;
    }

}
