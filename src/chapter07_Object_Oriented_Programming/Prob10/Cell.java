package chapter07_Object_Oriented_Programming.Prob10;

public class Cell {

    private final int number;

    public Cell(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    public boolean isZero() {
        return number == 0;
    }
    public boolean isMine() {
        return number == -1;
    }


    @Override
    public String toString() {
        return number == -1 ? "*" : String.valueOf(number);
    }
}
