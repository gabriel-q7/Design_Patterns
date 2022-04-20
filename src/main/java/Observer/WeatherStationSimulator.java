package Observer;

public class WeatherStationSimulator {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay conditionsDisplay =
                new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherStation);

        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(70, 65 , 30.4f);

    }
}
