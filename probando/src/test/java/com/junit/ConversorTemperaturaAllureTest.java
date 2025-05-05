package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import io.qameta.allure.*;

@Epic("Conversión de Temperatura")
@Owner("Equipo QA")
@Severity(SeverityLevel.NORMAL)
@DisplayName("Suite de pruebas de ConversorTemperatura")
class ConversorTemperaturaTest {

    ConversorTemperatura conversor = new ConversorTemperatura();

    @Feature("Conversión Celsius a Fahrenheit")
    @Story("Conversión de 0°C")
    @DisplayName("Convertir 0°C a Fahrenheit")
    @Description("Verifica que 0 grados Celsius se convierte correctamente a 32 Fahrenheit.")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void testCelsiusAFahrenheit_Zero() {
        Allure.step("Convertir 0 grados Celsius a Fahrenheit", () -> {
            double resultado = conversor.celsiusAFahrenheit(0);
            Allure.step("Validar que el resultado es 32.0 °F");
            assertEquals(33.0, resultado);
        });
    }

    @Feature("Conversión Celsius a Fahrenheit")
    @Story("Conversión de 100°C")
    @DisplayName("Convertir 100°C a Fahrenheit")
    @Description("Verifica que 100 grados Celsius se convierte correctamente a 212 Fahrenheit.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void testCelsiusAFahrenheit_Positive() {
        Allure.step("Convertir 100 grados Celsius a Fahrenheit", () -> {
            double resultado = conversor.celsiusAFahrenheit(100);
            Allure.step("Validar que el resultado es 212.0 °F (con delta)");
            assertEquals(212.0, resultado, 0.0001);
        });
    }

    @Feature("Conversión Celsius a Fahrenheit")
    @Story("Conversión de -40°C")
    @DisplayName("Convertir -40°C a Fahrenheit")
    @Description("Verifica que -40 grados Celsius se convierte correctamente a -40 Fahrenheit.")
    @Severity(SeverityLevel.MINOR)
    @Test
    void testCelsiusAFahrenheit_Negative() {
        Allure.step("Convertir -40 grados Celsius a Fahrenheit", () -> {
            double resultado = conversor.celsiusAFahrenheit(-40);
            Allure.step("Validar que el resultado es -40.0 °F");
            assertEquals(-40.0, resultado, 0.0001);
        });
    }

    @Feature("Conversión Fahrenheit a Celsius")
    @Story("Conversión de 32°F")
    @DisplayName("Convertir 32°F a Celsius")
    @Description("Verifica que 32 Fahrenheit se convierte correctamente a 0 grados Celsius.")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void testFahrenheitACelsius_Zero() {
        Allure.step("Convertir 32 grados Fahrenheit a Celsius", () -> {
            double resultado = conversor.fahrenheitACelsius(32);
            Allure.step("Validar que el resultado es 0.0 °C");
            assertEquals(0.0, resultado, 0.0001);
        });
    }

    @Feature("Conversión Fahrenheit a Celsius")
    @Story("Conversión de 212°F")
    @DisplayName("Convertir 212°F a Celsius")
    @Description("Verifica que 212 Fahrenheit se convierte correctamente a 100 grados Celsius.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void testFahrenheitACelsius_Positive() {
        Allure.step("Convertir 212 grados Fahrenheit a Celsius", () -> {
            double resultado = conversor.fahrenheitACelsius(212);
            Allure.step("Validar que el resultado es 100.0 °C (con delta)");
            assertEquals(100.0, resultado, 0.0001);
        });
    }

    @Feature("Conversión Fahrenheit a Celsius")
    @Story("Conversión de -40°F")
    @DisplayName("Convertir -40°F a Celsius")
    @Description("Verifica que -40 Fahrenheit se convierte correctamente a -40 grados Celsius.")
    @Severity(SeverityLevel.MINOR)
    @Test
    void testFahrenheitACelsius_Negative() {
        Allure.step("Convertir -40 grados Fahrenheit a Celsius", () -> {
            double resultado = conversor.fahrenheitACelsius(-40);
            Allure.step("Validar que el resultado es -40.0 °C");
            assertEquals(-40.0, resultado, 0.0001);
        });
    }
}
