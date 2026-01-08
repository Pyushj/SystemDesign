package com.learning.lld.factory;

public class TruckFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}
