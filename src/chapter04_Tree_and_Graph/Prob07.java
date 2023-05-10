/*
4.7 순서 정하기: 프로젝트의 리스트와 프로젝트들 간의 종속 한계
              (즉, 프로젝트 쌍이 리스트로 주어지면 각 프로젝트 쌍에서 두 번제 프로젝트가 첫 번제 프로젝트에 종속되어 있다는 뜻)가 주어졌을 때,
              프로젝트를 수행해 나가는 순서를 찾으라. 유효한 순서가 존재하지 않으면 에러를 반환한다. (사이클은 없다고 가정)
 */

package chapter04_Tree_and_Graph;

import java.util.*;

public class Prob07 {
    private Stack<String> stack;
    private Set<String> visited;

    public List<String> getOrderOfProjects(String[] projects, String[][] dependency) {
        List<String> answer = new ArrayList<>();
        Map<String, Node<String>> nodeMap = new HashMap<>();
        stack = new Stack<>();
        visited = new HashSet<>();

        for (String project : projects) {
            nodeMap.put(project, new Node<>(project));
        }
        for (String[] dep : dependency) {
            if (dep.length != 2) throw new IndexOutOfBoundsException();
            Node<String> temp = nodeMap.get(dep[0]);
            temp.children.add(nodeMap.get(dep[1]));
        }

        for (String project : projects) {
            dfs(nodeMap.get(project));
        }

        while (!stack.isEmpty()) {
            answer.add(stack.pop());
        }

        return answer;
    }

    public boolean dfs(Node<String> project) {
        if (visited.contains(project.val)) return false;

        List<Node<String>> children = project.children;
        for (Node<String> child : children) {
            if (!dfs(child)) return false;
        }
        visited.add(project.val);
        stack.push(project.val);

        return true;
    }
}
