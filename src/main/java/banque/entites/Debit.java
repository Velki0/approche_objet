package banque.entites;

public class Debit extends Operation {

    public Debit(String dateOperation, float montantOperation) {

        super(dateOperation, montantOperation);

    }

    public String getType() { return "DEBIT"; }

}
