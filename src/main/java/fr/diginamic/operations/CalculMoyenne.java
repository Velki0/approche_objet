package fr.diginamic.operations;

public class CalculMoyenne {

    private double[] tableauNombre;

    public void ajoutNombre(double nombre) {

        if (tableauNombre == null) {
            tableauNombre = new double[1];
            tableauNombre[0] = nombre;
        } else {
            double[] nouveauTableau = new double[tableauNombre.length + 1];
            System.arraycopy(tableauNombre, 0, nouveauTableau, 0, tableauNombre.length);
            nouveauTableau[tableauNombre.length] = nombre;
            tableauNombre = nouveauTableau;
        }

    }

    public double calculMoyenne() {

        double moyenne = 0;
        int nombreDeValeur = 0;
        for (double valeur : this.tableauNombre) {
            moyenne += valeur;
            nombreDeValeur++;
        }
        return moyenne/nombreDeValeur;

    }

}
