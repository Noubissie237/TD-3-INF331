package myPackage;

public class CompteSecurise extends Compte {

    public CompteSecurise(String Numéro, String Proprietaire, float Solde) {
        super(Numéro, Proprietaire, Solde);
    }

    @Override
    public void Retirer(float montant) {
        if (this.Solde >= montant)
            super.Retirer(montant);
        else
            System.out.println("Solde insuffisant !");
    }
    
}
