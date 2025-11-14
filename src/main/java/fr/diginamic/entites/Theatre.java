package fr.diginamic.entites;

public class Theatre {

    private final String nom;
    private final int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    public void inscrire(int nombreClients, double prixPlace) {

        if (nombreClients < this.capaciteMax-this.totalClientsInscrits) {

            this.totalClientsInscrits += nombreClients;
            this.recetteTotale += nombreClients * prixPlace;
            System.out.println("La réservation a bien été prise en compte pour : " + nombreClients + " clients au prix de " + prixPlace + " €.");

        } else  {

            System.out.println("La limite du Théatre a été atteinte, l'inscription est impossible.");

        }

    }

    public String getNom() { return nom; }
    public int getCapaciteMax() { return capaciteMax; }
    public int getTotalClientsInscrits() { return totalClientsInscrits; }
    public double getRecetteTotale() { return recetteTotale; }

}
