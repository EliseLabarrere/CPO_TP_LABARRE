/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Le but du jeu est de deviner un nombre, saisissez l'interval du nombre à deviner de jeu : de 0 à ?");
        int interval; // nombre d'entiers à additionner
        interval = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Avez-vous besoins de petites aides ?\n"
                + "1) Oui\n"
                + "2) Non");
        int choiceHelp;
        choiceHelp = sc2.nextInt();
        boolean help;
        switch (choiceHelp) {
            case 1 ->
                help = true;
            default ->
                help = false;
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Saisissez la difficulté :\n"
                + "1) Facile : nombre de coup illimité\n"
                + "2) Normal : vous devez gagner en 12 coups\n"
                + "3) Difficil : vous devez gagner en 6 coups");
        int choiceDifficulty;
        choiceDifficulty = sc3.nextInt();
        int difficulty;
        switch (choiceDifficulty) {
            case 1 ->
                difficulty = interval;
            case 2 ->
                difficulty = 12;
            default ->
                difficulty = 6;
        }

        System.out.println("Le jeu commence devinez le nombre");
        int n = generateurAleat.nextInt(interval);

        Scanner scNb = new Scanner(System.in);
        int nbrTry = 0;

        while (true) {
            int response = scNb.nextInt();
            nbrTry++;
            if (nbrTry == difficulty) {
                if (response > n) {
                    if ((response - interval * 0.2 > n) && help) {
                        System.out.println("Vraiment trop grand");
                    } else {
                        System.out.println("Trop grand");
                    }
                } else if (response < n) {
                    if ((response + interval * 0.2 < n) && help) {
                        System.out.println("Vraiment trop petit");
                    } else {
                        System.out.println("Trop petit");
                    }
                } else {
                    System.out.println("Gagné");
                    break;
                }
            } else {
                break;
            }
        }

        System.out.println("Vous avez gagné au bout de " + nbrTry + " tentatives");

    }

}
