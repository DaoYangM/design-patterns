public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        weatherData.addObserver(currentConditionsDisplay);
        weatherData.setMeasurement(80.1f, 20.5f, 10.0f);
    }
}
