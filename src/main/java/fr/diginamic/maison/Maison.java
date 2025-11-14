package fr.diginamic.maison;

public class Maison {

    Piece[] ensemblePieces;

    public void ajouterPiece(Piece piece) {

        if (piece != null && piece.getSuperficie() > 0 && piece.getNumeroEtage() >= 0) {
            if (ensemblePieces == null) {
                ensemblePieces = new Piece[1];
                ensemblePieces[0] = piece;
            } else {
                Piece[] nouvelEnsemblePieces = new Piece[ensemblePieces.length + 1];
                System.arraycopy(ensemblePieces, 0, nouvelEnsemblePieces, 0, ensemblePieces.length);
                nouvelEnsemblePieces[ensemblePieces.length] = piece;
                ensemblePieces = nouvelEnsemblePieces;
            }
        } else {
            System.out.println("Vous avez renseigné une piece non conforme ! Cet ajout a été ignoré.");
        }

    }

    public double getSuperficieTotale() {
        double superficieTotale = 0;
        for (Piece piece : ensemblePieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    public double getSuperficieEtage(int etage) {
        double superficieEtage = 0;
        for (Piece piece : ensemblePieces) {
            if (etage == piece.getNumeroEtage()) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;
    }

    public double getSuperficieTotaleTypePiece(Class<?> typePiece) {
        double superficieTotaleTypePiece = 0;
        for (Piece piece : ensemblePieces) {
            if (piece.getClass() == typePiece) {
                superficieTotaleTypePiece+= piece.getSuperficie();
            }
        }
        return superficieTotaleTypePiece;
    }

    public int getNombreTypePiece(Class<?> typePiece) {
        int nombreTypePiece = 0;
        for (Piece piece : ensemblePieces) {
            if (piece.getClass() == typePiece) {
                nombreTypePiece++;
            }
        }
        return nombreTypePiece;
    }

}
