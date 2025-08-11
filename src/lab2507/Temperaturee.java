package lab2507;

class Temperature {
    // Private field
    private double celsius;

    // Setter with validation
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("invalid");
            this.celsius = -273.15; 
        }
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Convert to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }

   
    public void displayTemperatures() {
        System.out.println("Celsius: " + celsius );
        System.out.println("Fahrenheit: " + toFahrenheit() );
        System.out.println("Kelvin: " + toKelvin() );
        
    }
}

// Main class to test
public class Temperaturee {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.setCelsius(25);   // Valid temperature
        t1.displayTemperatures();

        Temperature t2 = new Temperature();
        t2.setCelsius(-300); // Invalid, below absolute zero
        t2.displayTemperatures();
    }
}