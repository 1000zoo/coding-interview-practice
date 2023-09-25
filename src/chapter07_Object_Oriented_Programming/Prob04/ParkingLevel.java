package chapter07_Object_Oriented_Programming.Prob04;

import java.util.*;
import java.util.stream.Stream;

public class ParkingLevel {
    public final int level;
    public ParkingSpot[] spots;
    public int availableSpots;

    public ParkingLevel(int level) {
        this.level = level;
        spots = new ParkingSpot[100];
        availableSpots = 100;
    }

    public boolean hasAvailableSpots() {
        return availableSpots > 0;
    }

    public int findAvailableSpot() {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable()) return spot.spotID;
        }
        return -1;
    }

    public List<Integer> getAllAvailableSpots() {
        return Stream.of(spots)
                .filter(ParkingSpot::isAvailable)
                .mapToInt(ParkingSpot::getSpotID)
                .boxed()
                .toList();
    }

    public void leave(int spotID) {
        ParkingSpot spot = spots[spotID];
        if (spot.isAvailable()) return;
        spot.leave();
        this.availableSpots--;
    }

    public int park() {
        int availableSpot = findAvailableSpot();
        this.availableSpots++;
        return spots[availableSpot].park();
    }
}
