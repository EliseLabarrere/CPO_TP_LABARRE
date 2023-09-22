/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        double temp; // nombre d'entiers à additionner
        temp = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :\n"
                + "1) De Kelvin vers Celcius\n"
                + "2) De Celcius vers Kelvin\n"
                + "3) De Farenheit vers Celcius\n"
                + "4) De Celcius vers Farenheit\n"
                + "5) De Kelvin vers Farenheit\n"
                + "6) De Farenheit vers Kelvin");
        int choice; // nombre d'entiers à additionner
        choice = sc2.nextInt();

        switch (choice) {
            case 1 ->
                System.out.println(temp + "K = " + KelvinVersCelcius(temp) + "°C");
            case 2 ->
                System.out.println(temp + "°C = " + CelciusVersKelvin(temp) + "K");
            case 3 ->
                System.out.println(temp + "F = " + FarenheitVersCelcius(temp) + "°C");
            case 4 ->
                System.out.println(temp + "°C = " + CelciusVersFarenheit(temp) + "F");
            case 5 ->
                System.out.println(temp + "K = " + KelvinVersFarenheit(temp) + "F");
            default ->
                System.out.println(temp + "F = " + FarenheitVersKelvin(temp) + "K");
        }

    }

    public static double KelvinVersCelcius(double tempK) {
        return tempK - 273.15;
    }

    public static double CelciusVersKelvin(double tempC) {
        return tempC + 273.15;
    }

    public static double FarenheitVersCelcius(double tempF) {
        return (tempF - 32) * (5.0 / 9);
    }

    public static double CelciusVersFarenheit(double tempC) {
        return tempC * (9.0 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tempK) {
        return CelciusVersFarenheit(KelvinVersCelcius(tempK));
    }

    public static double FarenheitVersKelvin(double tempF) {
        return CelciusVersKelvin(FarenheitVersCelcius(tempF));
    }

}
