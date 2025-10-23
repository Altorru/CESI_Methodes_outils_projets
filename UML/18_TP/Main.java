public class Main {
    public static void main(String[] args) {
        // --- OLD METHOD ---
        // CalculateurPrix calculateur = new CalculateurPrix();
        // System.out.println("Prix étudiant : " + calculateur.calculerPrix(100, "ETUDIANT"));
        // System.out.println("Prix VIP : " + calculateur.calculerPrix(100, "VIP"));
        // ------------------

        // --- NEW METHOD USING STRATEGY PATTERN ---
        StrategieReduction etudiantStrategy = new StudentStrategy();
        StrategieReduction vipStrategy = new VipStrategy();
        double prixInitial = 100;
        System.out.println("Prix étudiant : " + etudiantStrategy.appliquerReduction(prixInitial));
        System.out.println("Prix VIP : " + vipStrategy.appliquerReduction(prixInitial));
    }
}