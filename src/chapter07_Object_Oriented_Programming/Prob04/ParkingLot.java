package chapter07_Object_Oriented_Programming.Prob04;

import java.util.*;

public class ParkingLot {
    public ParkingLevel[] levels;
    public Map<String, ParkingInformation> parkingInformationMap;

    public ParkingLot(int maxLevel) {
        levels = new ParkingLevel[maxLevel];
        parkingInformationMap = new HashMap<>();
    }

    public boolean park(Vehicle car) {
        for (ParkingLevel level : levels) {
            if (!level.hasAvailableSpots()) continue;
            int spot = level.park();
            parkingInformationMap.put(car.carID, new ParkingInformation(car, level.level, spot));
        }
        return false;
    }

    public int leave(Vehicle car, String currentTime) {
        if (parkingInformationMap.containsKey(car.carID)) return -1;
        ParkingInformation info = parkingInformationMap.get(car.carID);
        levels[info.level].leave(info.spot);
        int fee = calculateFee(car);
        parkingInformationMap.remove(car.carID);
        return fee;
    }

    public int calculateFee(Vehicle car) {
        String currentTime = "";
        return 0;
    }
}
