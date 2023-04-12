package chapter04_Tree_and_Graph;

import java.util.*;

public class Node <T>{
    public T val;
    public List<Node<T>> neighbor;

    public Node(T val) {
        this.val = val;
        neighbor = new ArrayList<>();
    }

    public Node(T val, List<Node<T>> neighbor) {
        this.val = val;
        this.neighbor = neighbor;
    }
}
