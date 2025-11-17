package fr.diginamic.combat.entites;

import static fr.diginamic.combat.entites.TypeMonstre.*;
import static fr.diginamic.combat.operations.Aleatoire.*;

public class Monstre {

    private String nom;
    private TypeMonstre type;
    private int force;
    private int attaque;
    private int sante;


    public Monstre() {

        getTypeMonstre();
        switch (type) {
            case LOUP:
                nom = "Loup des bois";
                force = 3 + choixAleatoire(0, 5);
                sante = 5 + choixAleatoire(0, 5);
                break;
            case GOBELIN:
                nom = "Gobelin des plaines";
                force = 5 + choixAleatoire(0, 5);
                sante = 10 + choixAleatoire(0, 5);
                break;
            case TROLL:
                nom = "Troll des cavernes";
                force = 10 + choixAleatoire(0, 5);
                sante = 20 + choixAleatoire(0, 10);
                break;
        }

    }

    public String getNom() { return nom; }
    public TypeMonstre getType() { return type; }
    public int getForce() { return force; }
    public int getAttaque() { return attaque; }
    public int getSante() { return sante; }

    private void getTypeMonstre() {

        switch (choixAleatoire(1, 3)) {
            case 1:
                type = LOUP;
                break;
            case 2:
                type = GOBELIN;
                break;
            case 3:
                type = TROLL;
                break;
        }

    }

    public void setSante(int sante) { this.sante = sante; }

    public void setAttaque() {

        attaque = force + choixAleatoire(1, 10);

    }

}
