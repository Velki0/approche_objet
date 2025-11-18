package fr.diginamic.combat.operations;

import fr.diginamic.combat.entites.Monstre;
import fr.diginamic.combat.entites.Personnage;
import fr.diginamic.combat.entites.Potion;

import static fr.diginamic.combat.entites.TypePotion.*;
import static fr.diginamic.combat.operations.Aleatoire.*;

public abstract class Combat {

    public static void combattre(Personnage personnage) {

        // Initialisation du premier tour
        int tour = 1;
        Monstre monstre = new Monstre();
        afficherCombat(personnage, monstre);

        // Boucle de combat
        while (personnage.getSante() > 0 && monstre.getSante() > 0) {
            System.out.println(
                    "---------------------------------------   Début du tour " + tour + " !   ---------------------------------------"
            );
            personnage.setAttaque();
            monstre.setAttaque();
            System.out.println(
                    "                       Attaque du héros : " + personnage.getAttaque() + "             Attaque du monstre : " + monstre.getAttaque()
            );
            if (personnage.getAttaque() > monstre.getAttaque()) {
                System.out.println(
                        "                             Le héros frappe le monstre pour " + (personnage.getAttaque() - monstre.getAttaque()) + " points de dégats."
                );
                monstre.setSante(monstre.getSante() - (personnage.getAttaque() - monstre.getAttaque()));
            } else if (personnage.getAttaque() < monstre.getAttaque()) {
                System.out.println(
                        "                             Le monstre frappe le héros pour " + (monstre.getAttaque() - personnage.getAttaque()) + " points de dégats."
                );
                personnage.setSante(personnage.getSante() - (monstre.getAttaque() - personnage.getAttaque()));
            } else {
                System.out.println(
                        "                             La manche est nulle, le combat est serré !"
                );
            }
            System.out.println(
                    "                          Santé du héros : " + String.format("%02d",personnage.getSante()) + " / " + personnage.getSanteMax() + "        Santé du " + monstre.getNom() + " : " + monstre.getSante() + "\n"
            );
            tour++;
        }

        // Perte des effets de potions
        if (personnage.getAmelioration().getDuree() > 0) {
            personnage.getAmelioration().setDuree(personnage.getAmelioration().getDuree() - 1);
            if (personnage.getAmelioration().getDuree() == 0) {
                System.out.println(
                        "                             Les effets de la potion d'attaque s'estompent ..."
                );
            } else {
                System.out.println(
                        "                             La potion fera encore effet pour le prochain combat !"
                );
            }
        }

        // Action de Victoire ou de Défaite
        if (personnage.getSante() > 0) {
            afficherVictoire(personnage, monstre);
        } else {
            afficherDefaite(personnage);
        }

    }

    private static void afficherCombat(Personnage personnage, Monstre monstre) {

        System.out.println(
                """
                -----------------------------------------------------------------------------------------------------
                                                               NOUVEAU COMBAT !
                                                                                  ,      ,
                                                                                 /(.-""-.)\\
                                                     .-.                     |\\  \\/      \\/  /|
                                                   __|=|__                   | \\ / =.  .= \\ / |
                                                  (_/`-`\\_)                  \\( \\   o\\/o   / )/
                                                   //___/\\\\                   \\_, '-/  \\-' ,_/
                                                  <>/   \\<>                     /   \\__/   \\
                                                   \\|_._|/                      \\ \\__/\\__/ /
                                                    <_I_>                     ___\\ \\|--|/ /___
                                                     |||                    /`    \\      /    `\\
                                                    /_|_\\                  /       '----'       \\
                \n""" +
                "                                    Héros          contre           Nom : " + monstre.getNom() + "\n" +
                "                                    Force : " + personnage.getForce() + "                     Force : " + monstre.getForce() + "\n" +
                "                                    Santé : " + personnage.getSante() + " / " + personnage.getSanteMax() + "                 Santé : " + monstre.getSante() + "\n"
        );

    }

    private static void afficherVictoire (Personnage personnage, Monstre monstre) {

        int bonusScore = switch (monstre.getType()) {
            case LOUP -> 1;
            case GOBELIN -> 3;
            case TROLL -> 5;
        };
        System.out.println(
                "\n                             " + personnage.getNom() + " est triomphant !\n" +
                  "                               Il gagne un score de + " + bonusScore
        );
        personnage.gainScore(bonusScore);
        recompenseSupplementaire(personnage);

    }

    private static void recompenseSupplementaire(Personnage personnage) {

        switch (choixAleatoire(1, 8)) {
            case 1:
                System.out.println(
                        "                               " + personnage.getNom() + " a reçu une récompense bonus ! + 5 à son score !"
                );
                personnage.gainScore(5);
                break;
            case 2:
                System.out.println(
                        "                               " + personnage.getNom() + " a reçu une récompense bonus ! Une potion de soin !"
                );
                personnage.ajouterPotion(new Potion(SOIN));
                break;
            case 3:
                System.out.println(
                        "                               " + personnage.getNom() + " a reçu une récompense bonus ! Une potion d'attaque mineure !"
                );
                personnage.ajouterPotion(new Potion(ATTAQUE_MINEURE));
                break;
            case 4:
                System.out.println(
                        "                               " + personnage.getNom() + " a reçu une récompense bonus ! Une potion d'attaque majeure !"
                );
                personnage.ajouterPotion(new Potion(ATTAQUE_MAJEURE));
                break;
            default:
                break;
        }

    }

    private static void afficherDefaite(Personnage personnage) {

        System.out.println(
                "\n------------------------------------------   GAME OVER !   ------------------------------------------\n" +
                  "                   Malheuresement, Sir " + personnage.getNom() + " est tombé au combat ...\n" +
                  "                   La partie se termine avec un score de : " + personnage.getScore() + " Félicitations !"
        );

    }

}
