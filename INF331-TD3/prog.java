import myPackage.*;

public class prog
{
    public static void main(String[] args)
    {
        /*          PROGRAMME DE  TEST         */

        Point tab[] = new Point[2];

        tab[0] = new Pointcol(1, 2, "red");
        tab[1] = new Point(3, 4);

        tab[0].identifie();
        tab[1].identifie();
    }
}