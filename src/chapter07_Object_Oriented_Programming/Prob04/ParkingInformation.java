package chapter07_Object_Oriented_Programming.Prob04;

public class ParkingInformation {
    public final Vehicle car;
    public final String parkedTime;
    public int level;
    public int spot;

    public ParkingInformation(Vehicle car, int level, int spot) {
        this.car = car;
        this.parkedTime = "CURRENT TIME";
        this.level = level;
        this.spot = spot;
    }
}
