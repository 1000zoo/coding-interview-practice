package chapter03_Stack_and_Queue;

//Prob06
public class Animal {
    String name;
    int type; //0 : Dog, 1 : Cat

    public Animal(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}