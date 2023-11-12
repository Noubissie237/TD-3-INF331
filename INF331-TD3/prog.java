import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        /*          PROGRAMME DE  TEST         */

        Point tab [] = new Point[3]; // tableau d'instances pour la mise en œuvre du polymorphisme

        tab[0] = new Point(1, 2); // Creation d'une instance de point
        tab[1] = new Pointcol(3, 4, "Green"); // Creation d'une instance de pointcol
        tab[2] = new Point(5, 6); // Creation d'une instance de point

        for (Point point : tab) {
            System.out.println("------------------------------------");
            point.afficher();
        }

    }
}