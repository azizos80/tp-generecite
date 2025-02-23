public class Comptecourant<T> extends Compte {
    private double limite;

    public Comptecourant(int numcompte, double solde, T devise,double limite) {
        super(numcompte, solde, devise);
        this.limite=limite;
    }

    @Override
    public void retirer(double montant)throws Expnega{
        if(solde-montant<limite){
            throw new Expnega();
        }
        else{
            solde -= montant;
        }

    }


    @Override
    public void affichersolde() {
        System.out.println("Compte courant - Solde "+solde+" "+devise);



    }
}
