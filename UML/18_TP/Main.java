public class Main {
    public static void main(String[] args) {
        // --- OLD METHOD ---
        // CalculateurPrix calculateur = new CalculateurPrix();
        // System.out.println("Prix étudiant : " + calculateur.calculerPrix(100, "ETUDIANT"));
        // System.out.println("Prix VIP : " + calculateur.calculerPrix(100, "VIP"));
        // ------------------

        // --- NEW METHOD USING STRATEGY PATTERN ---
        // CalculateurPrix calculateur = new CalculateurPrix();
        // System.out.println("Prix étudiant : " + calculateur.calculerPrix(100, new StudentStrategy()));
        // System.out.println("Prix VIP : " + calculateur.calculerPrix(100, new VipStrategy()));

        // --- NEW METHOD USING OBSERVER PATTERN ---
        CalculateurPrix calculateur = new CalculateurPrix();
        AfficheurConsole afficheur = new AfficheurConsole();
        calculateur.attach(afficheur);
        calculateur.calculerPrix(100, new StudentStrategy());
        calculateur.calculerPrix(100, new VipStrategy());
    }
}