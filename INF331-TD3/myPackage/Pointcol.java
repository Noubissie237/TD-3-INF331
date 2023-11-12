package myPackage;

public class Pointcol extends Point { // la class Pointcol herite de la class Point
    protected String couleur;

    public Pointcol(float Abscisse, float Ordonnée, String couleur)
    {
        super(Abscisse, Ordonnée);
        this.couleur = couleur;
    }

    public void colorer(String couleur)
    {
        this.couleur = couleur;
    }

    @Override
    public void identifie() {
        System.out.println("Je suis un point coloré de couleur "+this.couleur);
    }

}
