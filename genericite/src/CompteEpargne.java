public class CompteEpargne  <T>extends Compte {
    private double taux;

    public CompteEpargne(int numcompte, double solde, T devise , double taux ) {
        super(numcompte, solde, devise);
        this.taux = taux;
    }
    public void calculer(){
        solde+= solde*taux /100;
    }



    @Override
    public void affichersolde() {
        System.out.println("Compte Epargne - "+solde+" "+devise);

    }
}
