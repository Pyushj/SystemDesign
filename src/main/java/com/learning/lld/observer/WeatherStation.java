package com.learning.lld.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private final List<WeatherObserver> observers;
    private WeatherData weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setWeatherData(float temperature, float humidity) {
        this.weatherData = new WeatherData(temperature, humidity);
        notifyData();
    }

    public void notifyData() {
        for (WeatherObserver observer : observers) {
            observer.update(weatherData);
        }
    }
}
