package myPackage;

public class classDeriv2 extends Affichable {
    protected final float valeur = 1.25f;

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur "+this.valeur);
    }
}
