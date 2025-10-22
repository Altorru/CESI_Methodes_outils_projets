public class Main {
    public static void main(String[] args) {
        Personnage personnage = new Personnage(new ConduitStrategy());
        personnage.deplacer();

        personnage.setDeplacementStrategy(new VolStrategy());
        personnage.deplacer();

        personnage.setDeplacementStrategy(new MarcheStrategy());
        personnage.deplacer();
    }
}
