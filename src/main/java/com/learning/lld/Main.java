package com.learning.lld;

import com.learning.lld.chainofresponsibility.*;
import com.learning.lld.decorator.CheesePizzaDecorator;
import com.learning.lld.decorator.MushroomPizzaDecorator;
import com.learning.lld.decorator.ThinCrustPizza;
import com.learning.lld.factory.Vehicle;
import com.learning.lld.factory.VehicleFactoryProducer;
import com.learning.lld.factory.VehicleType;
import com.learning.lld.observer.CurrentWeatherDisplay;
import com.learning.lld.observer.FutureForecastDisplay;
import com.learning.lld.observer.WeatherStation;
import com.learning.lld.tictactoe.Game;

public class Main {
    static void main() {
        System.out.println("Beginning of function main...");
        testTicTacToe();
    }
    static void testObserver() {
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

    static void testDecorator() {
        ThinCrustPizza thinCrustPizza = new ThinCrustPizza();
        System.out.println(thinCrustPizza.getDescription()+" cost: "+ thinCrustPizza.getCost());
        CheesePizzaDecorator cheesePizzaDecorator = new CheesePizzaDecorator(thinCrustPizza);
        System.out.println(cheesePizzaDecorator.getDescription()+" cost: "+ cheesePizzaDecorator.getCost());

        MushroomPizzaDecorator mushroomPizzaDecorator = new MushroomPizzaDecorator(cheesePizzaDecorator);
        System.out.println(mushroomPizzaDecorator.getDescription()+" cost: "+ mushroomPizzaDecorator.getCost());

    }

    static void testFactory() {
        Vehicle car = VehicleFactoryProducer.getFactoryInstance(VehicleType.CAR).createVehicle();
        System.out.println("Vehicle description " + car.getDescription());
    }

    static void testChainOfResponsibility() {
        LogHandler fatalLogHandler = new FatalLogHandler(null);
        LogHandler errorLogHandler = new ErrorLogHandler(fatalLogHandler);
        LogHandler debugLogHandler = new DebugLogHandler(errorLogHandler);
        LogHandler infoLogHandler = new InfoLogHandler(debugLogHandler);

        infoLogHandler.parseLog(LogLevel.ERROR, "This should be an error log");

        infoLogHandler.parseLog(LogLevel.FATAL, "This should be a fatal log");
        infoLogHandler.parseLog(LogLevel.DEBUG, "This should be a debug log");
        infoLogHandler.parseLog(LogLevel.INFO, "This should be an info log");
    }
}
