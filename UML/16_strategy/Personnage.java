public class Personnage {
    private DeplacementStrategy deplacementStrategy;

    public Personnage(DeplacementStrategy deplacementStrategy) {
        this.deplacementStrategy = deplacementStrategy;
    }

    public void setDeplacementStrategy(DeplacementStrategy deplacementStrategy) {
        this.deplacementStrategy = deplacementStrategy;
    }

    public void deplacer() {
        deplacementStrategy.deplacer();
    }
}
