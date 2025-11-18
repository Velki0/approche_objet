package fr.diginamic.automates;

import java.util.concurrent.TimeUnit;

public class JeuDeLaVie {

    public static void main(String[] args) throws InterruptedException {

        final int lignesTotales = 30;
        final int colonnesTotales = 100;

        TableauJeu tableauJeu =  new TableauJeu(lignesTotales, colonnesTotales);

        while(true){
            tableauJeu.setProchainTableau();
            tableauJeu.setTableau();
            TimeUnit.SECONDS.sleep(1);
            tableauJeu.afficherTableauJeu();
        }

    }

}
