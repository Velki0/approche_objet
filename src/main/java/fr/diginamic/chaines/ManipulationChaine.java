package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        // 1
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère : " + premierCaractere + ".");

        // 2
        System.out.println("La chaine de caractères est de : " + chaine.length() +".");

        // 3
        System.out.println("Le premier ; se situe dans l'index " + chaine.indexOf(';') + " de la chaine.");

        // 4
        System.out.println("Le nom de la personne est : " + chaine.substring(0, chaine.indexOf(';')));

        // 5
        System.out.println("Le nom de la personne en majuscule : " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());

        // 6
        System.out.println("Le nom de la personne en minuscule : " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());

        // 7
        String[] decoupageChaine = chaine.split(";");
        System.out.println("Voici le tableau de découpe : ");
        for (String decoupe : decoupageChaine) {
            System.out.println(decoupe);
        }

        // 9
        Salarie nouveauSalarie = new Salarie(decoupageChaine[0], decoupageChaine[1], Double.parseDouble(decoupageChaine[2].replace(" ","")));
        System.out.println("Voici le nouveau salarié : " + nouveauSalarie.getPrenom() + " " + nouveauSalarie.getNom() + " et son salaire : " + nouveauSalarie.getSalaire());

    }

}
