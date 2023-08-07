package one.digitalinnovation.Cloud.service;

import one.digitalinnovation.Cloud.Model.Parking;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ParkingService{

    private static Map<String, Parking> parkingMap = new HashMap<>();
    private static Object UID;

    static {
        var id = getUID();
        Parking parking = new Parking(id, "MDS-111", "SC", "CELTA", "PRETO");
        parking.put(id, parking);
    }

    public static String getUID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
