package myPackage;

public class CompteFinal extends CompteSecurise {
    public CompteFinal(String Numero, String Proprietaire, float Solde)
    {
        super(Numero, Proprietaire, Solde);
    }

    @Override
    public void Deposer(float montant) {
        if(montant < 1000)
            System.out.println("Le montant minimum de retrait est de 1000 f");
        else
            super.Deposer(montant);
    }
}
