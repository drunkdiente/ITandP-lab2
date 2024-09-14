import java.awt.*;

public class Weather extends App{

    private String city;

    private String date;

    private double temperature;

    public Weather(String name, double version, String city, String date, double temperature) {
        super(name, version);
        this.city = city;
        this.date = date;
        this.temperature = temperature;
    }

    @Override
    public void launch() {
        System.out.println("Прогноз погоды запущен");
    }

    @Override
    public void shutdown() {
        System.out.println("Прогноз погоды выключен");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
