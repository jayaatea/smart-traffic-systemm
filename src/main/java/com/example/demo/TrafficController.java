package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/traffic")
public class TrafficController {

    List<VehicleEvent> events = new ArrayList<>();

    public TrafficController() {

        events.add(new VehicleEvent(
                "MH12AB1234",
                95,
                "Pune-West",
                false,
                System.currentTimeMillis()));

        events.add(new VehicleEvent(
                "MH14XY5678",
                130,
                "Pune-East",
                false,
                System.currentTimeMillis()));

        events.add(new VehicleEvent(
                "MH01ZZ9999",
                70,
                "Mumbai",
                false,
                System.currentTimeMillis()));

        events.add(new VehicleEvent(
                "MH12EM1111",
                140,
                "Pune-West",
                true,
                System.currentTimeMillis()));
    }

    @GetMapping("/search/{vehicleId}")
    public String searchVehicle(@PathVariable String vehicleId) {

        for (VehicleEvent event : events) {

            if (event.getVehicleId().equalsIgnoreCase(vehicleId)) {

                if (event.getSpeed() > 80 &&
                        !event.isEmergencyVehicle()) {

                    int fine;

                    if (event.getSpeed() > 120)
                        fine = 5000;
                    else if (event.getSpeed() > 100)
                        fine = 2000;
                    else
                        fine = 1000;

                    return "Vehicle: " + event.getVehicleId()
                            + " | Speed: " + event.getSpeed()
                            + " | Zone: " + event.getZone()
                            + " | Fine: ₹" + fine;
                }

                return "No violation for vehicle "
                        + event.getVehicleId();
            }
        }

        return "Vehicle not found";
    }
}