//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Comptecourant<String> compte1 = new Comptecourant<>(101, 5000, "EUR", 1000);
            CompteEpargne<String> compte2 = new CompteEpargne<>(102, 3000, "EUR", 2);

            compte1.affichersolde();
            compte2.affichersolde();

            Compte.transferee(compte1, compte2, 1000);

            compte1.affichersolde();
            compte2.affichersolde();
        } catch (Exception e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }
    }
}
