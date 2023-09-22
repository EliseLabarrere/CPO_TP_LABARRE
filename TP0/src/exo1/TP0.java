/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class TP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LE PRENOM
        // TODO code application logic here
        // String prenom;
        // Scanner sc;
        // sc = new Scanner(System.in);
        // System.out.println("Quel est votre prénom ?");
        // prenom = sc.nextLine();
        // System.out.println(" Bonjour " + prenom);

        // LES ADDITIONS
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        int nb; // nombre d'entiers à additionner
        int result; // resultat
        int ind; //indice
        // initialisation
        nb = sc.nextInt();
        result = 0;
        // addition des nb premiers entiers
        ind = 1;
        while (ind < nb) {
            result = result + ind;
            ind++;
        }
        // affichage du resultat
        System.out.println("la somme des " + nb + " entiers est: " + result);
    }

}
