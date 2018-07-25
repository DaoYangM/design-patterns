import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        observable = o;
        WeatherData weatherData = (WeatherData) observable;
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();

        display();
    }
}
