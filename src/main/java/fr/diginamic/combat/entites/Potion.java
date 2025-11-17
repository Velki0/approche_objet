package fr.diginamic.combat.entites;

public class Potion {

    private String nom;
    private String description;
    private final TypePotion type;

    public Potion(TypePotion type) {

        this.type = type;
        setAttributsPotion();

    }

    public String getNom() { return nom; }
    public String getDescription() { return description; }
    public TypePotion getType() { return type; }

    private void setAttributsPotion() {

        switch (type) {
            case SOIN:
                nom = "Potion de soin";
                description = "Cette potion permet de vous soigner de 5 de santé.";
                break;
            case ATTAQUE_MINEURE:
                nom = "Potion d'attaque mineure";
                description = "Cette potion vous permet d'obtenir + 3 d'attaque pour le prochain combat.";
                break;
            case ATTAQUE_MAJEURE:
                nom = "Potion d'attaque majeure";
                description = "Cette potion vous permet d'obtenir + 5 d'attaque' pour les 2 prochains combat.";
                break;
        }

    }

}
