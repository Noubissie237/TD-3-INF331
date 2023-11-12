import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        /*          PROGRAMME DE  TEST         */

        Point pt = new Point(); // Création d'une instance de Point

        pt.initialiser(0, 0); // Initialisation des coordonées à [0 ; 0]

        pt.afficher(); // affichage

        pt.deplacer(3, 7.5f); // deplacement du point vers la position [3 ; 7.5]

        pt.afficher(); // affichage

    }
}