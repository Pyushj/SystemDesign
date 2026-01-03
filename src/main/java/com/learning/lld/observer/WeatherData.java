package com.learning.lld.observer;

public record WeatherData(float temperature, float humidity) {

    @Override
    public String toString() {
        return "WeatherData(" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ')';
    }
}
