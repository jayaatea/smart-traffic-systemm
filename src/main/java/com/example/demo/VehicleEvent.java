package com.example.demo;

public class VehicleEvent {

    private String vehicleId;
    private double speed;
    private String zone;
    private boolean emergencyVehicle;
    private long timestamp;

    public VehicleEvent() {
    }

    public VehicleEvent(String vehicleId,
                        double speed,
                        String zone,
                        boolean emergencyVehicle,
                        long timestamp) {

        this.vehicleId = vehicleId;
        this.speed = speed;
        this.zone = zone;
        this.emergencyVehicle = emergencyVehicle;
        this.timestamp = timestamp;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public boolean isEmergencyVehicle() {
        return emergencyVehicle;
    }

    public void setEmergencyVehicle(boolean emergencyVehicle) {
        this.emergencyVehicle = emergencyVehicle;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}