package myPackage;

public class Point {
    
    protected float abscisse, ordonnée; // Coordonnées du point

    /*  Ajout d'un contructeur (et suppression de la méthode initialiser) */
    public Point(float Abscisse, float Ordonnée)
    {
        this.abscisse = Abscisse;
        this.ordonnée = Ordonnée;
    }

    /*  Méthode deplacer pour modifier les coordonnées d'un point */
    public void deplacer(float newAbscisse, float newOrdonnée)
    {
        this.abscisse = newAbscisse;
        this.ordonnée = newOrdonnée;
    }
    
    /*  Méthode afficher pour afficher un point */
    public void afficher()
    {
        System.out.println("Je suis un point de coordonnées "+this.abscisse+" et "+this.ordonnée);
    }
}
