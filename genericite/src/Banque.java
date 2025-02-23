import java.util.HashMap;
import java.util.Map;

public class Banque {
    private HashMap<Integer,Compte<?>>comptes= new HashMap<>();
    public void ajouterCompte(Compte<?> compte) {
        comptes.put(compte.numcompte, compte);
    }
}
