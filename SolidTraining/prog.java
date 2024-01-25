public class prog
{

    public static class GestionClient {
        private String nom;
        private int age;
    
        public GestionClient(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }
    
        public int getAge() {
            return age;
        }
    
        public String getNom() {
            return nom;
        }
    }
    
    public static class CourrielService {
        public void envoyerCourriel(GestionClient client) {
            System.out.println("Courriel envoyé à " + client.getNom());
        }
    }
    
    public static void main(String[] args) {
        GestionClient client = new GestionClient("Noubissie", 23);
        CourrielService courrielService = new CourrielService();
        courrielService.envoyerCourriel(client);

        System.out.println("Nom : " + client.getNom());
        System.out.println("Age : " + client.getAge() + " ans");
    }
}
