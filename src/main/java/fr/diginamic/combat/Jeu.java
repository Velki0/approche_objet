package fr.diginamic.combat;

import fr.diginamic.combat.entites.Personnage;
import java.util.Scanner;

import static fr.diginamic.combat.operations.Combat.*;
import static fr.diginamic.combat.operations.CreationPersonnage.*;

public class Jeu {

    public static void main(String[] args) {

        Personnage personnage = creationPersonnage();
        int choixUtilisateur = 0;
        int round = 1;
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();

    }

}
