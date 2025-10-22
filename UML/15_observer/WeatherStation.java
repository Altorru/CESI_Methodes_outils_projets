import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private final List<Observer> observers;
    private String weatherData;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setWeatherData(String data) {
        this.weatherData = data;
        notifyObservers(data);
    }
    
}
