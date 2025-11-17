package fr.diginamic.combat.entites;

import java.util.Scanner;

import static fr.diginamic.combat.entites.TypePotion.*;
import static fr.diginamic.combat.operations.Aleatoire.*;

public class Personnage {

    private final String nom;
    private final int force;
    private int attaque;
    private final int santeMax;
    private int sante;
    private int score;
    private Potion[] ceinturePotions;
    private AmeliorationAttaque ameliorationAttaque;

    public Personnage(String nom) {

        this.nom = nom;
        force = 12 + choixAleatoire(0, 5);
        santeMax = 20 + choixAleatoire(0, 30);
        sante = santeMax;
        score = 0;
        ajouterPotion(new Potion(SOIN));
        ajouterPotion(new Potion(ATTAQUE_MINEURE));
        ajouterPotion(new Potion(ATTAQUE_MAJEURE));
        ameliorationAttaque = new AmeliorationAttaque(0, 0);

    }

    public String getNom() { return nom; }
    public int getForce() { return force; }
    public int getAttaque() { return attaque; }
    public int getSanteMax() { return santeMax; }
    public int getSante() { return sante; }
    public int getScore() { return score; }
    public AmeliorationAttaque getAmelioration() { return ameliorationAttaque; }

    public void setAttaque() {

        if (ameliorationAttaque.getDuree() > 0) {
            attaque = force + ameliorationAttaque.getEffet() + choixAleatoire(1, 10);
        } else {
            attaque = force + choixAleatoire(1, 10);
        }

    }

    public void setSante(int sante) { this.sante = sante; }

    public void gainScore(int gainScore) { score += gainScore; }

    public void getFichePersonnage() {

        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n" +
                "              Sir " + nom + " possède les statistiques suivantes :                                   \n" +
                "              Force : " + force + "                                                                  \n" +
                "              Santé : " + sante + " / " + santeMax + "                                               "
        );
        afficherPotions();

    }

    private void afficherPotions() {

        System.out.print(
                "              Accrochés à sa ceinture, " + nom + " possède trois emplacements de potions :           \n" +
                "             "
        );
        if (ceinturePotions != null) {
            for (Potion potion : ceinturePotions) {
                System.out.print(" | " + potion.getNom() + " | ");
            }
            System.out.println();
        } else {
            System.out.println("Vides");
        }

    }

    public void ajouterPotion(Potion potion) {

        if (ceinturePotions == null || ceinturePotions.length == 0) {
            Potion[] nouvelleCeinture = new Potion[1];
            nouvelleCeinture[0] = potion;
            ceinturePotions = nouvelleCeinture;
        } else if (ceinturePotions.length < 3) {
            Potion[] nouvelleCeinture = new Potion[ceinturePotions.length + 1];
            System.arraycopy(ceinturePotions, 0, nouvelleCeinture, 0, ceinturePotions.length);
            nouvelleCeinture[ceinturePotions.length] = potion;
            ceinturePotions = nouvelleCeinture;
        } else {
            System.out.println("                               La ceinture du héros est pleine ... Cette potion est malheureusement perdue ...");
        }

    }

    private void boirePotion(Potion potion) {

        // Faire l'effet de la potion
        switch (potion.getType()) {
            case SOIN:
                if (sante < santeMax - 5) {
                    sante += 5;
                } else {
                    sante = santeMax;
                }
                System.out.println(
                        "                   La santé de " + nom + " passe à : " + sante + " / " + santeMax + "."
                );
                break;
            case ATTAQUE_MINEURE:
                ameliorationAttaque = new AmeliorationAttaque(3, 1);
                System.out.println(
                        "                   L'attaque de " + nom + " sera améliorée de + 3 pour le prochain combat."
                );
                break;
            case ATTAQUE_MAJEURE:
                ameliorationAttaque = new AmeliorationAttaque(5, 2);
                System.out.println(
                        "                   L'attaque de " + nom + " sera améliorée de + 5 pour les deux prochains combats."
                );
                break;
        }
        // Effacer la potion qui a été bue
        for (int index = ceinturePotions.length - 1 ; index >= 0; index--) {
            if (ceinturePotions[index] == potion) {
                ceinturePotions[index] = null;
                break;
            }
        }
        Potion[] nouvelleCeinture = new Potion[ceinturePotions.length - 1];
        int premierIndex = 0;
        int secondIndex = 0;
        while(secondIndex <= ceinturePotions.length - 1) {
            if(ceinturePotions[secondIndex] != null) {
                nouvelleCeinture[premierIndex] = ceinturePotions[secondIndex];
                premierIndex++;
            }
            secondIndex++;
        }
        ceinturePotions = nouvelleCeinture;

    }

    public void consommerPotion() {

        Scanner scanner = new Scanner(System.in);
        if (ceinturePotions.length > 0) {
            getFichePersonnage();
            System.out.println(
                    "              Laquelle voulez-vous utiliser ?                                       \n" +
                    "              Tapez le numéro de l'emplacement 1, 2, 3 ou bien 4 pour annuler       \n"
            );
            boolean choix = false;
            int choixUtilisateur;
            do {
                choixUtilisateur = scanner.nextInt();
                if ((choixUtilisateur <= ceinturePotions.length && choixUtilisateur > 0 ) || choixUtilisateur == 4) {
                    choix = true;
                } else {
                    System.out.println(
                            "                    Choix incorrect !              \n" +
                            "              Laquelle voulez-vous utiliser ?      \n" +
                            "              Tapez 1, 2, 3 ou 4 pour annuler      "
                    );
                }
            } while (!choix);
            switch (choixUtilisateur) {
                case 1:
                    boirePotion(ceinturePotions[0]);
                    break;
                case 2:
                    boirePotion(ceinturePotions[1]);
                    break;
                case 3:
                    boirePotion(ceinturePotions[2]);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println(
                    "-----------------------------------------------------------------------------------------------------\n" +
                    "                       Malheureusement Sir " + nom + " possède aucune potion ...                     "
            );
        }

    }

    public void afficherScore() {

        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n\n" +
                "                      Sir " + nom + " possède le score de : " + score +"                             \n"
        );

    }

}
