package myPackage;

public class CompteEpargne extends Compte {
    protected final float taux = 3.7f; // taux d'intérêt de 3.7% par exemple

    public CompteEpargne(String Numéro, String Proprietaire, float Solde)
    {
        super(Numéro, Proprietaire, Solde);
        this.Solde += (this.Solde * this.taux) / 100; // ajout des interêts
    }
    
}
