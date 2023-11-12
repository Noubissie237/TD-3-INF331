import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        Compte cmpt[] = new Compte[3];
        
        /*      Premier Compte (Compte simple) */
        cmpt[0] = new Compte("690232120", "Noubissie", 5000f);

        /*      Deuxieme Compte (Compte Epargne) */
        cmpt[1] = new CompteEpargne("671126291", "Kamga", 5000f);

        /*      Troisieme Compte (Compte Securisé) */
        cmpt[2] = new CompteSecurise("620269993", "Wilfried", 5000f);
        

        for (Compte compte : cmpt)
        {

            System.out.println("---------------------------------");
            compte.printInfos(); // Affichage du solde
            compte.Retirer(2050); // Retrait de 2050f
            compte.printInfos(); // Affichage du nouveau solde
            compte.Deposer(8000f); // Depot de 8000f
            compte.printInfos(); // Affichage 
            compte.Retirer(50000); // retrait d'un gros montant (depassant mon solde)
            compte.printInfos(); // Affichage 
        }



        
    }
}