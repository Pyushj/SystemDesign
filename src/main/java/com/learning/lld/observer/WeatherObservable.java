package com.learning.lld.observer;

public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void setWeatherData(float temperature, float humidity);

    void notifyData();
}
