package com.learning.lld.factory;

public class VehicleFactoryProducer {
    public static VehicleFactory getFactoryInstance(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarFactory();
            case BIKE -> new BikeFactory();
            case TRUCK -> new TruckFactory();
            default -> null;
        };
    }
}
