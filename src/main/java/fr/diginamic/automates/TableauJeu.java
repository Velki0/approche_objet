package fr.diginamic.automates;

import java.util.ArrayList;
import java.util.List;

public class TableauJeu {

    private final int lignesTotales;
    private final int colonnesTotales;
    private final List<List<Cellule>> cellules;

    public TableauJeu(int lignesTotales, int colonnesTotales) {

        this.lignesTotales = lignesTotales;
        this.colonnesTotales = colonnesTotales;
        cellules = new ArrayList<>();
        for (int x = 0; x < lignesTotales; x++) {
            cellules.add(new ArrayList<>());
            for (int y = 0; y < colonnesTotales; y++) {
                cellules.get(x).add(new Cellule());
            }
        }

    }

    public void afficherTableauJeu() {
        char etat;
        System.out.println("-------------------------------------------------Tableau Jeu-------------------------------------------------");
        for (List<Cellule> ligne : cellules) {
            System.out.print("|");
            for (Cellule cellule : ligne) {
                if (cellule.getEnVie()) { etat = 'X'; } else { etat = ' '; }
                System.out.print(etat + "|");
            }
            System.out.println();
        }
    }

    private boolean getValeurCellule(int ligne, int colonne) {

        return cellules.get(ligne).get(colonne).getEnVie();

    }

    private int compterVoisins(int ligne, int colonne) {

        int compteurVoisins = 0;
        // Cas des 4 coins
        if (ligne == 0 && colonne == 0) {
            for (int x = 0; x <= 1; x++) {
                for (int y = 0; y <= 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne == 0 && colonne == colonnesTotales - 1) {
            for (int x = 0; x <= 1; x++) {
                for (int y = colonnesTotales - 2; y <= colonnesTotales - 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne == lignesTotales - 1 && colonne == 0) {
            for (int x = lignesTotales - 2; x <= lignesTotales - 1; x++) {
                for (int y = 0; y <= 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne == lignesTotales - 1 && colonne == colonnesTotales - 1) {
            for (int x = lignesTotales - 2; x <= lignesTotales - 1; x++) {
                for (int y = colonnesTotales - 2; y <= colonnesTotales - 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        // Cas des bords
        if (ligne == 0 && colonne != 0 && colonne != colonnesTotales - 1) {
            for (int x = 0; x <= 1; x++) {
                for (int y = colonne - 1; y <= colonne + 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne == lignesTotales - 1 && colonne != 0 && colonne != colonnesTotales - 1) {
            for (int x = lignesTotales - 2; x <= lignesTotales - 1; x++) {
                for (int y = colonne - 1; y <= colonne + 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne != 0 && ligne != lignesTotales - 1 && colonne == 0) {
            for (int x = ligne - 1; x <= ligne + 1; x++) {
                for (int y = 0; y <= 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        if (ligne != 0 && ligne != lignesTotales - 1 && colonne == colonnesTotales - 1) {
            for (int x = ligne - 1; x <= ligne + 1; x++) {
                for (int y = colonnesTotales - 2; y <= colonnesTotales - 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        // Cas du milieu de tableau
        if (ligne > 0 && ligne < lignesTotales - 1 && colonne > 0 && colonne < colonnesTotales - 1) {
            for (int x = ligne - 1; x <= ligne + 1; x++) {
                for (int y = colonne - 1; y <= colonne + 1; y++) {
                    if (getValeurCellule(x, y)) {
                        compteurVoisins++;
                    }
                }
            }
        }
        // On élimine la valeur de la case ciblée si elle était vivante
        if (getValeurCellule(ligne, colonne)) {
            compteurVoisins--;
        }
        return compteurVoisins;

    }

    private void setProchainEtatCellule(int ligne, int colonne) {

        switch (compterVoisins(ligne, colonne)) {
            // Survie à 2 voisins
            case 2:
                if (getValeurCellule(ligne, colonne)) {
                    cellules.get(ligne).get(colonne).setProchainEtat(true);
                }
                break;
            // Survie à 2 voisins ou naissance
            case 3:
                cellules.get(ligne).get(colonne).setProchainEtat(true);
                break;
            // Mort dans tous les autres cas
            default:
                cellules.get(ligne).get(colonne).setProchainEtat(false);
                break;
        }

    }

    public void setProchainEtatTableau() {

        for (int x = 0; x < lignesTotales; x++) {
            for (int y = 0; y < colonnesTotales; y++) {
                setProchainEtatCellule(x,y);
            }
        }

    }

    private void setEtatCellule(int ligne, int colonne) {

        cellules.get(ligne).get(colonne).setEnVie(cellules.get(ligne).get(colonne).getProchainEtat());

    }

    public void setEtatTableau() {

        for (int x = 0; x < lignesTotales; x++) {
            for (int y = 0; y < colonnesTotales; y++) {
                setEtatCellule(x,y);
            }
        }

    }

}