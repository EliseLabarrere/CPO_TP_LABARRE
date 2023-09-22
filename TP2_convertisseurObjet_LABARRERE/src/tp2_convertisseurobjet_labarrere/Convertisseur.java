/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_labarrere;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class Convertisseur {
    int nbConversions = 0;
    String tempFrom = "Celcius";
    String tempTo = "Celcius";

    public float KelvinVersCelcius(float tempK) {
        nbConversions++;
        return tempK - 273.15f;
    }

    public float CelciusVersKelvin(float tempC) {
        nbConversions++;
        return tempC + 273.15f;
    }

    public float FarenheitVersCelcius(float tempF) {
        nbConversions++;
        return (tempF - 32) * (5.0f / 9);
    }

    public float CelciusVersFarenheit(float tempC) {
        nbConversions++;
        return tempC * (9.0f / 5) + 32;
    }

    public float KelvinVersFarenheit(float tempK) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tempK));
    }

    public float FarenheitVersKelvin(float tempF) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tempF));
    }
    
    @Override
    public String toString() {
        return "Convertion n°" + nbConversions + "\n";
    }
}
