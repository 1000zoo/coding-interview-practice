package chapter03_Stack_and_Queue;

import java.util.*;

/*
Prob 3.6 동물 보호소: 먼저 들어온 동물이 먼저 나가는 동물 보호소.
                   이 보호소는 개와 고양이만 수용한다. 사람들은 보호소에서 가장 오래된 동물부터 입양할 수 있는데,
                   개와 고양이 중 어떤 동물을 데려갈지 선택할 수 있다. 하지만 특정한 동물을 지정해 데려갈 수는 없다.
                   이 시스템을 자료구조로 구현하라. 이 자료구조는 enqueue, dequeueAny, dequeueDog, dequeueCat 의
                   연산을 제공해야 한다.
 */

public class Prob06 {

    public static class AnimalQueue {
        Queue<Animal> q;

        public AnimalQueue() {
            this.q = new LinkedList<>();
        }

        public void enqueue(Animal animal) {
            q.add(animal);
        }

        public Animal dequeueAny() {
            return q.poll();
        }

        public Animal dequeueDog() {
            Queue<Animal> temp = new LinkedList<>();
            Animal dog = null;

            while (!q.isEmpty() && q.peek().getType() != 0) {
                temp.add(q.poll());
            }
            dog = q.poll();
            while (!q.isEmpty()) {
                temp.add(q.poll());
            }
            q = temp;

            return dog;
        }

        public Animal dequeueCat() {
            Queue<Animal> temp = new LinkedList<>();
            Animal cat = null;

            while (!q.isEmpty() && q.peek().getType() != 1) {
                temp.add(q.poll());
            }
            cat = q.poll();
            while (!q.isEmpty()) {
                temp.add(q.poll());
            }
            q = temp;

            return cat;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Animal ani : q) {
                String tpe = ani.getType() == 0 ? "dog" : "cat";
                sb.append("(").append(tpe).append(": ").append(ani.getName()).append(")").append(",\n");
            }
            return sb.toString();
        }

    }
}