import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        /*          PROGRAMME DE  TEST         */

        Pointcol ptc = new Pointcol(0, 0, "white");

        ptc.afficheCol(); // affichage du point et de sa couleur

        ptc.colorer("blue"); // Coloration du point en bleu

        ptc.deplacer(5, 2); // Déplacement du point

        ptc.afficheCol(); // affichage du point mis à jour

    }
}