package myPackage;

public class classDeriv1 extends Affichable {
    protected final int valeur = 25;

    @Override
    public void affiche() {
        System.out.println("Je suis un entier de valeur "+this.valeur);
    }
}
