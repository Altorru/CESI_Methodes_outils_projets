public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherStation.attach(currentDisplay);
        weatherStation.attach(statisticsDisplay);
        weatherStation.setWeatherData("Sunny, 25°C");
        currentDisplay.display();
        statisticsDisplay.display();
        weatherStation.setWeatherData("Rainy, 18°C");
        currentDisplay.display();
        statisticsDisplay.display();
    }
}
