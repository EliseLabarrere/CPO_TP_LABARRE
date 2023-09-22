/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_labarrere;

/**
 *
 * @author Pedro Pablo Palmito
 */
public class TP2_Bieres_LABARRERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere biere1 = new BouteilleBiere("Cuvée des trolls",7.0,"Les Trolls");
        biere1.lireEtiquette();
        

        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
        biere2.lireEtiquette();

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        autreBiere.Décapsuler();
        autreBiere.Décapsuler();
        
        System.out.println(biere1) ;

        BouteilleBiere biere3 = new BouteilleBiere("Zéro Trois",5.5,"Allier");
        biere3.Décapsuler();
        biere3.lireEtiquette();
        
        BouteilleBiere biere4 = new BouteilleBiere("IPA", 7.5,"Burgonde");
        biere4.lireEtiquette();
        
        BouteilleBiere biere5 = new BouteilleBiere("5 ème Saison",6.2,"Backporte");
        biere5.Décapsuler();
        biere5.Décapsuler();
        biere5.lireEtiquette();
        
        BouteilleBiere biere6 = new BouteilleBiere("La Goupil", 6.0,"La Foline");
        biere6.lireEtiquette();
    }
}
