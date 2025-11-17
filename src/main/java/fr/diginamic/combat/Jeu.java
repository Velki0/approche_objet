package fr.diginamic.combat;

import fr.diginamic.combat.entites.Personnage;
import java.util.Scanner;

import static fr.diginamic.combat.operations.Combat.*;

public class Jeu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n" +
                "                      Bienvenue dans le jeu de rôle Chevalier contre Monstres                        \n" +
                "                           Veullier choisir un nom à votre chevalier !                               "
        );
        Personnage personnage = new Personnage(scanner.nextLine());
        personnage.getFichePersonnage();

        int choixUtilisateur = 0;
        int round = 1;
        while (personnage.getSante() > 0 && choixUtilisateur !=5) {

            do {
                System.out.println(
                        "-----------------------------------------------------------------------------------------------------\n" +
                        "                                         Round " + round + "                                         \n" +
                        "                              Que voulez vous faire ?                                                \n" +
                        "                              1 - Commencer le prochain combat !                                     \n" +
                        "                              2 - Afficher les statistiques de votre personnage !                    \n" +
                        "                              3 - Consommer une potion                                               \n" +
                        "                              4 - Afficher le score actuel                                           \n" +
                        "                              5 - Quitter le jeu                                                     "
                );
                choixUtilisateur = scanner.nextInt();
            } while (choixUtilisateur != 1 && choixUtilisateur != 2 && choixUtilisateur != 3 && choixUtilisateur != 4 && choixUtilisateur != 5);
            switch (choixUtilisateur) {
                case 1:
                    combattre(personnage);
                    round++;
                    break;
                case 2:
                    personnage.getFichePersonnage();
                    break;
                case 3:
                    personnage.consommerPotion();
                    break;
                case 4:
                    personnage.afficherScore();
                    break;
                case 5:
                    break;
            }

        }

    }

}
