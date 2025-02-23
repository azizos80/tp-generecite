public class  CompteCourantSecurise<T> extends Comptecourant <T> implements Securisable{
    public CompteCourantSecurise(int numcompte, double solde, T devise, double limite) {
        super(numcompte, solde, devise, limite);
    }


    @Override
    public boolean verifid(int id) {
        return(numcompte == id);
    }
}
