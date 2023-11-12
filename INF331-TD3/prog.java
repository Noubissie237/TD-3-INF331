import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        /*          PROGRAMME DE  TEST         */
        
        Affichable aff[] = new Affichable[2]; // création du tableau

        aff[0] = new classDeriv1(); // Instance de la class dérivée 1
        aff[1] = new classDeriv2(); // Instance de la class dérivée 2
        for (Affichable elt : aff) {
            elt.affiche(); // Affichage
        }
    
    }
}