package chapter07_Object_Oriented_Programming.Prob02;

public class Employee {
    public String name;
    public Level level;
    public boolean callable;

    public Employee(String name, Level level) {
        this.name = name;
        this.level = level;
        this.callable = true;
    }

    public boolean canDeal(Level level) {
        return level.compareTo(this.level) <= 0;
    }

    public void matchCall() {
        this.callable = false;
    }
    public void finishCall() {
        this.callable = true;
    }
}
