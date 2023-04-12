package chapter04_Tree_and_Graph;

/*
4.2 최소 트리: 오름차순으로 정렬된 배열이 있다. 이 배열 안에 들어있는 원소는 정수이며
              중복된 값이 없다고 했을 때 높이가 최소가 되는 이진 탐색 트리를 만드는 알고리즘을 작성하라.
 */

import java.util.*;

public class Prob02 {
    private int[] array;
    public TreeNode getBinarySearchTree(int[] _array) {
        array = _array;
        return setTree(0, array.length - 1);
    }

    public TreeNode setTree(int start, int end) {
        if (end < start) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]);
        node.leftChild = setTree(start, mid - 1);
        node.rightChild = setTree(mid + 1, end);
        return node;
    }
}
