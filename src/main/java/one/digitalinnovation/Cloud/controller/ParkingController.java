package one.digitalinnovation.Cloud.controller;

import one.digitalinnovation.Cloud.Model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){

        var parking = new Parking();
        parking.setColor("Preto");
        parking.setLicense("MMSS-111");
        parking.setModel("VW-GOL");
        parking.setState("SP");

        return Arrays.asList(parking);
    }
}
