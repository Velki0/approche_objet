package fichier.tri;

import fichier.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    @Override
    public int compare(Ville premiereVille, Ville secondeVille) {

        return Integer.compare(premiereVille.getPopulationTotal(), secondeVille.getPopulationTotal());

    }

}
