package myPackage;

public class Compte {
    protected String Numero;
    protected String Proprietaire;
    protected float Solde;

    public Compte(String Numéro, String Proprietaire, float Solde)
    {
        this.Numero = Numéro;
        this.Proprietaire = Proprietaire;
        this.Solde = Solde;
    }

    public void Deposer(float montant)
    {
        this.Solde += montant;
    }

    public void Retirer(float montant)
    {
        this.Solde -= montant;
    }

    /*  Ajout volontaire d'un methode me permettant de consulter mon solde */
    public void printInfos()
    {

        System.out.println("Proprietaire : "+this.Proprietaire.toUpperCase());
        System.out.println("Solde : "+this.Solde+" FCFA\n");
    }
}
