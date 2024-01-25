public class prog
{

    public static class Forme
    {
        public float aire()
        {
            return 0f;
        }
    }

    public static class Triangle extends Forme
    {
        protected float Largeur;
        protected float longueur;

        public Triangle(float L, float l)
        {
            this.longueur = l;
            this.Largeur = L;
        }

        @Override
        public float aire() {
            return (this.longueur * this.Largeur);
        }
    }

    public static void main(String[] args) {
        Forme forme = new Triangle(2f, 5f);
        System.out.println("Aire : "+forme.aire());
    }
}
