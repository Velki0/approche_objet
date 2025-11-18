package fichier.tri;

import fichier.Ville;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorNom implements Comparator<Ville> {

    @Override
    public int compare(Ville premiereVille, Ville secondeVille) {

        Collator collator = Collator.getInstance(Locale.FRANCE);
        return collator.compare(premiereVille.getNom(), secondeVille.getNom());

    }

}
