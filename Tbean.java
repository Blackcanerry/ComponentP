package tbean;

import java.io.Serializable;

public class Tbean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Private fields
    private double celsius;
    private double fahrenheit;

    // No-argument constructor
    public Tbean() {
        this.celsius = 0.0;
        this.fahrenheit = 0.0;
    }

    // Getters and Setters
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Conversion methods
    public double convertCelsiusToFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double convertFahrenheitToCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}

