package entites;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;

    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {

        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;

    }

    public void afficherPersonne() { System.out.println("Cette personne s'appelle : " + prenom + " " + nom); }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public AdressePostale getAdressePostale() { return adressePostale; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setAdressePostale(AdressePostale adressePostale) { this.adressePostale = adressePostale; }

}
