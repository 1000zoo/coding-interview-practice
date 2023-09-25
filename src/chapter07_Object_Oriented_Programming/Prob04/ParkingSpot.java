package chapter07_Object_Oriented_Programming.Prob04;

public class ParkingSpot {
    public final int spotID;
    private boolean available;

    public ParkingSpot(int spotID) {
        this.spotID = spotID;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public int park() {
        this.available = false;
        return spotID;
    }

    public int getSpotID() {
        return spotID;
    }

    public void leave() {
        this.available = true;
    }
}
