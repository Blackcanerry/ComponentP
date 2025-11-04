package com.mycompany.tempconvertergui;

import java.io.Serializable;

public class TempBean implements Serializable {
    private double celsius;
    private double fahrenheit;

    // Public no-argument constructor
    public TempBean() {}

    // Constructor with initial Celsius value
    public TempBean(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsiusToFahrenheit(celsius);
    }

    // Getters & Setters
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsiusToFahrenheit(celsius); // Auto-update
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = fahrenheitToCelsius(fahrenheit); // Auto-update
    }

    // Conversion methods
    private double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    private double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    // toString for easy display
    @Override
    public String toString() {
        return String.format("%.2f°C = %.2f°F", celsius, fahrenheit);
    }
}
