package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double temperatureSum = 0;
        double average = 0;

        for(Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            temperatureSum += entry.getValue();
        }

        average = temperatureSum/temperatures.getTemperatures().size();
        average = Math.floor(average * 100) / 100;
        return average;
    }

    public double calculateMedianTemperature() {
        ArrayList<Double> tmp = new ArrayList<>();
        double median = 0;

        for(Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            tmp.add(entry.getValue());
        }
        Collections.sort(tmp);
        if(tmp.size() % 2 != 0) {
            median = tmp.get(tmp.size()/2);
        }
        else {
            int middleIndex =tmp.size()/2-1;
            median = (tmp.get(middleIndex) + tmp.get(middleIndex+1))/2;
        }
        median = Math.floor(median * 100) / 100;
        return median;
    }
}