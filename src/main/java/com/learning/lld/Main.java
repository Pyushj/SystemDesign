package com.learning.lld;

import com.learning.lld.observer.CurrentWeatherDisplay;
import com.learning.lld.observer.FutureForecastDisplay;
import com.learning.lld.observer.WeatherStation;

public class Main {
    static void main() {
        System.out.println("Beginning og function main");
        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
        FutureForecastDisplay futureForecastDisplay = new FutureForecastDisplay();

        weatherStation.addObserver(currentWeatherDisplay);
        weatherStation.addObserver(futureForecastDisplay);

        weatherStation.setWeatherData(14.05f,66.45f);

        weatherStation.setWeatherData(21.07f,77.56f);

        weatherStation.removeObserver(futureForecastDisplay);

        weatherStation.setWeatherData(.07f,.56f);

    }
}
