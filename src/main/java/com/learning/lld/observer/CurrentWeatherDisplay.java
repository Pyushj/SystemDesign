package com.learning.lld.observer;

public class CurrentWeatherDisplay implements WeatherObserver {

    private long lastUpdatedTimeStamp;

    public CurrentWeatherDisplay() {
        this.lastUpdatedTimeStamp = System.currentTimeMillis();
    }

    @Override
    public void update(WeatherData weatherData) {
        long currentTime = System.currentTimeMillis();
        long delta = currentTime - lastUpdatedTimeStamp;
        System.out.println("Update available for class:" + this.getClass());
        System.out.println("Time elapsed since last update " + delta + " ms");
        System.out.println("Current status: " + weatherData);
        lastUpdatedTimeStamp = currentTime;
    }
}
