package fr.diginamic.automates;

import java.util.concurrent.TimeUnit;

public class JeuDeLaVie {

    public static void main(String[] args) throws InterruptedException {

        final int lignesTotales = 20;
        final int colonnesTotales = 50;

        TableauJeu tableauJeu =  new TableauJeu(lignesTotales, colonnesTotales);

        tableauJeu.afficherTableauJeu();

        while(true){
            tableauJeu.setProchainEtatTableau();
            tableauJeu.setEtatTableau();
            TimeUnit.SECONDS.sleep(1);
            tableauJeu.afficherTableauJeu();
        }

    }

}
