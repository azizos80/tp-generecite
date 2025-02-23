public abstract class Compte <T>{
     protected int numcompte;
     protected double solde;
     protected T devise;
     public Compte(int numcompte, double solde, T devise) {
         this.numcompte = numcompte;
         this.solde = solde;
         this.devise = devise;
     }
     public  void deposer(double montant){
         solde = solde + montant;
     }
     public  void retirer(double montant)throws Expnega {
         solde = solde - montant;
     }
     public abstract void affichersolde();
     public static <E extends Compte> void transferee(Compte<E> c1, Compte<E> c2,double montant) throws Expnega {
         c1.retirer(montant);
         c2.deposer(montant);
     }
}
