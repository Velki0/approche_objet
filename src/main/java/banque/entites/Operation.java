package banque.entites;

public class Operation {

    private final String dateOperation;
    private final float montantOperation;

    public Operation(String dateOperation, float montantOperation) {

        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;

    }

    public String getDateOperation() { return dateOperation; }
    public float getMontantOperation() { return montantOperation; }

    public String getType() { return null; }

}
