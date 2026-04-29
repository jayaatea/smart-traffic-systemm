package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traffic")
public class TrafficController {

    @PostMapping("/check")
    public String check(@RequestBody VehicleEvent event) {

        if (event.getSpeed() > 80 && !event.isEmergencyVehicle()) {
            int fine;

            if (event.getSpeed() > 120) fine = 5000;
            else if (event.getSpeed() > 100) fine = 2000;
            else fine = 1000;

            return "Violation! Fine: ₹" + fine;
        }

        return "No violation";
    }
}