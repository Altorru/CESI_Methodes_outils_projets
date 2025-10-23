public class AfficheurConsole implements Observer {
    @Override
    public void update(String strategy, double prixInitial, double prixFinal) {
        System.out.println("========================================");
        System.out.println("Stratégie appliquée : " + strategy);
        System.out.println("Prix initial : " + prixInitial);
        System.out.println("Prix final après réduction : " + prixFinal);
        System.out.println("========================================");
    }
    
}
