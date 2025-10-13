package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9 / 5  + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return "Current weather: "+ temperatureCelsius+ " C ("+temperatureFahrenheit()+" F) and "+conditions ;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double C = (tempFahrenheit - 32) * 5/9;
        return new WeatherData(C, conditions);
    }

    public static void main(String[] args) {
        WeatherData today = new WeatherData(25,"Sunny");
        System.out.print("Today's weather: ");
        System.out.println(today.getSummary());
        WeatherData yesterday = WeatherData.fromFahrenheit(50, "Cloudy");
        System.out.print("Yesterday's weather: ");
        System.out.println(yesterday.getSummary());
    }
}
