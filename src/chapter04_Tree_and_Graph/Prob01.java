package chapter04_Tree_and_Graph;

/*
4.1 노드 사이의 경로: 방향 그래프가 주어졌을 때, 두 노드 사이에 경로가 존재하는 지 확인하는 알고리즘을 작성하라.
 */

import java.util.*;

public class Prob01<T> {
    //Time: O(N) (Graph 상의 총 노드 개수)
    //Space:O(N)
    public boolean isConnected(Node<T> node1, Node<T> node2) {
        if (node1 == null || node2 == null) throw new NullPointerException();
        if (node1 == node2) return true;

        Queue<Node<T>> queue = new LinkedList<>(){{add(node1);}};
        Set<Node<T>> visited = new HashSet<>(){{add(node1);}};

        while(!queue.isEmpty()) {
            Node<T> curr = queue.poll();

            for (Node<T> next : curr.neighbor) {
                if (next == node2) return true;

                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }

        }

        return false;
    }
}
