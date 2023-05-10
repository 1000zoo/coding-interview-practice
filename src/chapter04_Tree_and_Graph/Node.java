package chapter04_Tree_and_Graph;

import java.util.*;

public class Node <T>{
    public T val;
    public List<Node<T>> children;

    public Node(T val) {
        this.val = val;
        children = new ArrayList<>();
    }

    public Node(T val, List<Node<T>> neighbor) {
        this.val = val;
        this.children = neighbor;
    }
}
