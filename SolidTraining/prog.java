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

    public static class Carre extends Forme
    {
        protected float cote;

        public Carre(float c)
        {
            this.cote = c;
        }

        @Override
        public float aire() {
            return (this.cote * this.cote);
        }
    }

    public static void main(String[] args) {
        Forme forme1 = new Forme();
        Forme forme2 = new Forme();
        Triangle triangle = new Triangle(12, 3);
        Carre carre = new Carre(4);
        forme1 = triangle;
        forme2 = carre;
        System.out.println("Aire : "+forme1.aire());
        System.out.println("Aire : "+forme2.aire());
    }
}
