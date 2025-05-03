package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import io.qameta.allure.*;

class ConversorTemperaturaTest {

    ConversorTemperatura conversor = new ConversorTemperatura();

    @Epic("Conversión de Temperatura")
    @Feature("Conversión Celsius a Fahrenheit")
    @Story("Celsius cero")
    @DisplayName("Convertir 0°C a Fahrenheit")
    @Description("Este test verifica que 0 grados Celsius se convierten correctamente a 32 Fahrenheit")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void testCelsiusAFahrenheit_Zero() {
        double resultado = conversor.celsiusAFahrenheit(0);
        assertEquals(32.0, resultado);
    }

    @Test
    void testCelsiusAFahrenheit_Positive() {
        double resultado = conversor.celsiusAFahrenheit(100);
        assertEquals(212.0, resultado, 0.0001);
        // El 0.0001 es un delta que se agrega, admitido por el metodo assertEquals, lo
        // que permite es que
        // ya que los cálculos con double (coma flotante) no siempre son exactos por la
        // forma en
        // que se representan en la memoria evitemos que nos de un error el test
    }

    @Test
    void testCelsiusAFahrenheit_Negative() {
        double resultado = conversor.celsiusAFahrenheit(-40);
        assertEquals(-40.0, resultado, 0.0001);
    }

    @Test
    void testFahrenheitACelsius_Zero() {
        double resultado = conversor.fahrenheitACelsius(32);
        assertEquals(0.0, resultado, 0.0001);
    }

    @Test
    void testFahrenheitACelsius_Positive() {
        double resultado = conversor.fahrenheitACelsius(212);
        assertEquals(100.0, resultado, 0.0001);
    }

    @Test
    void testFahrenheitACelsius_Negative() {
        double resultado = conversor.fahrenheitACelsius(-40);
        assertEquals(-40.0, resultado, 0.0001);
    }
}
