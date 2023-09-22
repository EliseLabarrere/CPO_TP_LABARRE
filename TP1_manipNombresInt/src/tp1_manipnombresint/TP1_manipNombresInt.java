/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer le premier nombre :");
        int nb1; // nombre d'entiers à additionner
        nb1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Entrer le second nombre :");
        int nb2; // nombre d'entiers à additionner
        nb2 = sc2.nextInt();

        int somme;
        somme = nb1 + nb2;
        System.out.println("Somme : " + somme);

        float quotient;
        quotient = (float) (nb1*0.1 / nb2);
        System.out.println("Produit : " + quotient);
    }

}
